import br.edu.senaisp.modelo.Carro;

public class Teste {

	public static void main(String[] args) {

		Carro c1 = new Carro("Fusca", "Volkswagen", "Azul baby", "EPG0X12", "Armando Peixoto", 1_000_000);
		
		System.err.println(c1.getNome());
	}

}
