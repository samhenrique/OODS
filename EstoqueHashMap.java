import java.util.HashMap;
import java.util.Map;

public interface InterfaceEstoque {
public void adicionarBebida(Bebida bebida, int quantidade);
public void adicionarIngrediente(Ingrediente ingrediente, int quantidade);
public int getQuantidadeBebida(Bebida bebida);
public int getQuantidadeIngrediente(Ingrediente ingrediente);
}

public class EstoqueHashMap implements InterfaceEstoque{
  public HashMap<Bebida, Integer> estoque;
  public HashMap<Ingrediente, Integer> estoqueIngrediente;

  public EstoqueHashMap() {
    this.estoque = new HashMap<Bebida, Integer>();
    this.estoqueIngrediente = new HashMap<Ingrediente, Integer>();
    
  }

  public HashMap<Bebida, Integer> getEstoque() {
    return estoque;
  }

  public HashMap<Ingrediente, Integer> getEstoqueIngredientes() {
    return estoqueIngrediente;
  }

  public void adicionarBebida(Bebida bebida, int quantidade) {
    if (this.estoque.containsKey(bebida)) {
      quantidade += this.estoque.get(bebida);
    }
    this.estoque.put(bebida, quantidade);
  }

  public void adicionarIngrediente(Ingrediente ingrediente, int quantidade) {
    if (this.estoque.containsKey(ingrediente)) {
      quantidade += this.estoqueIngrediente.get(ingrediente);
    }
    this.estoqueIngrediente.put(ingrediente, quantidade);
  }

  public int getQuantidadeBebida(Bebida bebida) {
    return this.estoque.getOrDefault(bebida, 0);
  }

  public static <Bebida, Integer> void getQuantidadeBebidaTotal(Map<Bebida, Integer> map) {
    for (Map.Entry<Bebida, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "\n Quantidade: " + entry.getValue());
    }
  }

  public int getQuantidadeIngrediente(Ingrediente ingrediente) {
    return this.estoqueIngrediente.getOrDefault(ingrediente, 0);
  }

  public static <Ingrediente, Integer> void getQuantidadeIngredienteTotal(Map<Ingrediente, Integer> map) {
    for (Map.Entry<Ingrediente, Integer> entry : map.entrySet()) {

      System.out.println(entry.getKey() + "\nQuantidade: " + entry.getValue() + "\n");
    }
  }
  
}
