package com.company.message;

import com.company.service.MessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    public final MessageInterface messageInterface;

    @Autowired
    public MessagePrinter(MessageInterface messageInterface){
        this.messageInterface = messageInterface;
    }

    public void printMessage(){
        System.out.println(messageInterface.getMessage());
    }
}
