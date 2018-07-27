package computerPart;
import superComputerpackage.superComputersetup;
import computerConfig.config;

public class motherboard extends superComputersetup{
	private int ramSlot;
	private int cpuSlot;
	private int cardSlot;
	private String biosVersion;
	private String cpuType;
	
	public motherboard(String manufacturer, String model, String country, int ramSlot, int cpuSlot, int cardSlot, String biosVersion, String cpuType) {
		super(manufacturer, model, country);
		this.ramSlot = ramSlot;
		this.cpuSlot = cpuSlot;
		this.cardSlot = cardSlot;
		this.biosVersion = biosVersion;
		this.cpuType = cpuType;
	}

	public int getRamSlot() {
		return ramSlot;
	}

	public void setRamSlot(int ramSlot) {
		this.ramSlot = ramSlot;
	}

	public int getCpuSlot() {
		return cpuSlot;
	}

	public void setCpuSlot(int cpuSlot) {
		this.cpuSlot = cpuSlot;
	}

	public int getCardSlot() {
		return cardSlot;
	}

	public void setCardSlot(int cardSlot) {
		this.cardSlot = cardSlot;
	}

	public String getBiosVersion() {
		return biosVersion;
	}

	public void setBiosVersion(String biosVersion) {
		this.biosVersion = biosVersion;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	
	public void setPartname(int partName) {
		 super.partName = getPartname(partName);
	}
	
	public void loadBIOS() {
		System.out.println("BIOS is starting !!!");
	}
	
	public void motherboardInfo() {
		showGeneralInfo();
		System.out.println(">>> Ram slot: " + ramSlot);
		System.out.println(">>> CPU slot: " + cpuSlot);
		System.out.println(">>> Card slot: " + cardSlot);
		System.out.println(">>> BIOS version: " + biosVersion);
		System.out.println(">>> Type of CPU: " + cpuType);
		System.out.println("\n\n");
	}
}
