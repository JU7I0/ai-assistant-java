package com.juliobarros.aiassistantjava.controller;

import dev.langchain4j.model.chat.ChatLanguageModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juliobarros.aiassistantjava.dto.Prompt;
import com.juliobarros.aiassistantjava.factory.AiAssistantFactory;


@RestController
@RequestMapping("/api/chat")
public class AiAssistantController {

    @SuppressWarnings("rawtypes")
    @PostMapping
    public ResponseEntity chat(@RequestBody Prompt prompt) {
        ChatLanguageModel gemini = AiAssistantFactory.createLocalChatModel();

        String response = gemini.chat(prompt.getContent());
        return ResponseEntity.ok().body(response);
    }
}
