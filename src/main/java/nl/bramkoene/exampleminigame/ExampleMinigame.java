package nl.bramkoene.exampleminigame;

import nl.bramkoene.minigameapi.GameController;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExampleMinigame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        GameController.RegisterGamemode(new Game());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
