class Fatorial{
  public static void main(String[] args) {
    for (long i=1; i<=30; i++) {
      long j = 1;
      long f = 1;

      while (j <= i){
        f = f*j;
        j++;
      }

      System.out.println("Fatorial de " + i + ": " + f);
    }
  }
}
