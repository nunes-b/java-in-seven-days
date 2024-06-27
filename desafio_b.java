import java.util.Scanner;

public class desafio_b {
    public static void main(String[] args) {

        System.out.print("Insira uma frase: ");
        Scanner phrase = new Scanner(System.in);
        String phrasesplit = phrase.nextLine();
        for(int index = 0; index < phrasesplit.length(); index++){
            System.out.print(phrasesplit.charAt(index) + " ");
        }
    }
}