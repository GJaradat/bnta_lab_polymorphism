public class Sword extends Weapon{

    private boolean doubleEdged;

    public Sword (String name,String material,boolean edge){
        super(name,material);
        this.doubleEdged = edge;
    }

    public boolean isDoubleEdged() {
        return doubleEdged;
    }

    public void setDoubleEdged(boolean doubleEdged) {
        this.doubleEdged = doubleEdged;
    }

    public String slash(){
        if (this.doubleEdged){
            return "Tis but a scratch!";
        }
        else {
            return "Nothing personnel kid";
        }
    }

    public String practice(){
        return "I got better with the sword!";
    }

}
