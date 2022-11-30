package classes.metodos;

import javax.swing.JOptionPane;

public class ClasseExecutavel {

	public static void main(String[] args) {
	String nome =JOptionPane.showInputDialog("Nome do Cliente");
	String sobrenome =JOptionPane.showInputDialog("Sobrenome do Cliente");	
	String dataNascimento =JOptionPane.showInputDialog("Data de Nascimento");
	String cpf =JOptionPane.showInputDialog(" CPF ");
	String rg =JOptionPane.showInputDialog(" RG ");
	String nomePai =JOptionPane.showInputDialog("Nome do Pai");
	String nomeMae =JOptionPane.showInputDialog("Nome do Mãe");
	String deposito =JOptionPane.showInputDialog("Valor de Depósito para abertura de conta");
	double d = Double.parseDouble(deposito);
	Cliente c1 = new Cliente();
	c1.setNome(nome);
	c1.setSobrenome(sobrenome);
	c1.setCpf(cpf);
	c1.setRegistroGeral(rg);
	c1.setNomePai(nomePai);
	c1.setNomeMae(nomeMae);
	c1.setDataNascimento(dataNascimento);

	Metodos c = new Metodos();
	c.setCliente(c1);
	c.depositoAbertura(d);
	c.Extrato();
	c.getClientes().add(c1);
	/*Metodos c2 = new Metodos("Diego","de Araujo Oliveira","123.456.789-78",200);
	c2.Extrato();
	}*/
	}
}
