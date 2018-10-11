package com.fallen.parrot.tool.random.hashid;

import com.fallen.parrot.tool.random.hashid.config.BaseConfig;
import com.fallen.parrot.tool.random.hashid.config.DefaultConfig;
import com.fallen.parrot.tool.random.hashid.config.Config;
import org.hashids.Hashids;

public class HashidTool {

    protected Config config;
    protected Hashids hashids = null;

    protected void clearConfig() {
        if (config == null) {
            config = new Config();
        } else {
            config.clear();
        }
        hashids = null;
    }

    public HashidTool() {
        initConfig(new DefaultConfig());
    }

    public HashidTool(BaseConfig inputConfig) {
        initConfig(inputConfig);
    }

    public HashidTool(int length, String alphabet, String salt) {
        initConfig(length, alphabet, salt);
    }

    public void initConfig(BaseConfig inputConfig) {
        clearConfig();
        config.length = inputConfig.getLength();
        config.alphabet = inputConfig.getAlphabet();
        config.salt = inputConfig.getSalt();
    }

    public void initConfig(int length, String alphabet, String salt) {
        clearConfig();
        config.length = length;
        config.alphabet = alphabet;
        config.salt = salt;
    }

    public Hashids getHashids() {
        if (hashids == null) {
            return new Hashids(config.salt, config.length, config.alphabet);
        }
        return hashids;
    }

}