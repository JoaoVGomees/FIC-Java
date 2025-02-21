import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Date date = new Date();
		LocalDate dtNasc = LocalDate.now();
		LocalDateTime dtEntrevista = LocalDateTime.now();

		System.out.println(date);
		System.err.println(dtNasc);
		System.out.println(dtEntrevista);
		
		LocalDate dtNascimento = LocalDate.of(2001, Month.SEPTEMBER, 03);
		System.err.println(dtNascimento);
	}

}
