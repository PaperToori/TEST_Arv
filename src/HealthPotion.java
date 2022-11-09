public class HealthPotion extends Potion{
    public HealthPotion (int heal){ this.effect = heal; }

    @Override
    public Avatar use (Avatar a){
        a.hitpoints += effect;
        return a;
    }

}
