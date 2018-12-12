package br.com.ordenacao.bubleSort;

import br.com.ordenacao.InsertionSort.InsertionSort;

public class TesteBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valores[] = {10,190,80,18965,1,890,176156,600,2,200,300,512,3,4,4,5};
		 //int valores[] = {25,57,48,37,12,92,33};
		InsertionSort i = new InsertionSort(valores);
		//i.imprimirVetor();
		long time = System.currentTimeMillis();
		
		i.realizarOrdenacao();
		
		double tempo = System.currentTimeMillis()-time;
		System.out.println(tempo);
	}

}
