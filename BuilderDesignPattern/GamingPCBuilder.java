package BuilderDesignPattern;
public class GamingPCBuilder implements PCBuilder {
	
	private PC pc;
	public GamingPCBuilder(){
		this.pc = new PC();
	}
	public void buildCase() {
		pc.setCase("Full Tower");
	}
	public void buildMotherboard() {
		pc.setMotherboard("ATX");
	}
	public void buildCPU() {
		pc.setCPU("AMD Ryzen 9");
	}
	public void buildGPU() {
		pc.setGPU("Nvidia GeForce RTX 3070");
	}
	public void buildRAM() {
		pc.setRAM("32 BG");
	}
	public void buildROM() {
		pc.setROM("1 TB SDD");
	}
	public void buildSource() {
		pc.setSource("800 Watts");
	}
	public PC getPC() {
		return this.pc;
	}
}