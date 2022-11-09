public class Poison extends Potion{
    public Poison (int harm){
        this.effect = harm;
    }

    @Override
    public Avatar use (Avatar a){
        a.hitpoints -= effect;
        return a;
    }
}
