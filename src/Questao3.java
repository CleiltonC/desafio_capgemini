import java.util.*;
/*
   Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas
   para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares
   de substrings que são anagramas. teste ifaijklgqq = 3
*/

/*
    Obs: O programa espera a entrada, mesmo nao exibindo nenhum texto no console,
    para que a entrada e saida fiquei como mostrada no exemplo
 */

public class Questao3 {
    static void counting(String string) {

        //HashMap to store items
        HashMap<String, Integer> list = new HashMap<>();

        //Iterating over the string to check
        for (int i = 0; i <= string.length(); i++) {
            for (int j = i; j < string.length(); j++) {

                // Store sub-arrays
                char[] wordArr = string.substring(i, j + 1).toCharArray();
                Arrays.sort(wordArr); // Ordering substrings with sort()
                String xWord = new String(wordArr);
                if (list.containsKey(xWord)) {
                    list.put(xWord, list.get(xWord) + 1);
                } else {list.put(xWord, 1);
                }
            }
        }

        // Counting how many anagrams were found
        int count = 0;
        for (String cont : list.keySet()) {
            int n = list.get(cont);
            count += ((n - 1) * n) / 2;
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        word = sc.next();

        counting(word);
    }
}