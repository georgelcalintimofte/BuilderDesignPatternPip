package BuilderDesignPattern;

public class Main {

	public static void main(String[] args) {
		PCBuilder officePC = new OfficePCBuilder();
		Director dir1 = new Director(officePC);
		dir1.buildPC();
		PC pc1 = dir1.returnPC();
		System.out.println("Builder constructed: \n"+ pc1);
		
		PCBuilder gamingPC = new GamingPCBuilder();
		Director dir2 = new Director(gamingPC);
		dir2.buildPC();
		PC pc2 = dir2.returnPC();
		System.out.println("\nBuilder constructed: \n"+ pc2);
		
		PCBuilder workstationPC = new WorkstationPCBuilder();
		Director dir3 = new Director(workstationPC);
		dir3.buildPC();
		PC pc3 = dir3.returnPC();
		System.out.println("\nBuilder constructed: \n"+ pc3);
	}

}
