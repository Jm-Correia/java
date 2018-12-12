package br.com.testes;

//Exemplo Pilha dinamica simples

public class PilhaDinamica {

	private Caixa fim;
	
	public PilhaDinamica() {
		fim = null;
	}
	
	public void push(int elemento) {
		Caixa nova = new Caixa();
		nova.setElemento(elemento);
		nova.setNextElemento(fim);
		
	
			fim = nova;
	
	}
	
	public int pop() {
		if(!isEmpty()) {
		int elemento = fim.getElement();
		fim = fim.getProximo();
		
		return elemento;
		}else {
			return -1;
		}
		
	}
	
	public boolean isEmpty() {
		return (fim == null);
	}
	
	
}
