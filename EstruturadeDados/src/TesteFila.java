
public class TesteFila {

	public static void main(String[] args) {
		
	Fila f = new Fila(10);
	
	try {
		f.inserir(101);
		f.inserir(1876);
		f.inserir(786);
		f.inserir(176);
		f.inserir(10);
		f.inserir(12);
		f.inserir(15);
		f.inserir(89);
		f.inserir(103);
		f.inserir(1890);
		f.inserir(2890);
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	int i = 1;
	
	while(!f.isEmpty()) {
		try {
			System.out.println(i +" Removendo da fila o número " + f.remover());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

		
		
		
	}
	
}
