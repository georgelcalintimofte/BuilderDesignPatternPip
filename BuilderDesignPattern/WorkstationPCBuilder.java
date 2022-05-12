package BuilderDesignPattern;
public class WorkstationPCBuilder implements PCBuilder {
	
	private PC pc;
	public WorkstationPCBuilder(){
		this.pc = new PC();
	}
	public void buildCase() {
		pc.setCase("Full Tower");
	}
	public void buildMotherboard() {
		pc.setMotherboard("Extended-ATX");
	}
	public void buildCPU() {
		pc.setCPU("Intel i9");
	}
	public void buildGPU() {
		pc.setGPU("AMD Radeon 6800 XT");
	}
	public void buildRAM() {
		pc.setRAM("32 GB");
	}
	public void buildROM() {
		pc.setROM("2 TB SDD");
	}
	public void buildSource() {
		pc.setSource("1000 Watts");
	}
	public PC getPC() {
		return this.pc;
	}
}