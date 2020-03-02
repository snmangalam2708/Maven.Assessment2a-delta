package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;


/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterator<T> {

    private ArrayList<T> ageables;


    public Shelter() {

        this.ageables = new ArrayList<T>();

        if (this.ageables == null) {
            throw new NullPointerException();
        }
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

        int i = 0;
        for (i = 0; i < ageables.size(); i++) {
            if (ageables.get(i).equals(ageable)) {
                return i;
            }
        }
        return -1;
    }


























































    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {

    }
}