//// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//// DEFINE ANY CLASS AND METHOD NEEDED
//import java.util.*;
//// CLASS BEGINS, THIS CLASS IS REQUIRED
//// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//// DEFINE ANY CLASS AND METHOD NEEDED
//import java.util.*;
//// CLASS BEGINS, THIS CLASS IS REQUIRED
//public class Solution
//{
//    private static final int SERVER = 1;
//    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//
//    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
//    int minimumHours(int rows, int columns, List<List<Integer> > grid)
//    {
//
//        int people = 0;
//        Queue<Point> server = new ArrayDeque<>();
//        for (int r = 0; r < grid.size(); r++) {
//            for (int c = 0; c < grid.get(0).size(); c++) {
//                if (grid.get(r).get(c) == SERVER) {
//                    zombies.add(new Point(r, c));
//                } else {
//                    people++;
//                }
//            }
//        }
//        if (people == 0) return 0;
//        for (int hours = 1; !zombies.isEmpty(); hours++) {
//            for (int sz = zombies.size(); sz > 0; sz--) {
//                Point zombie = zombies.poll();
//                for (int[] dir : DIRS) {
//                    int r = zombie.r + dir[0];
//                    int c = zombie.c + dir[1];
//                    if (isServer(grid, r, c)) {
//                        people--;
//                        if (people == 0) return hours;
//                        grid.get(r).set(c, SERVER);
//                        zombies.add(new Point(r, c));
//                    }
//                }
//            }
//        }
//        return -1;
//
//
//
//
//    }
//    // METHOD SIGNATURE ENDS
//    private boolean isServer(List<List<Integer>> grid, int r, int c) {
//        return r >= 0 && r < grid.size() &&c >= 0 && c < grid.get(0).size() && grid.get(r).get(c) != SERVER;
//    }
//    private static class Point {
//        int r, c;
//        Point(int r, int c) {
//            this.r = r;
//            this.c = c;
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}