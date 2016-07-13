package com.miew.zoo;


import com.miew.zoo.Animals;


public class Poultry extends Animals{


    public Poultry(String animalID, String animalName, String animalColor, String habitat) {
        super(animalID, animalName, animalColor, habitat);
    }

    public void hWings(){
        //Poultry have wings
    }
}
