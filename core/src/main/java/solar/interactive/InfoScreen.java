package solar.interactive;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;


import models.Location;
import models.Planet;
import models.Star;


public class InfoScreen implements Screen {
    private final SolarGame game;
    private Star star;
    private Planet mercury;
    private Planet venus;
    private Planet earth;
    private Planet mars;
    private Planet jupiter;
    private Planet saturn;
    private Planet uranus;
    private Planet neptune;
    private Texture mercuryTexture;
    private Texture venusTexture;
    private Texture earthTexture;
    private Texture marsTexture;
    private Texture jupiterTexture;
    private Texture saturnTexture;
    private Texture uranusTexture;
    private Texture neptuneTexture;
    private Texture backTexture;
    private Sprite mercurySprite;
    private Sprite venusSprite;
    private Sprite earthSprite;
    private Sprite marsSprite;
    private Sprite jupiterSprite;
    private Sprite saturnSprite;
    private Sprite uranusSprite;
    private Sprite neptuneSprite;
    private Sprite backSprite;
    
    private Location location;
    private Texture sunTexture;
    private Sprite sunSprite;
    private Texture saveTexture;
    private Sprite saveSprite; 
    private SpriteBatch batch;
    private GlyphLayout layout;
    private BitmapFont font;
    private ShapeRenderer shapeRenderer;
    private int type;

    public InfoScreen(SolarGame game, int type, Location location) 
    {
    	this.game = game;
    	this.type = type;
    	this.location = location;
    	
    	
    	switch (type) {
    		case 0:
    			this.star = DatabaseLoader.loadStar();
    			break;
    		case 1:
    			this.mercury = DatabaseLoader.loadPlanet(type);
    			break;
    		case 2:
    			this.venus = DatabaseLoader.loadPlanet(type);
    			break;
    		case 3:
    			this.earth = DatabaseLoader.loadPlanet(type);
    			break;
    		case 4:
    			this.mars = DatabaseLoader.loadPlanet(type);
    			break;
    		case 5:
    			this.jupiter = DatabaseLoader.loadPlanet(type);
    			break;
    		case 6:
    			this.saturn = DatabaseLoader.loadPlanet(type);
    			break;
    		case 7:
    			this.uranus = DatabaseLoader.loadPlanet(type);
    			break;
    		case 8:
    			this.neptune = DatabaseLoader.loadPlanet(type);
    			break;
    	}
    	
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();
        layout = new GlyphLayout();
        font.setColor(Color.WHITE);
        font.getData().setScale(1.5f);
        solarview.isLaunched = 1;

        //save location sprite
        saveTexture = new Texture("save.png");
        saveSprite = new Sprite(saveTexture);
        saveSprite.setSize(100, 100);
        saveSprite.setPosition(1825, 980);
        //back texture
        backTexture = new Texture("back.png");
        backSprite = new Sprite(backTexture);
        backSprite.setSize(100, 100);
        backSprite.setPosition(425, 850);
        
        
        switch (type) {
			case 0:
				//Sun inilization 
		        sunTexture = new Texture("sun.png");
		        sunSprite = new Sprite(sunTexture);
		        sunSprite.setSize(350, 350);
		        sunSprite.setPosition(40, 700);
				break;
			case 1:
				mercuryTexture = new Texture("mercury.png");
				mercurySprite = new Sprite(mercuryTexture);
				mercurySprite.setSize(350, 350);
				mercurySprite.setPosition(40, 700);
				break;
			case 2:
				venusTexture = new Texture("venus.png");
				venusSprite = new Sprite(venusTexture);
				venusSprite.setSize(350, 350);
				venusSprite.setPosition(40, 700);
				break;
			case 3:
				earthTexture = new Texture("earth.png");
				earthSprite = new Sprite(earthTexture);
				earthSprite.setSize(350, 350);
				earthSprite.setPosition(40, 700);
				break;
			case 4:
				marsTexture = new Texture("mars.png");
				marsSprite = new Sprite(marsTexture);
				marsSprite.setSize(350, 350);
				marsSprite.setPosition(40, 700);
				break;
			case 5:
				jupiterTexture = new Texture("jupiter.png");
				jupiterSprite = new Sprite(jupiterTexture);
				jupiterSprite.setSize(350, 350);
				jupiterSprite.setPosition(40, 700);
				break;
			case 6:
				saturnTexture = new Texture("saturn.png");
				saturnSprite = new Sprite(saturnTexture);
				saturnSprite.setSize(350, 350);
				saturnSprite.setPosition(40, 700);
				break;
			case 7:
				uranusTexture = new Texture("uranus.png");
				uranusSprite = new Sprite(uranusTexture);
				uranusSprite.setSize(350, 350);
				uranusSprite.setPosition(40, 700);
				break;
			case 8:
				neptuneTexture = new Texture("neptune.png");
				neptuneSprite = new Sprite(neptuneTexture);
				neptuneSprite.setSize(350, 350);
				neptuneSprite.setPosition(40, 700);
				
        }
        
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(0, 0, 1, 1);
        float squareSize = 400;
        float borderThickness = 10;

        float squareX = 5;
        float squareY = Gdx.graphics.getHeight() - squareSize;

        float x1 = squareX;
        float y1 = squareY;
        float x2 = squareX + squareSize;
        float y2 = squareY + squareSize;

        // Top edge
        shapeRenderer.rectLine(x1, y2, x2, y2, borderThickness);
        // Bottom edge
        shapeRenderer.rectLine(x1, y1, x2, y1, borderThickness);
        // Left edge
        shapeRenderer.rectLine(x1, y1, x1, y2, borderThickness);
        // Right edge
        shapeRenderer.rectLine(x2, y1, x2, y2, borderThickness);
        shapeRenderer.end();
        
        batch.begin();
        // Save location sprite and logic
        saveSprite.draw(batch);
        backSprite.draw(batch);
        if (Gdx.input.justTouched()) {
            int x = Gdx.input.getX();
            int y = Gdx.graphics.getHeight() - Gdx.input.getY();

            if (saveSprite.getBoundingRectangle().contains(x, y)) {
            	location.setType(type);
                DatabaseLoader.saveLocation(location);
                System.out.println("location saved");
            }
        }
        
        
        
        
        
        //All planets and sun sprites and info
        switch (type) {
			case 0:
				sunSprite.draw(batch);
				font.draw(batch, "circumference: " + star.getCircumference() + " Miles", 600, 1050);
		        font.draw(batch, "Surface temperature: " + star.getSurfaceTemperature() + " F", 950, 1050);
		        font.draw(batch, "color Spectrum: " + star.getColorSpectrum(), 1300, 1050);
		        font.draw(batch, "Life cycle Stage: " + star.getCurrentLifeCycleStage(), 600, 1000);
		        font.draw(batch, "Name of star: " + star.getName(), 950, 1000);
		        layout.setText(font, "Description: " + star.getDescription(), Color.WHITE, 800f, Align.left, true);
		        font.draw(batch, layout, 50, 500);

		        
		        batch.end();
		        if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (sunSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 1:
				mercurySprite.draw(batch);
				font.draw(batch, "Circumference: " + mercury.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + mercury.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + mercury.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + mercury.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + mercury.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + mercury.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + mercury.getName(), 600, 950);
				layout.setText(font, "Description: " + mercury.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);

				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (mercurySprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }		
				break;
			case 2:
				venusSprite.draw(batch);
				font.draw(batch, "Circumference: " + venus.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + venus.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + venus.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + venus.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + venus.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + venus.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + venus.getName(), 600, 950);
				layout.setText(font, "Description: " + venus.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (venusSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 3:
				earthSprite.draw(batch);
				font.draw(batch, "Circumference: " + earth.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + earth.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + earth.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + earth.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + earth.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + earth.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + earth.getName(), 600, 950);
				layout.setText(font, "Description: " + earth.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (earthSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 4:
				marsSprite.draw(batch);
				font.draw(batch, "Circumference: " + mars.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + mars.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + mars.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + mars.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + mars.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + mars.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + mars.getName(), 600, 950);
				layout.setText(font, "Description: " + mars.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (marsSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 5:
				jupiterSprite.draw(batch);
				font.draw(batch, "Circumference: " + jupiter.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + jupiter.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + jupiter.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + jupiter.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + jupiter.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + jupiter.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + jupiter.getName(), 600, 950);
				layout.setText(font, "Description: " + jupiter.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (jupiterSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 6:
				saturnSprite.draw(batch);
				font.draw(batch, "Circumference: " + saturn.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + saturn.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + saturn.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + saturn.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + saturn.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + saturn.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + saturn.getName(), 600, 950);
				layout.setText(font, "Description: " + saturn.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (saturnSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 7:
				uranusSprite.draw(batch);
				font.draw(batch, "Circumference: " + uranus.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + uranus.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + uranus.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + uranus.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + uranus.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + uranus.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + uranus.getName(), 600, 950);
				layout.setText(font, "Description: " + uranus.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (uranusSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
			case 8:
				neptuneSprite.draw(batch);
				font.draw(batch, "Circumference: " + neptune.getCircumference() + " Miles", 600, 1050);
				font.draw(batch, "Weight: " + neptune.getWeight() + " Pounds", 950, 1050);
				font.draw(batch, "satellites: " + neptune.getSatellites(), 1300, 1050);
				font.draw(batch, "Distance from sun: " + neptune.getDistanceFromSun() + " AU", 600, 1000);
				font.draw(batch, "Global Temperature: " + neptune.getGlobalTemperature() + " F", 950, 1000);
				font.draw(batch, "Is in habitable zone? " + neptune.isHabitableZone(), 1300, 1000);
				font.draw(batch, "Name of planet: " + neptune.getName(), 600, 950);
				layout.setText(font, "Description: " + neptune.getDescription(), Color.WHITE, 800f, Align.left, true);
				font.draw(batch, layout, 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (neptuneSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game, location));
		            }
		        }
				break;
        }
        
    }

    @Override public void resize(int width, int height) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
