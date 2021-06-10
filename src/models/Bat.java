package models;

public class Bat extends Mammal {
	
	public Bat() {	
		this.setEnergyLevel(300);	
	}
	
	public void fly() {	
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		System.out.println("Flap flap flap!");	
	}
	
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel() - 100);
		System.out.println("The roof is on fire! fire! fire!");	
		
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel() + 25);
		System.out.println("Soo tasty!");
	}
	
}
