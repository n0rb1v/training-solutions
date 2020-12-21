package week08d04;

public class Trainer {
    CanMark cmark;

    public Trainer(CanMark cmark) {
        this.cmark = cmark;
    }

    public int giveMark(){
        return cmark.giveMark();
    }

    public static void main(String[] args) {
        Trainer tr1 = new Trainer(new GoodMood());
        Trainer tr2 = new Trainer(new BadMood());

        System.out.println(tr1.giveMark());
        System.out.println(tr2.giveMark());

    }
}
