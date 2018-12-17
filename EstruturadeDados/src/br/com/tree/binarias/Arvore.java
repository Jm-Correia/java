package br.com.tree.binarias;

import basic.Elemento;


//Exemplo de Arvore Binaria

//autor: João Marcos Correia
public class Arvore {

	private Elemento elemento;
	private Arvore left;
	private Arvore right;
	private int qtdNO =0;
	
	public Arvore() {
		
	}
	
	public Arvore(Elemento ele) {
		this.elemento = ele;
		this.left = null;
		this.right = null;
	}
	
	private boolean isEmpty() {
		return (elemento ==null);
	}
	
	public void inserir(Elemento novo) {
		if(isEmpty()) {
			this.elemento = novo;
		}else {
			Arvore arvore = new Arvore(novo);
			if(novo.getElemento() < this.elemento.getElemento()) {
				if(this.left == null) {
					this.left = arvore;
					System.out.println("Inserindo o " + arvore.elemento.getElemento() + " a esquerda do elemento "+ this.elemento.getElemento());
				}else {
					this.left.inserir(novo);
				}
			
			}else if( novo.getElemento() > this.elemento.getElemento()) {
				if(this.right == null) {
					this.right = arvore;
					System.out.println("Inserindo o " + arvore.elemento.getElemento() + " a direita do elemento "+ this.elemento.getElemento());
				}else {
					this.right.inserir(novo);
				}
				
			}
		}
	}
	
	public Arvore remover(Elemento ele) {
		if(isEmpty()) {
			return this;
		}else {
			if(this.elemento.getElemento() == ele.getElemento()) {
				//caso simples: o elemento é o nó folha (sem elementos a esquerda ou direita)
				if(this.left == null && this.right == null) {
					return null;
				}else {
					//caso o elemento da direita nao exista
					if(this.left != null && this.right == null) {
						return this.left;
					}else if(this.right!=null && this.left ==null) {
						return this.right;
					}
					
					
					//caso quando o elemento é o nó raiz e possui elementos a esquerda e direita
					if(this.left != null && this.right !=null && this.elemento.getElemento() == ele.getElemento()) {
						
						Arvore aux = this.left;
						
						while(aux.right != null) {
							aux = aux.right;
						}
						
						this.elemento = aux.elemento;
						aux.elemento = ele;
						
						this.left = left.remover(ele);
					}
				}
				
			}else if(ele.getElemento() < this.elemento.getElemento()) {
				this.left = this.left.remover(ele);
			}else if(ele.getElemento() > this.elemento.getElemento()) {
				this.right = this.right.remover(ele);
			}
			return this;
		}
	}
	
	// default: pre-ordem, 1: in-ordem, 2: pos-ordem e 3: in-ordem invertida
	public void imprimirArvore(int ordem) {
		if(!isEmpty()) {
			
			switch (ordem) {
			case 1:
				System.out.println("================ IN ORDEM =======================");
				imprimirInOrdem(this);
				System.out.println("");
				break;
			case 2:
				System.out.println("================ POS ORDEM =======================");
				imprimirPosOrdem(this);
				System.out.println("");
				break;
			case 3:
				System.out.println("================ IN ORDEM Invertida===============");
				imprimirInOrdemIn(this);
				System.out.println("");
				break;

			default:
				System.out.println("================ PRE ORDEM =======================");
				imprimiNo(this);
				System.out.println("");
				break;
			}
			System.out.println("=================================================");
				
		}	
	}
	
	//Imprimir pre-ordem
	private void imprimiNo(Arvore a) {

		if(!isEmpty()) {
		
		
			System.out.print(a.elemento.getElemento() +  " ");
		if(a.left != null) {
			this.imprimiNo(a.left);
		}
		if(a.right != null) {
			this.imprimiNo(a.right);
		}
	}
	}
	
	private void imprimirInOrdem(Arvore a){
		if(!a.isEmpty()) {
			
			if(a.left !=null) {
				imprimirInOrdem(a.left);
			}
			System.out.print(a.elemento.getElemento() + " ");
			if(a.right!=null) {
				imprimirInOrdem(a.right);
			}
		}
	}
	
	private void imprimirPosOrdem(Arvore a) {
		if(!a.isEmpty()) {
			if(a.right!=null) {
				imprimirPosOrdem(a.right);
			}
			if(a.left !=null) {
				imprimirPosOrdem(a.left);
			}
			System.out.print(a.elemento.getElemento() + " ");
		}
	}
	
	private void imprimirInOrdemIn(Arvore a) {
		if(!a.isEmpty()) {
			
			
			
			if(a.right!=null) {
				imprimirInOrdemIn(a.right);
			}
			System.out.print(a.elemento.getElemento() + " ");
			if(a.left !=null) {
				imprimirInOrdemIn(a.left);
			}
		}
	}
	
	public int qtdNo() {
		this.calcularNOS(this);
		return this.qtdNO;
	}
	
	private void calcularNOS(Arvore a) {
		if(a.isEmpty()) {
			this.qtdNO += 0;
		}else {
			if(a.left !=null) {
				calcularNOS(a.left);
			}
			if(a.right !=null) {
				calcularNOS(a.right);
			}
			this.qtdNO++;
		}
	}
	
	public boolean buscar(int valor) {
		if(isEmpty()) {
			return false;
		}
		
		if(valor == this.elemento.getElemento()) {
			return true;
		}else {
			if(valor < this.elemento.getElemento()) {
				if(this.left == null) {
					return false;
				}else {
					return this.left.buscar(valor);
				}
			}
			if(valor > this.elemento.getElemento()) {
				if(this.right == null) {
					return false;
				}else {
					return this.right.buscar(valor);
				}
			}
			return false;
		}
	}
	
}
