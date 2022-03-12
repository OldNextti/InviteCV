package com.walberthlopes.invitecv;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class InviteCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 1) {
                if (Bukkit.getPlayer(args[0]) != null) {
                    Player alvo = Bukkit.getPlayer(args[0]);

                    if (alvo != player) {
                        alvo.sendMessage("Você recebeu um convite de" + player);

                    } else {
                        player.sendMessage("Você não pode convidar a si mesmo.");
                    }

                } else {
                    player.sendMessage("Este jogador não está online.");
                }

            } else {
                player.sendMessage("Um nome válido precisa ser inserido.");
            }
        }

        return false;
    }
}
