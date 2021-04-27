package main.java.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import main.java.dto.OperationReportDto;
import main.java.dto.TAB20V09Dto;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class ConvertOperationReportService {
	
	private static final String SOURCE_FILEPATH = "/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/src/";
	private static final String DESTINATION_FILEPATH = "/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/processedOutput/";
	
	private static final Logger logger = LoggerFactory.getLogger(ConvertOperationReportService.class);

    /** report converter to json file
     * @throws IOException
     * @throws URISyntaxException
     */
    public void processReport() throws IOException, URISyntaxException {
    	
    	//Read CSV File into Java List Objects
    	OperationReportDto operationList = readCsvFile(SOURCE_FILEPATH + "MAILFILE.ubz-reports.oper.MM20testartebatc2175.201117_002118.txt");
    	logger.debug("operationList:", operationList);

        //Convert Java List Objects to JSON File
        convertJavaObject2JsonFile(operationList, DESTINATION_FILEPATH + "Oper_MM20testartebatc2175_"+Utility.generateDateTime()+".json");
        logger.debug("report converted to json file");
    }

    /**
     * Read operation report CSV File into Memory
     * @param filePath
     * @return
     */
    private static OperationReportDto readCsvFile(String filePath) throws IOException {
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
                .typedSchemaFor(TAB20V09Dto.class)
                .withHeader()
                .withColumnSeparator(';')
                .withComments()
                .withSkipFirstDataRow(true);

        MappingIterator<TAB20V09Dto> TAB20V9Iter = csvMapper
                .readerWithTypedSchemaFor(TAB20V09Dto.class)
                .with(csvSchema)
                .readValues(csvFile);

        List<TAB20V09Dto> operationList = TAB20V9Iter.readAll();
        logger.debug("operationList:"+operationList);

        OperationReportDto operationReport = new OperationReportDto(TITLE,REPORT_NAME,DATE_TIME,REPORT_FORMAT,operationList);
        logger.debug("operation Report:"+operationReport);

        return operationReport;
        
       

    }
    /**
     * Convert operation report Object to JSON File
     * @param operationReport
     * @param pathFile
     */
    private static void convertJavaObject2JsonFile(OperationReportDto operationReport, String pathFile) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(pathFile);
        try {
            // Serialize Java object info JSON file.
            //       mapper.writeValue(file, transactionList);
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, operationReport);
            logger.info("write to json file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
