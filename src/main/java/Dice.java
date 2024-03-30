public class Dice {

    //CONSTRUCTOR
    public Dice() {}

    //METHODS
    //Create random number between 1 - 6 inclusive
    public int randomNumber(){
        return (int) ((6.0 * Math.random()) + 1) ;
    }
    //Roll a certain number of dice and sum up results
    public int tossAndSum(int numberOfDies) {
        int sum = 0;
        for (int i = 0; i < numberOfDies; i++) {
             sum += randomNumber();
        }
        return sum;
    }
}
