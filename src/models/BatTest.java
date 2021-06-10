package models;

public class BatTest {

	public static void main(String[] args) {
	
		Bat dracula = new Bat();
		
		//eating humans increases energy by 25
		dracula.displayEnergyLevel();
		dracula.eatHumans();
		dracula.eatHumans();
		dracula.eatHumans();
		dracula.displayEnergyLevel();
		System.out.println("..");
		
		//Attack towns decreases energy by 100
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		dracula.displayEnergyLevel();
		System.out.println("..");
		
		dracula.eatHumans();
		System.out.println("..");
		
		
		dracula.fly();
		dracula.fly();
		dracula.displayEnergyLevel();
		
		

	}

}
