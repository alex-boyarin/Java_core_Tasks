package aggregationAndComposition.task3;


import java.util.Arrays;


public class Country {
    private String nameCountry;
    private City capital;
    private double areaCountry;
    private State[] states;


    public Country(String nameCountry, City capital, double areaCountry, State[] states) {
        this.nameCountry = nameCountry;
        this.capital = capital;
        this.areaCountry = areaCountry;
        this.states = states;
    }

    public City getCapital() {
        return capital;
    }

    public double getAreaCountry() {
        return areaCountry;
    }

    public State[] getStates() {
        return states;
    }



    @Override
    public String toString() {
        return "Country- " + nameCountry + "\n" +
                "Capital- " + capital + ",\n" +
                "AreaCountry- " + areaCountry + ",\n" +
                "City States\n" + Arrays.toString(states);
    }
}
