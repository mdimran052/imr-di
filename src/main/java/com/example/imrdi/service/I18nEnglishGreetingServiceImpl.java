package com.example.imrdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
