package br.com.ordenacao.InsertionSort;

public class InsertionSort {

	private int vetor[];
	
	
	public InsertionSort(int vetor[]) {
		this.vetor = vetor;
		
	}
	
	public void realizarOrdenacao() {
		int atual, anterior, aux;
		
		for(atual=0;atual<vetor.length; atual++) {
			
			aux = vetor[atual];
			for(anterior = atual-1; (anterior >= 0) && vetor[anterior] > aux; anterior--) {
				vetor[anterior+1]=vetor[anterior];
			}
			vetor[anterior+1] = aux;
			
			System.out.println("Interação " + (atual));
			imprimirVetor();
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
