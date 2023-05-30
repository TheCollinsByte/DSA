package dev.collin.spf;

import java.util.ArrayList;
import java.util.List;

public class SPFAlgorithm {
    public static void main(String[] args) {
        System.out.println("Shortest Path First");
    }

    public List<Route> calculateRoutes(Router router) {
        List<Route> routes = new ArrayList<Route>();
        for (Link link : router.getLinks()) {
            routes.add(new Route(link.getDestination(), link.getCost()));
        }
        return routes;
    }
}
