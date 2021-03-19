/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiltp2;

/**
 *
 * @author Christy
 */
public class mobil {
    //Set variabel untuk atribut mobil
    private String merk;
    private String plat;
    private String warna;
    private String jenis;
    
    
    //Buat method set untuk seluruh atribut mobil
    public mobil(String merk, String plat, String warna, String jenis){
        this.merk = merk;
        this.plat = plat;
        this.warna = warna;
        this.jenis = jenis;
    }
    
    //Buat method get untuk seluruh atribut mobil
    public String getMerk(){
        return this.merk;
    }
    
    public String getPlat(){
        return this.plat;
    }
    
    public String getWarna(){
        return this.warna;
    }

    public String getJenis(){
        return this.jenis;
    }
}
