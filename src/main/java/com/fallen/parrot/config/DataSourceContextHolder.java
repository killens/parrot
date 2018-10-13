package com.fallen.parrot.config;

public class DataSourceContextHolder {
    public static final String Master = "master";
    public static final String Slaver1 = "slave1";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDataSource(String name){
        contextHolder.set(name);
    }

    public static String getDataSource(){
        return contextHolder.get();
    }

    public static void cleanDataSource(){
        contextHolder.remove();
    }
}
