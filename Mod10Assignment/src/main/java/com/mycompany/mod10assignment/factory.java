/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mod10assignment;

/**
 * This creates the factory that produces the items
 * 
 * @author thuanluu
 */
public class factory implements clothesFactory {

    
    /**
     * Return all types of tops
     * 
     * @return  tops
     */
    @Override
    public tops createTops() {
        return new tops();
    }
    
    /**
     * Return all types of pants
     * 
     * @return pants
     */
    @Override
    public pants createPants() {
        return new pants();
    }

    
    /**
     * Returns all types of shoes
     * 
     * @return shoes
     */
    @Override
    public shoes createShoes() {
        return new shoes();
    }
    
}
