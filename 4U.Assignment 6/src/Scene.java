
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

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

    String[] scenes;
    FileReader textFile;

    public Scene() {
        try {
            textFile = new FileReader("Locations");
            URL url = Scene.class.getResource("Locations.txt");

            textFile = new FileReader(url.getFile());
        } catch (Exception e) {
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }

        Scanner in = new Scanner(textFile);

        // get the start position
        String startLoc = in.nextLine();

        // move to the next line
        String startDir = in.nextLine();

        // go through the file
        for (int i = 0; i < 122; i++) {
            String dir = in.next();
            String image = in.next();
            String isBlocked = in.next();
            String nextDir = in.next();
            String nextLoc = in.nextLine().trim();
            // create the scene using that information
            SceneInputs scenes = new SceneInputs(dir);
            scenes.image(image);
            scenes.isBlocked(isBlocked);
            scenes.nextDirection(nextDir);
            scenes.nextLoc(nextLoc);
        }
    }
    
}
