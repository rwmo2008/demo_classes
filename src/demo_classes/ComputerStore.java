package demo_classes;
import java.util.*;

public class ComputerStore {
	private String name;
	private ArrayList<Computer> computers = new ArrayList<Computer>();
	Computer computer = new Computer();
	
	
	
	public ComputerStore(String name) {
		this.name = name;
	}
	
	public void addComputer(Computer computer) {
		this.computers.add(computer);
	}
	
	public ArrayList<Computer> getAllComputers(){
		return computers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
