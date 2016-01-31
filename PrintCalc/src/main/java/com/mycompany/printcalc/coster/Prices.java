/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theranjalinilaweera
 */
public class Prices {
    
    private static Prices prices;
    private float doubleBlack;
    private float doubleColor;
    private float singleBlack;
    private float singleColor;
    
    private final String doubleBlackCost = "cost.double.black";
    private final String doubleColorCost = "cost.double.color";
    private final String singleColorCost = "cost.single.color";
    private final String singleBlackCost = "cost.single.black";
    
    public static Prices getInstance(){
        if(prices == null){
            prices = new Prices();
        }
        return prices;
    }
    
     public Properties initPrices(){
        Properties properties = getPropertyFile();
        setPropertyValues(properties);

	return properties;	
    }
     
     private Properties getPropertyFile(){
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
//            inputStream = new FileInputStream("print_cost.properties");
            inputStream = Prices.class.getClassLoader().getResourceAsStream("print_costs.properties");
            // load a properties file
            properties.load(inputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Prices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Prices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return properties;
     }
    
     private void setPropertyValues(Properties properties ){
         this.setDoubleBlack(Float.parseFloat( properties.getProperty(this.doubleBlackCost)));
         this.setDoubleColor(Float.parseFloat( properties.getProperty(this.doubleColorCost)));
         this.setSingleBlack(Float.parseFloat( properties.getProperty(this.singleBlackCost)));
         this.setSingleColor(Float.parseFloat(properties.getProperty(this.singleColorCost)));
     }

    public float getDoubleBlack() {
        return doubleBlack;
    }

    public void setDoubleBlack(float doubleBlack) {
        this.doubleBlack = doubleBlack;
    }

    public float getDoubleColor() {
        return doubleColor;
    }

    public void setDoubleColor(float doubleColor) {
        this.doubleColor = doubleColor;
    }

    public float getSingleBlack() {
        return singleBlack;
    }

    public void setSingleBlack(float singleBlack) {
        this.singleBlack = singleBlack;
    }

    public float getSingleColor() {
        return singleColor;
    }

    public void setSingleColor(float singleColor) {
        this.singleColor = singleColor;
    }
    
  
    
}
