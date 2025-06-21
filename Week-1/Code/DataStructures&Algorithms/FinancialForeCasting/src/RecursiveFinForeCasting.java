
// This is less optimized than Iterative Approach.
public class RecursiveFinForeCasting {

    double presentValue;
    double rate;


    public RecursiveFinForeCasting(double presentValue, double rate){
        this.presentValue=presentValue;
        this.rate=rate;

    }
    public double predictFutureValue(int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }
        // Recursive case
        return predictFutureValue( years - 1) * (1 + rate);
    }
}
