package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {
        private List<Pet> pets = new ArrayList<>();

        public List<Pet> getPets(){
            return pets;
        }
        private boolean areEquals(Pet pet1,Pet pet2){
            return pet1.getRegSzam().equals(pet2.getRegSzam());
        }
        public void add(Pet pet){
            for (Pet pet1 : pets){
                if (areEquals(pet1,pet)){
                    return;
                }
            }
            pets.add(pet);
        }
}
