package net.rocsorc.rpgmechanics;


import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.util.event.Subscribe;

@Plugin( id = "RPGMechanics",  name="The plugin for RPG Mechanics", version = "1.0.0")
public class RPGMechanics {

    Game game;

    @Subscribe
    public void onStart(ServerStartingEvent event) {

        game = event.getGame();

        System.out.println("I am loaded!");


    }
}
