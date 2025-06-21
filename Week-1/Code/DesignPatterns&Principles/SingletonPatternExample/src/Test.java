public class Test {
    public static void main(String[] args) {

        // EagerSingleton

       EagerLogger log1= EagerLogger.getInstance();
       EagerLogger log2= EagerLogger.getInstance();

//       Methods to check both log1 and log2 are pointing to same object.
//        M-1.
        if(log1==log2) System.out.println("Equal");
        else System.out.println("Unequal");
//        M-2.
        System.out.println(log1.hashCode());
        System.out.println(log2.hashCode());
//        M-3.
        System.out.println(System.identityHashCode(log1));
        System.out.println(System.identityHashCode(log2));

        //LazySingleton

        LazyLogger log3= LazyLogger.getInstance();
        LazyLogger log4= LazyLogger.getInstance();

//        M-1.
        if(log3==log4) System.out.println("Equal");
        else System.out.println("Unequal");
//        M-2.
        System.out.println(log3.hashCode());
        System.out.println(log4.hashCode());
//        M-3.
        System.out.println(System.identityHashCode(log3));
        System.out.println(System.identityHashCode(log4));

        // SynchronisedSingleton

        SynchronisedLogger log5= SynchronisedLogger.getInstance();
        SynchronisedLogger log6= SynchronisedLogger.getInstance();


//        M-1.
        if(log5==log6) System.out.println("Equal");
        else System.out.println("Unequal");
//        M-2.
        System.out.println(log5.hashCode());
        System.out.println(log6.hashCode());
//        M-3.
        System.out.println(System.identityHashCode(log5));
        System.out.println(System.identityHashCode(log6));

//             DCLSingleton


        DCLLogger log7= DCLLogger.getInstance();
        DCLLogger log8= DCLLogger.getInstance();

//        M-1.
        if(log7==log8) System.out.println("Equal");
        else System.out.println("Unequal");
//        M-2.
        System.out.println(log7.hashCode());
        System.out.println(log8.hashCode());
//        M-3.
        System.out.println(System.identityHashCode(log7));
        System.out.println(System.identityHashCode(log8));

    }

}