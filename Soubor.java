/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.io.*;

/**
 *Třída <b>Soubor</b> pro práci s jednoduchými soubory
 * 
 * @author student
 * @version 1.0
 */
public class Soubor {
    
    /**
     * Promněná slouží k uložení obsahu textového souboru
     */
    private String data;
    /**
     * Metoda konstruktoru
     */
    Soubor(){
    }
    /**
     * Přetížena hodnota konstruktoru s parametrem
     * @param txt řetězec obsaahující data ke zpracování
     */
    Soubor(String txt){
        this.data = txt;
    }

    /**
     * Metoda vrací obsah atributu data
     * @return
     */
   public String getData(){
       return data;
    }
   /**
    * Metoda nastavuje atribut data
    * @param data obsah datoveho souboru
    */
   public void setData(String data){
       this.data = data;
   }
   /**
    * Metoda umožnuje načtení dat ze souboru
    * @param soubor identifikator souboru ktery ma byt otevřen k nastaveni
    * @param charset použítá znaková sada
    * @return
    * @throws FileNotFoundExceptiom
    */
   public boolean nactiZeSouboru(File soubor, String charset)
           throws FileNotFoundException {
   data = "";
   try{
       /*Vztvo59 objekt pro stream ye souboru*/
       InputStream inputStream = new FileInputStream(soubor);
       /*Objekt umožní načítání z otevřeného streamu,pouzije se*/
       Reader reader = new InputStreamReader(inputStream, charset);
       BufferedReader in = new BufferedReader(reader);
       /*Objekt umožní načítání z otevřeného souboru*/
       /*Proměnná bude použita pro postupné zpracování načtených dat */
       int znak;
       do {
           znak =in.read();
           /*Do proměné obsah jsou postupně ukládany jednotlivé znaky*/
           data += (char) znak;
       }while(znak != -1);
   }catch(IOException e){
   /*Ošetření případné výjimky - např. když soubor nemůže být otevřen*/
   return false;}
   return true; }

    void ulozDoSouboru(File soubor, String kodovani) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  /*

public boolean ulozDoSouboru(File soubor, String charset)
           throws FileNotFoundException {

   try{*/
       /*Vztvo59 objekt pro stream ye souboru*/
    //   OutputStream outputStream = new FileOutputStream(soubor);
       /*Objekt umožní načítání z otevřeného streamu,pouzije se*/
     //  Writer Writer = new OutputStreamWriter(outputStream, charset);
    //   BufferedWriter out = new BufferedWriter(writer);
       /*Objekt umožní načítání z otevřeného souboru*/
       /*Proměnná bude použita pro postupné zpracování načtených dat */
   /*    out.write(data);
       out.close();
}catch (IOException e){
   return false;
}
   return true; 
}*/
