package typeconversion.dataloss;

public class DataLoss {
    public void dataLoss() {
        long orig = 0;
        for (long count = 0; count < 3;) {
            long convert = (long) (float) orig;
            if (orig != convert) {
                System.out.println("orig:"+orig);
                System.out.println("convert:"+convert);
                count++;
            }
            orig++;
        }
    }

    public static void main(String[] args) {
        DataLoss dl = new DataLoss();
        dl.dataLoss();
    }
}
