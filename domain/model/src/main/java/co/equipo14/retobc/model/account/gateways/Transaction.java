package co.equipo14.retobc.model.account.gateways;

import co.equipo14.retobc.model.account.AccountRQ;
import co.equipo14.retobc.model.account.transactions.TransactionsResponse;
import reactor.core.publisher.Mono;

public interface Transaction {
    public Mono<TransactionsResponse> getTransactions(AccountRQ request);
}
