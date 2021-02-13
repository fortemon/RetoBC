package co.equipo14.retobc.model.account.transactions;
import co.equipo14.retobc.model.account.AccountRQ;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TransactionsResponse {
    private String responseSize;
    private Boolean flagMoreRecords;
    private List<TransactionResponse> transactionResponse;
    private Office office;
    private Customer customer;
    private RelatedTransferAccount relatedTransferAccount;
}
