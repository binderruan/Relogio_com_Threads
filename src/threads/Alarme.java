package threads;

public class Alarme extends Thread {
	
	Controle controle;
	private boolean status = true;
	
	public Alarme(Controle controle) {
		this.controle = controle;
	}

	@Override
	public void run() {
		while (status) {
			try {
				Thread.sleep(1000);
				if (controle.getAlarme() <= controle.getHoraDoRelogioSegundos()) {
					System.err.println("Trrrrrrrim, trrrrrrrrim SEU ALARME ESTÁ TOCANDO Trrrrrrrim, trrrrrrrrim!");
					status =  false;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}

}







