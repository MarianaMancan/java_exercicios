package trinagulo;

import java.util.Scanner;

public class testTriangle {

	 public static void main(String[] args) {
		 
		 Triangle x = new Triangle();
		 Triangle y = new Triangle();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the measures of triangle x: ");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		 
		 System.out.println("Enter the measure of triangle y : ");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
		 
		 
		Double areaX = calcArea(x.a,x.b,x.c);
		Double areaY = calcArea(y.a,y.b,y.c);
		
		System.out.printf("Triangle x are: %.4f%n",areaX);
		System.out.printf("Triangle y are: %.4f%n",areaY);
		 
	 }
	 
	 public static Double calcArea(double x, double y, double z) {
		 Double p = (x + y + z)/2;
		 Double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
		  return area; 
		 
	 }
}
