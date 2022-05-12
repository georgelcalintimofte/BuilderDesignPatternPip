package BuilderDesignPattern;

public class Director {
	
	private PCBuilder pcbuilder;
	
	// constructor
	public Director (PCBuilder  pcbuilder){
		this.pcbuilder =  pcbuilder;
	}
	// obtinerea obiectului
	public PC returnPC() {
		return this.pcbuilder.getPC();
	}
	// construirea obiectului fara parametri - pentru ConcreteBuilder (Gaming, ..)
	public void buildPC() {
		this.pcbuilder.buildCase();
		this.pcbuilder.buildMotherboard();	
		this.pcbuilder.buildCPU();
		this.pcbuilder.buildGPU();
		this.pcbuilder.buildRAM();
		this.pcbuilder.buildROM();
		this.pcbuilder.buildSource();
	}
	// construirea obiectului cu parametri
	public void buildCustomPC(String v1, String v2, String v3, String v4, String v5, String v6, String v7) {
		((CustomPCBuilder)this.pcbuilder).buildCase(v1);
		((CustomPCBuilder)this.pcbuilder).buildMotherboard(v2);	
		((CustomPCBuilder)this.pcbuilder).buildCPU(v3);
		((CustomPCBuilder)this.pcbuilder).buildGPU(v4);
		((CustomPCBuilder)this.pcbuilder).buildRAM(v5);
		((CustomPCBuilder)this.pcbuilder).buildROM(v6);
		((CustomPCBuilder)this.pcbuilder).buildSource(v7);
	}
}
