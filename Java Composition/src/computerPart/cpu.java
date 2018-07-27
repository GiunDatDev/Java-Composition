package computerPart;
import superComputerpackage.superComputersetup;
import computerPart.cpuTurbo;
import java.util.*;

public class cpu extends superComputersetup{
	private double processorFrequency;
	private int coreNumber;
	private int threadNumber;
	private String userLevel;

	public cpu(String manufacturer, String model, String country, double processorFrequency, int coreNumber, int threadNumber, String userLevel) {
		super(manufacturer, model, country);
		this.processorFrequency = processorFrequency;
		this.coreNumber = coreNumber;
		this.threadNumber = threadNumber;
		this.userLevel = userLevel;
	}

	public double getProcessorFrequency() {
		return processorFrequency;
	}

	public void setProcessorFrequency(double processorFrequency) {
		this.processorFrequency = processorFrequency;
	}

	public int getCoreNumber() {
		return coreNumber;
	}

	public void setCoreNumber(int coreNumber) {
		this.coreNumber = coreNumber;
	}

	public int getThreadNumber() {
		return threadNumber;
	}

	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	
	public void controllCpuSpeed() {
		cpuTurbo currentCPU = new cpuTurbo(this.processorFrequency);
		Scanner usr_in = new Scanner(System.in);
		System.out.println("Enter command to work with cpu !!!");
		String choice = usr_in.nextLine();
		
		if (choice.equals("Turbo up")) {
			processorFrequency = currentCPU.cpuTurboUp();
		}
		else if (choice.equals("Turbo down")) {
			processorFrequency = currentCPU.cpuTurboDown();
		}
		else if (choice.equals("ShutdownCPU")) {
			processorFrequency = currentCPU.cpuShutdown();
		}
		else {
			controllCpuSpeed();
		}
	}
	
	public void cpuInfo() {
		showGeneralInfo();
		System.out.println(">>> Level of user: " + userLevel);
		System.out.println(">>> Processor Frequency: " + processorFrequency + " GHz");
		System.out.println(">>> Number of core: " + coreNumber);
		System.out.println(">>> Number of thread: " + threadNumber);
	}
}
