package aggregationAndComposition.task3;


public class State {
    private String nameState;
    private City cityState;
    private Region[] regions;

    public State(String nameState, City cityState, Region[] regions) {
        this.nameState = nameState;
        this.cityState = cityState;
        this.regions = regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public Region[] getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        return cityState + "";
    }
}
