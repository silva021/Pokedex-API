package com.silva.PokedexAPI.api.utils;

public class Utils {

    public static int getPageFromMySql(int page){
        return (page - 1) * 10;
    }
}
