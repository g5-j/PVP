package com.author.pvp.events;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import com.author.pvp.config.WTapConfig;
import com.author.pvp.utils.SprintResetUtil;

public class AttackEventHandler {

    public static void registerAttackListener() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (world.isClient || player == null) {
                return ActionResult.PASS;
            }

            if (!WTapConfig.isWTapEnabled()) {
                return ActionResult.PASS;
            }

            int minDelay = WTapConfig.getMinDelay();
            int maxDelay = WTapConfig.getMaxDelay();
            int randomDelay = minDelay + (int) (Math.random() * (maxDelay - minDelay + 1));

            new Thread(() -> {
                try {
                    Thread.sleep(randomDelay);
                    SprintResetUtil.resetSprint(player);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();

            return ActionResult.PASS;
        });
    }
}
