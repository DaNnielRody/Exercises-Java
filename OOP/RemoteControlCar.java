package OOP;

/*
In this exercise you will be doing some more work on remote control cars.

An experimental car has been developed and the test track needs to be adapted to handle both production and experimental models.
The two types of car have already been built, and you need to find a way to deal with them both on the test track.

In addition, production cars are beginning to have some success. The team boss is keen to maintain the competitive spirit by publishing a ranking of the production cars.
 */

import java.util.Collections;
import java.util.List;

public interface RemoteControlCar {

    void drive();
    int getDistanceTravelled();
}

class ExperimentalRemoteControlCar implements RemoteControlCar {
    protected int distance = 0;

    public void drive() {
        distance += 20;
    }

    public int getDistanceTravelled() {
        return distance;
    }
}

class ProductionRemoteControlCar extends ExperimentalRemoteControlCar implements Comparable<ProductionRemoteControlCar>{

    private int numberOfVictories;

    @Override
    public void drive() {
        distance += 10;
    }

    public void setNumberOfVictories(int victories) {
        this.numberOfVictories = victories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }


    // O compareTo define a forma como os objetos desta classe são ordenados. Desse jeito, eu ordeno eles do maior número de vitórias para o menor.
    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(o.getNumberOfVictories(), numberOfVictories);
    }

    /*
    Mesmo recebendo a herança de uma classe abstrata que herda uma interface, eu não preciso colocar todos os métodos da interface caso a classe abstrata já faça isso.
    Porém, se eu não fizesse a implementação dentro da classe abstrata, seria o trabalho da classe filha fazer.
     */
}

class TestTrack extends ProductionRemoteControlCar{

    public void race(RemoteControlCar car){
        car.drive();
    }

    public List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars){
        Collections.sort(cars);
        return cars;
    }
}