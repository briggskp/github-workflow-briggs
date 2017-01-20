package edu.cofc.petstore.pets;

/**
 * Created by Kaelin Briggs on 1/19/2017.
 */
public abstract class Pet {

    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
