package models;

public class Moon 
{
	private int moonId;
	private float circumference;
	private int weight;
	private String orbitingPlanet;
	private float globalTemperature;
	private String description;
	private int planetId;
	private String name;
	
	
	
	public Moon(int moonId, float circumference, int weight, String orbitingPlanet, float globalTemperature, String description, int planetId, String name)
	{
		this.moonId = moonId;
		this.circumference = circumference;
		this.weight = weight;
		this.orbitingPlanet = orbitingPlanet;
		this.globalTemperature = globalTemperature;
		this.description = description;
		this.planetId = planetId;
		this.name = name;
	}



	public int getMoonId() {
		return moonId;
	}



	public float getCircumference() {
		return circumference;
	}



	public int getWeight() {
		return weight;
	}



	public String getOrbitingPlanet() {
		return orbitingPlanet;
	}



	public float getGlobalTemperature() {
		return globalTemperature;
	}



	public String getDescription() {
		return description;
	}



	public int getPlanetId() {
		return planetId;
	}



	public String getName() {
		return name;
	}
	
}
