package solar.interactive;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class InfoScreen implements Screen {
    private final SolarGame game;
    private final String planetName;

    private SpriteBatch batch;
    private BitmapFont font;
    private ShapeRenderer shapeRenderer;

    public InfoScreen(SolarGame game, String planetName) {
        this.game = game;
        this.planetName = planetName;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();
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
        
        batch.end();

        
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
