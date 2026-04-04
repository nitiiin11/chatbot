package chatbot.whatsapp.chatbot.controller;

import chatbot.whatsapp.chatbot.model.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import chatbot.whatsapp.chatbot.service.ChatService;
@RestController
@RequestMapping("/api")

public class WebhookController {
    @Autowired
    private ChatService chatService;

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody MessageRequest request){
        System.out.println("Received message: " + request.getMessage());
        String response = chatService.getReply(request.getMessage());
        return response;
    }

}