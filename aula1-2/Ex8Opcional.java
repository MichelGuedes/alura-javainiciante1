class Ex8Opcional{
  public static void main(String[] args) {
    int x = 13;

    while (x != 1){

      //se x for par
      if (x%2==0){
        x = x/2;
      }
      //se x for impar
      else{
        x = 3*x+1;
      }

      if (x!=1){
        System.out.print(x+">");
      }
      else{
        System.out.println(x);
      }
    }

    System.out.println("Fim de processamento.");
  }
}
