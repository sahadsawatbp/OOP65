
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super();
    }
    public Ship(double fuel){
        super(fuel);
    }public void move(){
        this.fl0at();
    }public void move(int distance){
        for(int i = 0; i < distance; i++){
            if(fuel < 50){
                System.out.println("Fuel is not enough.");
                break;
            }
            this.fl0at();
        }
    }
    @Override
    public void fl0at(){
        if(fuel >= 50){
            setFuel(-50);
            System.out.println("Ship moves");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }@Override
    public void startEngine(){
        if(fuel >= 10){
            setFuel(-10);
            System.out.println("Engine starts");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }@Override
    public void stopEngine(){
            System.out.println("Engine stops");
    }@Override
    public void honk(){
            System.out.println("Shhhhh");
    }
}
