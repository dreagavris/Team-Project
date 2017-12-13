
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ratid6445
 */
public class SceneInputs {

    static String dir;
    static BufferedImage image;
    static boolean isBlocked;
    static String nextDir;
    static String nextLoc;

    // get the direction
    public String getDirection(String direction) {
        this.dir = direction;
        return direction;
    }

    // get the image
    public BufferedImage getImage(BufferedImage image) {
        this.image = image;
        return image;
    }

    // see if can move
    public boolean isBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
        return isBlocked;
    }

    // get the next direction
    public String getNextDirection(String nextDir) {
        this.nextDir = nextDir;
        return nextDir;
    }

    // get the next location
    public String getNextLoc(String nextLoc) {
        this.nextLoc = nextLoc;
        return nextLoc;
    }
}
