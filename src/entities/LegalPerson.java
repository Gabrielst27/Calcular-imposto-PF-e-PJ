package entities;

public final class LegalPerson extends Person {
	
	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	@Override
	public Double Tax(Double annualIncome, Double healthSpending) {
		if(annualIncome < 20000.00) {
			return (annualIncome + annualIncome * 0.15) - (healthSpending/2);
		} else {
			return (annualIncome + annualIncome * 0.25) - (healthSpending/2);
		}
	}

}
