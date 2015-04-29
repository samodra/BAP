# BAP
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstream;

/**
 *
 * @author L855-S5309
 */
public class tampung {
    private static String nampung,nampungiddosen ,nampungidadmin, namadosen;

    public tampung() {
    }
    
    public static String getNampung() {
        return nampung;
    }

    public static void setNampung(String nampung) {
        tampung.nampung = nampung;
    }
    
    public static String getNampungiddosen(){
        return nampungiddosen; 
    }
    
    public static void setNampungiddosen(String nampungiddosen){
        tampung.nampungiddosen = nampungiddosen ;
    }

    public static String getNamadosen(){
        return namadosen; 
    }
    
    public static void setNamadosen(String namadosen){
        tampung.namadosen = namadosen ;
    }
    
    public static String getNampungidadmin() {
        return nampungidadmin;
    }

    public static void setNampungidadmin(String nampungidadmin) {
        tampung.nampungidadmin = nampungidadmin;
    }
}
