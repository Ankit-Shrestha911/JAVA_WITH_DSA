import java.util.*;

public class ShortestPath {

    public static int getShortestPath(String path) {
        if (path.length() == 1)
            return 1;
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int direction = path.charAt(i);
            if (direction == 'S')
                y--;
            else if (direction == 'N')
                y++;
            else if (direction == 'W')
                x--;
            else
                x++;
        }

        int answer = (x*x)+(y*y);
        
        return (int)Math.sqrt(answer);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

        System.out.println(path.contains("EE"));

    }
}