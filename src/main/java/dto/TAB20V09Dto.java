package main.java.dto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"header", "merchantId", "transactionReference", "operationSequence", "operationName", "operationAmount", "currencyCode", "transactionDateTime", "operationDateTime", "responseCode", "newStatus", "orderId",
    "paymentMeanType", "paymentMeanBrand", "newAmount", "operationOrigin", "acquirerResponseCode", "customerId", "orderChannel", "dccResponseCode", "dccAmount", "dccCurrencyCode", "dccExchangeRate",
    "dccRateValidity", "dccProvider", "remainingAmount", "s10TransactionId", "s10TransactionIdDate", "messageFunction", "acquirerNativeResponseCode", "returnContext", "authorisationId", "acquirerContractNumber", "guaranteeIndicator", "secureReference"})

public class TAB20V09Dto {
	
    private String HEADER;
    private String merchantId;
    private String transactionReference;
    private String operationSequence;
    private String operationName;
    private String operationAmount;
    private String currencyCode;
    private String transactionDateTime;
    private String operationDateTime;
    private String responseCode;
    private String newStatus;
    private String orderId;
    private String paymentMeanType;
    private String paymentMeanBrand;
    private String newAmount;
    private String operationOrigin;
    private String acquirerResponseCode;
    private String customerId;
    private String orderChannel;
    private String dccResponseCode;
    private String dccAmount;
    private String dccCurrencyCode;
    private String dccExchangeRate;
    private String dccRateValidity;
    private String dccProvider;
    private String remainingAmount;
    private String s10TransactionId;
    private String s10TransactionIdDate;
    private String messageFunction;
    private String acquirerNativeResponseCode;
    private String returnContext;
    private String authorisationId;
    private String acquirerContractNumber;
    private String guaranteeIndicator;
    private String secureReference;
    
    public TAB20V09Dto() {
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

	public String getOperationSequence() {
		return operationSequence;
	}

	public void setOperationSequence(String operationSequence) {
		this.operationSequence = operationSequence;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationAmount() {
		return operationAmount;
	}

	public void setOperationAmount(String operationAmount) {
		this.operationAmount = operationAmount;
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

	public String getOperationDateTime() {
		return operationDateTime;
	}

	public void setOperationDateTime(String operationDateTime) {
		this.operationDateTime = operationDateTime;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getNewAmount() {
		return newAmount;
	}

	public void setNewAmount(String newAmount) {
		this.newAmount = newAmount;
	}

	public String getOperationOrigin() {
		return operationOrigin;
	}

	public void setOperationOrigin(String operationOrigin) {
		this.operationOrigin = operationOrigin;
	}

	public String getAcquirerResponseCode() {
		return acquirerResponseCode;
	}

	public void setAcquirerResponseCode(String acquirerResponseCode) {
		this.acquirerResponseCode = acquirerResponseCode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderChannel() {
		return orderChannel;
	}

	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getDccResponseCode() {
		return dccResponseCode;
	}

	public void setDccResponseCode(String dccResponseCode) {
		this.dccResponseCode = dccResponseCode;
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

	public String getReturnContext() {
		return returnContext;
	}

	public void setReturnContext(String returnContext) {
		this.returnContext = returnContext;
	}

	public String getAuthorisationId() {
		return authorisationId;
	}

	public void setAuthorisationId(String authorisationId) {
		this.authorisationId = authorisationId;
	}

	public String getAcquirerContractNumber() {
		return acquirerContractNumber;
	}

	public void setAcquirerContractNumber(String acquirerContractNumber) {
		this.acquirerContractNumber = acquirerContractNumber;
	}

	public String getGuaranteeIndicator() {
		return guaranteeIndicator;
	}

	public void setGuaranteeIndicator(String guaranteeIndicator) {
		this.guaranteeIndicator = guaranteeIndicator;
	}

	public String getSecureReference() {
		return secureReference;
	}

	public void setSecureReference(String secureReference) {
		this.secureReference = secureReference;
	}

	@Override
	public String toString() {
		return "Operation List [HEADER=" + HEADER + ", merchantId=" + merchantId + ", transactionReference="
				+ transactionReference + ", operationSequence=" + operationSequence + ", operationName=" + operationName
				+ ", operationAmount=" + operationAmount + ", currencyCode=" + currencyCode + ", transactionDateTime="
				+ transactionDateTime + ", operationDateTime=" + operationDateTime + ", responseCode=" + responseCode
				+ ", newStatus=" + newStatus + ", orderId=" + orderId + ", paymentMeanType=" + paymentMeanType
				+ ", paymentMeanBrand=" + paymentMeanBrand + ", newAmount=" + newAmount + ", operationOrigin="
				+ operationOrigin + ", acquirerResponseCode=" + acquirerResponseCode + ", customerId=" + customerId
				+ ", orderChannel=" + orderChannel + ", dccResponseCode=" + dccResponseCode + ", dccAmount=" + dccAmount
				+ ", dccCurrencyCode=" + dccCurrencyCode + ", dccExchangeRate=" + dccExchangeRate + ", dccRateValidity="
				+ dccRateValidity + ", dccProvider=" + dccProvider + ", remainingAmount=" + remainingAmount
				+ ", s10TransactionId=" + s10TransactionId + ", s10TransactionIdDate=" + s10TransactionIdDate
				+ ", messageFunction=" + messageFunction + ", acquirerNativeResponseCode=" + acquirerNativeResponseCode
				+ ", returnContext=" + returnContext + ", authorisationId=" + authorisationId
				+ ", acquirerContractNumber=" + acquirerContractNumber + ", guaranteeIndicator=" + guaranteeIndicator
				+ ", secureReference=" + secureReference + "]";
	}
}
