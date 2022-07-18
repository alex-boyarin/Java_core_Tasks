package theSimplestClassesAndObjects.task4;

//  4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
//  Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//  Добавьте возможность сортировки массив по пункту назначения,
//  причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
public class Train {
    private int numberTrain;
    private String destination;
    private String departureTime;

    public Train(int numberTrain, String destination, String departureTime) {
        this.numberTrain = numberTrain;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }


    @Override
    public String toString() {
        return "Train{" +
                "numberTrain: " + numberTrain +
                ", destination: " + destination + " " +
                ", departure Time: " + departureTime + " " +
                "}\n";
    }
}

