package com.spring.ai.eval.llm.dto;

import com.fasterxml.jackson.annotation.JsonRawValue;

public record PromptTuningResult(@JsonRawValue String llmResponse, LlmEvaluationResponse evalResponse, @JsonRawValue String improvementSuggestion) {

}
