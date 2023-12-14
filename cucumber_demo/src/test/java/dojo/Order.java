package dojo;

import java.util.*;

public class Order {

    private String owner;
    private String target;

    public void declareOwner(String romeo) {
        this.owner = romeo;
    }

    public void declareTarget(String juliette) {
        this.target = juliette;
    }

    public String getOwner() {
        return owner;
    }

    public String getTarget() {
        return target;
    }

    public List<String> getCocktails() {
        return new ArrayList<>();
    }
    
}
