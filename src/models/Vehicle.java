package models;

public class Vehicle {
    private double Distance;
    private double Fuel;

    public Vehicle(){
        this (0,0);
    };

    public Vehicle(double Distance, double Fuel){
        this.Distance = Distance;
        this.Fuel = Fuel;
    }

    public double getFuel() {
        return Fuel;
    }

    public void setFuel(double Fuel) {
        this.Fuel = Fuel;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    public double getCost(){
        return (Distance/Fuel);
    }
}
