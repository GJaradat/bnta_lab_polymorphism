import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArmouryTest {

    Armoury armoury;

    Sword sword1;
    Sword sword2;
    Spear spear1;
    Spear spear2;
    ArrayList<Weapon> weapons;

    @BeforeEach
    public void setUp(){
        sword1 = new Sword("Excalibur","Holy steel", true);
        sword2 = new Sword("Zangetsu","Shinigami steel", false);

        spear1 = new Spear("Gungnir","Norse steel, Yggdrasil wood", 1.65);
        spear2 = new Spear("Lance of St. Longinus","Holy wood", 2.20);

        weapons = new ArrayList<>();
        weapons.add(sword1);
        weapons.add(spear1);
        armoury = new Armoury("Unlimited Bladeworks",weapons);
    }

    @Test
    public void canGetName(){
        assertThat(armoury.getName()).isEqualTo("Unlimited Bladeworks");
    }
    @Test
    public void canSetName(){
        armoury.setName("Khaz Modan Armoury");
        assertThat(armoury.getName()).isEqualTo("Khaz Modan Armoury");
    }
    @Test
    public void canGetWeapons(){
        assertThat(armoury.getWeapons()).isEqualTo(weapons);
    }

    @Test
    public void canSetWeapons(){
        weapons.add(sword2);
        armoury.setWeapons(weapons);
        assertThat(armoury.getWeapons()).isEqualTo(weapons);
    }

    

}
