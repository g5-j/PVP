package com.author.pvp.events;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.ActionResult;
import com.author.pvp.config.WTapConfig;
import com.author.pvp.utils.SprintResetUtil;

public class AttackEventHandler {
    public static void registerAttackListener() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            // التحقق من التشغيل داخل العميل وتفعيل المود
            if (!world.isClient() || !WTapConfig.isWTapEnabled()) {
                return ActionResult.PASS;
            }

            int minDelay = WTapConfig.getMinDelay();
            int maxDelay = WTapConfig.getMaxDelay();
            int randomDelay = minDelay + (int) (Math.random() * (maxDelay - minDelay + 1));

            new Thread(() -> {
                try {
                    Thread.sleep(randomDelay);
                    MinecraftClient client = MinecraftClient.getInstance();
                    client.execute(() -> {
                        if (client.player != null) {
                            SprintResetUtil.resetSprint(client.player);
                        }
                    });
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();

            return ActionResult.PASS;
        });
    }
}
