public class numberElevator {
    public static Integer power(Integer number, Integer x) {
        if (number == null || x == null || x < 0) {
            return null;
        }
        int n = 1;
        for (int i = 0; i < x; i++) {
            n *= number;
        }
        return n;
    }
}