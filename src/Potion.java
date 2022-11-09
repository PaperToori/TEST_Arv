public class Potion {
    //Variables
    int effect;

    // Methods
    public Avatar use (Avatar a){
        a.hitpoints += effect;
        return a;
    }
}
