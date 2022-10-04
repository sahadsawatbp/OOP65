package Online_World;

public class Novice extends Player{
    public Novice(){
        setHP(10);
        setMP(10);
        setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }public void attack(Player p){
        p.attacked(getATK());
    }public void attacked(double n){
        setHP(-n);
    }
}
