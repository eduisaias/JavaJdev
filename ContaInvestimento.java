package Contas;
import cliente.Classificacao;
import cliente.Cliente;


public class ContaInvestimento extends Conta {
    public ContaInvestimento(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Contas.Conta Investimento");
        super.imprimirinformacoes();
    }



}
