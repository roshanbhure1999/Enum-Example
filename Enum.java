package AbstractionPractice;

import java.util.HashMap;
import java.util.Map;

public enum Enum {
    One("one"),
    Two("Two"),
    Three("Three"),
    UNKNOWN("Unknown");
    private final String value;
    Enum(String name) {
        this.value = name;
    }
    public String getValue() {
        return value;
    }
    private final static Map<String,Test> values = new HashMap<String,Test>();
    static{
        values.put("one".toLowerCase(),One);
        values.put("two".toLowerCase(),Two);
        values.put("three".toLowerCase(),Three);
    }

    public static Test convertToTest(String value){
       return values.getOrDefault(value.toLowerCase(),UNKNOWN);
    }

    public static void main(String[] args) {
        System.out.println(Test.convertToTest("ONE").getValue());
        System.out.println(Test.convertToTest("ten").getValue());
    }
}
