import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, register the product here: ");
        Scanner product = new Scanner(System.in);
        String descriptionProdcut = product.nextLine();

        System.out.print("Now you can tell me the price below: ");
        Scanner value = new Scanner(System.in);
        Double descriptionValue = value.nextDouble();

        productList(descriptionProdcut, descriptionValue);
    }
    public static void productList(String productName, Double productValue){
        System.out.println(productName + "- R$"+ productValue);
    }
}