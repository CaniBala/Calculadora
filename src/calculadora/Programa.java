package calculadora;

public class Programa {

	public static void main(String[] args) {
		
		Calcula A = new Soma(); //A pode assumir qualquer uma das classes que implementa a interface Calcula.
		Calcula B = new Subtrai();
		Teste X = new Teste(20,10);
		
		System.out.println(A.calcula(20,10));
		System.out.println(B.calcula(20,10));
		
		
		int Y;
		Y = X.teste(20, 10);
		System.out.println(Y);
	}

}
