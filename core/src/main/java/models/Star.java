package models;

public class Star 
{
	
	private int starId;
	private float circumference;
	private float surfaceTemperature; 
	private String colorSpectrum; 
	private String currentLifeCycleStage;
	private String description; 
	private int solarsystemId;
	private String name;
	
	
	
	public Star(int starId, float circumference, float surfaceTemperature, String colorSpectrum, String currentLifeCycleStage, String description, int solarsystemId, String name )
	{
			
		this.starId = starId;
        this.circumference = circumference;
        this.surfaceTemperature = surfaceTemperature;
        this.colorSpectrum = colorSpectrum;
        this.currentLifeCycleStage = currentLifeCycleStage;
        this.description = description;
        this.solarsystemId = solarsystemId;
        this.name = name;
		
		
	}



	public int getStarId() {
		return starId;
	}



	public float getCircumference() {
		return circumference;
	}



	public float getSurfaceTemperature() {
		return surfaceTemperature;
	}



	public String getColorSpectrum() {
		return colorSpectrum;
	}



	public String getCurrentLifeCycleStage() {
		return currentLifeCycleStage;
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
