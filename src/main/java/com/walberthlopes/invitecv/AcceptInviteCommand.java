package com.walberthlopes.invitecv;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AcceptInviteCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 1) {
                if (Bukkit.getPlayer(args[0]) != null) {
                    Player alvo = Bukkit.getPlayer(args[0]);

                    if (alvo != player) {
                        player.performCommand("minecraft:gamemode survival");

                    } else {
                        player.sendMessage("Você não pode aceitar seu próprio convite!");
                    }

                } else {
                    player.sendMessage("Este jogador não está online!");
                }

            } else {
                player.sendMessage("Um nome válido precisa ser inserido!");
            }
        }

        return false;
    }
}
