import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RingTest {

    Ring ring1;
    Ring ring2;

    @BeforeEach
    public void setUp() {
        ring1 = new Ring("Ring of the Nibelung", true);
        ring2 = new Ring("Ring of Midas", false);
    }

    @Test
    public void canGetName() {
        assertThat(ring1.getName()).isEqualTo("Ring of the Nibelung");
    }

    @Test
    public void canSetName() {
        ring1.setName("Ring of Power");
        assertThat(ring1.getName()).isEqualTo("Ring of Power");
    }
    @Test
    public void canGetElemental() {
        assertThat(ring1.isElemental()).isEqualTo(true);
    }

    @Test
    public void canSetElemental() {
        ring1.setElemental(false);
        assertThat(ring1.isElemental()).isEqualTo(false);
    }

    @Test
    public void canImbueElement(){
        assertThat(ring1.imbueElement("darkness")).isEqualTo("The Ring of the Nibelung now holds a darkness spell!");
        assertThat(ring2.imbueElement("gold")).isEqualTo("Just a plain old ring");
    }

    @Test
    public void canEnchant(){
        assertThat(ring2.addEnchantment("luck")).isEqualTo("The Ring of Midas will give me luck +1!");
    }

}