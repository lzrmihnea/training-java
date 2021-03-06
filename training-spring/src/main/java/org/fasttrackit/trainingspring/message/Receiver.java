package org.fasttrackit.trainingspring.message;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "goodbye")
public class Receiver {

    @RabbitHandler
    public void receive(String rawMessage) {
        System.out.println(" [>] Received from `goodbye`: " + rawMessage);
    }

}
