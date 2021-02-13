package co.equipo14.retobc.model.account.transactions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TransactionResponse {
    private String id;
    private String postedDate;
    private String description;
    private Float amount;
    private String type;
    private String reference1;
    private String reference2;
    private String reference3;
    private String checkNumber;
    private Office office;
    private RelatedTransferAccount relatedTransferAccount;

}
