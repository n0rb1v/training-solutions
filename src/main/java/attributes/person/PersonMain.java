package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1= new Person("Joe","ABC123");
        Address cim1=new Address("HU","BP","gorkij","1183");

        person1.moveTo(cim1);
        System.out.println(person1.personToString()+" / "+person1.getCim().addressToString());

    }
}
