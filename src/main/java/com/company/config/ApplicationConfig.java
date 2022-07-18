package com.company.config;


import com.company.message.MessagePrinter;
import com.company.service.MessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Autowired
    public MessageInterface messageInterface;

    @Bean("messageService")
    public MessageInterface getMessageInterface(){
        return  new MessageInterface(){
            @Override
            public String getMessage(){
                return  "Hello Java Spring";
            }
        };
    }

    @Bean("messagePrinter")
    public MessagePrinter messagePrinter(){
        return new MessagePrinter(messageInterface);
    }

}
