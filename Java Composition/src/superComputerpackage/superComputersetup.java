package superComputerpackage;
import computerConfig.config;

public class superComputersetup {
	private String manufacturer;
	private String model;
	private String country;
	protected String partName;
	
	public superComputersetup(String manufacturer, String model, String country) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.country = country;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	
	public String getPartname(int partName) {
		if (partName == config.MONITOR) {
			return this.partName = "MONITOR";
		}
		else if (partName == config.MOTHERBOARD) {
			return this.partName = "MOTHERBOARD";
		}
		else if (partName == config.KEYBOARD) {
			return this.partName = "KEYBOARD";
		}
		else if (partName == config.CASE) {
			return this.partName = "CASE";
		}
		else if (partName == config.POWERSUPPLY) {
			return this.partName = "POWER SUPPLY";
		}
		else if (partName == config.CPU) {
			return this.partName = "CPU";
		}
		else if (partName == config.RAM) {
			return this.partName = "RAM";
		}
		else if (partName == config.GPU) {
			return this.partName = "GPU";
		}
		else {
			return this.partName = "INVALID PART OF COMPUTER !!!";
		}
	}
	
	public void showGeneralInfo() {
		System.out.println("=== Name of computer part: " + partName + " ====");
		System.out.println(">>> Name of manufacturer: " + manufacturer);
		System.out.println(">>> Model: " + model);
		System.out.println(">>> Manufacturing country: " + country);
	}
}

















