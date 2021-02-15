package co.equipo14.retobc.usecase.saldosymovimientos;

import co.equipo14.retobc.model.account.gateways.Balance;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaldosYMovimientosUseCase {
    //private final Balance balance;

    public Mono<String> getSaldosYMovimientos(){
        return Mono.just("Hola mundo");
    }
}
