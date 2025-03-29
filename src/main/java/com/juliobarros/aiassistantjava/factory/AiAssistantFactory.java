package com.juliobarros.aiassistantjava.factory;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.request.ResponseFormat;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class AiAssistantFactory {

    static String apiKey = System.getenv("GOOGLE_GEMINI_API_KEY");

    private AiAssistantFactory() {
    }

    public static ChatLanguageModel createLocalChatModel() {
        return GoogleAiGeminiChatModel.builder()
            .apiKey(apiKey)
            .modelName("gemini-2.0-flash")
            .responseFormat(ResponseFormat.TEXT)
            .build();
    }

}
