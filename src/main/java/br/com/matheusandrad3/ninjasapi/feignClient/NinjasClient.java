package br.com.matheusandrad3.ninjasapi.feignClient;

import br.com.matheusandrad3.ninjasapi.feignClient.response.CryptoSymbolsResponse;
import br.com.matheusandrad3.ninjasapi.feignClient.response.QuoteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "ninjasapi", url = "https://api.api-ninjas.com/v1/")
public interface NinjasClient {
    @GetMapping("/quotes")
    List<QuoteResponse> generateQuote
            (@RequestParam String category, @RequestHeader("X-Api-Key") String token);

    @GetMapping("/cryptosymbols")
    CryptoSymbolsResponse generareSymbols
            (@RequestHeader("X-Api-Key") String token);
}
