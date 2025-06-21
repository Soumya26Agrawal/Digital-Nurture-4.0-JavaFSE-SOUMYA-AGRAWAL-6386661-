public class BinarySearchService {
    public static void binarySearchByProductName(Product[] products, String target){

        int s=0;
        int e=products.length-1;
       int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int compareValue=products[mid].productName.compareToIgnoreCase(target);
            if(compareValue==0){
                ans=mid;
                System.out.println("Product with name "+ target+" exists at index "+ans);
                break;
            }
            else if(compareValue<0) s=mid+1;
            else e=mid-1;
        }
        if(ans==-1){
            System.out.println("Product with name "+target+" does not exist");
        }

    }
    public static void binarySearchByProductId(Product[] products, int target){

        int s=0;
        int e=products.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int id=products[mid].productId;
            if(id==target){
                ans=mid;
                System.out.println("Product with id "+target+" exists at index "+ans );
                break;
            }
            else if(id>target) e=mid-1;
            else s=mid+1;
        }
        if(ans==-1){
            System.out.println("Product with id "+target+" does not exist");
        }

    }
}
