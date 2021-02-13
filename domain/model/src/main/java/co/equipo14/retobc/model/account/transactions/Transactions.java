package co.equipo14.retobc.model.account.transactions;
import co.equipo14.retobc.model.account.AccountRQ;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Transactions {
    private Pagination pagination;
    private AccountRQ account;
}
