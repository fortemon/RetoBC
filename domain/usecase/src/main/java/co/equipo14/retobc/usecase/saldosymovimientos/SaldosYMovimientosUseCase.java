package co.equipo14.retobc.usecase.saldosymovimientos;

import co.equipo14.retobc.model.account.balance.AccountBalance;
import co.equipo14.retobc.model.account.gateways.BalanceGateway;
import co.equipo14.retobc.model.account.transactions.Transactions;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaldosYMovimientosUseCase {
    private final BalanceGateway balanceGateway;

    public Mono<AccountBalance> getSaldosYMovimientos(Transactions request){
        return balanceGateway.getBalance(request).flatMap(response -> {
            return Mono.just(AccountBalance.builder().balances(response).build());
        });
    }

}
