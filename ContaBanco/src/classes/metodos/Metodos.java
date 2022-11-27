package classes.metodos;

import java.util.Random;


public class Metodos {
private String cpf;
private String nome;
private String sobrenome;
private int conta;
private boolean contaAtiva;
private int agencia;
private double saldo;
private boolean contaPoupanca;
private boolean contaCorrente;
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getConta() {
	return conta;
}
public void setConta(int conta) {
	this.conta = conta;
}
public int getAgencia() {
	return agencia;
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
 System.out.println("Nome : "+ getNome());
 System.out.println("Sobrenome : "+ getSobrenome());
 System.out.println("CPF : " + getCpf());
 System.out.println("Conta : "+ getConta());
 System.out.println("Agência : "+ getAgencia());
 System.out.println("Saldo : R$ "+ getSaldo());
 System.out.println("Tipo de Conta : "+(isContaCorrente() ?"Conta Corrente ":"Conta Poupança"));
 System.out.println("Conta Ativa ? "+(getContaAtiva() ? " Conta Ativa " : "Conta Inativa, Favor Procurar o Gerente "));
}
Metodos(){};

Metodos(String nome, String sobrenome, String cpf
		, double deposito){
	Random randon = new Random();
	this.nome=nome;
	this.sobrenome=sobrenome;
	this.cpf=cpf;
	this.saldo=deposito;
	this.agencia=randon.nextInt(5000);
	this.conta=randon.nextInt(100000);
	if(deposito>=150) {
		this.setContaAtiva(true);
		this.setContaCorrente(true);
	}else if(deposito>=50&&deposito<150){
		this.setContaAtiva(true);
		this.setContaPoupanca(true);
	}else {
		this.setContaPoupanca(true);
		this.setContaAtiva(false);
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



