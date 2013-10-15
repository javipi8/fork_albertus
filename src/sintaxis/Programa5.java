/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxis;

/**
 *
 * @author aluadm
 */
public class Programa5 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[]={1,7,2,5}, i, longitud, res, mayor, menor;
        
        res=0;
        mayor=numeros[0];
        menor=numeros[0];
        
        longitud=(numeros.length);
        
        for(i=0;i<longitud;i++){
            
            if(numeros[i]<menor){
                menor=numeros[i];
            }
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
            
            res=numeros[i]+res;
            
        }
        
        System.out.println("suma: "+res);
            System.out.println("menor: "+menor);
            System.out.println("mayor: "+mayor);
    }
}
