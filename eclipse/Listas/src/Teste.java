import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		ArrayList<String> flores = new ArrayList<>();
		// flores[0] = "Margarida";
		flores.add("Margarida");
		flores.add("Rosa");
		flores.add("Tulipa");
		flores.add("Violeta");
		flores.add("Orquidea");
		flores.add("Lirius");
		flores.add("Girasol");
		flores.add("Gravo");
		flores.add("Crisantemo");
		flores.add("Jasmin");
		flores.add("Papoula");
		flores.add("Lotus");
		flores.add("Ortencia");
		flores.add("Bromelia");

		System.out.println(flores.contains("Lotus"));

		System.err.println(flores.get(5));

		System.out.println(flores.indexOf("Ortencia"));

		System.err.println(flores.isEmpty());

		System.out.println(flores.remove(2));
		System.out.println(flores.remove("Bromelia"));

		ArrayList<String> plantas = new ArrayList<>();
		plantas.add("Comigo ninguém pode");
		plantas.add("Samambaia");
		plantas.add("Cactos");
		flores.addAll(plantas);

		ArrayList<String> arvores = new ArrayList<>();
		arvores.add("Silveira");
		arvores.add("Pereira");
		System.err.println(flores.containsAll(arvores));

		flores.removeAll(plantas);

		System.out.println(flores.size());

//		flores.clear();v

		List<String> novaFlores = flores.reversed();

		for (String flor : novaFlores) {
			System.out.println(flor);
		}
	}
}