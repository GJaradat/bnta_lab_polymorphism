import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpearTest {

    Spear spear1;
    Spear spear2;

    @BeforeEach
    public void setUp(){
        spear1 = new Spear("Gungnir","Norse steel, Yggdrasil wood", 1.65);
        spear2 = new Spear("Lance of St. Longinus","Holy wood", 2.20);
    }

    @Test
    public void canGetLength(){
        assertThat(spear1.getLength()).isEqualTo(1.65);
    }

    @Test
    public void canSetLength(){
        spear1.setLength(2);
        assertThat(spear1.getLength()).isEqualTo(2);
    }

    @Test
    public void canStab(){
        assertThat(spear1.stab()).isEqualTo("Size is not everything");
        assertThat(spear2.stab()).isEqualTo("Can't escape this!");
    }

    @Test
    public void canStabOverload(){
        assertThat(spear2.stab(10)).isEqualTo("I will make you hole-y!");
    }

    @Test
    public void canPractice(){
        assertThat(spear1.practice()).isEqualTo("I got better with the spear!");
    }

    @Test
    public void canSharpenWeapon(){
        assertThat(spear1.sharpenWeapon()).isEqualTo("It's stabbing time!");
    }

    @Test
    public void canImbueElement(){
        assertThat(spear1.imbueElement("frost")).isEqualTo("Now my Gungnir carries the power of the frost element!");
    }
    @Test
    public void canEnchant(){
        assertThat(spear1.addEnchantment("durability")).isEqualTo("The Gungnir got increased durability!");
    }

}
