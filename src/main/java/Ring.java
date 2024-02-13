public class Ring implements IEnchant{

    private String name;
    private boolean elemental;

    public Ring(String name, boolean elemental){
        this.name = name;
        this.elemental = elemental;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isElemental() {
        return elemental;
    }

    public void setElemental(boolean elemental) {
        this.elemental = elemental;
    }

    @Override
    public String imbueElement(String element) {
        if (!this.elemental){
            return "Just a plain old ring";
        }
        return String.format("The %s now holds a %s spell!",this.name,element);
    }

    @Override
    public String addEnchantment(String enchantment) {
        return String.format("The %s will give me %s +1!",this.name,enchantment);
    }
}
