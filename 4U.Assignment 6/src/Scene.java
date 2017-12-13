
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
public class Scene {

    FileReader textFile;

    public Scene() {
        // read the text file
        Scanner in = new Scanner(textFile);

        // get the direction
        SceneInputs.dir = in.next();

        // get the image
        String theImage = in.next();

        // ImageLoader
        // make theImage the image
        try {
            // get the images from the file
            SceneInputs.image = ImageIO.read(new File("images/" + theImage));
            // exception thread
        } catch (IOException e) {
            e.printStackTrace();
        }

        // since the next information is a boolean, must make a string first to get it
        String next = in.next();
        // see if the next input is true or false
        if (next.equals("false")) {
            // if input is false then it is blocked
            SceneInputs.isBlocked = false;
            //get the next inputs
            // next input gives the next direction
            SceneInputs.nextDir = in.next();
            // the next input is the next location
            SceneInputs.nextLoc = in.next();
            // move to the next line
            in.nextLine();
            // if the next input is true
        } else {
            // then it is not blocked
            SceneInputs.isBlocked = true;
            //move to the next line because no more inputs after true
            in.nextLine();
        }
    }
}
