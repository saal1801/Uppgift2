/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarko
 */
public class Customers {

    static Object KundensStatus(int[] i, int[] i0) {
        throw new UnsupportedOperationException("Ingen stöd än."); //To change body of generated methods, choose Tools | Templates.
    }
    static Object scalarMultiplication(int[] i, int[] i0) {
        throw new UnsupportedOperationException("Ingen stöd än."); //To change body of generated methods, choose Tools | Templates.
    }
    static boolean equal(int[] i, int[] i0) {
        throw new UnsupportedOperationException("Ingen stöd än."); //To change body of generated methods, choose Tools | Templates.
    }
 
     boolean svar=false;   String namnen="";
     
     public boolean checkString(String ord, boolean personNR){   // här kan sökas medlemerna som är redan registrerat i systemet
         
         if(!personNR){                                        //namer?
             ord=ord.trim();
             //String[] namnen = ord.split(" ");
             
             if(NamnMedMellanSlag(ord)){

              return true;
             }
             else if (!svar){
                 JOptionPane.showMessageDialog(null, namnen);
                 return false;
             }          
         }
         else{                                                            // personnummer
             if(personNrKoll(ord)){
                 return true;
             }
             else if (!svar){
                JOptionPane.showMessageDialog(null, namnen);
                 return false; 
             }
         }

        return false;
     }
 
    public boolean kontroll(String person, Boolean persNR) throws IOException{
        Path p = Paths.get("/Users/Sarko/Desktop/customers.txt");
        String forstaR, andraR;
        KundensStatus k;
        
        
        try(BufferedReader bf = Files.newBufferedReader(p)){
        while((forstaR =bf.readLine()) != null){

        if(forstaR.contains(person)){     // om det finns char-värden
                
            andraR=bf.readLine();
        if(betalda(andraR) && svar==false){                                  //andraRader  
            k = new KundensStatus(forstaR,LocalDate.now().toString());
            JOptionPane.showMessageDialog(null, "Personen är medlem." + "\nHen registrerades i tränarens listNamn");
              }
              else{
              if(svar==false){
              JOptionPane.showMessageDialog(null,"Personen är medlem men är inte obetalda");
                        
                }
                }
                    return true; 
                }
                //andraR=bf.readLine();
            }
            bf.close();
        }
        catch(Exception e){
            System.out.println("Tyvärr filen hittades ej");
        }
        
        if(!svar){
        JOptionPane.showMessageDialog(null,"Okänd person i gym-systemet");
        }
    return false;
    }
    
    public void test(){
         svar=true;
     }

    public boolean betalda(String d){
        LocalDate lt = LocalDate.parse(d);  /// failddddd
        LocalDate nu = LocalDate.now();
        
        
        return nu.isBefore(lt.plusMonths(12)); // 
    }
    
    public boolean NamnMedMellanSlag(String ord){       // här kontrollerat namn och personNr och rekomendation hur ska dessa vara
         String[] orden = ord.split(" ");
         if(orden.length>1){
             return true;
         }
         else{
             namnen="skriva in bada namnen med ett mellanslag mellan";
             return false;
         }
     }

     
     public boolean personNrKoll(String siffra){
         if(siffra.length()>10 || siffra.length()<10){
             namnen="Skriv in ditt personnummer med BARA med 10 siffror.";
             return false;
         }
         return true;
     }
     
       public class KundensStatus {
    
    KundensStatus(String rad1, String rad2) throws IOException{           //skrivas namn och personnumret registreras på separat pappar
        
        FileWriter wr = new FileWriter("/Users/Sarko/Desktop/Listnamn.txt",true);
        try(BufferedWriter bw = new BufferedWriter(wr)){
            bw.write(rad1 + "\n"); bw.write(rad2+ "\n"); bw.flush();
            bw.close();
          
        }
        catch(Exception e){
            System.out.println("Filen kunde ej skapas");
        }
      }
    }

/**
 * @param args the command line arguments
 * @throws java.io.IOException
 */
public static void main(String[] args) throws IOException {
// TODO code application logic here

 while (true) {
            
            String s = JOptionPane.showInputDialog( "Skriv in" + "\nPersonens namn efternamn eller" + "personnummer YYMMDDXXXX)");
            
            if (s == null){
                System.exit(0);
            }
            boolean personnen = true;
            Customers cust = new Customers();
            
            
            String test = "\\d+";
            if(!s.matches(test))
                personnen=false;
            
            
            if(cust.checkString(s, personnen))
                cust.kontroll(s, personnen);
            break;
            }
                
    }

}