package br.com.testes;

public class TesteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaNode l = new ListaNode();
		
		l.inserir(890);
		l.inserir(789);
		l.inserir(501);
		l.inserir(1);
		l.inserir(89);
		l.inserir(78);
		
		l.listar();
		//removeu o primeiro item
		l.remover();
		
		
		l.listar();
		
		l.remover();
		l.remover();
		l.remover();
		
		l.listar();
		
		l.remover();
		l.remover();
		
		l.listar();
			
	}

}
