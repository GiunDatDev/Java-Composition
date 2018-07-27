package computerPart;
import computerConfig.config;
import superComputerpackage.superComputersetup;

public class monitor extends superComputersetup{
	private int screenSize;
	private double nativeResolution;

	public monitor(String manufacturer, String model, String country, int screenSize, double nativeResolution) {
		super(manufacturer, model, country);
		this.nativeResolution = nativeResolution;
		this.screenSize = screenSize;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public double getNativeResolution() {
		return nativeResolution;
	}

	public void setNativeResolution(double nativeResolution) {
		this.nativeResolution = nativeResolution;
	}
	
	public void monitorInfo() {
		showGeneralInfo();
		System.out.println(">>> Monitor size: " + screenSize);
		System.out.println(">>> Monitor resolution: " + nativeResolution);
		System.out.println("\n\n");
	}
}
