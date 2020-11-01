package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note=new Note();
        note.setName("Joco");
        note.setTopic("bugreport");
        note.setText("boot error");
        System.out.println(note.getNoteText());
    }
}
