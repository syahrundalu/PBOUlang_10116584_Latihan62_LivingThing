/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan62_livingthing;

/**
 *
 * @author
 * 
 */
public class Human extends LivingThing{
    
   public String nama;

    public String getNama() {
        return "Syahrun Dalu";
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama){
        System.out.println(nama+" Sedang Berjalan");
    }
    
    
    
}
