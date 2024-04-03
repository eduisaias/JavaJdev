package Contas;

import cliente.Cliente;
import cliente.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Conta implements IConta {
    private static  int AGENCIA_PADRAO = 0001;
    private static  int SEQUENCIAL = 1;
    private int agencia;
    private  int numero;
    private double saldo;
    private Cliente cliente;
    private Status status;





    private	String statusConta;
    private ArrayList<String> historico;
    private LocalDateTime dataAtualizacao;



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirinformacoes() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
        System.out.println(String.format("Nome do cliente: %s",this.cliente.getNome()));
    }


}
