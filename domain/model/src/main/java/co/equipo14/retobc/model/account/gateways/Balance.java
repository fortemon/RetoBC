package co.equipo14.retobc.model.account.gateways;

import co.equipo14.retobc.model.account.AccountRQ;
import co.equipo14.retobc.model.account.balance.AccountBalance;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Balance {
    public Mono<AccountBalance> getBalance(AccountRQ request);
}
