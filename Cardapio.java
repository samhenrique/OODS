
import java.util.ArrayList;
import java.util.Scanner;

public interface InterfaceCardapio {
  void addCardapio(ItemMenu item);
  void removerCardapio(ItemMenu item);
  void imprimeCardapio(ArrayList<ItemMenu> itens);
}

public class Cardapio implements InterfaceCardapio{
  Scanner scanner = new Scanner(System.in);
  private ArrayList<ItemMenu> itens = new ArrayList<>();

  
  public Cardapio(){
  }

  public void addCardapio(ItemMenu item){
    if(!(itens.contains(item))){
      itens.add(item); 
    }
    
  }

  public void removerCardapio(ItemMenu item){
    if(itens.contains(item)){
      itens.remove(item);
    }  
  }

  public void imprimeCardapio() {     
    System.out.print("Digite 1 para ver o cardapio de pratos e 2 para o cardapio de bebidas:\n ");
    int num = scanner.nextInt();
    

    if(num == 1){
      System.out.println("----- CARDAPIO PRATOS -----");
      for(int i =0;i<this.itens.size();i++){
        if(this.itens.get(i) instanceof Pratos){
           Pratos p = (Pratos) itens.get(i);
           System.out.println(this.itens.get(i).toString() + "\n");
        }       
      } 
    }
    else if(num == 2){
      System.out.println("----- CARDAPIO BEDIDAS -----");
      for(int i =0;i<this.itens.size();i++){
        if(this.itens.get(i) instanceof Bebida){
          Bebida b = (Bebida) itens.get(i);
          System.out.println(this.itens.get(i).toString() + "\n");
        }       
      } 
    }
    else{
      System.out.println("erro");
    }
  }
  
}