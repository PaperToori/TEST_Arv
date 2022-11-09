public class ForceUser extends Character {
    // Variables

    // Constructors
    public ForceUser (){
        forceSensitivity = true;
    }

    // Methods
    public String ForceSide() {
        if (forceSide == true) {
            return "Light";
        } else return "Dark";
    }
}
