package com.miew.zoo;


public class Animals {

    private  String animalID;
    private  String animalName;
    private  String animalColor;
    private  String habitat;


    public Animals(String animalID, String animalName, String animalColor, String habitat){

        this.animalID = animalID;
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "ID:"+animalID+ " Name: "+animalName+ " Color: " +animalColor+ " Habitat: " +habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalID() {
        return animalID;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }


}
