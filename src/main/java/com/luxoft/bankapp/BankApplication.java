package com.luxoft.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luxoft.bankapp.exceptions.ActiveAccountNotSet;
import com.luxoft.bankapp.model.*;
import com.luxoft.bankapp.service.BankReportService;
import com.luxoft.bankapp.service.BankReportServiceImpl;
import com.luxoft.bankapp.service.Banking;
import com.luxoft.bankapp.service.BankingImpl;
import com.luxoft.bankapp.model.Client.Gender;
import com.luxoft.bankapp.service.feed.BankFeedService;
import com.luxoft.bankapp.service.feed.BankFeedServiceImpl;
import com.luxoft.bankapp.service.storage.ClientStorage;
import com.luxoft.bankapp.service.storage.Storage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@SpringBootApplication
@PropertySource("classpath:clients.properties")
public class BankApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(BankApplication.class, args);
    }
}
