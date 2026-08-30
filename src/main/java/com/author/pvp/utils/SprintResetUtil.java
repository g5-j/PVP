package com.author.pvp.utils;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.input.Input;

public class SprintResetUtil {
    public static void resetSprint(ClientPlayerEntity player) {
        if (player == null || player.input == null) {
            return;
        }

        Input input = player.input;
        boolean wasPressingForward = input.pressingForward;

        // إعادة تعيين سرعة الـ Sprint والزر W
        input.pressingForward = false;
        player.setSprinting(false);
        input.pressingForward = wasPressingForward;
    }
}
