package homes.homesplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class HomesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Enabling homes plugin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
