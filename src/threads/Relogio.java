package threads;

public class Relogio extends Thread {
	
	Controle controle;
	
	public Relogio(Controle controle) {
		this.controle = controle;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				controle.incrementSegundos();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();	
		}
	}

}

