package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class RainbowParticle extends RoundParticle {
    private double hue = 0;

    public RainbowParticle(Vec2 p) {
        super(p);
        col = Color.hsb(hue, 0.8, 0.8);
    }

    @Override
    public void update(Canvas canvas) {
        super.update(canvas);
        hue += 10.0;
        col = Color.hsb(hue, 0.8, 0.8);

    }

}
