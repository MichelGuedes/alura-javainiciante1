class BalancoTrimestral{
  public static void main (String[] args){
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;

    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    float mediaMensal = gastosTrimestre / 3;

    System.out.println("Valor total dos gastos do trimestre: " + gastosTrimestre);
    System.out.println("Media de gastos por mes: " + mediaMensal);
  }
}
