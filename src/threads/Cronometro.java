package threads;

public class Cronometro extends Thread {

	Controle controle;
	private boolean status;

	public Cronometro(Controle controle) {
		this.controle = controle;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				if (status)
					controle.incrementCronometro();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

