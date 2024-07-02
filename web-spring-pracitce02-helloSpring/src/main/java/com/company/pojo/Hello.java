package com.company.pojo;

public class Hello {
    private String msg;

    public Hello () {
//        System.out.println("non-arg-constructor of Hello");
    }

    public Hello (String msg) {
        this.msg = msg;
//        System.out.println("arg-constructor of Hello");
    }

    public String getMsg () {
        return this.msg;
    }

    public void setMsg (String msg) {
//        System.out.println("non-arg-constructor of Hello");
        this.msg = msg;
    }

    public String toString() {
        return "Hello{msg="+ msg + '\'' + "}";
    }
}
