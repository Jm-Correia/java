package br.com.buscas;

public class BuscaSequencialBinaria {

	//problema de percorrer todo o vetor de forma exponencial
	public static void BuscaSequencial(int[] valores, int elemento) {
		int pos, qtdinteracoes;
		pos = -1;
		if(!isEmpty(valores)) {
			qtdinteracoes = 0;
			for(int i=0; i<valores.length; i++) {
				qtdinteracoes++;
				if(elemento == valores[i]) {
					pos = i;
					break;
				}
			}
			System.out.println("Busca sequencial Precisou de " + qtdinteracoes + " Interações");
		}
		if(pos==-1) {
			System.out.println("O elemento não foi encontrado ");
		}else {
			System.out.println("O elemento foi encontrado na Posição " + pos);
		}
		
	}
	
	//Problema de necessidade de ordenacao (crescenete ou decrescente) dos elementos
	public  static void BuscaBinaria(int[] valores, int elemento) {
		int inicio, fim, meio, pos, qtdInt;
		qtdInt = 0;
		pos = -1;
		inicio =0;
		fim = valores.length -1;
		
		
		while(inicio <= fim) {
			qtdInt++;
			meio = (inicio+fim)/2;
			if(valores[meio] == elemento) {
				pos = meio;
				break;
			}else {
				if(elemento > valores[meio]) {
					inicio = meio+1;
				}else {
					fim = meio-1;
				}
			
			}
			
		}
		System.out.println("Busca sequencial Precisou de " + qtdInt + " Interações");
		if(pos==-1) {
			System.out.println("O elemento não foi encontrado ");
		}else {
			System.out.println("O elemento foi encontrado na Posição " + pos);
		}
		
	}
	
	private static boolean isEmpty(int[] valores) {
		return (valores.length == 0);
	}
	
}
