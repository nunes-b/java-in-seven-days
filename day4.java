import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o nome do produto: ");
        Scanner produto = new Scanner(System.in);
        String nomeProduto= produto.next().toLowerCase();

        switch(nomeProduto) {
            case "banana":
                System.out.println("R$ 5,00");
                break;
            case "manga":
                System.out.println("R$ 30,00");
                break;
            case "uva":
                System.out.println("R$ 20.00");
                break;
            default:
                System.out.println("Produto não encontrado ");
                break;
        }
    }
}