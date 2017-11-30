/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haynal
 */
public class SceneInputs {
    private String dir;
    private String image;
    private boolean isBlocked;
    private String nextDir;
    private String nextLoc;
    
    public SceneInputs(String direction){
        this.dir = direction;
    }
    
    public void image(String image){
        this.image = image;
    }
    
    public boolean isBlocked(boolean isBlocked){
        this.isBlocked = isBlocked;
        return false;
    }
    
    public void nextDirection(String nextDir){
        this.nextDir = nextDir;
    }
    
    public void nextLoc(String nextLoc){
        this.nextLoc = nextLoc;
    }
}
