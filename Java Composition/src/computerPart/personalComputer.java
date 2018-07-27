package computerPart;

public class personalComputer {
	private computerCase computerCase;
	private monitor monitor;
	private motherboard motherboard;
	private powersupply powersupply;
	private cpu cpu;
	
	public personalComputer(computerPart.computerCase computerCase, computerPart.monitor monitor,
			computerPart.motherboard motherboard, computerPart.powersupply powersupply, computerPart.cpu cpu) {
		super();
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
		this.powersupply = powersupply;
		this.cpu = cpu;
	}

	public computerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(computerCase computerCase) {
		this.computerCase = computerCase;
	}

	public monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(monitor monitor) {
		this.monitor = monitor;
	}

	public motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public powersupply getPowersupply() {
		return powersupply;
	}

	public void setPowersupply(powersupply powersupply) {
		this.powersupply = powersupply;
	}

	public cpu getCpu() {
		return cpu;
	}

	public void setCpu(cpu cpu) {
		this.cpu = cpu;
	}
		
}
