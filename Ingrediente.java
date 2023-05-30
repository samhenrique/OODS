public interface IngredienteInterface {
    public String getNome();
    public void setNome(String nome);
    public String getDataValidade();
    public void setDataValidade(String dataValidade);
}

public class Ingrediente implements IngredienteInterface{
  private String nome;
  private String dataValidade;

  public Ingrediente(String nome, String dataValidade) {
    this.nome = nome;
    this.dataValidade = dataValidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  public String toString() {
    return "Nome: " + this.nome;
  }
}