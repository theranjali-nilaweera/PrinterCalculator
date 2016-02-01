/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author theranjalinilaweera
 */
public class CSVManager {
    
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
    //TODO add functionality to read from given path
    }
    
  
    public List<CSVRecord> getPrintJobInResourceFile(String fileNameInResource) throws IOException {

            CSVParser csvParser = new CSVParser(openCSVResource(fileNameInResource), CSVFormat.DEFAULT.withHeader().withIgnoreSurroundingSpaces(true));
            List<CSVRecord> csvs = csvParser.getRecords();
            for (Iterator<CSVRecord> it = csvs.iterator(); it.hasNext();) {
                CSVRecord cSVRecord = it.next();
                System.out.println("PrintJob total # =" + cSVRecord.get(0)  + " , color pg=" + cSVRecord.get(1) + " is double sided "+ cSVRecord.get(2));
            }
            return csvs;

        
    }
        
}
