/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

import com.mycompany.printcalc.model.PrintJob;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theranjalinilaweera
 */
public class CostCalculator {
    
    private Logger logger = Logger.getLogger(CostCalculator.class.getName());
    
    public List<PrintJob> calulateCostForPrintJobs(List<PrintJob> printJobs){
        logger.log(Level.INFO, "Start cost calculation for job");
        Prices prices = Prices.getInstance();
        this.costJobs(printJobs, prices);
        return printJobs;
    }
    
    private void costJobs(List<PrintJob> printJobs, Prices prices){
        for (PrintJob printJob : printJobs) {
            printJob.getJobCost().setColorCost(costSingleJob(printJob.getColorPages(),printJob.isIsDoubleSided()?prices.getDoubleColor():prices.getSingleColor()));
            printJob.getJobCost().setBlackCost(costSingleJob(printJob.getBlackPages(),printJob.isIsDoubleSided()?prices.getDoubleBlack():prices.getSingleBlack()));
        }
    }
    
    private float costSingleJob(int pages,float costPerPage){
        return pages*costPerPage;   
    }
}
