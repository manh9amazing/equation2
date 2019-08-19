public class Equation2 {
    float a, b, c;
    float x1, x2;
    int numberOfSolution;
    //mau xam la chua dung den
    Equation2(float a, float b, float c) {
        this.a = a;//thuoc tinh cua class
        this.b = b;
        this.c = c;
    }

   void execute(){
       System.out.println("tinh nghiem");
       if (a == 0) {
           if (b == 0){
               if (c != 0){
                   numberOfSolution = 0;
                   System.out.println("phuong trinh vo nghiem");
               }
               else {
                   System.out.println("phuong tirnh vo so nghiem");
               }
           }
           else {
               numberOfSolution = 1;
               x1 = -c/b;
               //neu an return o day thi se ra ngoai ham
               System.out.println("phuong trinh co 1 ngiem" + x1);

           }
       }
       else {
           double delta;
           delta = b*b - 4*a*c;
           if (delta < 0){
               System.out.println("phuong trinh vo nghiem");
           }
           else if (delta == 0){
               x1 = -b/(2*a);// java co the viet lien tiep x1 = x2 = 222
               System.out.println("phuong trinh co nghiem kep la " + x1);
           }
           else{
               x1 = (-b + (float) Math.sqrt(delta))/(2*a);//(float) de ep kieu du lieu
               x2 = (-b - (float) Math.sqrt(delta))/(2*a);
               //ta co the dung vi-et de nhanh hon
               System.out.println("phuong trinh co 2 nghiem ");
               System.out.println("nghiem 1 la " + x1);
               System.out.println("nghiem 2 la " + x2);
           }
       }

// void printSolution(){
//       switch (numberOfSolution){
//           case 0://truong hop = 0
//               System.out.println("so nghiem la " + numberOfSolution);
//               System.out.println("nghiem la" + x1);

//mau xam tuc la chua duoc goi
   }
}
