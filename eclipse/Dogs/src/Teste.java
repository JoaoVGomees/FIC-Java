import br.edu.senaisp.model.Cachorro;

public class Teste {

	public static void main(String[] args) {

		Cachorro spike = new Cachorro("Spike", "Pastor alemão", "Negão");

		System.out.println(spike.getNome());
		System.out.println(spike.getRaca());
		System.out.println(spike.getCor());

		System.out.println(spike.latir());
		System.out.println(spike.correr());

	}

}
