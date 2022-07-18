package theSimplestClassesAndObjects.task10;


public interface SearchCriteria {
    boolean isMatch(String searchString, Airline airline);

    static SearchCriteria byDestination() {
        return (searchString, airline) -> airline.getDestination().equals(searchString);
    }

    static SearchCriteria byDayOfTheWeek() {
        return (searchString, airline) -> airline.getDaysOfTheWeek().equals(searchString);
    }
}