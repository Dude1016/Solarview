package solar.interactive;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class solarview extends ApplicationAdapter {
    private SpriteBatch batch;
    private Sprite sunSprite;
    private Texture sunTexture;

    @Override
    public void create() {
        batch = new SpriteBatch();
        sunTexture = new Texture("sun.png");
        
     
        
        sunSprite = new Sprite(sunTexture);
        
        float sunX = (Gdx.graphics.getWidth() - sunSprite.getWidth()) / 2f;
        float sunY = (Gdx.graphics.getHeight() - sunSprite.getHeight()) / 2f;
        sunSprite.setPosition(Math.round(sunX), Math.round(sunY));
    }

    @Override
    public void render() {
    	
    	
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        
    	
    	batch.begin();
    	sunSprite.draw(batch);
    	batch.end();
    	
    	if (Gdx.input.justTouched()) {
    	    int x = Gdx.input.getX();
    	    int y = Gdx.graphics.getHeight() - Gdx.input.getY();

    	    if (sunSprite.getBoundingRectangle().contains(x, y)) {
    	        onSunClicked();
    	    }
    	}
    	
    	
    }


	@Override
    public void dispose() {
        batch.dispose();
        sunTexture.dispose();
    }
	
	private void onSunClicked() {
	
		System.out.println("Omg it worked");
		
	}
}
