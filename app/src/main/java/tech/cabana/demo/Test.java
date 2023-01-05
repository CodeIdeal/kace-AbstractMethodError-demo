package tech.cabana.demo;

import java.util.Arrays;

public class Test {
    private static final String[] processName = {null};

    public String test() {
        System.out.println(Arrays.deepToString(processName));
        return processName[0];
    }
}
