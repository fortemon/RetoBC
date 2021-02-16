package co.equipo14.retobc.api;

import co.equipo14.retobc.model.account.balance.AccountBalance;
import co.equipo14.retobc.model.account.transactions.Transactions;
import co.equipo14.retobc.usecase.saldosymovimientos.SaldosYMovimientosUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private final SaldosYMovimientosUseCase saldosYMovimientosUseCase;

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {

        Mono<Transactions> request = serverRequest.bodyToMono(Transactions.class);
        Mono<AccountBalance> response = request.flatMap(r -> saldosYMovimientosUseCase.getSaldosYMovimientos(r));

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(response, AccountBalance.class);
    }
}
