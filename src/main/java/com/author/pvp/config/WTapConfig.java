package com.author.pvp.config;

public class WTapConfig {
    private static boolean wtapEnabled = true;
    private static int minDelay = 50;
    private static int maxDelay = 150;

    public static void load() {
        // يمكن إضافة منطق تحميل الإعدادات هنا مستقبلاً
    }

    public static boolean isWTapEnabled() {
        return wtapEnabled;
    }

    public static void setWTapEnabled(boolean enabled) {
        wtapEnabled = enabled;
    }

    public static int getMinDelay() {
        return minDelay;
    }

    public static void setMinDelay(int min) {
        minDelay = min;
    }

    public static int getMaxDelay() {
        return maxDelay;
    }

    public static void setMaxDelay(int max) {
        maxDelay = max;
    }
}
