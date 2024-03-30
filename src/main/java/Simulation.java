import org.jetbrains.annotations.Nullable;

public class Simulation {
    //Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
    //Create a simulation where two dies are thrown one million times. Keep track of all results.
    int numberOfDies;
    int numberOfTosses;
    Bins value;
    Dice dice = new Dice();

    public Simulation(int numberOfDies, int numberOfTosses){
        this.value = new Bins(numberOfDies);
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }
    private void printResults() {
        double tosses = numberOfTosses;
        System.out.println("***\n" +
                "Simulation of " + numberOfDies+ " dice tossed for " + numberOfTosses + " times.\n" +
                "***");
        for (int i = numberOfDies; i <= numberOfDies * 6; i++) {
            Integer count = value.getValue(i);
            double percent = (count != null ? (count / tosses) * 100 : 0);
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < percent / 2; j++) {
                output.append("*");
            }
            System.out.printf("%2d : %8d: %.2f %s%n", i, (count != null ? count : 0), percent, output);
        }
    }

    private @Nullable Integer runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            int result = dice.tossAndSum(numberOfDies);
            value.increment(result);
        }
        return null;
    }
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }

}
