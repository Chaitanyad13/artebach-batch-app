package main.java.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import main.java.dto.TAB20V20Dto;
import main.java.services.Utility;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({})
public class TransactionReportDto {

	private String TITLE;
	private  String REPORT_NAME;
	private String DATE_TIME;
	private  String REPORT_FORMAT;
	private String ARTEBATCHREPORT_FILEPROCESSEDDATE;
	private String ARTEBATCHREPORT_REQUESTSTATUS;
	private String ARTEBATCHREPORT_REQUESTERROR;
	private List<TAB20V20Dto> transactionList = new ArrayList<>();

	public TransactionReportDto(String TITLE, String REPORT_NAME, String DATE_TIME, String REPORT_FORMAT, List<TAB20V20Dto> transactionList) {
		this.TITLE = TITLE;
		this.REPORT_NAME = REPORT_NAME;
		this.DATE_TIME = DATE_TIME;
		this.REPORT_FORMAT = REPORT_FORMAT;
		this.transactionList = transactionList;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}

	public String getREPORT_NAME() {
		return REPORT_NAME;
	}

	public void setREPORT_NAME(String REPORT_NAME) {
		this.REPORT_NAME = REPORT_NAME;
	}

	public String getDATE_TIME() {
		return DATE_TIME;
	}

	public void setDATE_TIME(String DATE_TIME) {
		this.DATE_TIME = DATE_TIME;
	}

	public String getREPORT_FORMAT() {
		return REPORT_FORMAT;
	}

	public void setREPORT_FORMAT(String REPORT_FORMAT) {
		this.REPORT_FORMAT = REPORT_FORMAT;
	}

	public List<TAB20V20Dto> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<TAB20V20Dto> transactionList) {
		this.transactionList = transactionList;
	}
	
	public void setARTEBATCHREPORT_FILEPROCESSEDDATE() {
		ARTEBATCHREPORT_FILEPROCESSEDDATE = Utility.generateDateTime();
	}

	public String getARTEBATCHREPORT_FILEPROCESSEDDATE() {
		return ARTEBATCHREPORT_FILEPROCESSEDDATE;
	}

	public String getARTEBATCHREPORT_REQUESTSTATUS() {
		return ARTEBATCHREPORT_REQUESTSTATUS;
	}

	public String getARTEBATCHREPORT_REQUESTERROR() {
		return ARTEBATCHREPORT_REQUESTERROR;
	}

	@Override
	public String toString() {
		return '{' + "{" +
				"TITLE='" + TITLE + '\'' +
				", REPORT_NAME='" + REPORT_NAME + '\'' +
				", DATE_TIME='" + DATE_TIME + '\'' +
				", REPORT_FORMAT='" + REPORT_FORMAT + '\'' +
				", ARTEBATCHREPORT_FILEPROCESSEDDATE='" + ARTEBATCHREPORT_FILEPROCESSEDDATE + '\'' +
				", ARTEBATCHREPORT_REQUESTSTATUS='" + ARTEBATCHREPORT_REQUESTSTATUS + '\'' +
				", ARTEBATCHREPORT_REQUESTERROR='" + ARTEBATCHREPORT_REQUESTERROR + '\'' +
				'}' +", transactionList=" + transactionList +
				'}';
	}
}
