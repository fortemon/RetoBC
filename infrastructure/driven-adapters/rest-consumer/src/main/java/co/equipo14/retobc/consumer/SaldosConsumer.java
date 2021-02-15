package co.equipo14.retobc.consumer;

import co.equipo14.retobc.model.account.AccountRQ;
import co.equipo14.retobc.model.account.balance.AccountBalance;
import co.equipo14.retobc.model.account.transactions.Transactions;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class SaldosConsumer // implements Gateway from domain
{
    @Autowired
    @Qualifier("Saldos")
    private WebClient client;


    public Mono<AccountBalance> getSaldos(Transactions request) {

        AccountRQ saldosRequest = AccountRQ.

        return client
            .post()
            .body(Mono.just(request), ObjectRequest.class)
            .retrieve()
            .bodyToMono(ObjectResponse.class);
    }
}