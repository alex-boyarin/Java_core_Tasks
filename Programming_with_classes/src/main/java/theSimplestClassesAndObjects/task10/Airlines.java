package theSimplestClassesAndObjects.task10;

import java.util.ArrayList;
import java.util.List;

public class Airlines {
    private List<Airline> airlines;

    public Airlines() {
        this.airlines = new ArrayList<>();
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void addAirlines(Airline airline) {
        airlines.add(airline);
    }

    public List<Airline> findAirline(SearchCriteria searchCriteria, String searchString) {
        List<Airline> searchResult = new ArrayList<>();
        for (Airline airline : airlines) {
            if (searchCriteria.isMatch(searchString, airline)) {
                searchResult.add(airline);
            }
        }
        return searchResult;
    }

    @Override
    public String toString() {
        return "Airlines " + airlines;
    }
}
