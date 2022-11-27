package classes.metodos;

public class ClasseExecutavel {

	public static void main(String[] args) {
		Metodos conta1= new Metodos ("Diego ", "de Araujo Oliveira","951.753.852-88",1000);
		conta1.Extrato();
		System.out.println("");
		conta1.Depositar(50);
		System.out.println("");
		conta1.Extrato();
		System.out.println("");
		conta1.Sacar(300);
		System.out.println("");
		conta1.Extrato();
	}

}
