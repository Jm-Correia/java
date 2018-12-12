package br.com.testes;

public class TestePilha {

	public static void main(String[] args) {
		PilhaDinamica p = new PilhaDinamica();
		p.push(101);
		p.push(1203);
		p.push(4003);
		
		System.out.println(p.pop());
	}
	
}
