package classes.metodos;

public class ClasseExecutavel {

	public static void main(String[] args) {
	Cliente c1 = new Cliente();
	c1.setNome("Diego");
	c1.setSobrenome("de Araujo Oliveira");
	c1.setCpf("123.456.789-00");
	Metodos c2 = new Metodos("Diego","de Araujo Oliveira","123.456.789-78",200);
	c2.Extrato();
	}

}
