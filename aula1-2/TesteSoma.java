class TesteSoma{
  public static void main(String[] args) {
    int i = 1;
    int soma = 0;

    while (i<=1000){
      soma += i;
      i++;
    }

    System.out.println("Valor total da soma: " + soma);
  }
}
