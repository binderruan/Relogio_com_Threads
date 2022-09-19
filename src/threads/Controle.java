package threads;

public class Controle {

	private int segundos;
	private int cronometro;
	private int alarme;

	public Controle() {
		segundos = 0;
		cronometro = 0;
		alarme = 0;
	}

	public int getHoraDoRelogioSegundos() {
		return segundos;
	}

	public void setHoraDoRelogio(int segundos) {
		this.segundos = segundos;
	}

	public void incrementSegundos() {
		if (segundos >= 86399)
			segundos = 0;
		segundos++;
	}

	public int getCronometroSegundos() {
		return cronometro;
	}

	public void reiniciarCronometro() {
		cronometro = 0;
	}

	public void incrementCronometro() {
		cronometro++;
	}

	public void criarAlarme(int segundos) {
		alarme = segundos;
	}

	public int getAlarme() {
		return alarme;
	}
}
