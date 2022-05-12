package BuilderDesignPattern;

public interface PCBuilder {
	//construirea fiecarei componente in parte
	public void buildCase();
	public void buildMotherboard();
	public void buildCPU();
	public void buildGPU();
	public void buildRAM();
	public void buildROM();
	public void buildSource();
	public PC getPC();
}
