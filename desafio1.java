import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Bem vindo a calculadora! \n Digite o primeiro numero (operador1) a operação (+, -, *, /) e em seguida o segundo numero (operador2): " );
        Scanner sc = new Scanner(System.in);

        double primaryOperator = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double secondOperator = sc.nextDouble();

        boolean operacaoValida = false;
        if(operator == '+'){
            System.out.println((int) primaryOperator + secondOperator);
            operacaoValida= true;
        }
        if( operator == '-'){
            System.out.println((int) primaryOperator - secondOperator);
            operacaoValida= true;

        }
        if (operator == '/'){
            System.out.println((int) primaryOperator / secondOperator);
            operacaoValida= true;
        }
        if (operator == '*'){
            System.out.println((int) primaryOperator * secondOperator);
            operacaoValida= true;
        }
        if(!operacaoValida){
            System.out.println("ERRO! Você utilizou um operador invalido, tente usar os operadores abaixo: \n + = SOMA \n - = SUBTRAÇÃO \n / = DIVISÃO \n * = MULTIPLICAÇÃO");
        }
    }
}