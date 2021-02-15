package co.equipo14.retobc.api;

import co.equipo14.retobc.usecase.saldosymovimientos.SaldosYMovimientosUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private final SaldosYMovimientosUseCase saldosYMovimientosUseCase;

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
//        Mono<SaldosYMovimientosUseCase> request = saldosYMovimientosUseCase.;
        return ServerResponse.ok().body(saldosYMovimientosUseCase.getSaldosYMovimientos(), String.class);
    }
}
