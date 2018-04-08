package com.example.bananasplash.laligamanager.agregates;

import java.util.List;

public class League {
    public String name;
    public List<String> players;

    public League(){}

    public League(String name, List<String> players) {
        this.name = name;
        this.players = players;
    }
}
