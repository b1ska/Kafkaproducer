package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.domain.OperatorNotification;
import com.example.kafkaproducer.service.KafkaProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping(value = "/sendMessageToKafka.do")
    public void markOperatorNotificationAsRead(@RequestParam Integer messageCount) throws JsonProcessingException {

        for (int i = 0; i<messageCount;i++ ){
            OperatorNotification operatorNotification = new OperatorNotification();
            operatorNotification.setOperatorNotificationUserId(7875); //7875 на 152 бд
            operatorNotification.setOperatorNotificationMessage("12345678");
            operatorNotification.setOperatorNotificationType(0);

            com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
            String notification = objectMapper.writeValueAsString(operatorNotification);

            kafkaProducerService.sendMessage(notification);
        }
        System.out.println("Все сообщения отправлены");
    }
}
