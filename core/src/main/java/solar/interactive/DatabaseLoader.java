package solar.interactive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import models.Location;
import models.Planet;
import models.Star;


public class DatabaseLoader {

    public static Star loadStar() {
        Star star = null;

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM star WHERE star_id = 1"); 

            if (rs.next()) {
                int starId = rs.getInt("star_id");
                float circumference = rs.getFloat("circumference");
                float surfaceTemperature = rs.getFloat("surface_tempature");
                String colorSpectrum = rs.getString("color_spectrum");
                String currentLifeCycleStage = rs.getString("current_life_cycle_stage");
                String description = rs.getString("description");
                String name = rs.getString("name");

                star = new Star(starId, circumference, surfaceTemperature, colorSpectrum, currentLifeCycleStage, description, name);
            }
            
           

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return star;
    }
    
    public static Planet loadPlanet(int type)
    {
    	Planet planet = null;

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM planet WHERE planet_id = " + type); 

            if (rs.next()) {
                int planetId = rs.getInt("planet_id");
                float circumference = rs.getFloat("circumference");
                float globalTemperature = rs.getFloat("global_tempature");
                String weight = rs.getString("weight");
                String satellites = rs.getString("satellites");
                float distanceFromSun = rs.getFloat("distance_from_sun");
                String name = rs.getString("name");
                String description = rs.getString("description");
                Boolean habitableZone = rs.getBoolean("habitable_zone");
                
                

                planet = new Planet(planetId, circumference, weight, satellites, distanceFromSun, globalTemperature, habitableZone, description, name);
            }
            
           

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return planet;
    }
    
    public static void saveLocation(Location location)
    {
    	 String url = "jdbc:mysql://localhost:3306/mydb";
         String userDb = "root";
         String password = "root";
         
         
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");

             Connection conn = DriverManager.getConnection(url, userDb, password);

             // Example SQL; change column names to match your table
             String sql = "INSERT INTO location (type, user_name) VALUES (?, ?)";

             java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setInt(1, location.getType());
             stmt.setString(2, location.getUser());
               
             stmt.executeUpdate();
             

             stmt.close();
             conn.close();

         } catch (Exception e) {
             e.printStackTrace();
         }
         
         
         
    }
    
    public static Location loadLocation(String user)
    {
    	Location location = null;
    	 String url = "jdbc:mysql://localhost:3306/mydb";
         String userdb = "root";
         String password = "root";
    		
    	 try {
         	Class.forName("com.mysql.cj.jdbc.Driver");
         	
             Connection conn = DriverManager.getConnection(url, userdb, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM location WHERE user_name = " + "'" + user + "'"); 

             if (rs.next()) {
                 int type = rs.getInt("type");
                 String userName = rs.getString("user_name");
               
                location = new Location(type, userName);
                
               
                 
             }
             
            

             rs.close();
             stmt.close();
             conn.close();

         } catch (Exception e) {
             e.printStackTrace();
         }
    	 
    	 return location;
    }
    
    
}
