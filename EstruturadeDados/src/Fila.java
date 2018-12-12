
public class Fila {

	private int inicio;
	private int fim;
	private int total;
	private int valor[];
	
	public Fila(int n) {
		valor = new int[n];
		inicio = 0;
		fim = 0;
		total = 0;
	}
	
	public void inserir(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Fila Cheia");
		}		
		valor[fim] = element;
		fim = (fim + 1) % valor.length;
		total++;
	}
	
	public int remover() throws Exception {
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		int element = valor[inicio];
		inicio = (inicio+1)% valor.length;
		total--;
		return element;
	}
	
	public boolean isEmpty() {
		return (total == 0);
	}
	
	public boolean isFull() {
		return (total == valor.length);
	}
	
	
}
