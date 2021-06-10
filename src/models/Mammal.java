package models;

public class Mammal {
	
	private int energyLevel;
	
	
	public Mammal() {
		super();
		this.energyLevel = 100;
	}

	public int getEnergyLevel() {		
		return energyLevel;
	}



	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}



	public int displayEnergyLevel() {	
		System.out.println("The energy level is: " + Integer.toString(this.energyLevel));
		return this.energyLevel;
	}

}
