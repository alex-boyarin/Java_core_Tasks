package aggregationAndComposition.task3;



public class Region {
    private String nameRegion;
    private City city;

    public Region(String nameRegion, City city) {
        this.nameRegion = nameRegion;
        this.city = city;
    }



    @Override
    public String toString() {
        return "Region{" +
                "nameRegion=" + nameRegion +
                ", city=" + city +
                '}';
    }
}
