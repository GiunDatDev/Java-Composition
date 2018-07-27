package computerPart;
import computerConfig.config;
import superComputerpackage.superComputersetup;

public class graphicCard extends superComputersetup{
	private String typeOfuser;
	private int pinSocket;
	private int fanAmmount;

	public graphicCard(String manufacturer, String model, String country, String typeOfuser, int pinSocket, int fanAmmount) {
		super(manufacturer, model, country);
		this.typeOfuser = typeOfuser;
		this.pinSocket = pinSocket;
		this.fanAmmount = fanAmmount;
	}

	public String getTypeOfuser() {
		return typeOfuser;
	}

	public void setTypeOfuser(String typeOfuser) {
		this.typeOfuser = typeOfuser;
	}

	public int getPinSocket() {
		return pinSocket;
	}

	public void setPinSocket(int pinSocket) {
		this.pinSocket = pinSocket;
	}

	public int getFanAmmount() {
		return fanAmmount;
	}

	public void setFanAmmount(int fanAmmount) {
		this.fanAmmount = fanAmmount;
	}
	
	public void graphicCardInfo() {
		showGeneralInfo();
		System.out.println("User level: " + typeOfuser);
		System.out.println("Number of pin socket: " + pinSocket);
		System.out.println("Nunber of fan: " + fanAmmount);
		System.out.println("\n\n");
	}
}
