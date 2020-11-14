package arrayofarrays;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size) {
        int[][] numbers = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = (i+1) * (j+1);
            }
        }
        return numbers;
    }
    public void printTable(int[][] table){
        for (int i[] : table){
            for (int j : i){
                if (j<10) {System.out.print("  "+j);}
                else{
                    System.out.print(" "+j);
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ArrayOfArraysMain prog = new ArrayOfArraysMain();
        prog.printTable(prog.multiplicationTable(15));
    }
}
