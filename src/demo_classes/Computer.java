package demo_classes;

public class Computer {
	//attributes
	private String MODEL;
	private Memory memory;
	private HardDrive hardDrive;
	private Processor PROCESSOR;
	
	public Computer(String model, HardDrive hardDrive, Processor processor, Memory memory) {
		this.MODEL = model;
		this.memory = memory;
		this.hardDrive = hardDrive;
		this.PROCESSOR = processor;
	}
	
	public void getPower(PowerSource powerSource) {
		powerSource.supplyPower();
			System.out.println(powerSource.supplyPower() + " watts received from power source.");
	}
	
	public void turnOn() {
		System.out.println("You turned the computer on.");
	}
	
	public void turnOff() {
		System.out.println("You turned the computer off.");
	}

	public String getMODEL() {
		return MODEL;
	}

	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Processor getPROCESSOR() {
		return PROCESSOR;
	}

	public void setPROCESSOR(Processor pROCESSOR) {
		PROCESSOR = pROCESSOR;
	}
}
