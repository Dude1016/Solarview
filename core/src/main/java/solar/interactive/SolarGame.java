package solar.interactive;

import com.badlogic.gdx.Game;

public class SolarGame extends Game {
    @Override
    public void create() {
        this.setScreen(new solarview(this));
    }
}
