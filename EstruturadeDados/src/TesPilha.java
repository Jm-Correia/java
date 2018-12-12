
public class TesPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha p = new Pilha();
		try {
			p.push(2);
			p.push(3);
			p.push(5);
			System.out.println(p.pop());
			int i = p.pop();
			System.out.println(i);
			p.push(1);
			p.push(4);
			p.push(6);
			p.push(7);
			p.push(8);
			p.push(9);
			p.push(2);
			p.push(3);
			p.push(5);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
