package com.dyna;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        JDABuilder.createDefault("MTE3MzM0MzgyMzMwNTM3NTc2NA.G10Hza.BQd4XKPoQKrEd7SeNaEtTtSKP41CEyzsek5jRk")
                .setActivity(Activity.playing("epiccool simulator"))
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new Listener())
                .build();
    }
}