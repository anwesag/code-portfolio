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
public class TowerOfHanoi {
    
    private PoleCollection poles;
    private int numDisks;
    private ArrayList<Integer> diskSet;
    private int numSteps;
    
    public TowerOfHanoi(int numOfDisks, int numOfPoles) {
        poles = new PoleCollection(numOfPoles, numOfDisks);
        numDisks = numOfDisks;
        
        diskSet = new ArrayList<Integer>();
        for (int i=1; i <= numOfDisks; i++)
            diskSet.add(new Integer(i));
        
        
    }
            
    public void play() {
        moveToDestination(diskSet, 0, poles.getLastPoleNumber(), 1);
    }
    
    // Current assumption: 3 poles - will extend further for more poles
    private void moveToDestination(ArrayList<Integer> diskSet, int startPole, int endPole, int midPole) {
        if (diskSet.size() > 2) {
            ArrayList<Integer> newDiskSet = (ArrayList<Integer>) diskSet.clone();
            newDiskSet.remove(newDiskSet.size() - 1);
            Integer largeDisk = diskSet.get(diskSet.size() - 1);
            
            moveToDestination(newDiskSet, startPole, midPole, endPole);
            moveOneDisk(largeDisk, startPole, endPole);
            moveToDestination(newDiskSet, midPole, endPole, startPole);
        }
        else {
            moveTwoDisks(diskSet, startPole, endPole, midPole);
        }
    }
     
    private void moveOneDisk(Integer disk, int startPole, int endPole) {
        Integer diskToMove = poles.get(startPole).pop();
        poles.get(endPole).push(diskToMove);
        numSteps++;
        MessageLogger.logMessage("Moved " + diskToMove.intValue() + " from " + startPole + " to " + endPole);
    }
    
    private void moveTwoDisks(ArrayList<Integer> diskSet, int startPole, int endPole, int midPole) {
        PoleModel sPole = poles.get(startPole);
        PoleModel mPole = poles.get(midPole);
        PoleModel ePole = poles.get(endPole);
        
        // Move smaller one to the middle
        Integer disk = sPole.pop();
        mPole.push(disk);
        MessageLogger.logMessage("Moved " + disk.intValue() + " from " + startPole + " to " + midPole);
        // Move larger one to end pole
        disk = sPole.pop();
        ePole.push(disk);
        MessageLogger.logMessage("Moved " + disk.intValue() + " from " + startPole + " to " + endPole);
        // Move smaller one to end pole
        disk = mPole.pop();
        ePole.push(disk);        
        MessageLogger.logMessage("Moved " + disk.intValue() + " from " + midPole + " to " + endPole);
        
        numSteps += 3;
    }
    
    private void logMessage(String message) {
        System.out.println(message);
    }

    public void print() {
        MessageLogger.logMessage("Steps " + numSteps);
        poles.print();
    }
}
