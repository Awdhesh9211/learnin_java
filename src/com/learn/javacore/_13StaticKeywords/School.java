package com.learn.javacore._13StaticKeywords;

public class School {
    public String name= "GSS";
    private static School school=new School();
    private School(){}

    public static School getInstance(){
        if(school==null){
            school=new School();
        }
        return school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
