public class ForLoop
 {
     public static void main(String[] args) {
         for (int i = 0; i < 10; i++){
             System.out.print(i);
         }

         for (int i=0; i < 10; i=i+4){
             System.out.println(i);
         }

         for (int i = 1; i < 5; i++){
             System.out.print(i);

             for (int j = 0; j < 5; j++){
                 System.out.print(j);
             }

         }
     }
}
