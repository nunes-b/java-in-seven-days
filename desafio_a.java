import java.util.Scanner;

public class desafio_a {
    public static void main(String[] args) {
        System.out.println("Insira um numero: ");
        Scanner number = new Scanner(System.in);
        int range = number.nextInt();

        for(int index = 0; index < range; index++){
            if(index % 2 ==0){
                System.out.print(index + " ");
            }
        }
           }
}