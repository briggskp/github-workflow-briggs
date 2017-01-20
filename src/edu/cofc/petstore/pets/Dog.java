package edu.cofc.petstore.pets;

/**
 * Created by Kaelin Briggs on 1/19/2017.
 */
public class Dog extends Pet {
    public Boolean getAggressive() {
        return isAggressive;
    }

    public void setAggressive(Boolean aggressive) {
        isAggressive = aggressive;
    }

    private Boolean isAggressive;

}
