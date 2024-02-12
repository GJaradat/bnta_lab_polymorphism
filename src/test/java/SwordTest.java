import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SwordTest {

    Sword sword1;
    Sword sword2;

    @BeforeEach
    public void setUp(){
        sword1 = new Sword("Excalibur","Holy steel", true);
        sword2 = new Sword("Zangetsu","Shinigami steel", false);
    }

    @Test
    public void canGetName(){
        assertThat(sword1.getName()).isEqualTo("Excalibur");
    }

    @Test
    public void canSetName(){
        sword1.setName("Dragonslayer");
        assertThat(sword1.getName()).isEqualTo("Dragonslayer");
    }

    @Test
    public void canGetMaterial(){
        assertThat(sword1.getMaterial()).isEqualTo("Holy steel");
    }

    @Test
    public void canSetMaterial(){
        sword1.setMaterial("Raw Iron");
        assertThat(sword1.getMaterial()).isEqualTo("Raw Iron");
    }

    @Test
    public void canGetDoubleEdged(){
        assertThat(sword1.isDoubleEdged()).isEqualTo(true);
    }

    @Test
    public void canSetDoubleEdged(){
        sword1.setDoubleEdged(false);
        assertThat(sword1.isDoubleEdged()).isEqualTo(false);
    }

    @Test
    public void canSharpenWeapon(){
        assertThat(sword1.sharpenWeapon()).isEqualTo("Ready for action");
    }

    @Test
    public void canSlash(){
        assertThat(sword1.slash()).isEqualTo("Tis but a scratch!");
        assertThat(sword2.slash()).isEqualTo("Nothing personnel kid");
    }


}
