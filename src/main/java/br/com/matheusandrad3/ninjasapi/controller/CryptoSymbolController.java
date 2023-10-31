package br.com.matheusandrad3.ninjasapi.controller;

import br.com.matheusandrad3.ninjasapi.feignClient.response.CryptoSymbolsResponse;
import br.com.matheusandrad3.ninjasapi.service.CryptoSymbolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/cryptosymbols")
public class CryptoSymbolController {

    private final CryptoSymbolService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CryptoSymbolsResponse> getAllSymbols() {
        return ResponseEntity.ok(service.getAllSymbols());
    }

}
