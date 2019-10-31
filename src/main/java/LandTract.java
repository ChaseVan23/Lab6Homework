/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chasec
 */
public class LandTract {
    private double tractLength;
    private double tractWidth;
    
    public LandTract () {
    tractLength = 0;
    tractWidth = 0;
    }
    public LandTract(double newLength, double newWidth) {
    tractLength = newLength;
    tractWidth = newWidth;
    }
    public double getLandTractArea() {
    double landTractArea;
    landTractArea = (tractLength * tractWidth);
    return landTractArea;
    }
    public boolean equals(LandTract otherLandTract) {
    boolean isEqual;
    if(tractLength != otherLandTract.tractLength || tractWidth != otherLandTract.tractWidth)
        isEqual = false;
    else
        isEqual = true;
    
        return isEqual;
    } 
    public String toString() {
    String result = "";
    result += "Length " + tractLength;
    result += " and Width: " + tractWidth;
    
    return result;
    }  

    
   
}
