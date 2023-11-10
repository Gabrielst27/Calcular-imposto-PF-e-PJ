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
	public Double tax(Double annualIncome) {
		if(numberOfEmployees <= 10) {
			return annualIncome + annualIncome * 0.16;
		} else {
			return annualIncome + annualIncome * 0.14;
		}
	}

}
