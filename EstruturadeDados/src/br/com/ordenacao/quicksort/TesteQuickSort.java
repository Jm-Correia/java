package br.com.ordenacao.quicksort;

import br.com.ordenacao.InsertionSort.InsertionSort;

public class TesteQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int valores[] = {10,190,80,18965,1,890,176156,600,2,200,300,512,3,4,4,5};
		 //int valores[] = {25,57,48,37,12,92,33};
		QuickSort q = new QuickSort(valores);
		//i.imprimirVetor();
		q.imprimirVetor();
		q.quickSort(0, valores.length-1);
		q.imprimirVetor();
		
	}

}
