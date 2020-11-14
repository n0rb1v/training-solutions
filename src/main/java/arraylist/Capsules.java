package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private ArrayList<String> cso = new ArrayList<>();

    public void addLast(String s){
        cso.add(s);
    }

    public void addFirst(String s){
        cso.add(0,s);
    }

    public void removeLast(){
        cso.remove(cso.size()-1);
    }
    public void removeFirst(){
        cso.remove(0);
    }
    public List<String> getColors(){
        return cso;
    }

    public static void main(String[] args) {
        Capsules kaps = new Capsules();

        kaps.addLast("kek");
        kaps.addLast("piros");
        kaps.addLast("kek");
        kaps.addLast("zold");
        kaps.addLast("sarga");
        System.out.println(kaps.getColors());

        kaps.addFirst("zold");
        kaps.addLast("kek");
        System.out.println(kaps.getColors());

        kaps.removeFirst();
        kaps.removeLast();
        System.out.println(kaps.getColors());

    }
}
