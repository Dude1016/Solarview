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

import models.Planet;
import models.Star;


public class InfoScreen implements Screen {
    private final SolarGame game;
    private Star star;
    private Planet mercury;
    private Texture mercuryTexture;
    private Sprite mercurySprite;
   
    private Texture sunTexture;
    private Sprite sunSprite;
    private SpriteBatch batch;
    private BitmapFont font;
    private ShapeRenderer shapeRenderer;
    private int type;

    public InfoScreen(SolarGame game, int type) 
    {
    	this.game = game;
    	this.type = type;
    	
    	switch (type) {
    		case 0:
    			this.star = DatabaseLoader.loadStar();
    			break;
    		case 1:
    			this.mercury = DatabaseLoader.loadPlanet(type);
    			break;
    		case 2:
    		
    	}
    	
    	
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();
        font.setColor(Color.RED);
        font.getData().setScale(1.5f);
        
        
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
        
        
        
        
        switch (type) {
			case 0:
				sunSprite.draw(batch);
				font.draw(batch, "circumference: " + star.getCircumference() + " Miles", 600, 1050);
		        font.draw(batch, "Surface temperature: " + star.getSurfaceTemperature() + " F", 950, 1050);
		        font.draw(batch, "color Spectrum: " + star.getColorSpectrum(), 1300, 1050);
		        font.draw(batch, "Life cycle Stage: " + star.getCurrentLifeCycleStage(), 600, 1000);
		        font.draw(batch, "Name of star: " + star.getName(), 950, 1000);
		        font.draw(batch, "Description: " + star.getDescription(), 50, 500);
		        
		        batch.end();
		        if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (sunSprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game));
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
				font.draw(batch, "Description: " + mercury.getDescription(), 50, 500);
				
				batch.end();
				if (Gdx.input.justTouched()) {
		            int x = Gdx.input.getX();
		            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
	
		            if (mercurySprite.getBoundingRectangle().contains(x, y)) {
		                game.setScreen(new solarview(game));
		            }
		        }		
				break;
			case 2:
				
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
