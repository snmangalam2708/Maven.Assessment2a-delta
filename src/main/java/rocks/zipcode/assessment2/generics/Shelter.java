package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {

    private ArrayList<T> ageables;


    public Shelter() {

        this.ageables = new ArrayList<T> ();
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return ageables.size();

    }

    public void add(Object object) {

        ageables.add((T) object);
    }

    public Boolean contains(Object object) {

        return ageables.contains(object);
    }

    public void remove(Object object) {

        ageables.remove(object);
    }

    public Object get(Integer index) {

        return ageables.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        for (int i = 0; i < ageables.size(); i++) {
            if(ageables.get(i).equals(ageable)){
                return i;
            }
        }
        return -1;
    }
}