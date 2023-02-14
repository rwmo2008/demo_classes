package demo_classes;

public class Main {

	public static void main(String[] args) {
		ComputerStore computerStore = new ComputerStore("Best Buy");
		HardDrive hardDrive1 = new HardDrive();
		HardDrive hardDrive2 = new HardDrive();
		Processor processor1 = new Processor();
		Processor processor2 = new Processor();
		Memory memory1 = new Memory();
		Memory memory2 = new Memory();
		PowerSource powerSource = new PowerSource(2000);
		Computer computer1 = new Computer("Dell", hardDrive1, processor1, memory1);
		Computer computer2 = new Computer("Lenovo", hardDrive2, processor2, memory2);
		computer1.getPower(powerSource);
		computerStore.addComputer(computer1);
		computerStore.addComputer(computer2);
		computerStore.getAllComputers();
	}
}
