
// This is more optimized than Recursive Approach.
public class IterativeFinForeCasting {
    double presentValue;
    double rate;


    public IterativeFinForeCasting(double presentValue, double rate){
        this.presentValue=presentValue;
        this.rate=rate;

    }

    public double predictFutureValue(int years){
        double predictedFutureValue=presentValue;
        for(int i=1;i<=years;i++){
            predictedFutureValue*=(1+rate);
        }
        return predictedFutureValue;
    }
}
