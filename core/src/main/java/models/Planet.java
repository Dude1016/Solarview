package models;

public class Planet 
{
	private int planetId;
	private float circumference;
	private int weight;
	private String satellites;
	private float distanceFromSun;
	private float globalTemperature;
	private boolean habitableZone;
	private String description;
	private int solarsystemId;
	private String name;
	
	
	
	public Planet(int planetId, float circumference, int weight, String satellites, float distanceFromSun, float globalTemperature, boolean habitableZone, String description, int solarsystemId, String name)
	{
		
		this.planetId = planetId;
		this.circumference = circumference;
		this.weight = weight;
		this.satellites = satellites;
		this.distanceFromSun = distanceFromSun;
		this.globalTemperature = globalTemperature;
		this.habitableZone = habitableZone;
		this.description = description;
		this.solarsystemId = solarsystemId;
		this.name = name;
		
		
	}



	public int getPlanetId() {
		return planetId;
	}



	public float getCircumference() {
		return circumference;
	}



	public int getWeight() {
		return weight;
	}



	public String getSatellites() {
		return satellites;
	}



	public float getDistanceFromSun() {
		return distanceFromSun;
	}



	public float getGlobalTemperature() {
		return globalTemperature;
	}



	public boolean isHabitableZone() {
		return habitableZone;
	}



	public String getDescription() {
		return description;
	}



	public int getSolarsystemId() {
		return solarsystemId;
	}



	public String getName() {
		return name;
	}
	
	
	
}
