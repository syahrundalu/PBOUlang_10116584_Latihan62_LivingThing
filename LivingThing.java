/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan62_livingthing;

/**
 *
 * @author 
 * NIM : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public abstract class LivingThing {
    
    public abstract void walk (String nama);
    
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
    
}
