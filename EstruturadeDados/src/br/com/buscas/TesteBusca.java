package br.com.buscas;

public class TesteBusca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores= {34,56,12,6,78,99,102,5120, 1245, 4,2,876,101};
		int[] valoresOrd = {2,4,6,12,34,56,78,99,101,102,876,1245,5120};
		
		BuscaSequencialBinaria.BuscaSequencial(valores, 8900);
		BuscaSequencialBinaria.BuscaBinaria(valoresOrd, 8900);
		
	}

}
