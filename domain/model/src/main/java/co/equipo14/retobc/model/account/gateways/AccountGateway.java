package co.equipo14.retobc.model.account.gateways;

import co.equipo14.retobc.model.account.balance.AccountBalance;
import reactor.core.publisher.Flux;

public interface AccountGateway {
    public Flux<AccountBalance> getBalance();
}
