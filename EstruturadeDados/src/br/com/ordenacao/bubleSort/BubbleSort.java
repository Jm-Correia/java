package br.com.ordenacao.bubleSort;

public class BubbleSort {

	private int vetor[];
	
	public BubbleSort(int vetor[]) {
		this.vetor = vetor;
	}
	
	
	public void realizarOrdenacao() {
		int i;
		int pos;
		int temp;
		
		for(i = 0; i < vetor.length-1; i++) {
			for(pos =0; pos < vetor.length-i-1;pos++) {
				
				if(vetor[pos] > vetor[pos+1]) {
					temp = vetor[pos];
					vetor[pos] = vetor[pos+1];
					vetor[pos+1] = temp;
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
