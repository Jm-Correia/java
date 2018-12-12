package br.com.ordenacao.quicksort;

public class QuickSort {

	private int vetor[];
	
	
	public QuickSort(int vetor[]) {
		this.vetor = vetor;
		
	}
	
	private int partition(int inicio, int fim) {
		int ref, down, up, pivo, aux;
		down = inicio;
		up = fim;
		ref = vetor[inicio];
		
		while(down < up) {
		
			
			while(vetor[down] <= ref && down<fim) {
				down++;
			}
			
			while(vetor[up] > ref) {
				up--;
			}
			
			if(down < up) {
				aux = vetor[up];
				vetor[up] = vetor[down];
				vetor[down] = aux;
			}
	
		}
		vetor[inicio] = vetor[up];
		vetor[up] = ref;
		return up;
	}
	
	
	public void quickSort(int inicio, int fim) {
		int pivo;
		if(inicio > fim) {
			return;
		}
		pivo = partition(inicio, fim);
		quickSort(inicio, pivo-1);
		quickSort(pivo+1, fim);
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
