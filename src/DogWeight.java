public class DogWeight {
    public static void main(String[] args) {
        double jasonWeight;

        double rexWithJasonWeight;
        double deliWithJasonWeight;
        double rexWeight;
        double deliWeight;

        jasonWeight = 191.3;
        deliWithJasonWeight = 200.4;
        rexWithJasonWeight = 200.3;

        rexWeight = rexWithJasonWeight - jasonWeight;
        deliWeight = deliWithJasonWeight - jasonWeight;

        System.out.println();
        System.out.println();
        System.out.print("Rex weighs: ");
        System.out.print(rexWeight);
        System.out.print("lbs.");
        System.out.println();
        System.out.println();
        System.out.print("Deli weighs: ");
        System.out.print(deliWeight);
        System.out.print("lbs.");

    }
}
