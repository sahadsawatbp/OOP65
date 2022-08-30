public class Vehicle {
   private int fuel;
   private String topSpeed;
   protected void setFuel(int i){
       if(i >= 0){
           fuel = i;
       }else{
           fuel += i;
       }
   }protected void setTopSpeed(String n){
       this.topSpeed = n;
   }protected int getFuel(){
       return this.fuel;
   }protected String getTopSpeed(){
       return this.topSpeed;
   }public void shiwInfo(){
       System.out.println("Fuel is "+this.fuel+" litre and Top Speed is "+this.topSpeed+" m/s.");
   }
}
