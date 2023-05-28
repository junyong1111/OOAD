package com.project.kmuflow.GPT;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class GPTRequest {
    private String model = "text-davinci-003";
    private String prompt;
    private int temperature = 1;

    @JsonProperty(value ="max_tokens")
    private int maxTokens = 100;
}
