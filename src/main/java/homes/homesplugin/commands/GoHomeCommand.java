package homes.homesplugin.commands;

import homes.homesplugin.HomesPlugin;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GoHomeCommand implements CommandExecutor {
    private final HomesPlugin homesPlugin;

    public GoHomeCommand(HomesPlugin homesPlugin) {
        this.homesPlugin = homesPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            Location userHomeLocation = (Location) homesPlugin.getConfig().get("home-"+player.getUniqueId());
            if(userHomeLocation == null){
                player.sendMessage("No tienes casa aun");
                return false;
            }
            player.teleport(userHomeLocation);
            player.sendMessage("Teletransportandote a tu casa");
        }else{
            System.out.println("sender is not a player");
        }
        return true;
    }
}
