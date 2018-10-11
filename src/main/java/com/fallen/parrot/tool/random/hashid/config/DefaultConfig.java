package com.fallen.parrot.tool.random.hashid.config;

public class DefaultConfig implements BaseConfig {
    @Override
    public int getLength() {
        return 6;
    }

    @Override
    public String getAlphabet() {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    }

    @Override
    public String getSalt() {
        return "main20181011";
    }
}
