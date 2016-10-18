class ex1{
  String nomeFuncionario;
  String departamentoFuncionario;
  double salarioFuncionario;
  String dataEntradaFuncionario;
  String rgFuncionario;

  public void CriaFuncionario(String nome, String depto, double salario, String dataEntrada, String rg){
    this.nomeFuncionario = nome;
    this.departamentoFuncionario = depto;
    this.salarioFuncionario = salario;
    this.dataEntradaFuncionario = dataEntrada;
    this.rgFuncionario = rg;
  }

  public void RecebeAumento(double valorAumentado){
    if (valorAumentado >= 0){
      this.salarioFuncionario += valorAumentado;
    }
  }

  public double CalculaGanhoAnual(){
    return this.salarioFuncionario * 12;
  }

  public void AdmiteFuncionario(){
  }

  public void DesligaFuncionario(){
  }

  public void DefineFerias(String dataInicio, String dataFim){
  }
}
