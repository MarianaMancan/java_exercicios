package retangulo;

public class Retangulo {

	public Double width;
	public Double Height;
	
	
	public Double calcArea(double x,double y) {
		Double a = x*y;
		return a;
	}
	public Double calcPerimetro(double x,double y) {
		Double p = 2*(x+y);
		return p;
	}
	
	public Double calcDiagonal(double x,double y) {
		Double d =  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));  
		return d;
	}
}
