package BuilderDesignPattern;

public class CustomPCBuilder implements PCBuilder {
	private PC pc;
	
	public CustomPCBuilder(){
		this.pc = new PC();
	}	
	// functii care primesc parametri cititi prin interfata
	public PC getPC() {
		return this.pc;
	}
	public void buildCase(String ccase) {
		pc.setCase(ccase);
	}
	public void buildMotherboard(String mboard) {
		pc.setMotherboard(mboard);
	}
	public void buildCPU(String cpu) {
		pc.setCPU(cpu);
	}
	public void buildGPU(String gpu) {
		pc.setGPU(gpu);
	}
	public void buildRAM(String ram) {
		pc.setRAM(ram);
	}
	public void buildROM(String rom) {
		pc.setROM(rom);
	}
	public void buildSource(String source) {
		pc.setSource(source);
	}

	// implementarea metodelor din interfata - fara parametri
	public void buildCase() {
		pc.setCase("Default");
	}	
	public void buildMotherboard() {
		pc.setMotherboard("Default");
	}
	public void buildCPU() {
		pc.setCPU("Default");
	}	
	public void buildGPU() {
		pc.setGPU("Default");
	}
	public void buildRAM() {
		pc.setRAM("Default");
	}	
	public void buildROM() {
		pc.setROM("Default");
	}
	public void buildSource() {
		pc.setSource("Default");
	}
}