package com.fanap.billingService.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by h.mehrara on 6/28/2016.
 */
/*@ApiObject(
        name = "VoucherUsageSrv",
        description = "desc"
)*/
public class VoucherUsageSrv implements Serializable {
    private String hash;
    private long consumDate;
    private BigDecimal usedAmount;
    private boolean canceled;

    public long getConsumDate() {
        return consumDate;
    }

    public void setConsumDate(long consumDate) {
        this.consumDate = consumDate;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
