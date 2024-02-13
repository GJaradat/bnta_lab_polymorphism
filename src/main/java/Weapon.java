public abstract class Weapon {

    private String name;
    private String material;

    public Weapon(String name, String material){
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String sharpenWeapon(){
        return "Ready for action";
    }

    public abstract String practice();
}
