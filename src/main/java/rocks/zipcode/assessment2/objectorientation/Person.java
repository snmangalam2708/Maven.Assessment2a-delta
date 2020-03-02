package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    private Long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public Person() {

        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();

    }

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Address getAddress() {

        return this.address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return id.equals(person.id) && name.equals(person.name) && address.equals(person.address);
//        && address.equals(address.getAddressLine1()) && address.equals(person.address.getAddressLine2()) &&
//                address.equals(person.address.getCity()) && address.equals(person.address.getState()) &&
//                address.equals(person.address.getZipcode());
    }

    @Override
    public String toString() {

        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address + '}';
    }

}