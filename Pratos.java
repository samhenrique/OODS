import java.util.ArrayList;

public interface InterfacePratos {

  public ArrayList<Ingrediente> getIngredientes();

  public void setIngredientes(Ingrediente ingrediente);

  public String getDescricao();

  public void setDescricao(String descricao);

  public void ImprimeIngredientes();

  public int getTempoPreparo();

  public void setTempoPreparo(int tempoPreparo);

}

public class Pratos extends ItemMenu implements InterfacePratos {

  private String descricao;
  private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
  private int tempoPreparo;

  public Pratos(String nome, String categoria, Double preco, String descricao, int tempoPreparo) {
    super(nome, categoria, preco);
    this.descricao = descricao;
    this.tempoPreparo = tempoPreparo;

  }

  public ArrayList<Ingrediente> getIngredientes() {
    return ingredientes;
  }

  public void setIngredientes(Ingrediente ingrediente) {
    ingredientes.add(ingrediente);
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void ImprimeIngredientes() {
    System.out.println("Ingredientes:\n");
    for (int i = 0; i < ingredientes.size(); i++) {
      System.out.println(ingredientes.get(i).getNome());
    }
  }

  public int getTempoPreparo() {
    return tempoPreparo;
  }

  public void setTempoPreparo(int tempoPreparo) {
    this.tempoPreparo = tempoPreparo;
  }

  public String toString() {
    return "Nome: " + this.nome + "\nPreço: R$" + this.preco + "\nDescrição: " + this.descricao;
  }

}