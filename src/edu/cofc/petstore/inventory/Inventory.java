package edu.cofc.petstore.inventory;
import edu.cofc.petstore.pets.Pet;
import java.util.ArrayList;

/**
 * Created by Kaelin Briggs on 1/19/2017.
 */
public class Inventory {

    private ArrayList<Pet> petInventory;

    public Inventory(){

        petInventory = new ArrayList();
    }


    public void add(Pet pet){
        petInventory.add(pet);
    }

    public void remove(Pet pet){
        petInventory.remove(pet);

    }
}
