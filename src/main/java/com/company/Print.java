package com.company;

import com.company.config.ApplicationConfig;
import com.company.message.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Print {


    public static void main(String[] arg){

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MessagePrinter printer = (MessagePrinter) context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
