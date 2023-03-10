
package lab8p1_evasalgado;
import java.util.Scanner;

public class OMatriz {
    static Scanner leer = new Scanner(System.in);
    
    public void opcion3(){
        System.out.println("Ingrese una oracion: ");
        String sentence = leer.nextLine();
        
        OMatrix(sentence);
    } 
        
    
    public void OMatrix (String sentence){
        String acum = " "; 
        int numletra = 0;
        for(int i=0;i<sentence.length();i++){
            char letra = sentence.charAt(i); 
            numletra = letra; 
            if (numletra<123&&numletra>64){
                acum += "["+letra+"]";
         }  if(numletra== 32){
            acum += "\n";
         }
        } 
        
        System.out.print(acum);
        System.out.println();
    } 
}
