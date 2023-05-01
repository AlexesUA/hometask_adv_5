package ua.edu.cbs.lms.hometask_adv_5.task3;

import java.util.ArrayList;
import java.util.List;

public class SomeClass {
    public int someFieldInt = 10;
    protected String someFieldString = "Some string";
    private List<Long> someFieldList = new ArrayList<>();

    public SomeClass(){}

    public SomeClass(int someFieldInt){
        this.someFieldInt = someFieldInt;
    }


    public int getSomeFieldInt() {
        return someFieldInt;
    }

    public void setSomeFieldInt(int someFieldInt) {
        this.someFieldInt = someFieldInt;
    }

    public String getSomeFieldString() {
        return someFieldString;
    }

    public void setSomeFieldString(String someFielsString) {
        this.someFieldString = someFielsString;
    }

    public List<Long> getSomeFieldList() {
        return someFieldList;
    }

    public void setSomeFieldList(List<Long> someFieldList) {
        this.someFieldList = someFieldList;
    }
}
