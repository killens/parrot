package com.fallen.parrot.tool.random.hashid.config;

public class Config {

    public int length = 0;
    public String alphabet = "";
    public String salt = "";

    public void clear() {
        length = 0;
        alphabet = "";
        salt = "";
    }
}
