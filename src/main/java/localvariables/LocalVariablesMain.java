package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b=false;
        int a=2;
        int i=3;int j=4;
        int k=i;
        String s="HelloWorld";
        String t=s;
        {
            int x=0;
            System.out.println(x);
            System.out.println(a);
        }
        System.out.println(b);
    }
}
