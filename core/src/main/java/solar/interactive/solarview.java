package solar.interactive;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.List;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class solarview extends ApplicationAdapter {
    private SpriteBatch batch;
    private int zoomLevel = 0;
    private Sprite sunSprite;
    private Texture sunTexture;
    private Texture zoomInTexture;
    private Sprite zoomInSprite;
    private Texture zoomOutTexture;
    private Sprite zoomOutSprite;
    private List<Sprite> planetSprites;
    private Sprite mercury;
    private Sprite venus;
    private Sprite earth;
    private Sprite mars;
    private Sprite jupiter;
    private Sprite saturn;
    private Sprite uranus;
    private Sprite neptune;
  
    @Override
    public void create() {
        batch = new SpriteBatch();
        
        planetSprites = new ArrayList<>();
        sunTexture = new Texture("sun.png");
        zoomInTexture = new Texture("zoomin.png");
        zoomOutTexture = new Texture("zoomout.png");
        
        
        
        sunSprite = new Sprite(sunTexture);
        zoomInSprite = new Sprite(zoomInTexture);
        zoomOutSprite = new Sprite(zoomOutTexture);
        
        zoomInSprite.setSize(100, 100);
        zoomOutSprite.setSize(100, 100);
        
        float sunX = (Gdx.graphics.getWidth() - sunSprite.getWidth()) / 2f;
        float sunY = (Gdx.graphics.getHeight() - sunSprite.getHeight()) / 2f;
        sunSprite.setPosition(Math.round(sunX), Math.round(sunY));
        
        float padding = 10f;

     
     zoomInSprite.setPosition(
         padding,
         Gdx.graphics.getHeight() - zoomInSprite.getHeight() - padding
     );

     
     zoomOutSprite.setPosition(
         zoomInSprite.getX() + zoomInSprite.getWidth() + padding,
         zoomInSprite.getY()
     );
        
    }

    @Override
    public void render() {
    	
    	
    	Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        
    	
    	batch.begin();
    	zoomInSprite.draw(batch);
    	zoomOutSprite.draw(batch);
    	sunSprite.draw(batch);
    	
    	for (Sprite p : planetSprites) {
    	    p.draw(batch);
    	}
    	
    	
    	batch.end();
    	
    	
    	
    	if (Gdx.input.justTouched()) {
            int x = Gdx.input.getX();
            int y = Gdx.graphics.getHeight() - Gdx.input.getY();

            if (sunSprite.getBoundingRectangle().contains(x, y)) {
                onSunClicked();
            } else if (zoomInSprite.getBoundingRectangle().contains(x, y)) {
                onZoomInClicked();
            } else if (zoomOutSprite.getBoundingRectangle().contains(x, y)) {
                onZoomOutClicked();
            }
        }
    	
    	
    }


	private void onZoomOutClicked() {
		if(zoomLevel == 0)
		{
			System.out.println("zoom out works zoom level 0");
			mercury = new Sprite(new Texture("mercury.png"));
			venus = new Sprite(new Texture("venus.png"));
			earth = new Sprite(new Texture("earth.png"));
			 mars = new Sprite(new Texture("mars.png"));
			
			mercury.setSize(115, 115);
			venus.setSize(160, 160);
			earth.setSize(175, 175);
			mars.setSize(140, 140);
		
			
			float mercuryX = sunSprite.getX() + sunSprite.getWidth() + 20f; 
		    float mercuryY = sunSprite.getY() + sunSprite.getHeight() / 2f - mercury.getHeight() / 2f; 
		    float venusX = sunSprite.getX() - venus.getWidth() - 20f; 
		    float venusY = sunSprite.getY() + sunSprite.getHeight() / 2f - venus.getHeight() / 2f; 
		    float earthX = sunSprite.getX() + (sunSprite.getWidth() - earth.getWidth()) / 2f;  
		    float earthY = sunSprite.getY() + sunSprite.getHeight() + 20f;
		    float marsX = sunSprite.getX() + (sunSprite.getWidth() - mars.getWidth()) / 2f; 
		    float marsY = sunSprite.getY() - mars.getHeight() - 20f;
		    
		    
		    mercury.setPosition(mercuryX, mercuryY);
		    venus.setPosition(venusX, venusY);
		    earth.setPosition(earthX, earthY);
		    mars.setPosition(marsX, marsY);
			
			planetSprites.add(mercury);
			planetSprites.add(venus);
			planetSprites.add(earth);
			planetSprites.add(mars);
			
			
		
		
		}
		
		if(zoomLevel == 1)
		{
			System.out.println("zoom out works zoom level 1");
		    jupiter = new Sprite(new Texture("jupiter.png"));
		    saturn = new Sprite(new Texture("saturn.png"));
		    uranus = new Sprite(new Texture("uranus.png"));
		    neptune = new Sprite(new Texture("neptune.png"));
			
			sunSprite.setSize(600, 600);
			float sunX = (Gdx.graphics.getWidth() - sunSprite.getWidth()) / 2f;
		    float sunY = (Gdx.graphics.getHeight() - sunSprite.getHeight()) / 2f;
		    sunSprite.setPosition(Math.round(sunX), Math.round(sunY));
		    
		    jupiter.setSize(250, 250);
		    saturn.setSize(225, 225);
		    uranus.setSize(210, 210);
		    neptune.setSize(200, 200);
		    
		    float jupiterX = sunSprite.getX() + sunSprite.getWidth() - 80f; 
		    float jupiterY = sunSprite.getY() + sunSprite.getHeight() / 2f - jupiter.getHeight() / 2f + 300;
		    float saturnX = sunSprite.getX() - saturn.getWidth() + 80f; 
		    float saturnY = sunSprite.getY() + sunSprite.getHeight() / 2f - saturn.getHeight() / 2f - 300;
		    float uranusX = sunSprite.getX() + (sunSprite.getWidth() - uranus.getWidth()) / 2f - 300;  
		    float uranusY = sunSprite.getY() + sunSprite.getHeight() - 80f;
		    float neptuneX = sunSprite.getX() + sunSprite.getWidth() - 80f; 
		    float neptuneY = sunSprite.getY() + sunSprite.getHeight() / 2f - neptune.getHeight() / 2f - 300; 
		    
		    
		    jupiter.setPosition(jupiterX, jupiterY);
		    saturn.setPosition(saturnX, saturnY);
		    uranus.setPosition(uranusX, uranusY);
		    neptune.setPosition(neptuneX, neptuneY);
		    
		    planetSprites.add(jupiter);
		    planetSprites.add(saturn);
		    planetSprites.add(uranus);
		    planetSprites.add(neptune);
			
			
			
		}
		if(zoomLevel > 1)
		{
			zoomLevel--;
			System.out.println(zoomLevel);
		}
		zoomLevel++;
		
		
		
	}

	private void onZoomInClicked() {
		System.out.println("zoom in works");
		if(zoomLevel == 2)
		{
			planetSprites.remove(neptune);
			planetSprites.remove(saturn);
			planetSprites.remove(jupiter);
			planetSprites.remove(uranus);
			sunSprite.setSize(660, 660);
			float sunX = (Gdx.graphics.getWidth() - sunSprite.getWidth()) / 2f;
		    float sunY = (Gdx.graphics.getHeight() - sunSprite.getHeight()) / 2f;
		    sunSprite.setPosition(Math.round(sunX), Math.round(sunY));
		}
		
		if(zoomLevel == 1)
		{
			planetSprites.remove(mercury);
			planetSprites.remove(earth);
			planetSprites.remove(venus);
			planetSprites.remove(mars);
		}
		if(zoomLevel < 1)
		{
			zoomLevel++;
		}
		zoomLevel--;
		
	}

	@Override
    public void dispose() {
        batch.dispose();
        sunTexture.dispose();
        zoomInTexture.dispose();
        zoomOutTexture.dispose();
    }
	
	private void onSunClicked() {
	
		System.out.println("Omg it worked");
		
	}
}
