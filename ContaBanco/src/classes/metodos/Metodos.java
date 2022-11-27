package classes.metodos;

import java.util.Random;


public class Metodos {
private String cpf;
private String nome;
private String sobrenome;
private int conta;
boolean contaAtiva;
private int agencia;
private double saldo;
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

public void  Status() {
 System.out.println("Nome : "+ getNome());
 System.out.println("Sobrenome : "+ getSobrenome());
 System.out.println("CPF : " + getCpf());
 System.out.println("Conta : "+ getConta());
 System.out.println("Agência : "+ getAgencia());
 System.out.println("Saldo : R$ "+ getSaldo());
 System.out.println("Conta Ativa ? "+(getContaAtiva() ? " Conta Ativa " : "Conta Inativa, Favor Procurar o Gerente "));
}
Metodos(){
	
};

Metodos(String nome, String sobrenome, String cpf ){
	Random randon = new Random();
	this.nome=nome;
	this.sobrenome=sobrenome;
	this.cpf=cpf;
	this.saldo=100;
	this.agencia=randon.nextInt(5000);
	this.conta=randon.nextInt(100000);
	if(getSaldo()>=150) {
		this.setContaAtiva(true);
	}else {
		this.setContaAtiva(false);
	}
}

}



