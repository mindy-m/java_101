class Suffering {
    // Function signature
    public static void main(String[] args) {
        System.out.println("AAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHH!!!\nANYTHING BUT JAVA!!!");
        System.out.println("\nWell, except maybe Rust. ...\n");
        
        double inchesOfPizzaArea = calcPizzaArea(12);
        System.out.println("How many inches of pizza will I have?");
        System.out.println(inchesOfPizzaArea);

        Goat orlando = new Goat("Orlando", 99, true);
        System.out.println("\nHere's some info about Orlando (who happens to be a goat): ");
        System.out.println(orlando);

        Goat lily = new Goat("Lily", 12, false);
        System.out.println("\n\n...and here's some info about Lily! (also a goat)");
        System.out.println(lily);
    }

    // Will return a double precision float (a number data type)
    public static double calcPizzaArea (double pizzaDiameter) {
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;

        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        return pizzaArea;
    }

       

}