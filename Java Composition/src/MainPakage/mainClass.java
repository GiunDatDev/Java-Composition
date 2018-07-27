package MainPakage;
import computerPart.caseDimension;
import computerPart.cpu;
import computerPart.computerCase;
import computerPart.monitor;
import computerPart.motherboard;
import computerPart.personalComputer;
import computerPart.screenResolution;
import computerPart.powersupply;

import computerConfig.config;

public class mainClass {
	public static void main(String args[]) {
		caseDimension caseDimension = new caseDimension(10, 5, 5);
		computerCase theCase = new computerCase("COOLER MASTER", "CL-111", "CANADA", caseDimension.findDimension());
		screenResolution screenResolution = new screenResolution(10, 5);
		monitor computermonitor = new monitor("ACER", "AC-1145", "TAIWAN", 20, screenResolution.findResolution());
		motherboard pcMotherboard = new motherboard("ASUS", "AM-6687", "HONG KONG", 8, 1, 4, "v5.0", "INTEL");
		powersupply powersupply = new powersupply("CYBER", "AH-117", "VIET NAM", 900, "TITAN");
		cpu cpu = new cpu("AMD", "THREADDRIPPER", "USA", 5, 32, 32, "PROFESSIONAL");
		personalComputer WILLCOMPUTER = new personalComputer(theCase, computermonitor, pcMotherboard, powersupply, cpu);
		
		WILLCOMPUTER.getPowersupply().getPartname(config.POWERSUPPLY);
		WILLCOMPUTER.getPowersupply().powersupplyInfo();
		WILLCOMPUTER.getMotherboard().getPartname(config.MOTHERBOARD);
		WILLCOMPUTER.getMotherboard().motherboardInfo();
		WILLCOMPUTER.getMonitor().getPartname(config.MONITOR);
		WILLCOMPUTER.getMonitor().monitorInfo();
		WILLCOMPUTER.getComputerCase().getPartname(config.CASE);
		WILLCOMPUTER.getComputerCase().caseInfo();
		WILLCOMPUTER.getCpu().getPartname(config.CPU);
		WILLCOMPUTER.getCpu().cpuInfo();
		WILLCOMPUTER.getCpu().controllCpuSpeed();
	}
}
