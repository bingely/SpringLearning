package com.bingley.desiner.builder;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class ComputerBuilder {

    private String mCName;

    private void ComputerBuilder() {

    }


    public ComputerBuilder builder() {
        ComputerBuilder computerBuilder = new ComputerBuilder();

        return computerBuilder;
    }

    public ComputerBuilder setCName(String CName) {
        mCName = CName;

        return
    }
}
