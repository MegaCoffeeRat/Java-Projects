package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.util.concurrent.ThreadLocalRandom;
public class basic {
    float xPos;
    boolean isExpired = false;
    float yPos;
    float xSpeed;
    float ySpeed;
    float gravity;
    int size;
    basic(float x, float y) {
        yPos = y;
        xPos = x;
        ySpeed = ThreadLocalRandom.current().nextInt(-10, 1 + 1);
        xSpeed = ThreadLocalRandom.current().nextInt(-7, 7 + 1);
        size = 10;
        gravity = 0.2F;
    }
    void update()
    {
        yPos = yPos + ySpeed*2;
        ySpeed = ySpeed + gravity;
        xPos = xPos + xSpeed*2;
    }
    void render(Graphics g)
    {
        g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255) ,(int)(Math.random()*255)) );
        g.fillOval(xPos-(size/2), yPos-(size/2), size, size);

    }
}
