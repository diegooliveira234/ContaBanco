package classes.metodos;

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
public void  Status() {
 System.out.println("Nome :"+ getNome());
 System.out.println("Sobrenome :"+ getSobrenome());
 System.out.println("Agência :"+ getAgencia());
 System.out.println("Conta ::"+ getConta());
 System.out.println("Agência :"+ getAgencia());
 System.out.println("Saldo :"+ getSaldo());
}

Metodos(String nome, String sobrenome, String cpf ){
	this.nome=nome;
	this.sobrenome=sobrenome;
	this.cpf=cpf;
	this.saldo=100;
	this.agencia=random(5000);
	this.conta=random(100000);
	this.contaAtiva=true;
}
private int random(int i) {
	// TODO Auto-generated method stub
	return 0;
}
}



