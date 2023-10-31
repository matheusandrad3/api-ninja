package br.com.matheusandrad3.ninjasapi.controller;

import br.com.matheusandrad3.ninjasapi.feignClient.response.QuoteResponse;
import br.com.matheusandrad3.ninjasapi.service.QuoteSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/quotes")
@RequiredArgsConstructor
public class QuoteController {

    private final QuoteSevice quoteSevice;

    @GetMapping
    public ResponseEntity<List<QuoteResponse>> generateQuote
            (@RequestParam String category) {
        return ResponseEntity.ok(quoteSevice.generateQuote(category));
    }

}
