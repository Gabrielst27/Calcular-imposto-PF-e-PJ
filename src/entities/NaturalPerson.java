package entities;

public final class NaturalPerson extends Person {
	
	private Double healthSpending;
	
	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	@Override
	public Double tax() {
		if(annualIncome < 20000.00) {
			return (annualIncome + annualIncome * 0.15) - (healthSpending / 2);
		} else {
			return (annualIncome + annualIncome * 0.25) - (healthSpending / 2);
		}
	}

}
