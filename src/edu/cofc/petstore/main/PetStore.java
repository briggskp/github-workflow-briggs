package edu.cofc.petstore.main;

import edu.cofc.petstore.inventory.Inventory;
import edu.cofc.petstore.pets.Pet;

/**
 * Created by Kaelin Briggs on 1/19/2017.
 */
public class PetStore {

    Inventory inventory;

    public PetStore(){
        inventory = new Inventory();
    }

    public void buyPet(Pet pet){
        inventory.add(pet);

    }

    public void sellPet(Pet pet){
        inventory.remove(pet);
    }
}
