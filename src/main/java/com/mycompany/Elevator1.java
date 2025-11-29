
package oop;


public class Elevator1 {
   private char speed;
   private int floors;

   public Elevator1() {
       setSpeed('f');
       setFloors(4);
    }

   public Elevator1(char speed, int floors) {
        this.speed = speed;
        this.floors = floors;
        
    }
    public char getSpeed() {
        return speed;
    }
 
    public void setSpeed(char speed) {
        if(speed=='F'|| speed=='S'){
        this.speed = speed;
        }
        else{
            System.out.println("error");
            }

    public int getFloors() {
        return floors;
               }
    public void setFloors(int floors) {
       if(floors >=1 && floors <=20);{
        this.floors = floors;
        }
   }

    
   
    public double getSpeedCost(){ 
      return 0;
   } 
   
    public double getFloorCost(){ 
         return 0;
   } 

    @Override
    public String toString() {
        return "Elevator1{" + "speed=" + speed + ", floors=" + floors + '}';
    }
    public double gteSpeeedCost(){
       int cost=0;
        switch(speed){
           case 'S': cost=1500;break;
           case 'F': cost=3000;break;   
       }
       return cost;
   }
    public double gteFloorsCost(){
      double floorsCost=0;
      if(this.floors>=1 && this.floors<=5){
          floorsCost=this.floors*2000;
      }else if(this.floors>=6 && this.floors<=10){
          floorsCost=this.floors*1500;
      }else if(this.floors>=11 && this.floors<=20){
          floorsCost=this.floors*1000;
      }
        return floorsCost;
    }
    public double gteTotalCost(){
        double totalCost=getSpeedCost()+gteFloorsCost()+100;
        return totalCost;
    }
    }
  