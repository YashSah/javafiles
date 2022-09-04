package Recursion;

//place tiles of size 1xm in a floor of size nxm
public class tiles {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically placed
        int verticalPlacements = placeTiles(n - m, m);

        // horizontally placed
        int horPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horPlacements;
    }

    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
