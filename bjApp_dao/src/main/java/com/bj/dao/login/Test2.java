package com.bj.dao.login;

public class Test2 {
    private static volatile Test2 t = null;


    public static Test2 getTest2() {
        if (null == t) {
            synchronized (Test2.class) {
                if (null == t) {
                    t = new Test2();
                }

            }
        }
        return t;
    }

    public static void main(String[] args) {
        Test2 test2 = Test2.getTest2();
        System.out.println(test2 == Test2.getTest2());

    }



}
