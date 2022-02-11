import java.util.ArrayList;
import java.util.List;
public class PythagoreanTriplet{
    private int a,b,c;
    private static List<PythagoreanTriplet> tripletList = new ArrayList<>();
    private static final PythagoreanTriplet instance = new PythagoreanTriplet();
    private static int N;
    public PythagoreanTriplet() {
    }
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        tripletList = new ArrayList<>();
        return instance;
    }
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit) {
        return instance;
    }
    public static PythagoreanTriplet thatSumTo(int sum) {
        N = sum;
        return instance;
    }
    public static List<PythagoreanTriplet> build() {
        for (int i = 1; i <= N/3; i++) {
            for (int j = i; j <= (N-i)/2; j++) {
                if (Math.pow(i,2) + Math.pow(j,2) == Math.pow(N-i-j,2)) {
                    tripletList.add(new PythagoreanTriplet(i,j,N-i-j));
                }
            }
        }
        return tripletList;
    }
    @Override
    public boolean equals(Object other) {
        if (! (other instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet triplet = (PythagoreanTriplet) other;
        return (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }
}