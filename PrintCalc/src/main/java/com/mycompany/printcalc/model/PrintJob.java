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
    
    
}
