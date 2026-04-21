class A_reverse{
 public static void main(String[] args){

  int num = 123;
  int rem, reverse = 0;

  do{
   rem = num % 10;
   reverse = reverse * 10 + rem;
   num = num / 10;

  }while(num != 0);

  System.out.println("Reverse = " + reverse);

 }
}