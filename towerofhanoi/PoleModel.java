/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

import java.util.Stack;
/**
 *
 * @author mgoswami
 */
public class PoleModel {
    private Stack<Integer> poleStack;
    
    public PoleModel() {
        poleStack = new Stack<Integer>();
    }
    
    public void push(Integer disk)
    {
        poleStack.push(disk);
    }        
    
    public Integer pop()
    {
        return poleStack.pop();
    }   
    
    public void print() {
        for (int i=poleStack.size()-1; i >= 0; i--)
            MessageLogger.logMessage(""+poleStack.get(i));
    }
            
            
}
