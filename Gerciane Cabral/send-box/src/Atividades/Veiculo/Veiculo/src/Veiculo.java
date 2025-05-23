public class Veiculo {
    private String placa; // modificador (public, private) - tipo - nome
    private String marca;
    private int ano;
    private int qtdPorta;
    
    // 2- Criar um construtor 
    
    public Veiculo (String placa, String marca, int ano, int qtdPorta){
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.qtdPorta = qtdPorta;
    
    }
    // 3- Criar métodos
    
    // Get - pega a informação
    
    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }
    public int getQtdPorta(){
        return qtdPorta;
    
    }
    
    // Set - muda o atributo
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setQtdPorta(int qtdPorta){
        this.qtdPorta = qtdPorta;
    }
    
    // Pegar informações
    
    public void ExibirInformacoes(){
        System.out.println("Placa: "+ getPlaca() + "\nMarca: "+ getMarca());
    }
}
