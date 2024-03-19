import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int segundoParametro = scanner.nextInt();

        try {
            imprimirNumeros(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void imprimirNumeros(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio >= fim) {
            throw new ParametrosInvalidosException();
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
