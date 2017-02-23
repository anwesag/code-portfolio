/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

import java.util.ArrayList;
/**
 *
 * @author mgoswami
 */
public class PoleCollection {
    private ArrayList<PoleModel> poles;
    private int numPoles;
    
    public PoleCollection(int numOfPoles, int numOfDisks)
    {
        if (numOfPoles > 0) {
            numPoles = numOfPoles;
            poles = new ArrayList<PoleModel>();
            
            for (int i=0; i < numPoles; i ++)
                poles.add(new PoleModel());
            
            PoleModel startPole = poles.get(0);
            for (int i=numOfDisks-1; i >= 0; i--)
                startPole.push(new Integer(i));
        }    
    }  
    
    public PoleModel get(int index) {
        return poles.get(index);
    }
    
    public int getLastPoleNumber() {
        return numPoles - 1;
    }
    
    public void print() {
        int pIdx = 0;
        for (PoleModel p: poles) {
            MessageLogger.logMessage("Pole " + pIdx++);
            p.print();
        }    
    }
            
}
