package com.dyna;


import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot())
            return;
        MessageChannel channel = event.getChannel();
        if(event.getMessage().getContentDisplay().contains("uwucutesingle")) {
            event.getChannel().sendMessage("krill your shelf").queue();
        }
    }
}
