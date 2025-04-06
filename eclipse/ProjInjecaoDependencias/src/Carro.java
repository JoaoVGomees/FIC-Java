
public class Carro {

	private IMotor motor;
	
	public Carro(IMotor m) {
		motor = m;
	}

	public void ligarCarro() {
		motor.ligar();
		System.out.println("Carro ligado!");
	}
	
}
