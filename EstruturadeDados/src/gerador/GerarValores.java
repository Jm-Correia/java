package gerador;

import java.util.Random;

public class GerarValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valores[] = new int[10];
		int valor, pos;
		
		pos=0;
		Random r= new Random();
		int i = ((int)(System.currentTimeMillis() * valores.length) % 100)*-1;
		System.out.println("         I         " + i);
		do {
		valor = (int) (Math.random() * (valores.length))% (int)System.currentTimeMillis();
		//int v = r.nextInt((((valores.length-1)+1) + 1));
		int v = r.nextInt(1000*i);
		System.out.println(" Valor Gerado: Math.radom() " + valor);
		System.out.println(" Valor Gerado: RANDOM()     " + v);	
		valores[pos] = valor;	
		pos++;	
		} while(pos < valores.length);
		
	}

}
