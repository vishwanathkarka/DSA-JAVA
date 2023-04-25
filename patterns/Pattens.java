public class Pattens {
static void patten1(){
    for(int i =0; i<5;i++){
        for(int j =0; j<5;j++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}

//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

static  void patten2(){
    for(int i =0; i<5; i++){
        for(int j =0; j<i; j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}

//        *
//        * *
//        * * *
//        * * * *
static void patten3(){
    for(int i =1; i<=5; i++){
        for(int j =1; j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

    static void patten4(){
        for(int i =0; i<=5; i++){
            for(int j =1; j<=5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
static void patten5(){
    for(int i =1; i<=5; i++){
        for(int j =1; j<=5-i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
//        1 2 3 4
//        1 2 3
//        1 2
//        1
static void patten6(){
    for(int i =0; i<5; i++){
       for(int j =0; j<5-i-1;j++){
           System.out.print(" ");
       }
for(int j =0; j<i*2+1; j++){
    System.out.print("*");
}
        for(int j =0; j<5-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}

//            *
//            ***
//            *****
//            *******
//            *********

    static void patten7() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*5 - (2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

//           *********
//            *******
//             *****
//              ***
//               *

static void patten8(int n){
    int start = 1;
  for(int i =0; i<n; i++){
      if(i%2==0)start= 1;
      else start =0;
      for(int j =0; j<=i;j++){
          System.out.print(start+" ");
          start = 1-start;
      }
      System.out.println();
  }
}

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
static void  patten9(int n){
    int space = 2* (n-1);
   for(int i =0; i<n;i++){
       //number
       for(int j =1; j<=i;j++){
           System.out.print(j);
       }
       //space
       for(int j =1; j<=space;j++){
           System.out.print(" ");
       }
//number
       for(int j =i; j>=1;j--){
           System.out.print(j);
       }
       space -=2;
       System.out.println();

   }
}
//        1      1
//        12    21
//        123  321
//        12344321

    static void patten10(int n){
        int count =1;
    for(int i =0; i<n; i++){

        for(int j =0; j<=i; j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
    }
    //            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15

    static  void patten11(int n){
    for(int i =0; i<n; i++){
        for(char  ch = 'A';ch<= (char)'A'+i;ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}
//    A
//    AB
//    ABC
//    ABCD
//    ABCDE
static  void patten12(int n){
    for(int i =0; i<n; i++){
        for(char ch = 'A'; ch<='A'+(n-i-1);ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}

//    ABCDE
//    ABCD
//    ABC
//    AB
//    A
    static void patten13(int n){
    for(int i =0; i<n; i++){
        char letter = (char)('A'+i);
        for(int j =0; j<=i;j++){
            System.out.print(letter);
        }
        System.out.println();
    }
    }
//    A
//    BB
//    CCC
//    DDDD
//    EEEEE

    static void patten14(){
        for(int i =0; i<5; i++){
            //spacing
            for(int j =0; j<5-i-1;j++){
                System.out.print(" ");
            }
            //letters
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j =0; j<i*2+1; j++){
                System.out.print(ch);
if(j<=breakPoint)ch++;
else ch--;
            }
            //spacing
            for(int j =0; j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
//    A
//    ABC
//    ABCDC
//    ABCDEDC
//    ABCDEFEDC

    static  void patten15(int n){

//letter
for(int i =0; i<n;i++){
    for(char j = (char)('E'-i); j<='E';j++){
        System.out.print(j);
    }
    System.out.println();
}
    }

//    E
//    DE
//    CDE
//    BCDE
//    ABCDE
static void patten16(int n) {
    //starts
    int space =0;
    for (int i = 0; i < n; i++) {
       for(int j =0; j<n-i; j++){
           System.out.print("*");
       }
       for(int j =0; j<space; j++){
           System.out.print(" ");

       }
       for(int j =0; j<n-i;j++){
           System.out.print("*");
       }
        space+=2;
        System.out.println();
    }
    int space1 = 8;
    for(int i =0; i<n;i++){

        for(int j =0; j<=i; j++){
            System.out.print("*");
        }

        for(int j =0; j<space1; j++){
            System.out.print(" ");
        }
        for(int j =0; j<=i; j++){
            System.out.print("*");
        }
        space1= space1-2;
        System.out.println();
    }
    //
}

//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

    static void patten17(int n ){
int space =2*n-2;
    for(int i =1; i<=2*n-1; i++){
        int star = i;
        if(i>n) star = 2*n-i;
        for(int j =1; j<=star ; j++){
            System.out.print("*");
        }
        for(int j =1; j<=space; j++){
            System.out.print(" ");
        }
        for(int j =1; j<=star ; j++){
            System.out.print("*");
        }
        System.out.println();
        if(i<n) space -=2;
        else space +=2;
    }
    }

//            *        *
//            **      **
//            ***    ***
//            ****  ****
//            **********
//            ****  ****
//            ***    ***
//            **      **
//            *        *

    static void patten18(int n){
    for(int i =0; i<n; i++){
        for(int j =0; j<n; j++){
            if(i==0||j==n-1||i==n-1||j==0){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
//            *****
//            *   *
//            *   *
//            *   *
//            *****

    public static  void main(String[] args){
        patten18(5);
    }
}
