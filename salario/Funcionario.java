package salario;

public class Funcionario {

	public String name;
	public Double GrossSalary;
	public Double tax;
	public Double salary;
	
	public Double salarioLiquido() {
		this.salary = GrossSalary - tax;
		return this.salary;
	}
	
	public Double increaseSalary(Double porcent) {
		this.GrossSalary += (this.GrossSalary * porcent)/100;
		return this.GrossSalary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name 
				+ ", Gross Salary: " +  
		        String.format("%.2f",GrossSalary) 
				+ ", Tax: " + tax;
	}
	
	
}
