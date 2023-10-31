package br.com.matheusandrad3.ninjasapi.feignClient.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class QuoteResponse {

    private String quote;
    private String author;
    private String category;

}
