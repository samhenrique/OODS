public interface ItemMenuInterface{
  public String getNome();
  public void setNome(String nome);
  public String getCategoria();
  public void setCategoria(String categoria);
  public Double getPreco();
  public void setPreco(Double preco);
  public String toString();
}

public class ItemMenu implements ItemMenuInterface{
  protected String nome;
  protected String categoria;
  protected Double preco;

  public ItemMenu(String nome, String categoria, Double preco){
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
  }
  
  public String getNome() {
  	return nome;
  }
  public void setNome(String nome) {
  	this.nome = nome;
  }
  public String getCategoria() {
  	return categoria;
  }
  public void setCategoria(String categoria) {
  	this.categoria = categoria;
  }
  public Double getPreco() {
  	return preco;
  }
  public void setPreco(Double preco) {
  	this.preco = preco;
  }
  
  public String toString() {  
	 return "Nome: " + this.nome + "\nPreço: R$" + this.preco;
  }
}

