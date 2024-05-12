package com.juliobarros.aiassistantjava.factory;

import com.juliobarros.aiassistantjava.service.DocumentService;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;

public class DocumentAssistantFactory {
    private DocumentService documentAiService;

    public DocumentAssistantFactory(ChatLanguageModel chatModel) {
        documentAiService = buildDocumentAiService(chatModel);
    }

    public String chat(String message) {
        return documentAiService.chat(message);
    }

    private DocumentService buildDocumentAiService(ChatLanguageModel chatModel) {
        return AiServices.builder(DocumentService.class)
                .chatLanguageModel(chatModel)
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }
}
