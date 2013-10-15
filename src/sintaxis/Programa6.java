package sintaxis;

public class Programa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = {15, 2, 78, 33, 1, 8, 158, 4, 6, 17};
        int i, j, menor;
        for (i = 0; i < (numeros.length) - 1; i++) {
            for (j = 0; j < (numeros.length) - i - 1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    menor = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = menor;

                }
            }
        }
        for (i = 0; i < (numeros.length); i++) {
            System.out.println(numeros[i] + "\n");
        }

    }
}
