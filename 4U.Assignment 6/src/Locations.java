
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andreeagavris
 */
public class Locations {

    private BufferedImage image;
    private BufferedImage[] images;

    /**
     * @param args the command line arguments
     */
    public void theLocationsInfo(String[] args) {
        FileReader file = null;
        try {

            URL url = Locations.class.getResource("Scenarios.txt");
             System.out.println(url);
            file = new FileReader("src/TScenarios.txt");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        } 
        
    }

}
