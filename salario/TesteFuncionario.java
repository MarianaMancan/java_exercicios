package salario;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   Funcionario func = new Funcionario();
	   System.out.println("Enter with name : ");
	   func.name = sc.nextLine();
	   System.out.println("Enter with gross salary: ");
	   func.GrossSalary = sc.nextDouble();
	   System.out.println("Enter with tax: ");
	   func.tax = sc.nextDouble();
	   func.salarioLiquido();
	   System.out.println(func);
	   System.out.println();
	   System.out.println("Employee: " + func.name + ", $" + String.format("%.2f", func.salary));
	   
	   System.out.println();
	   System.out.println("Wich percentage to increase salary? ");
	   Double porcent = sc.nextDouble();
	   func.increaseSalary(porcent);
	   
	   func.salarioLiquido();
	   System.out.println();
	   System.out.println("Update data: " + func.name + ", $" + String.format("%.2f", func.salary));
	}
}
