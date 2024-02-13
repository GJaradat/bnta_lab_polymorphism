public class Spear extends Weapon{

    private double length;

    public Spear(String name, String material, double length){
        super(name, material);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String stab(){
        if (this.length < 2){
            return "Size is not everything";
        }
        else{
            return "Can't escape this!";
        }
    }

    public String stab(int stabs){
        return "I will make you hole-y!";
    }

    public String practice(){
        return "I got better with the spear!";
    }

}
