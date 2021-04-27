package main.java.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import main.java.dto.TAB20V20Dto;
import main.java.dto.TransactionReportDto;

public class ConvertTransactionReportService {

	/*
	 * private static final String SOURCEFILEPATH =
	 * "/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/src/"; private static
	 * final String DESTINATIONFILEPATH =
	 * "/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/processedOutput/";
	 */
	
	private static final String SOURCEFILEPATH = "C:\\Users\\A688925\\Desktop\\Work\\Artebatch\\FileProcessing\\src\\";  
	private static final String DESTINATIONFILEPATH = "C:\\Users\\A688925\\Desktop\\Work\\Artebatch\\FileProcessing\\processedOutput\\";
	
	private static final Logger logger = LoggerFactory.getLogger(ConvertTransactionReportService.class);

	
	/**report converter to json file
	 * @throws IOException
	 */
	public void processReport() throws IOException {

		//Read CSV File into Java List Objects
		TransactionReportDto transactionReport =	readCsvFile(SOURCEFILEPATH + "MAILFILE.ubz-reports.trans.MM20testartebatc2175.201120_000101.txt");
		logger.debug("transactionReport:", transactionReport);

		//Convert Java List Objects to JSON File
		convertJavaObject2JsonFile(transactionReport, DESTINATIONFILEPATH + "Trans_MM20testartebatc2175_"+Utility.generateDateTime()+".json");
		logger.debug("report converted to json file");
	}


	/**
	 * Read transaction report CSV File into Memory
	 * @param filePath
	 * @throws IOException
	 * @return
	 */
	private TransactionReportDto readCsvFile(String filePath) throws IOException {
		File csvFile = new File(filePath);
		logger.debug("Csv file: "+ csvFile);

		CsvMapper csvMapper = new CsvMapper();

		CSVParser csvParser =  new CSVParser( new BufferedReader(new FileReader(filePath)), CSVFormat.newFormat(';') );

		Iterator<CSVRecord> iterator = csvParser.iterator();

		CSVRecord next = iterator.next();

		String TITLE = next.get(0);
		String REPORT_NAME = next.get(1);
		String DATE_TIME = next.get(2);
		String REPORT_FORMAT = next.get(3);

		CsvSchema csvSchema = csvMapper
				.typedSchemaFor(TAB20V20Dto.class)
				.withHeader()
				.withColumnSeparator(';')
				.withComments().withSkipFirstDataRow(true);

		MappingIterator<TAB20V20Dto> TAB20V20Iter = csvMapper
				.readerWithTypedSchemaFor(TAB20V20Dto.class)
				.with(csvSchema)
				.readValues(csvFile);

		List<TAB20V20Dto> transactionList = TAB20V20Iter.readAll();
		logger.debug("transactionList:"+transactionList);
		TransactionReportDto transactionReport = new TransactionReportDto(TITLE,REPORT_NAME,DATE_TIME,REPORT_FORMAT,transactionList);
		logger.debug("transaction Report:"+transactionReport);
		
		return transactionReport;

	}

	 /**
     * Convert transaction report Object to JSON File
     * @param operationReport
     * @param pathFile
     */
	private void convertJavaObject2JsonFile(TransactionReportDto transactionReport, String pathFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		File file = new File(pathFile);
		try {
			// Serialize Java object info JSON file.
			//       mapper.writeValue(file, transactionList);
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, transactionReport);
			logger.info("write to json file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
