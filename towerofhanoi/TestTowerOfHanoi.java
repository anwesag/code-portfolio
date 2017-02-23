/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

/**
 *
 * @author mgoswami
 */
public class TestTowerOfHanoi {
    
    public static void main(String[] args) {
        
        TowerOfHanoi game = new TowerOfHanoi(3, 3);
        game.play();
        game.print();
    }
    
}
