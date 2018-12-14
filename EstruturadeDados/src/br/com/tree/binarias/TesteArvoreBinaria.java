package br.com.tree.binarias;

import basic.Elemento;

public class TesteArvoreBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arvore a  = new Arvore(new Elemento(10));
		
		a.inserir(new Elemento(5));
		a.inserir(new Elemento(3));
		a.inserir(new Elemento(15));
		a.inserir(new Elemento(12));
		
		
		// caso do default 
		a.imprimirArvore(0);
		
		
		a.imprimirArvore(1);
		a.imprimirArvore(2);
		
		
		a.inserir(new Elemento(1));
		
		a.imprimirArvore(3);
		
		System.out.println("Arvore tem o total de " + a.qtdNo() + " Elementos");
		System.out.println("O elemento 5 " + (a.buscar(1)? "Existe " : "Não Existe"));
	}

}
