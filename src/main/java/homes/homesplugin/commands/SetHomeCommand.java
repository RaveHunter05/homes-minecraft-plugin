package homes.homesplugin.commands;

import homes.homesplugin.HomesPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHomeCommand implements CommandExecutor {

    private final HomesPlugin homesPlugin;

    public SetHomeCommand(HomesPlugin homesPlugin) {
        this.homesPlugin = homesPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            homesPlugin.getConfig().set("home-" + player.getUniqueId(), player.getLocation());
            homesPlugin.saveConfig();
            player.sendMessage("Home creada");
        }else{
            System.out.println("sender is not a player");
        }
        return true;
    }
}
