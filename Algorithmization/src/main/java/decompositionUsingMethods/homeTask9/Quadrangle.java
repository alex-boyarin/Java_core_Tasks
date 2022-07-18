package decompositionUsingMethods.homeTask9;

public class Quadrangle {
    private double sideX;
    private double sideY;
    private double sideZ;
    private double sideT;

    public Quadrangle(double sideX, double sideY, double sideZ, double sideT) {
        this.sideX = sideX;
        this.sideY = sideY;
        this.sideZ = sideZ;
        this.sideT = sideT;
    }

    private double areaOfRightTriangle() {
        return (sideX * sideY) / 2;
    }

    private double hypotenuseLength() {
        return Math.sqrt(Math.pow(sideX, 2) + Math.pow(sideY, 2));
    }

    private double semiPerimeterTriangle() {
        return (sideZ + sideT + hypotenuseLength()) / 2;
    }

    private double areaTriangle() {
        return Math.sqrt(semiPerimeterTriangle() * (semiPerimeterTriangle() - sideZ) * (semiPerimeterTriangle() - sideT) * (semiPerimeterTriangle() - hypotenuseLength()));
    }

    private double areaQuadrangle() {
        return areaOfRightTriangle() + areaTriangle();
    }

    @Override
    public String toString() {
        return "Четырехугольник со сторонами:" + "\n" +
                "сторонаX=" + sideX + "\n" +
                "сторонаY=" + sideY + "\n" +
                "сторонаZ=" + sideZ + "\n" +
                "сторонаT=" + sideT + "\n" +
                "Площадь четырехугольника " + String.format("%.3f", areaQuadrangle());
    }
}

