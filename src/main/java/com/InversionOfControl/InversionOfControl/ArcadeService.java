package com.InversionOfControl.InversionOfControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArcadeService {
    private final GameProviderService gameProviderService;

    @Autowired
    public ArcadeService(GameProviderService gameProviderService){
        this.gameProviderService = gameProviderService;
    }
    public void startGame(){
        System.out.println(this.gameProviderService.getGameToPlay() + "is being started");
    }
    public void stopGame(){
        System.out.println(this.gameProviderService.getGameToPlay() + "is being stopped");
    }


    // Field Injection With Annotations

//    @Service
//    public class ArcadeService {
//        @Autowired
//        private GameProviderService gameProviderService;
//
//        public void startGame(){
//            System.out.println(this.gameProviderService.getGameToPlay() + "is being started");
//        }
//        public void stopGame(){
//            System.out.println(this.gameProviderService.getGameToPlay() + "is being stopped");
//        }


     // Setter Injection With Annotations

//@Service
//public class ArcadeService {
//    private GameProviderService gameProviderService;
//
//    @Autowired
//    public void setGameProviderService(GameProviderService gameProviderService) {
//        this.gameProviderService = gameProviderService;
//    }
//
//    public void startGame(){
//        System.out.println(this.gameProviderService.getGameToPlay() + "is being started");
//    }
//    public void stopGame(){
//        System.out.println(this.gameProviderService.getGameToPlay() + "is being stopped");
//    }

}
