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

    public void forgeWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }

    public String admireWeapons(){
        if (this.weapons.isEmpty()){
            return ("My glorious Armoury is empty! I am ruined!");
        }
        return String.format("My glorious %s Armoury contains %d weapons! I am ready for war!", this.name, this.weapons.size());
    }
}


