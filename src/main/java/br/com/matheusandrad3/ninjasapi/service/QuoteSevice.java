package br.com.matheusandrad3.ninjasapi.service;

import br.com.matheusandrad3.ninjasapi.feignClient.NinjasClient;
import br.com.matheusandrad3.ninjasapi.feignClient.response.QuoteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuoteSevice {

    private final NinjasClient ninjasClient;
    @Value("${X.Api.key}")
    private String token;

    public List<QuoteResponse> generateQuote(String category) {
        return ninjasClient.generateQuote(category, token);
    }
}
