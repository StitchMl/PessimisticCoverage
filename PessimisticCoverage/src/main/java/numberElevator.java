public class numberElevator {
    public static Integer power(Integer number, Integer x) {
        if (x == 0){
            return 1;
        }
        int n = number;
        for (int i = 1; i < x; i++){
            n = number * n;
        }
        return n;
    }
}