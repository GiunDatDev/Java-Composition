package computerPart;
import computerConfig.config;
import superComputerpackage.superComputersetup;

public class ram extends superComputersetup{
	private int ramAmmount;
	private String ramGeneration;
	
	public ram(String manufacturer, String model, String country, int ramAmmount, String ramGeneration) {
		super(manufacturer, model, country);
		this.ramAmmount = ramAmmount;
		this.ramGeneration = ramGeneration;
	}

	public int getRamAmmount() {
		return ramAmmount;
	}

	public void setRamAmmount(int ramAmmount) {
		this.ramAmmount = ramAmmount;
	}

	public String getRamGeneration() {
		return ramGeneration;
	}

	public void setRamGeneration(String ramGeneration) {
		this.ramGeneration = ramGeneration;
	}
	
	public void ramEECchecking(boolean EECcapability) {
		if (EECcapability == true) {
			System.out.println("EEC mode is ready !!!");
		}
		else {
			System.out.println("EEC mode is not ready !!!");
		}
	}
	
	public void ramInfo() {
		showGeneralInfo();
		System.out.println("Ammount of ram: " + ramAmmount);
		System.out.println("Ram generation: " + ramGeneration);
		System.out.println("\n\n");
	}
}
