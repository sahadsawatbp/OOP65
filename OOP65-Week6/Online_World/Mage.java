package Online_World;

public class Mage extends Player{
    public Mage(){
        setHP(10);
        setMP(20);
        setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }public void attack(Player p){
        p.attacked(getATK()*2.5);
        setMP(-5);
    }public void attacked(double n){
        setHP(-n);
    }
}
