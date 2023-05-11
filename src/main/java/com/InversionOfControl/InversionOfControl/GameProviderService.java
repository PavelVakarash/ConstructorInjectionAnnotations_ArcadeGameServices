package com.InversionOfControl.InversionOfControl;

import org.springframework.stereotype.Service;

@Service
public class GameProviderService {

    public String getGameToPlay(){
        return "World of Warcraft";
    }
}
