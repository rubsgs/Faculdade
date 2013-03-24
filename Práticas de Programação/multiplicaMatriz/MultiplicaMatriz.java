/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicaMatriz;

/**
 *
 * @author Rubens
 */
public class MultiplicaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][2];
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length; j++){
                matriz[i][j] = (i+1)+(j+1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matriz2 = new int[2][2];
        for(int i = 0; i < matriz2.length;i++){
            for(int j = 0;j < matriz2[i].length; j++){
                matriz2[i][j] = (2*(i+1))+(2*(j+1));
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < matriz.length;i++){
            for(int k = 0; k < matriz2[0].length;k++){
                int resultado = 0;
                for(int j = 0;j < matriz[0].length; j++){
                    resultado += matriz[i][j] * matriz2[j][k];
                    
                    
                }

                System.out.print(resultado + " ");
            }
            System.out.println();
        }
    }
}
