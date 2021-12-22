package design.patterns;

public class Warrior extends Role implements InterfaceHitPointsCalculation{
	
	private double finalHitPoints;
	private double hitPointsRate = 2.0;
	
	public Warrior() {
		super("Warrior");
		this.finalHitPoints = calculateHitPoints(this.hitPointsRate);
	}
	
	public double getFinalHitPoints() {
		return this.finalHitPoints;
	}
	
	//Implemented interface to calculate
	//Hit Points of each Role
	//as Strategy Pattern Example
	public double calculateHitPoints(Double HitPointsRate) {
		return this.getHitPoints() * HitPointsRate;
	}
	
}
