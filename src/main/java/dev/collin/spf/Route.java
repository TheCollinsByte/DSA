package dev.collin.spf;

public class Route {

    private String destination;
    private int cost;


    public Route(String destination, int cost) {
        this.destination = destination;
        this.cost = cost;
    }


    public String getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }
}
