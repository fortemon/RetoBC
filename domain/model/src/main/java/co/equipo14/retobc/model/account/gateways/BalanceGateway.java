package co.equipo14.retobc.model.account.gateways;

import co.equipo14.retobc.model.account.balance.Balances;
import co.equipo14.retobc.model.account.transactions.Transactions;
import reactor.core.publisher.Mono;


public interface BalanceGateway {
    Mono<Balances> getBalance(Transactions request);
}
