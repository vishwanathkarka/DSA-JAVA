package Apnacollege;

public class methods {
    static String prime (int n){
	    for(int i =2; i<n/2;i++){
	        System.out.println(n+"%"+i);
	        if(n%i ==0){
	            return "not prime number";
	        }
	    }
	    return "prime number";
	}
	
    static int binaryToDecimal (int binNum){
      
        int pow = 0;
        int decNum = 0;
        while(binNum>0 ){
          int  lastValue = binNum%10;
            decNum += (lastValue *  Math.pow(2,pow));
            pow++; 
            binNum = binNum/10;
        }
        return decNum;
    }
 static int average (int a,int b,int c){
    return (a+b+c)/3;
 }

 static Boolean isEven(int num){
    if(num%2 == 0){
        return true;
    }
    return false;
 }

static void mathFuns(double a , double b) {
System.out.println("max value is "+Math.max(a,b));
System.out.println("min value  is "+Math.min(a,b));
System.out.println("square root " +Math.sqrt(a));
System.out.println("power"+ Math.pow(a,b));
// System.out.println("Average"+Math.avg(a,b));
System.out.println("Abs"+Math.abs(a));
}

 static int  isPalindrome (int num){
    int finalval =0 ;
    while(num >0){
int lastNum = num%10;
finalval = (finalval * 10) + lastNum;
num = num/10;
    }
    return finalval;
 }
	public static void main (String[] args) {
 
// System.out.println(prime(97));
// System.out.println(binaryToDecimal(111));
// System.out.println(average(2, 5, 7));
// System.out.println(isEven(7));
// System.out.println(isPalindrome(1012));
mathFuns(-4.5,5.0);
	}   
}
