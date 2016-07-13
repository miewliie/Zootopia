package com.miew.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apinya on 7/13/2016.
 */
public class Main {

    public static void main(String[] args){

        List<Animals> birds = new ArrayList<>();
        Poultry birds1 = new Poultry("01", "birdA", "yellow", "Live in cage zone");
        Poultry birds2 = new Poultry("02", "birdB", "yellow", "Live in cage zone");
        Poultry birds3 = new Poultry("03", "birdC", "yellow", "Live in cage zone");
        Poultry birds4 = new Poultry("04", "birdD", "yellow", "Live in cage zone");
        Poultry birds5 = new Poultry("05", "birdE", "yellow", "Live in cage zone");
        birds.add(birds1);
        birds.add(birds2);
        birds.add(birds3);
        birds.add(birds4);
        birds.add(birds5);

        for(int i = 0; i < birds.size(); i++){
            System.out.println("" + birds.get(i));
        }
        System.out.println("---------------------  *****  ------------------------");

        List<Animals> snakes = new ArrayList<>();
        Amphibian snakes1 = new Amphibian("01", "snakeA", "green", "Live in glass box zone");
        Amphibian snakes2 = new Amphibian("02", "snakeA", "green", "Live in glass box zone");
        Amphibian snakes3 = new Amphibian("03", "snakeA", "green", "Live in glass box zone");
        Amphibian snakes4 = new Amphibian("04", "snakeA", "green", "Live in glass box zone");
        Amphibian snakes5 = new Amphibian("05", "snakeA", "green", "Live in glass box zone");
        snakes.add(snakes1);
        snakes.add(snakes2);
        snakes.add(snakes3);
        snakes.add(snakes4);
        snakes.add(snakes5);

        for (int i = 0; i < snakes.size(); i++){
            System.out.println("" + snakes.get(i));
        }
        System.out.println("---------------------  *****  ------------------------");


        List<Animals> fishes = new ArrayList<>();
        Aquatic fishes1 = new Aquatic("01", "fishA", "blue", "Live in aquarium zone");
        Aquatic fishes2 = new Aquatic("02", "fishA", "blue", "Live in aquarium zone");
        Aquatic fishes3 = new Aquatic("03", "fishA", "blue", "Live in aquarium zone");
        Aquatic fishes4 = new Aquatic("04", "fishA", "blue", "Live in aquarium zone");
        Aquatic fishes5 = new Aquatic("05", "fishA", "blue", "Live in aquarium zone");
        fishes.add(fishes1);
        fishes.add(fishes2);
        fishes.add(fishes3);
        fishes.add(fishes4);
        fishes.add(fishes5);

        for (int i = 0; i < fishes.size(); i++){
            System.out.println("" + fishes.get(i));
        }
        System.out.println("---------------------  *****  ------------------------");

        List<Animals> lions = new ArrayList<>();
        Terrestrial lions1 = new Terrestrial("01", "lionA","yellow", "Live in wild zone");
        Terrestrial lions2 = new Terrestrial("01", "lionA","yellow", "Live in wild zone");
        Terrestrial lions3 = new Terrestrial("01", "lionA","yellow", "Live in wild zone");
        Terrestrial lions4 = new Terrestrial("01", "lionA","yellow", "Live in wild zone");
        Terrestrial lions5 = new Terrestrial("01", "lionA","yellow", "Live in wild zone");
        lions.add(lions1);
        lions.add(lions2);
        lions.add(lions3);
        lions.add(lions4);
        lions.add(lions5);
        for (int i = 0; i < lions.size(); i++){
            System.out.println("" + fishes.get(i));
        }
        System.out.println("---------------------  *****  ------------------------");


    }
}
