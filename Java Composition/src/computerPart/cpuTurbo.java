package computerPart;

public class cpuTurbo{
	private double cpuBaseFrequency;
	
	public cpuTurbo(double cpuBaseFrequency) {
		this.cpuBaseFrequency = cpuBaseFrequency;
	}
	
	public double cpuTurboUp() {
		cpuBaseFrequency += 1;
		System.out.println("CPU is running at: " + cpuBaseFrequency);
		return cpuBaseFrequency;
	}
	
	public double cpuTurboDown() {
		cpuBaseFrequency -= 1;
		System.out.println("CPU is running at: " + cpuBaseFrequency);
		return cpuBaseFrequency;
	}
	
	public double cpuShutdown() {
		cpuBaseFrequency = 0;
		System.out.println("EMERGENCY TURNING OFF CPU !!!" + "\nCPU SPEED: " + cpuBaseFrequency + " GHz");
		return cpuBaseFrequency;
	}
}
