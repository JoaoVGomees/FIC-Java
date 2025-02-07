
public class Teste {

	public static void main(String[] args) {

		Lista lista = new Lista(50);
		
		lista.adicionar("Salamaleiko");
		lista.adicionar("Pastel de flango");

		Lista animais = new Lista(50);
		animais.adicionar("Unicornio");
		animais.adicionar("Leão Marinho");
		animais.adicionar("Pombo");
		animais.adicionar("Águia");
		animais.adicionar("Cavalo");
		animais.adicionar("Macaco");
		
		
		System.out.println(animais.mostrarTodos());
		
	}

}
