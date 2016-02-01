/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

import com.mycompany.printcalc.csv.CSVManager;
import com.mycompany.printcalc.model.PrintJob;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theranjalinilaweera
 */
public class PrintJobCostManager {
    
    private CSVManager csvManager;
    private CostCalculator costCalculator;
    private Logger logger;

    public PrintJobCostManager() {
        this.csvManager = new CSVManager();
        this.costCalculator = new CostCalculator();
        this.logger =  Logger.getLogger(PrintJobCostManager.class.getName());
    }
    
    
    
    public void costJobsInFile(String fileName){
        try {
            List<PrintJob> printJobs =  csvManager.getPrintJobsInFile(fileName);
            costCalculator.calulateCostForPrintJobs(printJobs);
            printAllJobDetailsToConsole(printJobs);
        } catch (IOException ex) {
            System.out.println("");
            logger.log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void printAllJobDetailsToConsole(List<PrintJob> printJobs){
        System.out.println("Total pages \t Double sided \t Color pages \t B&W pages \t\t  Total Cost \n");
        for (PrintJob printJob : printJobs) {
            System.out.format("%d \t\t  %s \t\t  %dpg = $%.2f \t  %dpg = $%.2f \t  $%.2f \n",
                    printJob.getTotalPages(),
                    (printJob.isIsDoubleSided() ? "Yes" : "No"),
                    printJob.getColorPages(),
                    printJob.getJobCost().getColorCost(),
                    printJob.getBlackPages(),
                    printJob.getJobCost().getBlackCost(),
                    printJob.getJobCost().getTotalJobCost());
        }
    }
}
