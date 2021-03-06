package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.io.*;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class UpdateDirectWithdrawVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, username ,privateKey,depositNumber,onDemand, minAmount, maxAmount and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String username;
    private String privateKey;
    private String depositNumber;
    private String onDemand;
    private String minAmount;
    private String maxAmount;
    private String wallet;
    private static String scProductId;


    public UpdateDirectWithdrawVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();

        this.username = builder.getUsername();
        this.privateKey = builder.getPrivateKey();
        this.depositNumber = builder.getDepositNumber();
        this.onDemand = TypeConversionUtil.booleanToString(builder.getOnDemand());
        this.minAmount = TypeConversionUtil.longToString(builder.getMinAmount());
        this.maxAmount = TypeConversionUtil.longToString(builder.getMaxAmount());
        this.wallet = builder.getWallet();
        this.id = TypeConversionUtil.longToString(builder.getId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_UPDATE_DIRECT_WITHDRAW);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_UPDATE_DIRECT_WITHDRAW);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public String getOnDemand() {
        return onDemand;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public String getWallet() {
        return wallet;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private String username;
        private String privateKey;
        private String depositNumber;
        private Boolean onDemand;
        private Long minAmount;
        private Long maxAmount;
        private String wallet;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setPrivateKey(File xmlFile) throws IOException {
            Reader fileReader = new FileReader(xmlFile);
            BufferedReader bufReader = new BufferedReader(fileReader);

            StringBuilder sb = new StringBuilder();
            String line = bufReader.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = bufReader.readLine();
            }
            String xml2String = sb.toString();
            this.privateKey = xml2String;
            bufReader.close();
            return this;
        }

        public String getDepositNumber() {
            return depositNumber;
        }

        public Builder setDepositNumber(String depositNumber) {
            this.depositNumber = depositNumber;
            return this;
        }

        public Boolean getOnDemand() {
            return onDemand;
        }

        public Builder setOnDemand(Boolean onDemand) {
            this.onDemand = onDemand;
            return this;
        }

        public Long getMinAmount() {
            return minAmount;
        }

        public Builder setMinAmount(Long minAmount) {
            this.minAmount = minAmount;
            return this;
        }

        public Long getMaxAmount() {
            return maxAmount;
        }

        public Builder setMaxAmount(Long maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }

        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public UpdateDirectWithdrawVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.id != null && this.baseInfoVo.getServerType()!=null)
                return new UpdateDirectWithdrawVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
