package com.mycompany.mod10assignment;

/**
 *
 * @author Thuan Luu
 */
public class main {
    
    public static void main(String[] args) {
        
        // creates the factory for the clothes
        clothesFactory factory = new factory();
        
        // creates tops, pants, shoes
        tops top = factory.createTops();
        pants pant = factory.createPants();
        shoes shoe = factory.createShoes();
        
        // creates all top clothing items
        top.casual();
        top.party();
        top.prof();
        System.out.println("----");
        // creates all pants clothing items
        pant.casual();
        pant.party();
        pant.prof();
        System.out.println("----");
        // creates all shoe items
        shoe.casual();
        shoe.party();
        shoe.prof();
        
    }
    
}
