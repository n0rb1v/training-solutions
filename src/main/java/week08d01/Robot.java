package week08d01;

public class Robot {

    public String move(String s,Point point) {
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            switch (p) {
                case 'F':
                    point.up();
                    break;
                case 'L':
                    point.down();
                    break;
                case 'B':
                    point.left();
                    break;
                case 'J':
                    point.right();
                    break;
                default:
                    throw new IllegalArgumentException("rossz parameter");

            }
        }

        return point.getX()+":"+ point.getY();
    }

}
