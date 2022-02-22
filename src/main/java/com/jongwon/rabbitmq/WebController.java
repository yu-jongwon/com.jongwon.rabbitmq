package com.jongwon.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebController {

  private final RabbitTemplate rabbitTemplate;

  @GetMapping
  public void send() {
    String message = "Hello, RabbitMQ!";
    rabbitTemplate.convertAndSend(
      RabbitMqConfiguration.TOPIC_EXCHANGE_NAME,
      RabbitMqConfiguration.ROUTING_KEY,
      message
    );
  }
  
}
