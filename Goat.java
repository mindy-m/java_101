public class Goat {
    public String name;
    public double powerLevel;
    public boolean isGrumpy;

    // flashback to constructors, save me
    public Goat(
            String name,
            double powerLevel,
            // no dangling commas in Java
            boolean isGrumpy) {
                this.name = name;
                this.powerLevel = powerLevel;
                this.isGrumpy = isGrumpy;
    }
}
