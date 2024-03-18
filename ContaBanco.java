import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Por favor, digite o seu nome !");
        String nome = entrada.next();

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = entrada.nextInt();

        System.out.println("Por favor, digite o número da sua conta !");
        int conta = entrada.nextInt();

        System.out.println("Por favor, digite o seu saldo em conta !");
        double saldo = entrada.nextDouble();







        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco," +
                " sua Agencia é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque.");





    }
}