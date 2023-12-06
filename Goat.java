import java.util.Random;

public class Goat {
    public String name;
    public double powerLevel;
    public boolean isGrumpy;

    // Proof of concept of private class
    private String favoriteFood;

    // flashback to constructors, save me
    public Goat(
            String name,
            double powerLevel,
            // no dangling commas in Java
            boolean isGrumpy) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.isGrumpy = isGrumpy;

        // Array of strings for favorite food options. 
        // Totes legit from actual goat polling data.
        String[] favoriteFoodOptions = {
                "pretzels",
                "Bugles",
                "Gushers",
                "cars",
                "Cheetos",
                "Red Bulls, but just the can part"
        };

        Random randomFoodNumGenerator = new Random();
        int favoriteFoodIndex = randomFoodNumGenerator.nextInt(6);
        this.favoriteFood = favoriteFoodOptions[favoriteFoodIndex];

    }

    public String toString() {
        String result = "This is a goat named ";
        result += this.name;
        result += ", and their power level is ";
        result += this.powerLevel;
        result += ".  Are they grumpy?? ";
        result += this.isGrumpy;
        result +=".\n";
        result += this.name;
        result += "'s favorite food is ";
        result += this.favoriteFood;
        result += "!";

        return result;
    }
}
