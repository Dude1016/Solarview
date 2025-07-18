package solar.interactive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
}
