package Model;


import java.awt.*;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();

    public LinkedList<GameObject> getObject() {
        return object;
    }

    private boolean up=false;
    private boolean down=false;
    private boolean right=false;
    private boolean left=false;

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void tick(){
        for(int i=0;i<object.size();i++){
            GameObject temp=object.get(i);

            temp.tick();
        }
    }

    public void render(Graphics g){
        for(int i=0;i<object.size();i++){
            GameObject temp=object.get(i);

            temp.render(g);
        }
    }

    public void addObject(GameObject tempObject){
        object.add(tempObject);
    }

    public void removeObject(GameObject tempObject){
        object.remove(tempObject);
    }
}
