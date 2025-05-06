//Half Pyramid
public class patterns3 {
    public static void main(String[] args) {
        int n = 4;
        
        
       
        //outer loop
        for(int i=0; i<=n; i++){
            int count = 1;
            for(int j=0; j<=i; j++){
                System.out.print(count);
                count = count*(i-j)/(j+1);
            }
            System.out.println();
            }
          

        }
    }
    

