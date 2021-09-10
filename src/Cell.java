import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Cell {

    //Variable declaration
    private int strength;
    private int x;
    private int y;
    private int id;
    private ArrayList<Cell> neighbors;
    private HashMap<String,Integer> chemicals;
    private HashSet<String> signals;

    //Main Constructor
   Cell(int strength, int id, int x, int y, ArrayList<Cell> neighbors, HashMap<String,Integer> chemicals, Set<String> signals ){
        setStrength(strength);
        setID(id);
        setX(x);
        setY(y);

        //Adds cell chemicals to track concentration of chemicals
        chemicals.put("ATP",0);
        chemicals.put("Glucose",1);
        chemicals.put("Lactate",2);

        //If the size of neighbors array exceeds 6, do something
        if ( neighbors.size()> 6){
            interactNeighbors(neighbors);
        }

        //When certain signal detected performs action
       Iterator<String> i = signals.iterator();
        while (i.hasNext()){
            if (Objects.equals(i.next(), "insulin")){
                //regulateBlood();
            }
            else if(Objects.equals(i.next(), "adrenaline")){
                //increaseHeartRate();
            }
            else if(Objects.equals(i.next(), "glucagon")){
                //raiseBloodLevels();
            }
        }

    }

    //Default Constructor
    Cell(){
        this( 0,0, 0,0,new ArrayList<>(),new HashMap<>(),new HashSet<>());
    }

    //Setters
    private void setStrength(int strength) {
        this.strength = Math.max(strength, 0);
    }
    private void setID (int id) {
        this.id = Math.max(id, 0);
    }
    private void setX (int x) {
        this.x = Math.max(x, 0);
    }
    private void setY (int y) {
        this.y = Math.max(y, 0);
    }

    //Getters
    private int getStrength(int strength) {
        return strength;
    }
    private int getId (int id) {
        return id;
    }
    private int getX (int x) {
        return x;
    }
    private int getY (int y) {
        return y;
    }

    // To fill out
    public void interactNeighbors (ArrayList<Cell> neighbors){

    }

    //Main method
    public static void main(String[] args) {
        Cell newCell = new Cell();
    }
}
