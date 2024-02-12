import java.util.ArrayList;

public class Armoury {

    private String name;
    private ArrayList<Weapon> weapons;

    public Armoury(String name, ArrayList<Weapon> weapons){
        this.name = name;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }


}


