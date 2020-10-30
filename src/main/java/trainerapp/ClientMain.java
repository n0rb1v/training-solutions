package trainerapp;

public class ClientMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.name = "John Doe";
        trainer.yearOfBirth = 1980;
        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Jack Doe";
    }
}
