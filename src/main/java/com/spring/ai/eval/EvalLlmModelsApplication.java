package com.spring.ai.eval;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EvalLlmModelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvalLlmModelsApplication.class, args);
	}
	
	@Bean
	public ChatClient openAIChatClient(OpenAiChatModel chatModel) {
		return ChatClient.create(chatModel);
	}

	@Bean
	public ChatClient anthropicChatClient(AnthropicChatModel chatModel) {
		return ChatClient.create(chatModel);
	}

}