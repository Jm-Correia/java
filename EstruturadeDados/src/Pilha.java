
//Exemplo simples de implementação de Pilha

public class Pilha {

	
	private int valores[];
	private int topo;
		
	public Pilha() {
		valores = new int[10];
		topo = -1;
	}
	
	public void push(int element) throws Exception {
		if(this.isFull()) {
			throw new Exception("Pilha se encontra Cheia");
		}
		valores[++topo] = element;
		
	}
	
	public boolean isEmpty() {
		return (topo==-1);
	}
	
	public boolean isFull() {
		return (topo ==9);
	}
	
	public int pop() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Pilha se encontra vazia");
		}
		
		return valores[topo--];
	}
	
}
