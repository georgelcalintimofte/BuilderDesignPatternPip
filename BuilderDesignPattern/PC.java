package BuilderDesignPattern;

class PC {
	// partile obiectului final
	private String Case;
	private String Motherboard;
	private String CPU;
	private String GPU;
	private String RAM;
	private String ROM;	
	private String Source;
	
	
	// functiile folosite in builder
	public void setCase(String Case){
		this.Case = Case;
	}
	public void setMotherboard(String Motherboard){
		this.Motherboard = Motherboard;
	}
	public void setCPU(String CPU) {
		this.CPU = CPU;
	}
	public void setGPU(String GPU) {
		this.GPU = GPU;
	}
	public void setRAM(String RAM){
		this.RAM = RAM;
	}
	public void setROM(String ROM){
		this.ROM = ROM;
	}
	public void setSource(String Source){
		this.Source = Source;
	}
	// pentru a putea afisa obiectul cu specificatiile
    public String toString() 
    { 
        return "Case: "+this.Case+"\nMotherbord: "+this.Motherboard+
        		"\nCPU: "+this.CPU+"\nGPU: "+this.GPU+"\nRAM: "+this.RAM+
        		"\nROM: "+this.ROM+"\nSource: "+this.Source;
    } 
}