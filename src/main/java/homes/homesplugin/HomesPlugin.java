package homes.homesplugin;

import homes.homesplugin.commands.GoHomeCommand;
import homes.homesplugin.commands.SetHomeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class HomesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println("Enabling homes plugin");

        getCommand("home").setExecutor(new GoHomeCommand(this));
        getCommand("sethome").setExecutor(new SetHomeCommand(this));
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling home plugin");
    }
}
