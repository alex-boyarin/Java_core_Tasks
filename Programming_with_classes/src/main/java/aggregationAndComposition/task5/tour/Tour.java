package aggregationAndComposition.task5.tour;

public enum Tour {
    CRUISE("ship", true, 7, 1500),
    EXCURSION("bus", true, 3, 40),
    THERAPY("train, bus", true, 14, 2000),
    SHOPPING("bus", false, 2, 150),
    RELAXATION("airplane", true, 10, 1300);
    private String transport;
    private boolean food;
    private int numberOfDays;
    private int cost;

    private Tour(String transport, boolean food, int numberOfDays, int cost) {
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.cost = cost;
    }


    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transport='" + transport + '\'' +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                ", cost=" + cost +
                '}';
    }
    }
