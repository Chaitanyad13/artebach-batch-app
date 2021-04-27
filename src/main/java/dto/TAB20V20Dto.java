package main.java.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"header", "merchantId", "transactionReference", "transactionServiceType", "originAmount", "amount", "currencyCode", "transactionDateTime", "captureDay", "captureMode", "orderChannel", "paymentPattern",
        "paymentMeanType", "paymentMeanBrand", "maskedPan", "orderId", "responseCode", "authorisationId", "transactionStatus", "complementaryCode", "complementaryInfo", "merchantWalletId", "paymentMeanSequence",
        "merchantToken", "panExpiryDate", "captureLimitDate", "acquirerResponseCode", "cardCSCResultCode", "returnContext", "customerId", "customerIpAddress", "scoreValue", "scoreColor", "scoreProfile", "scoreThreshold",
        "guaranteeIndicator", "threeDHolderAuthentStatus", "merchantTokenOrigin", "terminalId", "bankCode", "sddMandateId", "panEntryMode", "walletType", "holderAuthentMethod", "holderAuthentStatus", "statementReference",
        "dccStatus", "dccAmount", "dccCurrencyCode", "dccExchangeRate", "dccRateValidity", "dccProvider", "remainingAmount", "fromTransactionRemainingAmount", "fromTransactionReference", "dueDate", "creditorId",
        "walletPaymentMeansAlias", "settlementMode", "holderAuthentProgram", "issuerWalletInformation", "s10TransactionId", "s10TransactionIdDate", "s10FromTransactionId", "s10FromTransactionIdDate", "acquirerResponseMessage",
        "paymentMeanTradingName", "transactionLink", "preAuthenticationValue", "preAuthenticationColor", "preAuthenticationProfile", "preAuthenticationThreshold", "messageFunction", "acquirerNativeResponseCode", "holderAddressCountry",
        "automaticResponseStatus", "cardCSCPresence", "paymentMeanBrandSelectionMode", "paymentMeanBrandSelectionStatus", "preAuthorisationProfileValue", "preAuthenticationProfileValue", "avsAddressResponseCode", "avsPostcodeResponseCode",
        "preAuthorisationProfile", "acquirerContractNumber", "paymentAttemptNumber", "holderAuthentType", "challengeMode3DS", "secureReference", "authentExemptionReasonList", "paymentMeanDataProvider"})
public class TAB20V20Dto {

    private String HEADER;
    private String merchantId;
    private String transactionReference;
    private String transactionServiceType;
    private String originAmount;
    private String amount;
    private String currencyCode;
    private String transactionDateTime;
    private String captureDay;
    private String captureMode;
    private String orderChannel;
    private String paymentPattern;
    private String paymentMeanType;
    private String paymentMeanBrand;
    private String maskedPan;
    private String orderId;
    private String responseCode;
    private String authorisationId;
    private String transactionStatus;
    private String complementaryCode;
    private String complementaryInfo;
    private String merchantWalletId;
    private String paymentMeanSequence;
    private String merchantToken;
    private String panExpiryDate;
    private String captureLimitDate;
    private String acquirerResponseCode;
    private String cardCSCResultCode;
    private String returnContext;
    private String customerId;
    private String customerIpAddress;
    private String scoreValue;
    private String scoreColor;
    private String scoreProfile;
    private String scoreThreshold;
    private String guaranteeIndicator;
    private String threeDHolderAuthentStatus;
    private String merchantTokenOrigin;
    private String terminalId;
    private String bankCode;
    private String sddMandateId;
    private String panEntryMode;
    private String walletType;
    private String holderAuthentMethod;
    private String holderAuthentStatus;
    private String statementReference;
    private String dccStatus;
    private String dccAmount;
    private String dccCurrencyCode;
    private String dccExchangeRate;
    private String dccRateValidity;
    private String dccProvider;
    private String remainingAmount;
    private String fromTransactionRemainingAmount;
    private String fromTransactionReference;
    private String dueDate;
    private String creditorId;
    private String walletPaymentMeansAlias;
    private String settlementMode;
    private String holderAuthentProgram;
    private String IssuerWalletInformation;
    private String s10TransactionId;
    private String s10TransactionIdDate;
    private String s10FromTransactionId;
    private String s10FromTransactionIdDate;
    private String acquirerResponseMessage;
    private String paymentMeanTradingName;
    private String transactionLink;
    private String preAuthenticationValue;
    private String preAuthenticationColor;
    private String preAuthenticationProfile;
    private String preAuthenticationThreshold;
    private String messageFunction;
    private String acquirerNativeResponseCode;
    private String holderAddressCountry;
    private String automaticResponseStatus;
    private String cardCSCPresence;
    private String paymentMeanBrandSelectionMode;
    private String paymentMeanBrandSelectionStatus;
    private String preAuthorisationProfileValue;
    private String preAuthenticationProfileValue;
    private String avsAddressResponseCode;
    private String avsPostcodeResponseCode;
    private String preAuthorisationProfile;
    private String acquirerContractNumber;
    private String paymentAttemptNumber;
    private String holderAuthentType;
    private String challengeMode3DS;
    private String secureReference;
    private String authentExemptionReasonList;
    private String paymentMeanDataProvider;


    public TAB20V20Dto() {
    }

    public String getHEADER() {
        return HEADER;
    }

    public void setHEADER(String HEADER) {
        this.HEADER = HEADER;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getTransactionServiceType() {
        return transactionServiceType;
    }

    public void setTransactionServiceType(String transactionServiceType) {
        this.transactionServiceType = transactionServiceType;
    }

    public String getOriginAmount() {
        return originAmount;
    }

    public void setOriginAmount(String originAmount) {
        this.originAmount = originAmount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getCaptureDay() {
        return captureDay;
    }

    public void setCaptureDay(String captureDay) {
        this.captureDay = captureDay;
    }

    public String getCaptureMode() {
        return captureMode;
    }

    public void setCaptureMode(String captureMode) {
        this.captureMode = captureMode;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getPaymentPattern() {
        return paymentPattern;
    }

    public void setPaymentPattern(String paymentPattern) {
        this.paymentPattern = paymentPattern;
    }

    public String getPaymentMeanType() {
        return paymentMeanType;
    }

    public void setPaymentMeanType(String paymentMeanType) {
        this.paymentMeanType = paymentMeanType;
    }

    public String getPaymentMeanBrand() {
        return paymentMeanBrand;
    }

    public void setPaymentMeanBrand(String paymentMeanBrand) {
        this.paymentMeanBrand = paymentMeanBrand;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getAuthorisationId() {
        return authorisationId;
    }

    public void setAuthorisationId(String authorisationId) {
        this.authorisationId = authorisationId;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getComplementaryCode() {
        return complementaryCode;
    }

    public void setComplementaryCode(String complementaryCode) {
        this.complementaryCode = complementaryCode;
    }

    public String getComplementaryInfo() {
        return complementaryInfo;
    }

    public void setComplementaryInfo(String complementaryInfo) {
        this.complementaryInfo = complementaryInfo;
    }

    public String getMerchantWalletId() {
        return merchantWalletId;
    }

    public void setMerchantWalletId(String merchantWalletId) {
        this.merchantWalletId = merchantWalletId;
    }

    public String getPaymentMeanSequence() {
        return paymentMeanSequence;
    }

    public void setPaymentMeanSequence(String paymentMeanSequence) {
        this.paymentMeanSequence = paymentMeanSequence;
    }

    public String getMerchantToken() {
        return merchantToken;
    }

    public void setMerchantToken(String merchantToken) {
        this.merchantToken = merchantToken;
    }

    public String getPanExpiryDate() {
        return panExpiryDate;
    }

    public void setPanExpiryDate(String panExpiryDate) {
        this.panExpiryDate = panExpiryDate;
    }

    public String getCaptureLimitDate() {
        return captureLimitDate;
    }

    public void setCaptureLimitDate(String captureLimitDate) {
        this.captureLimitDate = captureLimitDate;
    }

    public String getAcquirerResponseCode() {
        return acquirerResponseCode;
    }

    public void setAcquirerResponseCode(String acquirerResponseCode) {
        this.acquirerResponseCode = acquirerResponseCode;
    }

    public String getCardCSCResultCode() {
        return cardCSCResultCode;
    }

    public void setCardCSCResultCode(String cardCSCResultCode) {
        this.cardCSCResultCode = cardCSCResultCode;
    }

    public String getReturnContext() {
        return returnContext;
    }

    public void setReturnContext(String returnContext) {
        this.returnContext = returnContext;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerIpAddress() {
        return customerIpAddress;
    }

    public void setCustomerIpAddress(String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
    }

    public String getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(String scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getScoreColor() {
        return scoreColor;
    }

    public void setScoreColor(String scoreColor) {
        this.scoreColor = scoreColor;
    }

    public String getScoreProfile() {
        return scoreProfile;
    }

    public void setScoreProfile(String scoreProfile) {
        this.scoreProfile = scoreProfile;
    }

    public String getScoreThreshold() {
        return scoreThreshold;
    }

    public void setScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    public String getGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    public void setGuaranteeIndicator(String guaranteeIndicator) {
        this.guaranteeIndicator = guaranteeIndicator;
    }

    public String getThreeDHolderAuthentStatus() {
        return threeDHolderAuthentStatus;
    }

    public void setThreeDHolderAuthentStatus(String threeDHolderAuthentStatus) {
        this.threeDHolderAuthentStatus = threeDHolderAuthentStatus;
    }

    public String getMerchantTokenOrigin() {
        return merchantTokenOrigin;
    }

    public void setMerchantTokenOrigin(String merchantTokenOrigin) {
        this.merchantTokenOrigin = merchantTokenOrigin;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getSddMandateId() {
        return sddMandateId;
    }

    public void setSddMandateId(String sddMandateId) {
        this.sddMandateId = sddMandateId;
    }

    public String getPanEntryMode() {
        return panEntryMode;
    }

    public void setPanEntryMode(String panEntryMode) {
        this.panEntryMode = panEntryMode;
    }

    public String getWalletType() {
        return walletType;
    }

    public void setWalletType(String walletType) {
        this.walletType = walletType;
    }

    public String getHolderAuthentMethod() {
        return holderAuthentMethod;
    }

    public void setHolderAuthentMethod(String holderAuthentMethod) {
        this.holderAuthentMethod = holderAuthentMethod;
    }

    public String getHolderAuthentStatus() {
        return holderAuthentStatus;
    }

    public void setHolderAuthentStatus(String holderAuthentStatus) {
        this.holderAuthentStatus = holderAuthentStatus;
    }

    public String getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(String statementReference) {
        this.statementReference = statementReference;
    }

    public String getDccStatus() {
        return dccStatus;
    }

    public void setDccStatus(String dccStatus) {
        this.dccStatus = dccStatus;
    }

    public String getDccAmount() {
        return dccAmount;
    }

    public void setDccAmount(String dccAmount) {
        this.dccAmount = dccAmount;
    }

    public String getDccCurrencyCode() {
        return dccCurrencyCode;
    }

    public void setDccCurrencyCode(String dccCurrencyCode) {
        this.dccCurrencyCode = dccCurrencyCode;
    }

    public String getDccExchangeRate() {
        return dccExchangeRate;
    }

    public void setDccExchangeRate(String dccExchangeRate) {
        this.dccExchangeRate = dccExchangeRate;
    }

    public String getDccRateValidity() {
        return dccRateValidity;
    }

    public void setDccRateValidity(String dccRateValidity) {
        this.dccRateValidity = dccRateValidity;
    }

    public String getDccProvider() {
        return dccProvider;
    }

    public void setDccProvider(String dccProvider) {
        this.dccProvider = dccProvider;
    }

    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getFromTransactionRemainingAmount() {
        return fromTransactionRemainingAmount;
    }

    public void setFromTransactionRemainingAmount(String fromTransactionRemainingAmount) {
        this.fromTransactionRemainingAmount = fromTransactionRemainingAmount;
    }

    public String getFromTransactionReference() {
        return fromTransactionReference;
    }

    public void setFromTransactionReference(String fromTransactionReference) {
        this.fromTransactionReference = fromTransactionReference;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(String creditorId) {
        this.creditorId = creditorId;
    }

    public String getWalletPaymentMeansAlias() {
        return walletPaymentMeansAlias;
    }

    public void setWalletPaymentMeansAlias(String walletPaymentMeansAlias) {
        this.walletPaymentMeansAlias = walletPaymentMeansAlias;
    }

    public String getSettlementMode() {
        return settlementMode;
    }

    public void setSettlementMode(String settlementMode) {
        this.settlementMode = settlementMode;
    }

    public String getHolderAuthentProgram() {
        return holderAuthentProgram;
    }

    public void setHolderAuthentProgram(String holderAuthentProgram) {
        this.holderAuthentProgram = holderAuthentProgram;
    }

    public String getIssuerWalletInformation() {
        return IssuerWalletInformation;
    }

    public void setIssuerWalletInformation(String issuerWalletInformation) {
        IssuerWalletInformation = issuerWalletInformation;
    }

    public String getS10TransactionId() {
        return s10TransactionId;
    }

    public void setS10TransactionId(String s10TransactionId) {
        this.s10TransactionId = s10TransactionId;
    }

    public String getS10TransactionIdDate() {
        return s10TransactionIdDate;
    }

    public void setS10TransactionIdDate(String s10TransactionIdDate) {
        this.s10TransactionIdDate = s10TransactionIdDate;
    }

    public String getS10FromTransactionId() {
        return s10FromTransactionId;
    }

    public void setS10FromTransactionId(String s10FromTransactionId) {
        this.s10FromTransactionId = s10FromTransactionId;
    }

    public String getS10FromTransactionIdDate() {
        return s10FromTransactionIdDate;
    }

    public void setS10FromTransactionIdDate(String s10FromTransactionIdDate) {
        this.s10FromTransactionIdDate = s10FromTransactionIdDate;
    }

    public String getAcquirerResponseMessage() {
        return acquirerResponseMessage;
    }

    public void setAcquirerResponseMessage(String acquirerResponseMessage) {
        this.acquirerResponseMessage = acquirerResponseMessage;
    }

    public String getPaymentMeanTradingName() {
        return paymentMeanTradingName;
    }

    public void setPaymentMeanTradingName(String paymentMeanTradingName) {
        this.paymentMeanTradingName = paymentMeanTradingName;
    }

    public String getTransactionLink() {
        return transactionLink;
    }

    public void setTransactionLink(String transactionLink) {
        this.transactionLink = transactionLink;
    }

    public String getPreAuthenticationValue() {
        return preAuthenticationValue;
    }

    public void setPreAuthenticationValue(String preAuthenticationValue) {
        this.preAuthenticationValue = preAuthenticationValue;
    }

    public String getPreAuthenticationColor() {
        return preAuthenticationColor;
    }

    public void setPreAuthenticationColor(String preAuthenticationColor) {
        this.preAuthenticationColor = preAuthenticationColor;
    }

    public String getPreAuthenticationProfile() {
        return preAuthenticationProfile;
    }

    public void setPreAuthenticationProfile(String preAuthenticationProfile) {
        this.preAuthenticationProfile = preAuthenticationProfile;
    }

    public String getPreAuthenticationThreshold() {
        return preAuthenticationThreshold;
    }

    public void setPreAuthenticationThreshold(String preAuthenticationThreshold) {
        this.preAuthenticationThreshold = preAuthenticationThreshold;
    }

    public String getMessageFunction() {
        return messageFunction;
    }

    public void setMessageFunction(String messageFunction) {
        this.messageFunction = messageFunction;
    }

    public String getAcquirerNativeResponseCode() {
        return acquirerNativeResponseCode;
    }

    public void setAcquirerNativeResponseCode(String acquirerNativeResponseCode) {
        this.acquirerNativeResponseCode = acquirerNativeResponseCode;
    }

    public String getHolderAddressCountry() {
        return holderAddressCountry;
    }

    public void setHolderAddressCountry(String holderAddressCountry) {
        this.holderAddressCountry = holderAddressCountry;
    }

    public String getAutomaticResponseStatus() {
        return automaticResponseStatus;
    }

    public void setAutomaticResponseStatus(String automaticResponseStatus) {
        this.automaticResponseStatus = automaticResponseStatus;
    }

    public String getCardCSCPresence() {
        return cardCSCPresence;
    }

    public void setCardCSCPresence(String cardCSCPresence) {
        this.cardCSCPresence = cardCSCPresence;
    }

    public String getPaymentMeanBrandSelectionMode() {
        return paymentMeanBrandSelectionMode;
    }

    public void setPaymentMeanBrandSelectionMode(String paymentMeanBrandSelectionMode) {
        this.paymentMeanBrandSelectionMode = paymentMeanBrandSelectionMode;
    }

    public String getPaymentMeanBrandSelectionStatus() {
        return paymentMeanBrandSelectionStatus;
    }

    public void setPaymentMeanBrandSelectionStatus(String paymentMeanBrandSelectionStatus) {
        this.paymentMeanBrandSelectionStatus = paymentMeanBrandSelectionStatus;
    }

    public String getPreAuthorisationProfileValue() {
        return preAuthorisationProfileValue;
    }

    public void setPreAuthorisationProfileValue(String preAuthorisationProfileValue) {
        this.preAuthorisationProfileValue = preAuthorisationProfileValue;
    }

    public String getPreAuthenticationProfileValue() {
        return preAuthenticationProfileValue;
    }

    public void setPreAuthenticationProfileValue(String preAuthenticationProfileValue) {
        this.preAuthenticationProfileValue = preAuthenticationProfileValue;
    }

    public String getAvsAddressResponseCode() {
        return avsAddressResponseCode;
    }

    public void setAvsAddressResponseCode(String avsAddressResponseCode) {
        this.avsAddressResponseCode = avsAddressResponseCode;
    }

    public String getAvsPostcodeResponseCode() {
        return avsPostcodeResponseCode;
    }

    public void setAvsPostcodeResponseCode(String avsPostcodeResponseCode) {
        this.avsPostcodeResponseCode = avsPostcodeResponseCode;
    }

    public String getPreAuthorisationProfile() {
        return preAuthorisationProfile;
    }

    public void setPreAuthorisationProfile(String preAuthorisationProfile) {
        this.preAuthorisationProfile = preAuthorisationProfile;
    }

    public String getAcquirerContractNumber() {
        return acquirerContractNumber;
    }

    public void setAcquirerContractNumber(String acquirerContractNumber) {
        this.acquirerContractNumber = acquirerContractNumber;
    }

    public String getPaymentAttemptNumber() {
        return paymentAttemptNumber;
    }

    public void setPaymentAttemptNumber(String paymentAttemptNumber) {
        this.paymentAttemptNumber = paymentAttemptNumber;
    }

    public String getHolderAuthentType() {
        return holderAuthentType;
    }

    public void setHolderAuthentType(String holderAuthentType) {
        this.holderAuthentType = holderAuthentType;
    }

    public String getChallengeMode3DS() {
        return challengeMode3DS;
    }

    public void setChallengeMode3DS(String challengeMode3DS) {
        this.challengeMode3DS = challengeMode3DS;
    }

    public String getSecureReference() {
        return secureReference;
    }

    public void setSecureReference(String secureReference) {
        this.secureReference = secureReference;
    }

    public String getAuthentExemptionReasonList() {
        return authentExemptionReasonList;
    }

    public void setAuthentExemptionReasonList(String authentExemptionReasonList) {
        this.authentExemptionReasonList = authentExemptionReasonList;
    }

    public String getPaymentMeanDataProvider() {
        return paymentMeanDataProvider;
    }

    public void setPaymentMeanDataProvider(String paymentMeanDataProvider) {
        this.paymentMeanDataProvider = paymentMeanDataProvider;
    }

    @Override
    public String toString() {
        return "{" +
                "HEADER='" + + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", transactionReference='" + transactionReference + '\'' +
                ", transactionServiceType='" + transactionServiceType + '\'' +
                ", originAmount='" + originAmount + '\'' +
                ", amount='" + amount + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", transactionDateTime='" + transactionDateTime + '\'' +
                ", captureDay='" + captureDay + '\'' +
                ", captureMode='" + captureMode + '\'' +
                ", orderChannel='" + orderChannel + '\'' +
                ", paymentPattern='" + paymentPattern + '\'' +
                ", paymentMeanType='" + paymentMeanType + '\'' +
                ", paymentMeanBrand='" + paymentMeanBrand + '\'' +
                ", maskedPan='" + maskedPan + '\'' +
                ", orderId='" + orderId + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", authorisationId='" + authorisationId + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", complementaryCode='" + complementaryCode + '\'' +
                ", complementaryInfo='" + complementaryInfo + '\'' +
                ", merchantWalletId='" + merchantWalletId + '\'' +
                ", paymentMeanSequence='" + paymentMeanSequence + '\'' +
                ", merchantToken='" + merchantToken + '\'' +
                ", panExpiryDate='" + panExpiryDate + '\'' +
                ", captureLimitDate='" + captureLimitDate + '\'' +
                ", acquirerResponseCode='" + acquirerResponseCode + '\'' +
                ", cardCSCResultCode='" + cardCSCResultCode + '\'' +
                ", returnContext='" + returnContext + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerIpAddress='" + customerIpAddress + '\'' +
                ", scoreValue='" + scoreValue + '\'' +
                ", scoreColor='" + scoreColor + '\'' +
                ", scoreProfile='" + scoreProfile + '\'' +
                ", scoreThreshold='" + scoreThreshold + '\'' +
                ", guaranteeIndicator='" + guaranteeIndicator + '\'' +
                ", threeDHolderAuthentStatus='" + threeDHolderAuthentStatus + '\'' +
                ", merchantTokenOrigin='" + merchantTokenOrigin + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", sddMandateId='" + sddMandateId + '\'' +
                ", panEntryMode='" + panEntryMode + '\'' +
                ", walletType='" + walletType + '\'' +
                ", holderAuthentMethod='" + holderAuthentMethod + '\'' +
                ", holderAuthentStatus='" + holderAuthentStatus + '\'' +
                ", statementReference='" + statementReference + '\'' +
                ", dccStatus='" + dccStatus + '\'' +
                ", dccAmount='" + dccAmount + '\'' +
                ", dccCurrencyCode='" + dccCurrencyCode + '\'' +
                ", dccExchangeRate='" + dccExchangeRate + '\'' +
                ", dccRateValidity='" + dccRateValidity + '\'' +
                ", dccProvider='" + dccProvider + '\'' +
                ", remainingAmount='" + remainingAmount + '\'' +
                ", fromTransactionRemainingAmount='" + fromTransactionRemainingAmount + '\'' +
                ", fromTransactionReference='" + fromTransactionReference + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", creditorId='" + creditorId + '\'' +
                ", walletPaymentMeansAlias='" + walletPaymentMeansAlias + '\'' +
                ", settlementMode='" + settlementMode + '\'' +
                ", holderAuthentProgram='" + holderAuthentProgram + '\'' +
                ", IssuerWalletInformation='" + IssuerWalletInformation + '\'' +
                ", s10TransactionId='" + s10TransactionId + '\'' +
                ", s10TransactionIdDate='" + s10TransactionIdDate + '\'' +
                ", s10FromTransactionId='" + s10FromTransactionId + '\'' +
                ", s10FromTransactionIdDate='" + s10FromTransactionIdDate + '\'' +
                ", acquirerResponseMessage='" + acquirerResponseMessage + '\'' +
                ", paymentMeanTradingName='" + paymentMeanTradingName + '\'' +
                ", transactionLink='" + transactionLink + '\'' +
                ", preAuthenticationValue='" + preAuthenticationValue + '\'' +
                ", preAuthenticationColor='" + preAuthenticationColor + '\'' +
                ", preAuthenticationProfile='" + preAuthenticationProfile + '\'' +
                ", preAuthenticationThreshold='" + preAuthenticationThreshold + '\'' +
                ", messageFunction='" + messageFunction + '\'' +
                ", acquirerNativeResponseCode='" + acquirerNativeResponseCode + '\'' +
                ", holderAddressCountry='" + holderAddressCountry + '\'' +
                ", automaticResponseStatus='" + automaticResponseStatus + '\'' +
                ", cardCSCPresence='" + cardCSCPresence + '\'' +
                ", paymentMeanBrandSelectionMode='" + paymentMeanBrandSelectionMode + '\'' +
                ", paymentMeanBrandSelectionStatus='" + paymentMeanBrandSelectionStatus + '\'' +
                ", preAuthorisationProfileValue='" + preAuthorisationProfileValue + '\'' +
                ", preAuthenticationProfileValue='" + preAuthenticationProfileValue + '\'' +
                ", avsAddressResponseCode='" + avsAddressResponseCode + '\'' +
                ", avsPostcodeResponseCode='" + avsPostcodeResponseCode + '\'' +
                ", preAuthorisationProfile='" + preAuthorisationProfile + '\'' +
                ", acquirerContractNumber='" + acquirerContractNumber + '\'' +
                ", paymentAttemptNumber='" + paymentAttemptNumber + '\'' +
                ", holderAuthentType='" + holderAuthentType + '\'' +
                ", challengeMode3DS='" + challengeMode3DS + '\'' +
                ", secureReference='" + secureReference + '\'' +
                ", authentExemptionReasonList='" + authentExemptionReasonList + '\'' +
                ", paymentMeanDataProvider='" + paymentMeanDataProvider + '\'' +
                '}';
    }
}
