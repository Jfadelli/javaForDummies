public class TrackPopulation4 {

    public static void main(String[] args) {
        var smackoverAR = new City();
        smackoverAR.population = 2232;
        smackoverAR = doBirth(smackoverAR);
        System.out.println(smackoverAR.population);
    }

    static City doBirth(City aCity) {
        var myCity = new City();
        myCity.population = aCity.population + 1;
        return myCity;
    }
}
