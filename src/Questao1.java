import java.util.Scanner;

/*
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
    A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 */

/*
    Obs: O programa espera a entrada, mesmo nao exibindo nenhum texto no console,
    para que a entrada e saida fiquei como mostrada no exemplo
 */

public class Questao1 {
    public static void main(String[] args) {
        int i;
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for (i = 1; i < n+1; i++){
            String word = "";
            for( int j = 1; j < n+1; j++){
                if (i+j < n+1){
                    word = " " + word;
                }else{
                    word += "*";
                }
            }
            if(i<n){
                System.out.println(word);
            }else{
                System.out.print(word);
            }
        }
    }
}

