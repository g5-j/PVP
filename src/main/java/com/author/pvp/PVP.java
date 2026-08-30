package com.author.pvp;

import net.fabricmc.api.ModInitializer;
import com.author.pvp.events.AttackEventHandler;
import com.author.pvp.config.WTapConfig;

public class PVP implements ModInitializer {
    public static final String MOD_ID = "pvp";
    public static final String MOD_NAME = "PVP";

    @Override
    public void onInitialize() {
        WTapConfig.load();
        AttackEventHandler.registerAttackListener();
    }
}
