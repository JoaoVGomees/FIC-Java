
public class TesteTipos {
	public static void main(String[] args) {

		String[] vetor = new String[3];

		vetor[0] = "João;1.78;19;SP";
		vetor[1] = "Nathan;1.80;24;SP";
		vetor[2] = "Matheus;1.90;22;SP";

		String[] nome = new String[vetor.length];
		String[] altura = new String[vetor.length];
		String[] idade = new String[vetor.length];
		String[] cidade = new String[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			String[] registro = vetor[i].split(";");

			nome[i] = registro[0];
			altura[i] = registro[1];
			idade[i] = registro[2];
			cidade[i] = registro[3];

			System.out.println("Nome: " + nome[i]);
			System.out.println("Altura: " + altura[i]);
			System.out.println("Idade: " + idade[i]);
			System.out.println("Cidade: " + cidade[i]);
			System.out.println();

		}
		float media = mediaAltura(altura);
		System.out.println("Media da Altura: " + media);

//		String precoStr1 = "45.75";
//		String precoStr2 = "20.25";
//		
//		double precoDouble1 = Double.parseDouble(precoStr1);
//		double precoDouble2 = Double.parseDouble(precoStr2);
//		
//		double somaD = precoDouble1 + precoDouble2;
//		String somaStr = String.valueOf(somaD);
//		System.out.println(somaStr);	
//		
//		String registo = "Dennis;1,81;26;São Paulo";
//		
//		String[] vetor = registo.split(";");
//		
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
	}

	public static float mediaAltura(String[] lista) {
		float somatorio = 0;
		for (int i = 0; i < lista.length; i++) {
			float temp = Float.parseFloat(lista[i]);
			somatorio = somatorio + temp;
		}
		return somatorio / lista.length;
	}
}