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
    Ring ring;
    ArrayList<IEnchant> weapons;

    @BeforeEach
    public void setUp(){
        sword1 = new Sword("Excalibur","Holy steel", true);
        sword2 = new Sword("Zangetsu","Shinigami steel", false);

        spear1 = new Spear("Gungnir","Norse steel, Yggdrasil wood", 1.65);
        spear2 = new Spear("Lance of St. Longinus","Holy wood", 2.20);

        ring = new Ring("Ring of the Nibelung", true);

        weapons = new ArrayList<>();
        weapons.add(sword1);
        weapons.add(spear1);
        weapons.add(ring);
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

    @Test
    public void canForgeWeapon(){
        armoury.forgeWeapon(sword2);
        assertThat(armoury.getWeapons().contains(sword2)).isEqualTo(true);
    }

    @Test
    public void canAdmireWeapons(){
        assertThat(armoury.admireWeapons()).isEqualTo("My glorious Unlimited Bladeworks Armoury contains 3 weapons! I am ready for war!");

        armoury.setWeapons(new ArrayList<>());
        assertThat(armoury.admireWeapons()).isEqualTo("My glorious Armoury is empty! I am ruined!");
    }
}
