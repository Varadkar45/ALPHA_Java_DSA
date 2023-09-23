/*Question 2
Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
"WNEENESENNN"
*/
public class shortestpath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;// intializing the coordinates as x,y = 0,0
        for(int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);

            if(dir == 'S') {
                y--;
            }
            else if(dir == 'N') {
                y++;
            }
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2); //typecasted to float & applied formula of displacement i.e = ((x2-x1)^2+(y2-y1)^2)^1/2
    }
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        String path2 = "NS";
        System.out.println(getShortestPath(path));
        System.out.println(getShortestPath(path2));
    }
}
