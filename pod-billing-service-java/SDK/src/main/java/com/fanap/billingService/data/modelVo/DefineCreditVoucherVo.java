package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.PodServicesEnum;
import com.fanap.billingService.util.TypeConversionUtil;
import com.fanap.billingService.util.Voucher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */
public class DefineCreditVoucherVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, guildCode, expireDate, count, amount, name and description are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String guildCode;
    private String expireDate;
    private List<String> count;
    private List<String> amount;
    private List<String> name;
    private List<String> description;
    private String limitedConsumerId;
    private String currencyCode;
    private List<String> hashCode;
    private Voucher[] vouchers;
    private static String scProductId;


    public DefineCreditVoucherVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.guildCode = builder.getGuildCode();
        this.expireDate = builder.getExpireDate();
        this.count = TypeConversionUtil.intToString(builder.getCount());
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.name = builder.getName();
        this.description = builder.getDescription();
        this.limitedConsumerId = TypeConversionUtil.longToString(builder.getLimitedConsumerId());
        this.currencyCode = builder.getCurrencyCode();
        this.hashCode = builder.getHashCode();
        this.vouchers = builder.getVouchers();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_DEFINE_CREDIT_VOUCHER);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public List<String> getCount() {
        return count;
    }

    public List<String> getAmount() {
        return amount;
    }

    public List<String> getName() {
        return name;
    }

    public List<String> getDescription() {
        return description;
    }

    public String getLimitedConsumerId() {
        return limitedConsumerId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public List<String> getHashCode() {
        return hashCode;
    }

    public Voucher[] getVouchers() {
        return vouchers;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String guildCode;
        private String expireDate;
        private List<Integer> count;
        private List<Long> amount;
        private List<String> name;
        private List<String> description;
        private Long limitedConsumerId;
        private String currencyCode;
        private List<String> hashCode;
        private Voucher[] vouchers;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getExpireDate() {
            return expireDate;
        }

        public Builder setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        public Builder setExpireDate(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.expireDate = d;
            return this;

        }

        public List<Integer> getCount() {
            return count;
        }


        public List<Long> getAmount() {
            return amount;
        }


        public List<String> getName() {
            return name;
        }


        public List<String> getDescription() {
            return description;
        }


        public Long getLimitedConsumerId() {
            return limitedConsumerId;
        }

        public Builder setLimitedConsumerId(Long limitedConsumerId) {
            this.limitedConsumerId = limitedConsumerId;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public List<String> getHashCode() {
            return hashCode;
        }

        public Builder setHashCode(List<String> hash) {
            this.hashCode = hash;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public Voucher[] getVouchers() {
            return vouchers;
        }

        public Builder setVouchers(Voucher[] vouchers) {
            List<Integer> counts = new ArrayList<>();
            List<Long> amounts = new ArrayList<>();
            List<String> names = new ArrayList<>();
            List<String> descriptions = new ArrayList<>();
            for (int i = 0; i < vouchers.length; i++) {
                if (vouchers[i] != null) {
                    counts.add(i, vouchers[i].getCount());
                    amounts.add(i, vouchers[i].getAmount());
                    names.add(i, vouchers[i].getName());
                    descriptions.add(i, vouchers[i].getDescription());
                }
            }
            this.count = counts;
            this.amount = amounts;
            this.name = names;
            this.description = descriptions;
            return this;
        }

        public Builder setCount(Voucher[] vouchers) {
            for (int i = 0; i < vouchers.length; i++) {
                List<Integer> counts = new ArrayList<>();
                if (vouchers[i] != null) {
                    counts.add(i, vouchers[i].getCount());
                }
                this.count = count;

            }
            return this;
        }

        public Builder setAmount(Voucher[] vouchers) {
            List<Long> amounts = new ArrayList<>();
            for (int i = 0; i < vouchers.length; i++) {
                if (vouchers[i] != null) {
                    amounts.add(i, vouchers[i].getAmount());
                }
            }
            this.count = count;
            return this;
        }


        public Builder setName(Voucher[] vouchers) {
            List<String> names = new ArrayList<>();
            for (int i = 0; i < vouchers.length; i++) {
                if (vouchers[i] != null) {
                    names.add(i, vouchers[i].getName());
                }
            }
            this.count = count;
            return this;
        }

        public Builder setDescription(Voucher[] vouchers) {
            List<String> descriptions = new ArrayList<>();
            for (int i = 0; i < vouchers.length; i++) {
                if (vouchers[i] != null) {
                    descriptions.add(i, vouchers[i].getDescription());
                }
            }
            this.count = count;
            return this;
        }

        public DefineCreditVoucherVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.guildCode != null && this.expireDate != null
                    && this.count != null && this.amount != null && this.name != null && this.description != null)
                return new DefineCreditVoucherVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}