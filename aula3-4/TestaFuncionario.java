class Funcionario{
  private String nomeFuncionario;
  private String departamentoFuncionario;
  private double salarioFuncionario;
  private Data dataEntradaFuncionario;
  private String rgFuncionario;
  private int identificador;
  private static int proximoIdentificador; //static ficara como sendo uma variavel global. static só enxerga static!

  public String getNomeFuncionario(){
    return this.nomeFuncionario;
  }

  public String getDepartamentoFuncionario(){
    return this.departamentoFuncionario;
  }

  public double getSalarioFuncionario(){
    return this.salarioFuncionario;
  }

  public Data getDataEntradaFuncionario(){
    return this.dataEntradaFuncionario;
  }

  public String getRgFuncionario(){
    return this.rgFuncionario;
  }

  public int getIdentificador(){
    return this.identificador;
  }

  public Funcionario(String nome, String depto, double salario, Data dataEntrada, String rg){
    this.nomeFuncionario = nome;
    this.departamentoFuncionario = depto;
    this.salarioFuncionario = salario;
    this.rgFuncionario = rg;
    this.dataEntradaFuncionario = dataEntrada;
    proximoIdentificador++;
    this.identificador=proximoIdentificador;
  }

  public void setRecebeAumento(double valorAumentado){
    if (valorAumentado >= 0){
      this.salarioFuncionario += valorAumentado;
    }
  }

  public double getCalculaGanhoAnual(){
    return this.salarioFuncionario * 12;
  }

  public void getAtributosFuncionario(){
    System.out.println("\n");
    System.out.println("Dados do funcionario: ");
    System.out.println("Nome: " + this.nomeFuncionario);
    System.out.println("Departamento: " + this.departamentoFuncionario);
    System.out.println("Data de Admissao: " + this.dataEntradaFuncionario.devolveData());
    System.out.println("RG: " + this.rgFuncionario);
    System.out.println("Salario atual = " + this.salarioFuncionario);
    System.out.println("Ganho anual = " + this.getCalculaGanhoAnual());
  }
}
/*******************************//*******************************//*******************************/
class Data{
  int dia;
  int mes;
  int ano;

  public Data (int diaData, int mesData, int anoData){
    this.dia = diaData;
    this.mes = mesData;
    this.ano = anoData;
  }

  public String devolveData(){
    return this.dia+"/"+this.mes+"/"+this.ano;
  }
}

/******************************************************************************/
class Empresa{
  private String empresaNome;
  private String empresaCNPJ;
  private int qtdFuncionarios = 0;
  private Funcionario[] funcionariosDaEmpresa;

  public void setFuncionario(Funcionario f){
    this.funcionariosDaEmpresa[qtdFuncionarios] = f;
    this.qtdFuncionarios += 1;
  }

  public Funcionario getFuncionarioDaEmpresaPorNome(String nomeFunc){
    boolean r = false;
    int posR = 0;

    for (int i = 0; i < this.funcionariosDaEmpresa.length; i++) {
      if (nomeFunc == this.funcionariosDaEmpresa[i].getNomeFuncionario()){
        r = true;
        posR = i;
      }
    }

    if (r == true){
      return this.funcionariosDaEmpresa[posR];
    }
    else{
      return null;
    }
  }

  public String getEmpresaNome(){
    return this.empresaNome;
  }

  public String GetEmpresaCNPJ(){
    return this.empresaCNPJ;
  }

  public void getEmpregados(){
    for (int i = 0; i < this.qtdFuncionarios; i++){
      this.funcionariosDaEmpresa[i].getAtributosFuncionario();
    }
  }

  public boolean getContemFuncionario(Funcionario f){
    boolean r = false;
    for (int i = 0; i < this.funcionariosDaEmpresa.length; i++) {
      if (f == this.funcionariosDaEmpresa[i]){
        r = true;
        break;
      }
    }

    return r;
  }

  public Empresa(String nomeEmpresa, String CNPJ, Funcionario[] funcs){
    this.empresaNome = nomeEmpresa;
    this.empresaCNPJ = CNPJ;
    this.funcionariosDaEmpresa = funcs;
  }
}
/******************************************************************************/

/*******************************//*********************************************/
class TestaFuncionario{
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario("Lucas Guedes Vieira", "Juridico", 500, new Data(04,10,2016), "987654321");
    Funcionario f2 = new Funcionario("Mariana Guedes Vieira", "RH", 500.0, new Data(04,10,2016), "123456789");

    if (f1==f2){
      System.out.println("Funcionarios sao iguais!");
    }else{
      System.out.println("Funcionarios sao diferentes!");
    }

    f1.setRecebeAumento(100);
    f1.getAtributosFuncionario();
    f2.getAtributosFuncionario();

    System.out.println("Numero ID do(a) funcionario(a) " + f1.getNomeFuncionario() + ": " + f1.getIdentificador());
    System.out.println("Numero ID do(a) funcionario(a) " + f2.getNomeFuncionario() + ": " + f2.getIdentificador());
  }
}
/******************************************************************************/
class TestaEmpresa{
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario("Lucas Guedes Vieira", "Juridico", 500, new Data(04,10,2016), "987654321");
    Funcionario f2 = new Funcionario("Mariana Guedes Vieira", "RH", 500.0, new Data(04,10,2016), "123456789");

    Empresa e1 = new Empresa("Empresa Teste", "0123456789", new Funcionario[10]);
    //e1.funcionariosDaEmpresa = new Funcionario[10];

    e1.setFuncionario(f1);
    e1.setFuncionario(f2);

    /*e1.funcionariosDaEmpresa[0].mostraAtributosFuncionario();
    e1.funcionariosDaEmpresa[1].mostraAtributosFuncionario();*/

    e1.getEmpregados();
  }
}
