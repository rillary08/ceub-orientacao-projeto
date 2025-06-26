public abstract class veiculo {

  String modelo;
  int ano;

  public veiculo(String modelo, int ano){
    this.modelo = modelo;
    this.ano = ano;
  }

  public String getTipoCombustivel(){
    return "energia";
  }

//Método abstrato a ser implementado por uma subclasse
  abstract void Ligar();

  public void exibirIngormacoes(){
    System.out.println("Modelo"+ modelo + " | Ano:"+ ano);
  }





}
