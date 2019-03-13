package io.zipcoder.interfaces;


import java.util.ArrayList;
import java.util.List;


public abstract class People<E extends Person> {
    protected List<E> personList=new ArrayList<E>();
    private Long id;
    private String name;

   public People()
   {

   }
    public People(long id, String  name){
        this.id = id;
        this.name=name;
        personList= new ArrayList<E>();
    }
    public void add(E person){
           // personList=new ArrayList<Person>();
            personList.add(person);

    }

    public Person findById(long id){
       for(Person p : personList) {
           if(p.getId() == id) {
               return p;
           }
       }
       return null;
    }

    public void remove(Person person)
    {   if(personList!=null)
        personList.remove(person);
    }

    public int size()
    {
        return personList.size();
    }

    public abstract E[] getArray();




    public void removeAll(Person person)
    {
       personList.removeAll(personList);
    }

    public void clear()
    {
        personList.clear();
    }
}
