package co.equipo14.retobc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class RestConsumerConfig {

    @Value("${adapter.saldos.url}")
    private String saldosUrl;
    @Value("${adapter.movimientos.url}")
    private String movimientosUrl;


    @Bean(name="Saldos")
    public WebClient getWebClientSaldos() {
        return WebClient.builder()
            .baseUrl(saldosUrl)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
            .build();
    }

    @Bean(name="Movimientos")
    public WebClient getWebClientMovimientos() {
        return WebClient.builder()
            .baseUrl(saldosUrl)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
            .build();
    }

}
