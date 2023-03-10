
package lab8p1_evasalgado;

import java.util.Scanner; 
import java.util.Random;


public class XArray {
    static Scanner leer = new Scanner(System.in); 
    static Random rand = new Random(1100);
    
    public void opcion1(){
        System.out.println("Ingrese un tamaño: ");
         int tam = leer.nextInt(); 
         int [][] num = new int [tam][tam];
         
         num = llenado(tam,tam);
         System.out.println("Matriz Generada:"+"\n"+imprimir(num));
         System.out.println("Arreglo de diagnostico: ");
         diagonales(num);
         
         
    }
    public int [][] llenado (int fila, int columna ){
        int[][] temp = new int [fila][columna]; 
        for(int i = 0; i <fila;i++){
            for(int j=0;j<columna;j++){
                temp[i][j] = rand.nextInt(4100);
            }
        } return temp;
    }
    
    public String imprimir (int [][] matriz){
        String acum = " "; 
         for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                  acum += "["+matriz[i][j]+"]";
            } 
            System.out.println();
          acum+="\n";
         } 
        return acum;
    } 
    public String imprimirarray (int[] matriz){
        String acumarray = " "; 
       for(int i=0;i<matriz.length;i++){
            acumarray += matriz[i];
        } System.out.println();
        return acumarray; 
    } 
    public void diagonales(int[][] matriz){
        System.out.println();
        imprimir(matriz);
        String acum = " ";
        int num1 = 0, num2 = 0;
        int temp [] = new int[matriz.length*2]; 
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                
               if(i==j){
                   acum += "["+matriz[i][j]+"]";
                   num1 = matriz[i][j];
               }
               
         }  
            temp[i]=num1;
//            temp [0][ = num1; 
//            temp [0][1] = num2;
//            System.out.println(temp[0][0]);
//            System.out.println(temp[0][1]);
            
            System.out.print("["+temp[i]+"]");
        } 
        for (int k=0;k<matriz.length;k++){
            for(int l=0;l<matriz[k].length;l++){
                
               if(l==matriz.length-1-k){
                   acum += "["+matriz[k][l]+"]";
                   num2 = matriz[k][l];
               } 
               
         }  
            temp[k]=num2;
            System.out.print("["+temp[k]+"]");
        }  
        
    } 
}
