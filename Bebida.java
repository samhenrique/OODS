public interface InterfaceItemBebida {
  int getVolume();
  String getDataValidade();
}

public class Bebida extends ItemMenu implements InterfaceItemBebida{
  private int volume;
  private String dataValidade;

  public Bebida(String nome, String categoria, Double preco, int volume, String dataValidade) {
    super(nome, categoria, preco);
    this.volume = volume;
    this.dataValidade = dataValidade;
  }

  public int getVolume() {
    return volume;
  }

  public String getDataValidade() {
    return dataValidade;
  }

  public String toString() {
    return "Nome: " + this.nome + "\nPreço: R$" + this.preco + "\nVolume: " + this.volume + "ml";
  }

}