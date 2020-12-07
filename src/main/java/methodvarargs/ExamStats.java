package methodvarargs;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("Rossz parameter");
        }
        int sum = 0;
        for (int item : results) {
            if (item > limitInPercent) {
                sum++;
            }
        }
        return sum;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("Rossz parameter");
        }
        for (int item : results) {
            if (item < limitInPercent) {
                return true;
            }
        }
        return false;
    }
}
