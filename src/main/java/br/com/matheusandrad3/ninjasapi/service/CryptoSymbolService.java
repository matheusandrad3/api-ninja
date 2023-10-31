package br.com.matheusandrad3.ninjasapi.service;

import br.com.matheusandrad3.ninjasapi.feignClient.NinjasClient;
import br.com.matheusandrad3.ninjasapi.feignClient.response.CryptoSymbolsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class CryptoSymbolService {

    private final NinjasClient client;
    @Value("${X.Api.key}")
    private String token;

    public CryptoSymbolsResponse getAllSymbols() {
        return client.generareSymbols(token);
    }
}
