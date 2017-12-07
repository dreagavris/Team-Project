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
    private char dir;
    private Locations image;
    private boolean isBlocked;
    private char nextDir;
    private Scene nextLoc;
    
    public SceneInputs(char direction){
        this.dir = direction;
    }
    
    public void image(Locations image){
        this.image = image;
    }
    
    public void isBlocked(boolean isBlocked){
        this.isBlocked = isBlocked;
    }
    
    public void nextDirection(char nextDir){
        this.nextDir = nextDir;
    }
    
    public void nextLoc(Scene nextLoc){
        this.nextLoc = nextLoc;
    }
}
