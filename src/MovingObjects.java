public class MovingObjects extends GameObjects {
    // Variables
    int moveX = 0;
    int moveY = 0;

    // Constructors
    public MovingObjects (){}
    public MovingObjects (int moveX, int moveY){
        this.moveX = moveX;
        this.moveY = moveY;
    }

    // Methods
    public void update() {
        this.posX += moveX;
        this.posY += moveY;
    }

    // Getters
    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }
}
