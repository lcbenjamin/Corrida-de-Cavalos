package corrida;

import java.util.Random;

public class Corredor extends Thread {
	
	private int id;
	private int distancia;
	private int passadaMaxima;
	private float distanciaPercorrida = 0;

	public Corredor(int id, int distancia, int passadaMaxima) {
		
		this.id = id;
		this.distancia = distancia;
		this.passadaMaxima = passadaMaxima;
		
		this.start();
			
	}
	
	@Override
	public void run() {

		while (this.distanciaPercorrida < this.distancia) {
			this.distanciaPercorrida = this.distanciaPercorrida + (new Random().nextFloat() * this.passadaMaxima);
		}
		
		System.out.println("Corredor "+this.id+" chegou com a distancia "+this.distanciaPercorrida);
		
	}
	

}
