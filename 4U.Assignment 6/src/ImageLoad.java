
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
public class ImageLoad {

    public void ImageLoad() {
        // load the images
        BufferedImage image = null;
        try {
            String theImage = null;
            // get the images from the file
            image = ImageIO.read(new File("images/" + theImage));
            // exception thread
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
