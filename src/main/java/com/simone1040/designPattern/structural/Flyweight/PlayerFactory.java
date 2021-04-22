package com.simone1040.designPattern.structural.Flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<PlayerType, Player> hm = new HashMap<>();
    enum PlayerType{
            Terrorist,
            CounterTerrorist
    }

    public static Player getPlayer(PlayerType type){
        Player player = null;
        if(hm.containsKey(type)){
            player = hm.get(type);
        }
        else{
            switch (type){
                case Terrorist:
                    player = new Terrorist();
                    hm.put(type, player);
                    break;
                case CounterTerrorist:
                    player = new CounterTerrorist();
                    hm.put(type, player);
                    break;
            }
        }
        return player;
    }
}
