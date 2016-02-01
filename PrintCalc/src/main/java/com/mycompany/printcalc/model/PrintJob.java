/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.model;

/**
 *
 * @author theranjalinilaweera
 */
public class PrintJob {
    
    private int totalPages;
    private int colorPages;
    private boolean isDoubleSided;
    private Cost jobCost;

    public PrintJob() {
    }

    public PrintJob(int totalPages, int colorPages, boolean isDoubleSided) {
        this.totalPages = totalPages;
        this.colorPages = colorPages;
        this.isDoubleSided = isDoubleSided;
        this.jobCost = new Cost();
    }
    
       public PrintJob(String totalPages, String colorPages, String isDoubleSided) {
        this.totalPages = (totalPages==null || totalPages.isEmpty())?0:Integer.parseInt(totalPages) ;
        this.colorPages = (colorPages==null || colorPages.isEmpty())?0:Integer.parseInt(colorPages) ;
        this.isDoubleSided = (isDoubleSided==null || isDoubleSided.isEmpty())?false:Boolean.parseBoolean(isDoubleSided) ;
        this.jobCost = new Cost();
    }
    
    

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getColorPages() {
        return colorPages;
    }

    public void setColorPages(int colorPages) {
        this.colorPages = colorPages;
    }

    public boolean isIsDoubleSided() {
        return isDoubleSided;
    }

    public void setIsDoubleSided(boolean isDoubleSided) {
        this.isDoubleSided = isDoubleSided;
    }

    public Cost getJobCost() {
        return jobCost;
    }

    public void setJobCost(Cost jobCost) {
        this.jobCost = jobCost;
    }
    
    public int getBlackPages(){
        return this.getTotalPages()-this.getColorPages();
    }
    
}
