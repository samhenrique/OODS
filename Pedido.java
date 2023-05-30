
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface InterfaceItemPedido {
public void addPedido(ItemMenu item, Map<Bebida, Integer> hashMapBebidas, Map<Ingrediente, Integer> hashMapIngredientes);
public void getPedido();
public Double getValorTotal();
public int getTempoTotal();
}

public class Pedido implements InterfaceItemPedido{

  private int numMesa;
  private ArrayList<ItemMenu> pedidos = new ArrayList<>();
  private Double valorTotal = 0.0;
  private int tempoTotal = 0;
  
  public Pedido(int numMesa) {
    this.numMesa = numMesa;
  }

  public int getNumMesa() {
    return numMesa;
  }

public void addPedido(ItemMenu item, Map<Bebida, Integer> hashMapBebidas, Map<Ingrediente, Integer> hashMapIngredientes) {
    try {
        if (item instanceof Bebida) {
            Bebida b = (Bebida) item;
            if(hashMapBebidas.containsKey(b) && hashMapBebidas.get(b)>0){
                int quantidade = hashMapBebidas.get(b);
                hashMapBebidas.put(b, quantidade - 1);
                this.pedidos.add(b);
                valorTotal += b.getPreco();
            } else {
                throw new Exception("Bebida não disponível no estoque.");
            }
        } else {
            boolean todosDisponiveis = true;
            Pratos p = (Pratos) item;
            for(int i = 0;i<p.getIngredientes().size();i++){
                if(hashMapIngredientes.containsKey(p.getIngredientes().get(i)) && hashMapIngredientes.get(p.getIngredientes().get(i)) > 0){
                    int quantidade = hashMapIngredientes.get(p.getIngredientes().get(i));
                    hashMapIngredientes.put(p.getIngredientes().get(i), quantidade - 1);
                } else {
                    todosDisponiveis = false;
                    break;
                }
            }
            if(todosDisponiveis){
                valorTotal += p.getPreco();
                tempoTotal += p.getTempoPreparo();
                pedidos.add(p);
            } else {
                throw new Exception("Ingrediente não disponível no estoque.");
            }
        }
    } catch (Exception e) {
        System.out.println("Erro ao adicionar pedido: " + e.getMessage());
    }
}


  public void getPedido() {
    System.out.println("Mesa " + this.numMesa + "\n");
    for (int i = 0; i < pedidos.size(); i++) {
      System.out.println(pedidos.get(i).toString() + "\n");
    }
  }

  public Double getValorTotal(){
    return valorTotal;
  }

  public int getTempoTotal(){
    return tempoTotal;
  }
}
