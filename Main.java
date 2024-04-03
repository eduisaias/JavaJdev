import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import cliente.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Eduardo");

        Conta cc = new ContaCorrente(cliente1);

        cc.depositar(9);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(cliente1);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}