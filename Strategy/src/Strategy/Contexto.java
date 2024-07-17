package Strategy;

public class Contexto {
	
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void executarStrategy() {
		strategy.executar();
	}
	
}
