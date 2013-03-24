/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class JogoDaVelha {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //criando tabuleiro;
        int[][] tabuleiro = new int[3][3];
        int jogada = 0;
        int numJogada = 1;
        int jogador;
        boolean acabou = false;
        Scanner entrada = new Scanner(System.in);
        int coord1, coord2,pecasSeguintes = 0;
        for(int i = 0; i < tabuleiro.length;i++){
            for(int j = 0; j < tabuleiro[0].length; j++){
                tabuleiro[i][j] = 0;
                System.out.print(" " + tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        //loop principal
        //sai do loop se o jogo empatar ou alguém ganhar
        do{
            //loop para verificar se a posição jogada é valida ou não
            while(true){
                System.out.println("Digite as coordenadas de sua jogada no formato xx");
                jogada = entrada.nextInt();
                System.out.println("Jogada nº " + numJogada);
                coord1 = jogada/10;
                coord2 = jogada%10;
                if(tabuleiro[coord1][coord2] == 0){
                    if(numJogada%2 == 0){
                        jogador = 2;
                        tabuleiro[coord1][coord2] = jogador;
                    }
                    else{
                        jogador = 1;
                        tabuleiro[coord1][coord2] = jogador;
                    }
                    break;
                }
                else{
                    System.out.println("Posição ocupada!");
                }
            
            }
            //imprime tabuleiro
            for(int i = 0; i < tabuleiro.length;i++){
            for(int j = 0; j < tabuleiro[0].length; j++){
                System.out.print(" " + tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        
        //verificando linhas
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[0].length; j++){
                if(tabuleiro[i][j] == jogador){
                    pecasSeguintes++;
                }
                else{
                    pecasSeguintes = 0;
                }
            }
            if(pecasSeguintes == 3){
                acabou = true;
                System.out.println("Jogador " + jogador + " ganhou!");
                break;
            }
        }
        //verificando colunas
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[0].length; j++){
                if(tabuleiro[j][i] == jogador){
                    pecasSeguintes++;
                }
                else{
                    pecasSeguintes = 0;
                }
            }
            if(pecasSeguintes == 3){
                acabou = true;
                System.out.println("Jogador " + jogador + " ganhou!");
                break;
            }
        }
        
        for(int i = 0; i < tabuleiro.length;i++){
            if(tabuleiro[i][i] == jogador){
                    pecasSeguintes++;
                    System.out.println(pecasSeguintes);
                }
                else{
                    pecasSeguintes = 0;
                }
            if(pecasSeguintes == 3){
                acabou = true;
                System.out.println("Jogador " + jogador + " ganhou!");
                break;
            }
        }
        for(int i = 0; i < tabuleiro.length ; i++){
            if(tabuleiro[2-i][i] == jogador){
                pecasSeguintes++;
                System.out.println(pecasSeguintes);
            }
            else{
                pecasSeguintes = 0;
            }
            if(pecasSeguintes == 3){
                acabou = true;
                System.out.println("Jogador " + jogador + " ganhou!");
                break;
            }
        }
        
        numJogada++;
        if(numJogada > 9){
            System.out.println("Empate");
            acabou = true;
        }
        }while(!acabou);
        
    }
    
}
