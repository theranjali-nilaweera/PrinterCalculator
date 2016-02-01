/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.model;

/**
 *
 * @author theranjalinilaweera
 */
public class Cost {
    private float blackCost;
    private float colorCost;

    public Cost() {
    }

    public float getTotalJobCost(){
        return this.getBlackCost()+ this.getColorCost();
    }

    public float getBlackCost() {
        return blackCost;
    }

    public void setBlackCost(float blackCost) {
        this.blackCost = blackCost;
    }

    public float getColorCost() {
        return colorCost;
    }

    public void setColorCost(float colorCost) {
        this.colorCost = colorCost;
    }
    
}
