package com.company;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Test {

    public void test() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Method methodplus = Main.class.getMethod("plus");
        Method methodminus = Main.class.getMethod("minus");
        Field A = Main.class.getField("a");
        Field B = Main.class.getField("b");
        Field C = Main.class.getField("c");
        Main obj = new Main();
        A.set(obj,10);
        B.set(obj,4);
        C.set(obj,6);
        methodplus.invoke(obj);
        methodminus.invoke(obj);
    }
}
