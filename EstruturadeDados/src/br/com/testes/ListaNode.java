package br.com.testes;

public class ListaNode {

	private Caixa inicio;
	
	public ListaNode() {
		this.inicio = null;
	}
	
	//inserir remover listar e isVazio
	
	public boolean isEmpty() {
		return inicio == null;
	}
	
	public void inserir(int n) {
		Caixa nova = new Caixa();
		nova.setElemento(n);
		nova.setNextElemento(null);
		
		if(isEmpty()) {
			inicio = nova;
		}else {
			Caixa aux;
			aux = inicio;
			while(aux.getProximo() != null){
				aux = aux.getProximo();
			}
			aux.setNextElemento(nova);
			
		}	
	}
	
	public void listar() {
		if(isEmpty()) System.out.println("Não existe elementos na lista");
		if(inicio != null) {
			Caixa aux;
			aux = inicio;
			System.out.println("Elemento: " + aux.getElement());
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
				System.out.println("Elemento: " + aux.getElement());
			}	
		}
	}
	
	public void remover() {
		
		if(!isEmpty()) {
			inicio = inicio.getProximo();
		}
	
	}
}
