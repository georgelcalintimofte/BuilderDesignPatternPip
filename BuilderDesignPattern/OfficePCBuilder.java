package BuilderDesignPattern;

public class OfficePCBuilder implements PCBuilder {
	
	private PC pc;
	public OfficePCBuilder(){
		this.pc = new PC();
	}
	public void buildCase() {
		pc.setCase("Mid Tower");
	}
	public void buildMotherboard() {
		pc.setMotherboard("ATX");
	}
	public void buildCPU() {
		pc.setCPU("Intel i5");
	}
	public void buildGPU() {
		pc.setGPU("Integrated");
	}
	public void buildRAM() {
		pc.setRAM("8 GB");
	}
	public void buildROM() {
		pc.setROM("1 TB HDD");
	}
	public void buildSource() {
		pc.setSource("600 Watts");
	}
	public PC getPC() {
		return this.pc;
	}
}