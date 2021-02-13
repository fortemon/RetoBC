package co.equipo14.retobc.model.account.transactions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RelatedTransferAccount {
    private String type;
    private String number;
    private Customer customer;

}
