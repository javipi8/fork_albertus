/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxis;

/**
 *
 * @author aluadm
 */
public class Programa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min, max, res, i;
        min = 1;
        max = 4;
        i = 0;
        res = 0;
        // TODO code application logic here
        
        for(i=min;i<=max;i++){
            if( i%2==0){
                res=res+i;
            }
        }
        
        System.out.println("Resultat " + res);
    }
}
