package preAssessment;

public class Peripheral { //the class where objects will be instantiated
	private int num;
	private String code;
	private String name;
	private String peripheral;
	private String assignedTo;
	
	Peripheral(){
		
		num = 0;
		code = "";
		name = "";
		peripheral = "";
		assignedTo = "";
		
	}
	
	Peripheral (int num, String code, String name, String peripheral, String assignedTo){ // constructor to assign all parameters to the attributes
		this.num = num;
		this.code = code;
		this.name = name;
		this.peripheral = peripheral;
		this.assignedTo = assignedTo;
		
	}
	public String toString() {
		return "["+num+"]"+"\nCode: "+code+"\nName: "+name+"\nPeripheral: "+ peripheral+"\nAssigned To: "+assignedTo; 
	}
		
	
}
