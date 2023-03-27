package important;

public class duplicate {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 4, 5 };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("duplicate value is=" + a[i]);
            }
            count = 0;
        }
    }
}
