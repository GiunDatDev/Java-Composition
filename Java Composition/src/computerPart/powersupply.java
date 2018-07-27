package computerPart;

import superComputerpackage.superComputersetup;

public class powersupply extends superComputersetup{
	private int powerLevel;
	private String qualityLevel;

	public powersupply(String manufacturer, String model, String country, int powerLevel, String qualityLevel) {
		super(manufacturer, model, country);
		this.powerLevel = powerLevel;
		this.qualityLevel = qualityLevel;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	public String getQualityLevel() {
		return qualityLevel;
	}

	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}
	
	public void powersupplyInfo() {
		showGeneralInfo();
		System.out.println(">>> Powersupply level: " + powerLevel);
		System.out.println(">>> Quality level: " + qualityLevel);
		System.out.println("\n\n");
	}
}
