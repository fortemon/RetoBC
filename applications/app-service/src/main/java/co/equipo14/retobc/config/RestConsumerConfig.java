package co.equipo14.retobc.config;

import co.equipo14.retobc.usecase.saldosymovimientos.SaldosYMovimientosUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConsumerConfig {

    @Bean
    public SaldosYMovimientosUseCase getSaldosYMovimientosUseCase(){
        return new SaldosYMovimientosUseCase();
    }
}
