package Arrays;

public class majorityElement {
    static boolean isMajority(int a[], int size, int candidate) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == candidate) {
                counter++;
            }
        }
        return (counter > size / 2);
    }

    static int majority(int a[], int size) {
        int candidate = -1;
        int votes = 0;
        for (int i = 0; i < size; i++) {
            if (votes == 0) {
                candidate = a[i];
                votes = 1;
            } else {
                if (a[i] == candidate) {
                    votes++;
                } else {
                    votes--;
                }
            }
        }
        return (isMajority(a, size, candidate)) ? candidate : -1;
    }

    public static void main(String argsp[]) {
        int a[] = { 3, 2, 2, 3, 2 };
        int ans = majority(a, 5);
        System.out.println(ans);
    }
}
