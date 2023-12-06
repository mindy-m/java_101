class Suffering {
    // Function signature
    public static void main(String[] args) {
        System.out.println("AAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHH!!!\nANYTHING BUT JAVA!!!");
        System.out.println("\nWell, except maybe Rust. ...\n");
        
        double inchesOfPizzaArea = calcPizzaArea(12);
        System.out.println("How many inches of pizza will I have?");
        System.out.println(inchesOfPizzaArea);
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