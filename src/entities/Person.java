package entities;

public abstract class Person {
	
	protected String name;
	protected Double annualIncome;
	
	public Person() {
		
	}

	public Person(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public abstract Double calcTax();

}
