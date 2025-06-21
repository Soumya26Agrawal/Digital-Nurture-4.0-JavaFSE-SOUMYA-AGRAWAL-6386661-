
public class Main {
    public static void main(String[] args) {

        // Recursive Approach
        RecursiveFinForeCasting f1= new RecursiveFinForeCasting(1000.0, 0.10);
        long startRecursive = System.nanoTime();
        double predictedFutureValue1=f1.predictFutureValue(10);
        long endRecursive = System.nanoTime();
        long timeDiffRecursive=(endRecursive-startRecursive);
        System.out.println("PresentValue "+f1.presentValue);
        System.out.println("Rate "+f1.rate);
        System.out.println("Predicted Future Value "+predictedFutureValue1);
        System.out.println("Time taken by Recursive Approach "+timeDiffRecursive);

        // Iterative Approach
        IterativeFinForeCasting f2= new IterativeFinForeCasting(1000.0, 0.10);
        long startIterative = System.nanoTime();
        double predictedFutureValue2=f2.predictFutureValue(10);
        long endIterative = System.nanoTime();
        long timeDiffIterative=(endIterative-startIterative);
        System.out.println("PresentValue "+f1.presentValue);
        System.out.println("Rate "+f1.rate);
        System.out.println("Predicted Future Value "+predictedFutureValue2);
        System.out.println("Time taken by Iterative Approach "+timeDiffIterative);

//       if(timeDiffIterative<timeDiffRecursive) System.out.println("Iterative Approach is faster");
//       else System.out.println("Recursive Approach is faster");
    }
}