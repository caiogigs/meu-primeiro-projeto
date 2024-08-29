import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = sc.next();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();
     
        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agencia é %s ,conta %d e seu saldo %.2f ja está disponivel para saque",
        nome, agencia , numeroConta, saldo);
         
    }
}
