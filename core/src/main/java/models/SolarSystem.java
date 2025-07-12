package models;

public class SolarSystem 
{
	private int solarsystemId;
	private float size;
	private String stars;
	private String planets;
	private int galaxyId;
	private String name;
	
	
	public SolarSystem(int solarsystemId, float size, String stars, String planets, int galaxyId, String name)
	{
		this.solarsystemId = solarsystemId;
		this.size = size;
		this.stars = stars;
		this.planets = planets;
		this.galaxyId = galaxyId;
		this.name = name;
	}


	public int getSolarsystemId() {
		return solarsystemId;
	}


	public float getSize() {
		return size;
	}


	public String getStars() {
		return stars;
	}


	public String getPlanets() {
		return planets;
	}


	public int getGalaxyId() {
		return galaxyId;
	}


	public String getName() {
		return name;
	}
	
	
}
