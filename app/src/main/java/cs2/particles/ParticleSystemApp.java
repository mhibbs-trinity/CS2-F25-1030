package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ParticleSystemApp extends Application {

    private GraphicsContext g;
    public Vec2 wind = new Vec2();
    
    public void start(Stage stg) {
        Canvas canvas = new Canvas(600,600);
        Scene scene = new Scene(new StackPane(canvas));
        stg.setTitle("Particles!");
        stg.setScene(scene);
        stg.show();

        g = canvas.getGraphicsContext2D();

        ArrayList<ParticleSystem> ps = new ArrayList<>();
        
        //new ParticleSystem(new Vec2(300,100));

        Vec2 gravity = new Vec2(0,0.5);

        canvas.setOnMousePressed((MouseEvent e) -> {
            Vec2 mloc = new Vec2(e.getX(), e.getY());
            ps.add(new ParticleSystem(mloc));
        });
        
        canvas.setOnMouseMoved((MouseEvent e) -> {
            wind = new Vec2(e.getX() / 300.0 -1,0);
        });

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long time) {
                g.setFill(Color.WHITE);
                g.fillRect(0,0, canvas.getWidth(),canvas.getHeight());
                for(ParticleSystem p : ps) {    
                    p.addParticle();
                    p.display(g);
                    p.update(canvas);
                    p.applyForce(gravity);
                    p.applyForce(wind);
                }
            }
        };
        timer.start();

    }
}