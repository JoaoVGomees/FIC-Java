
public class Teste {

	public static void main(String[] args) {

		String cpf = "459.274.118-86";

		if (validadorCpf(cpf)) {
			System.out.println("Cpf valido");
		} else {
			System.out.println("Cpf invalido");
		}
	}

	public static boolean validadorCpf(String cpf) {
		cpf = cpf.replace(".", "").replace("-", "");

		char letra;
		int numero;
		int multiplicador = 10;
		int soma = 0;

		for (int i = 0; i < 9; i++) {
			letra = cpf.charAt(i);
			numero = Character.getNumericValue(letra);

			soma += (numero * multiplicador--);
		}

		int resto = soma % 11;
		int dv1 = 11 - resto;

		if (dv1 > 9)
			dv1 = 0;

		int dv1Real = Character.getNumericValue(cpf.charAt(9));

		if (dv1 != dv1Real)
			return false;
		else {
			soma = 0;
			multiplicador = 11;
			for (int i = 0; i < 10; i++) {
				letra = cpf.charAt(i);
				numero = Character.getNumericValue(letra);

				soma += (numero * multiplicador--);
			}

			resto = soma % 11;
			int dv2 = 11 - resto;

			if (dv2 > 9)
				dv2 = 0;

			int dv2Real = Character.getNumericValue(cpf.charAt(10));

			if (dv2 != dv2Real) {
				return false;
			} else {
				return true;
			}

		}

	}
}
