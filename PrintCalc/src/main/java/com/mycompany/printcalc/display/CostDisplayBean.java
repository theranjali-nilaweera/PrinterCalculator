/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.display;

import com.mycompany.printcalc.coster.PrintJobCostManager;
import com.mycompany.printcalc.model.PrintJob;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author theranjalinilaweera
 */
@ManagedBean
@SessionScoped
public class CostDisplayBean implements Serializable {
    private static final long serialVersionUID = 1L;
	
	private List<PrintJob> prinJobs;
        private PrintJobCostManager printCostMngr;

    public List<PrintJob> getPrinJobs() {
        printCostMngr= new PrintJobCostManager();
        
        return printCostMngr.costJobsInFile("printjobs.csv");
    }

	
}
