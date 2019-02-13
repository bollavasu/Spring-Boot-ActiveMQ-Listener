package com.javainuse;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

@Component
public class VasuListener {

    @JmsListener(destination = "VasuQueue")
    public void receiveMessage(String message) {
        System.out.println("Received message from the Queue : " + message);
    }
	
}
