package xezi.gof.strategy;

public class Robo {

	private Comportamento compotamento;

	public void setCompotamento(Comportamento compotamento) {
		this.compotamento= compotamento;
	}
	
	public void mover() {
		compotamento.mover();
	}
}
