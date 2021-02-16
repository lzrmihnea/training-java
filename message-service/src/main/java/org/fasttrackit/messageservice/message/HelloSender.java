package org.fasttrackit.messageservice.message;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;

@Component
public class HelloSender {

    private final RabbitTemplate template;
    private final FanoutExchange fanout;
    private final Queue queue;
    private Integer count = 0;

    public HelloSender(RabbitTemplate template, FanoutExchange fanout, Queue queue1) {
        this.template = template;
        this.fanout = fanout;
        this.queue = queue1;
    }

    @Scheduled(fixedDelay = 4000, initialDelay = 500)
    public void sendMessageEverySecond() {
        String message = "Hello world " + Date.from(Instant.now()) + " " + count++;
        this.template.convertAndSend(fanout.getName(), "", message);
        System.out.println(" [x] Sent '" + message + "'");
    }
}
