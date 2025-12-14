package xezi.gof;

import xezi.gof.facade.Facade;
import xezi.gof.singleton.SingletonEager;
import xezi.gof.singleton.SingletonLazy;
import xezi.gof.singleton.SingletonLazyHolder;
import xezi.gof.strategy.Comportamento;
import xezi.gof.strategy.ComportamentoAgressivo;
import xezi.gof.strategy.ComportamentoDefensivo;
import xezi.gof.strategy.ComportamentoNormal;
import xezi.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
	
		//Singleton
		System.out.println("LAZY");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println("\nEAGER");
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		System.out.println("\nLAZY HOLDER");
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder+"\n");
		
		
		//Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
				
		Robo robo = new Robo();		
		robo.setCompotamento(normal);
		
		robo.mover();
		robo.mover();
		
		robo.setCompotamento(defensivo);
		robo.mover();
		
		robo.setCompotamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		System.out.println();
		
		
		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("xezi", "021312-321");		
	}
}