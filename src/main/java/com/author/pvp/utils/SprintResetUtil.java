package com.author.pvp.utils;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

package class SprintResetUtil {
    
    public static void resetSprint(PlayerEntity player) {
        if (!(player instanceof ClientPlayerEntity)) {
            return;
        }
        
        ClientPlayerEntity clientPlayer = (ClientPlayerEntity) player;
        
        if (clientPlayer.input == null) {
            return;
        }
        
        Input input = clientPlayer.input;
        boolean wasPressingForward = input.pressingForward;
        
        input.pressingForward = false;
        clientPlayer.setSprinting(false);
        
        input.pressingForward = wasPressingForward;
    }
}
