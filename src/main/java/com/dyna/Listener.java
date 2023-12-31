package com.dyna;

import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ShutdownEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot())
            return;
        MessageChannel channel = event.getChannel();
        if(event.getMessage().getContentDisplay().equalsIgnoreCase(",invite")) {
            event.getChannel().sendMessage("https://discord.com/oauth2/authorize?client_id=1173343823305375764&permissions=8&scope=bot").queue();
        }
        if(event.getMessage().getContentDisplay().equalsIgnoreCase(",tiziland")) {
            event.getChannel().sendMessage("Join Tiziland!! It's a great community server. Find it here: discord.gg/9XTkWVbycs").queue();
        }
        if (event.getMessage().getContentDisplay().contains("uwucutesingle")) {
            event.getChannel().sendMessage("krill your shelf").queue();
        }
    }

    @Override
    public void onShutdown(ShutdownEvent event) {
        System.out.println("CLIENT DESTROYED");
    }
}