package model.contract;

public interface IPessoa {
    // Contrato: quem implementar a classe IPessoa é OBRIGATORIO que implemente getNome, getPeso e getAltura
    String getNome();
    double getPeso();
    double getAltura();
}
