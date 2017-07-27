/**
 * Created by 민우 on 2017-07-13.
 */
public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // Layer
        int num=1;
        for (int i = 1; i <= height; i++){
            for (int j = 1; j < i+1; j++){
               if ((height+1)*height/2<10){
                   System.out.print(num + " ");
                   num++;
               }
               else if ((height+1)*height/2>10&&(height+1)*height/2<100){
                   if (num<10) {
                       System.out.print(" " + num + " ");
                       num++;
                   }
                   else if (10<=num&&num<100){
                       System.out.print(num + " ");
                       num++;
                   }
               }
               else {
                   if (num<10) {
                       System.out.print("  " + num + " ");
                       num++;
                   }
                   else if (10<=num&&num<100){
                       System.out.print(" " + num + " ");
                       num++;
                   }
                   else {
                       System.out.print(num + " ");
                       num ++;
                   }
               }
            }
            System.out.println();
        }
    }
}