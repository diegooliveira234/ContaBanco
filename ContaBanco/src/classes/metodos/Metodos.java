package classes.metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Metodos {
private int conta;
private boolean contaAtiva;
private int agencia;
private double saldo;
private boolean contaPoupanca;
private boolean contaCorrente;
private Cliente cliente = new Cliente();
/*private List <Cliente> clientes = new ArrayList <Cliente>();


public List<Cliente> getClientes() {
	return clientes;
}
public void setClientes(List<Cliente> clientes) {
	this.clientes = clientes;
}*/
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public int getConta() {
	return numeroConta();
}
public void setConta(int conta) {
	this.conta = conta;
}
public int getAgencia() {
	return numeroAgencia();
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public boolean getContaAtiva() {
	
	return contaAtiva;
}
public void setContaAtiva(boolean contaAtiva) {
	this.contaAtiva= contaAtiva;
}
public boolean isContaPoupanca() {
	return contaPoupanca;
}
public void setContaPoupanca(boolean contaPoupança) {
	this.contaPoupanca = contaPoupança;
}
public boolean isContaCorrente() {
	return contaCorrente;
}
public void setContaCorrente(boolean contaCorrente) {
	this.contaCorrente = contaCorrente;
}
public void  Extrato() {
 System.out.println("Nome: "+cliente.getNome());
 System.out.println("Sobrenome: "+cliente.getSobrenome());
 System.out.println("CPF: "+cliente.getCpf());
 System.out.println("Conta : "+ getConta());
 System.out.println("Agência : "+ getAgencia());
 System.out.println("Saldo : R$ "+ getSaldo());
 System.out.println("Tipo de Conta : "+(isContaCorrente() ?"Conta Corrente ":"Conta Poupança"));
 System.out.println("Conta Ativa ? "+(getContaAtiva() ? " Conta Ativa " : "Conta Inativa, Favor Procurar o Gerente "));
}
Metodos(){};

Metodos(String nome, String sobrenome, String cpf ){
	
	getCliente().setNome(nome);
	getCliente().setSobrenome(sobrenome);
	getCliente().setCpf(cpf);
	agencia=numeroAgencia();
	conta =numeroConta();
}
public int numeroAgencia() {
	Random randon = new Random();
 int numeroAgencia = randon.nextInt(5000);
 return numeroAgencia;
}
public int numeroConta() {
	Random randon = new Random();
 int numeroConta = randon.nextInt(1000000);
 return numeroConta;
}
public void depositoAbertura(double deposito) {
	if(deposito>=150) {
		this.setContaAtiva(true);
		this.setContaCorrente(true);
		this.saldo=getSaldo()+deposito;
	}else if(deposito>=50&&deposito<150){
		this.setContaAtiva(true);
		this.setContaPoupanca(true);
		this.saldo=getSaldo()+deposito;
	}else {
		this.setContaPoupanca(true);
		this.setContaAtiva(false);
		this.saldo=getSaldo()+deposito;
	}
	
}
public void Depositar(double deposito) {
	this.saldo=getSaldo()+deposito;
}
public void Sacar(double saque) {
	if(getSaldo()<saque) {
		System.out.println("Não é possível realizar operação, saldo inferior ao valor de saque ");
	}else {
		this.saldo=getSaldo()-saque;
	}
}

}



