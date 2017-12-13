
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;

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

    private String dir;
    private BufferedImage image;
    private boolean isBlocked;
    private String nextDir;
    private String nextLoc;
    FileReader textFile;

    public SceneInputs() {
        // read the text file
        Scanner in = new Scanner(textFile);

        // get the direction
        dir = in.next();

        // get the image
        String theImage = in.next();
        
        // ImageLoader
        // make theImage the image
        try {
            // get the images from the file
            image = ImageIO.read(new File("images/" + theImage));
            // exception thread
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // since the next information is a boolean, must make a string first to get it
        String next = in.next();
        // see if the next input is true or false
        if (next.equals("false")) {
            // if input is false then it is blocked
            isBlocked = false;
            //get the next inputs
            // next input gives the next direction
            nextDir = in.next();
            // the next input is the next location
            nextLoc = in.next();
            // move to the next line
            in.nextLine();
            // if the next input is true
        } else {
            // then it is not blocked
            isBlocked = true;
            //move to the next line because no more inputs after true
            in.nextLine();
        }
    }

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
