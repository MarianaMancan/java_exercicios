package retangulo;

import java.util.Scanner;

public class testeRetangulo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Retangulo retangulo = new Retangulo();
	    
	    System.out.println("Digite a largura do triangulo: ");
	    retangulo.width = sc.nextDouble();
	    System.out.println("Digite a altura do triangulo: ");
	    retangulo.Height = sc.nextDouble();
	    
	    Double area = retangulo.calcArea(retangulo.Height,retangulo.width);
	    Double diagonal = retangulo.calcDiagonal(retangulo.Height,retangulo.width);
	    Double perimetro = retangulo.calcPerimetro(retangulo.Height,retangulo.width);
	    
	    
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("Diagonal = %.2f%n", diagonal);
        System.out.printf("Perimetro = %.2fn",perimetro);
	}
	
	
	
	
	
    
}
