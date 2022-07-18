package decompositionUsingMethods.homeTask3;

public class CalculateAreas {
    private double sideHexagon;

    public CalculateAreas(double sideHexagon) {
        this.sideHexagon = sideHexagon;
    }

    private double areaTriangle() {
        return Math.sqrt(3) * Math.pow(sideHexagon, 2) / 4;
    }

    public double calculateAreaHexagon() {
        return areaTriangle() * 6;
    }
}
