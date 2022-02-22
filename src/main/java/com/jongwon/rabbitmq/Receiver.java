package com.jongwon.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

  @RabbitListener(queues = "spring-boot")
  public void receiveMessage(String message) {
    System.out.println(message);
  }

}
