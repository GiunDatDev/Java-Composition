package computerPart;
import superComputerpackage.superComputersetup;
import computerConfig.config;

public class computerCase extends superComputersetup{
	private double caseDimension;
	
	public computerCase(String manufacturer, String model, String country, double caseDimension) {
		super(manufacturer, model, country);
		this.caseDimension = caseDimension;
	}

	public double getCaseDimension() {
		return caseDimension;
	}

	public void setCaseDimension(double caseDimension) {
		this.caseDimension = caseDimension;
	}
	
	public void caseInfo() {
		showGeneralInfo();
		System.out.println(">>> Case dimension: " + caseDimension);
		System.out.println("\n\n");
	}
}
