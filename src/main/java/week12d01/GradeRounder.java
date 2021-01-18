package week12d01;

public class GradeRounder {
    public int[] roundGrades(int[] grades) {
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 40) {
                int k = 5 - (grades[i] % 5);
                if (k<3){
                    result[i] = grades[i] + k;
                }else{
                    result[i] = grades[i];
                }
            }else{
                result[i] = grades[i];
            }
        }
        return result;
    }
}
