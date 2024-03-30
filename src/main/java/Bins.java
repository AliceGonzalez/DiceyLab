import java.util.HashMap;

public class Bins {

    //VARIABLES
    HashMap<Integer, Integer> value = new HashMap<>();
    //CONSTRUCTOR
    public Bins(){}
    public Bins(int numberOfDice){
        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            value.put(i, 0);
        }
    }
    //METHOD
    public Integer getValue(int binNumber){
        return value.getOrDefault(binNumber, 0);
    }

    public  void  increment(int binNumber) {
        value.put(binNumber, value.getOrDefault(binNumber, 0) + 1);
    }
}
