package br.com.ordenacao.selectionsort;

public class SelectionSort {

	private int vetor[];
	
	
	public SelectionSort(int vetor[]) {
		this.vetor = vetor;
		
	}
	
	public void realizarOrdenacao() {
		int i, menor, aux;
		
		for(i =0;i<vetor.length-1; i++) {
			for(menor= i+1; menor < vetor.length; menor++) {
				
				if(vetor[i] > vetor[menor]) {
					aux = vetor[menor];
					vetor[menor] = vetor[i];
					vetor[i] = aux;
				}
			}
		
			
		}	
	}
	
	public void imprimirVetor() {
		System.out.print("[");
		for(int i=0; i< vetor.length; i++) {
			System.out.print(" " + vetor[i]);
			if(i != vetor.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	

	
}
