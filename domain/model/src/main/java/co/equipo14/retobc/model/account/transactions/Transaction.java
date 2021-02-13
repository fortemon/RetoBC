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
public class Transaction {
    private String startDate;
    private String endDate;
    private Float minAmount;
    private Float maxAmount;
    private String type;
    private String checkNumber;
    private String group;
    private String description;
    private Office office;
}
