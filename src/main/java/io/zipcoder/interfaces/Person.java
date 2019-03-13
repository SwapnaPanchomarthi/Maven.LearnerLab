package io.zipcoder.interfaces;


public class Person {

    protected   long id;
    private String name;

    public Person(long id, String name)

    {
        this.id=id;
        this.name=name;
    }

    public Person()
    {
        this(0,"");
    }



    public long getId()
    {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }







}
