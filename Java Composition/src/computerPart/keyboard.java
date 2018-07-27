package computerPart;
import computerConfig.config;
import superComputerpackage.superComputersetup;

public class keyboard extends superComputersetup{
	private String keyboardLanguage;
	private String colour;

	public keyboard(String manufacturer, String model, String country, String keyboardLanguage, String colour) {
		super(manufacturer, model, country);
		this.keyboardLanguage = keyboardLanguage;
		this.colour = colour;
	}

	public String getKeyboardLanguage() {
		return keyboardLanguage;
	}

	public void setKeyboardLanguage(String keyboardLanguage) {
		this.keyboardLanguage = keyboardLanguage;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void keyboardInfo() {
		showGeneralInfo();
		System.out.println("Keyboard language: " + keyboardLanguage);
		System.out.println("Keyboard color: " + colour);
		System.out.println("\n\n");
	}
	
}
