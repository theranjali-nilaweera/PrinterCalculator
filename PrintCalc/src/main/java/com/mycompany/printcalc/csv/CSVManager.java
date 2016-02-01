/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.csv;

import com.mycompany.printcalc.model.PrintJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author theranjalinilaweera
 */
public class CSVManager {
    //TODO add logs
    
    /**
     * If CSV file is in resource folder 
     * @param fileName
     * @throws FileNotFoundException 
     */
    private Reader openCSVResource(String fileName) throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        return new FileReader(file);
        
    }
    
    private void openCSVFileWithPath(String fileName){
        
    }
    
  
    public List<CSVRecord> getPrintJobInResourceFile(String fileNameInResource) throws IOException {

            CSVParser csvParser = new CSVParser(openCSVResource(fileNameInResource), CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true));
            List<CSVRecord> csvs = csvParser.getRecords();
            for (Iterator<CSVRecord> it = csvs.iterator(); it.hasNext();) {
                CSVRecord cSVRecord = it.next();
                System.out.println("PrintJob total # =" + cSVRecord.get(0)  + " , color pg=" + cSVRecord.get(1) + " is double sided "+ cSVRecord.get(2));
            }
            return csvs;

        
    }
    /**
     * Assumption that the file is in the resource folder
     * @param fileNameInResource
     * @return
     * @throws IOException 
     */
    //TODO generalize the file read for uploaded file
    public List<PrintJob> getPrintJobsInFile(String fileNameInResource) throws IOException {
         List<CSVRecord> csvRecords = getPrintJobInResourceFile(fileNameInResource);
         List<PrintJob> printJobs = new ArrayList<>();
         for (CSVRecord cSVRecord : csvRecords) {
             if (!isCSVRecordValid(cSVRecord)) {
                 continue;
             }
            printJobs.add(new PrintJob(cSVRecord.get(0),cSVRecord.get(1),cSVRecord.get(2)));
        }
         return printJobs;
    }
    
    private boolean isCSVRecordValid(CSVRecord csvRecord ){
        return (csvRecord != null && csvRecord.size()==3);
    }
        
}
