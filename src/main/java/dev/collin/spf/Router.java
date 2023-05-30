package dev.collin.spf;

import java.util.ArrayList;
import java.util.List;

public class Router {

    private String id;
    private List<Link> links = new ArrayList<>();

    public Router(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void addLink(Link link) {
        links.add(link);
    }

    public List<Link> getLinks() {
        return links;
    }
}
