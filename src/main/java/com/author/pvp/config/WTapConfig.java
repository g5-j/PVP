package com.author.pvp.config;

public class WTapConfig {
    private static final boolean DEFAULT_WTAP_ENABLED = true;
    private static final int DEFAULT_MIN_DELAY = 50;
    private static final int DEFAULT_MAX_DELAY = 150;

    private boolean wtapEnabled;
    private int minDelay;
    private int maxDelay;

    public WTapConfig() {
        this.wtapEnabled = DEFAULT_WTAP_ENABLED;
        this.minDelay = DEFAULT_MIN_DELAY;
        this.maxDelay = DEFAULT_MAX_DELAY;
    }

    public boolean isWTapEnabled() {
        return wtapEnabled;
    }

    public void setWTapEnabled(boolean enabled) {
        this.wtapEnabled = enabled;
    }

    public int getMinDelay() {
        return minDelay;
    }

    public void setMinDelay(int minDelay) {
        this.minDelay = minDelay;
    }

    public int getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(int maxDelay) {
        this.maxDelay = maxDelay;
    }
}
