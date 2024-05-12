package com.juliobarros.aiassistantjava.controller;

import com.juliobarros.aiassistantjava.DTO.MessageDTO;
import com.juliobarros.aiassistantjava.factory.AiAssistantFactory;
import com.juliobarros.aiassistantjava.factory.DocumentAssistantFactory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class AiAssistantController {

    @SuppressWarnings("rawtypes")
    @PostMapping
    public ResponseEntity chat(@RequestBody MessageDTO messageDTO){
        ChatLanguageModel chatModel = AiAssistantFactory.createLocalChatModel();

        var documentAssistant = new DocumentAssistantFactory(chatModel);
        String response = documentAssistant.chat(messageDTO.message());
        return ResponseEntity.ok().body(response);
    }
}
