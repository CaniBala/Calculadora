package calculadora;

public class Teste { //Classe para ser usada como teste.
	
	private int A,B; //Variaveis de teste
	
	public Teste(int A,int B){ //construtor de teste
		
		this.A = A;
		this.B = B;
		
	}

	public int teste(int A, int B) {

		int resultado = 0;
		
		resultado = A+B;

		return resultado;
		
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

}
