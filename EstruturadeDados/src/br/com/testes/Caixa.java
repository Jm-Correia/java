package br.com.testes;

public class Caixa {

	private int elemento;
	private Caixa caixa;
	
	public Caixa() {
		
	}
	
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
	public int getElement() {
		return this.elemento;
	}
	
	public void setNextElemento(Caixa c) {
		this.caixa = c;
	}
	
	public Caixa getProximo() {
		return this.caixa;
	}
}
