package com.bingley.desiner.builder;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class Computer {

    private String cName;
    private String cNumber;

    @Override
    public String toString() {
        return "Comsoler{" +
                "cName='" + cName + '\'' +
                ", cNumber='" + cNumber + '\'' +
                '}';
    }


    public static class Builder {

    }

}
