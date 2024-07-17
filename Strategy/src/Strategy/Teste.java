package Strategy;

public class Teste {
	
	public static void main(String[] args) {
		
		Contexto contexto = new Contexto();
		
		Strategy strategyA = new StrategyConcretaA();
		Strategy strategyB = new StrategyConcretaB();
		
		contexto.setStrategy(strategyA);
		contexto.executarStrategy();
		
		contexto.setStrategy(strategyB);
		contexto.executarStrategy();
		
	}

}
