package com.walberthlopes.invitecv;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("invite").setExecutor(new InviteCommand());
        getCommand("acceptinvite").setExecutor(new AcceptInviteCommand());

    }

}
