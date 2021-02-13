package co.equipo14.retobc.model.account.balance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Balances {
    private float available;
    private float availableOverdraftBalance;
    private float overdraftValue;
    private float availableOverdraftQuota;
    private float cash;
    private float unavailable_clearing;
    private float receivable;
    private float blocked;
    private float unavailableStartDay_clearingStartDay;
    private float cashStartDay;
    private float pockets;
    private float remittanceQuota;
    private float agreedRemittanceQuota;
    private float remittanceQuotaUsage;
    private float normalInterest;
    private float suspensionInterest;
}
