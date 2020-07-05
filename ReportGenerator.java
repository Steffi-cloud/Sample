package com.example.demo.config;
import com.example.demo.model.*;

import javax.batch.api.chunk.ItemReader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class ReportGenerator {

    @Bean
    ItemReader csvFileItemReader() {
        FlatFileItemReader<Account> csvFileReader = new FlatFileItemReader<>();
        csvFileReader.setResource(new ClassPathResource("data/report.txt"));
        csvFileReader.setLinesToSkip(1);
 
        LineMapper<Account> accountLineMapper = createAccountLineMapper();
        csvFileReader.setLineMapper(accountLineMapper);
 
        return (ItemReader) csvFileReader;
    }
 
    private LineMapper<Account> createAccountLineMapper() {
        DefaultLineMapper<Account> accountLineMapper = new DefaultLineMapper<>();
 
        LineTokenizer accountLineTokenizer = createAccountLineTokenizer();
        accountLineMapper.setLineTokenizer(accountLineTokenizer);
 
        FieldSetMapper<Account> accountInformationMapper = createaccountInformationMapper();
        accountLineMapper.setFieldSetMapper(accountInformationMapper);
 
        return accountLineMapper;
    }
 
    private LineTokenizer createAccountLineTokenizer() {
        DelimitedLineTokenizer accountLineTokenizer = new DelimitedLineTokenizer();
        accountLineTokenizer.setDelimiter(";");
        accountLineTokenizer.setNames(new String[]{"date","acctNo", "creditAmount", "debitAmount"});
        return accountLineTokenizer;
    }
 
    private FieldSetMapper<Account> createaccountInformationMapper() {
        BeanWrapperFieldSetMapper<Account> accountInformationMapper = new BeanWrapperFieldSetMapper<>();
        accountInformationMapper.setTargetType(Account.class);
        return accountInformationMapper;
    }
}
