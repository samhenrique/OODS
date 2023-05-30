import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // implementação dos estoques de bebida e ingredientes dos pratos, e do
    // cardápio;
    EstoqueHashMap estoqueBebidas = new EstoqueHashMap();
    EstoqueHashMap estoqueIngredientes = new EstoqueHashMap();
    Cardapio cardapio = new Cardapio();
    Banco banco = new Banco();
    banco.BancoEstoque(estoqueBebidas, estoqueIngredientes); // adiciona os ingredientes no estoque
    banco.BancoCardapio(cardapio);

    Pratos parmegiana = new Pratos("parmegiana", "prato principal", 29.99,
        "carne empanada com mararrão e queijo, ao molho de tomate", 12);

    parmegiana.setIngredientes(banco.tomate());
    parmegiana.setIngredientes(banco.macarrao());
    parmegiana.setIngredientes(banco.carneBovina());
    parmegiana.setIngredientes(banco.queijo());

    Pratos pratoFeito = new Pratos("prato feito", "acompanhamento", 8.50,
        "arroz branco e feijão temperado com carne de boi", 20);
    pratoFeito.setIngredientes(banco.arroz());
    pratoFeito.setIngredientes(banco.feijao());
    pratoFeito.setIngredientes(banco.carneBovina());

    Pratos omelete = new Pratos("omelete", "prato principal", 12.99,
        "omelete de queijo com tomate, acompanhado de pão e manteiga", 8);
    omelete.setIngredientes(banco.ovos());
    omelete.setIngredientes(banco.queijo());
    omelete.setIngredientes(banco.tomate());
    omelete.setIngredientes(banco.pao());
    omelete.setIngredientes(banco.manteiga());

    Pratos legumesAssados = new Pratos("legumes assados", "acompanhamento", 15.99,
        "cenoura, batata, abobrinha e couve assados com alho e azeite", 6);
    legumesAssados.setIngredientes(banco.cenoura());
    legumesAssados.setIngredientes(banco.batata());
    legumesAssados.setIngredientes(banco.abobrinha());
    legumesAssados.setIngredientes(banco.alho());

    Pratos lasanhaBolonhesa = new Pratos("lasanha à bolonhesa", "prato principal", 35.00,
        "massa de lasanha com molho bolonhesa e queijo gratinado", 10);
    lasanhaBolonhesa.setIngredientes(banco.macarrao());
    lasanhaBolonhesa.setIngredientes(banco.carneBovina());
    lasanhaBolonhesa.setIngredientes(banco.queijo());

    Pratos saladaTomateQueijo = new Pratos("Salada de Tomate com Queijo", "entrada", 12.99,
        "salada de tomate e queijo com tempero de alho e cebola", 6);
    saladaTomateQueijo.setIngredientes(banco.tomate());
    saladaTomateQueijo.setIngredientes(banco.queijo());
    saladaTomateQueijo.setIngredientes(banco.alho());
    saladaTomateQueijo.setIngredientes(banco.cebola());

    Pratos acaiDaCasa = new Pratos("acai da casa", "sobremesa", 14.0, "açai com leite, leite condensado e granola", 10);
    acaiDaCasa.setIngredientes(banco.leite());
    acaiDaCasa.setIngredientes(banco.leiteCondensado());
    acaiDaCasa.setIngredientes(banco.granola());
    acaiDaCasa.setIngredientes(banco.acai());

    Pratos galeto = new Pratos("galeto com acompanhamentos", "prato principal", 45.0,
        "galeto assado, com arroz e feijao com batatas", 20);
    galeto.setIngredientes(banco.frango());
    galeto.setIngredientes(banco.arroz());
    galeto.setIngredientes(banco.feijao());
    galeto.setIngredientes(banco.batata());

    Pratos sopaDePeixe = new Pratos("sopa", "prato principal", 30.0, "sopa de peixe com legumes", 20);
    sopaDePeixe.setIngredientes(banco.peixe());
    sopaDePeixe.setIngredientes(banco.tomate());
    sopaDePeixe.setIngredientes(banco.macarrao());
    sopaDePeixe.setIngredientes(banco.arroz());
    sopaDePeixe.setIngredientes(banco.abobrinha());

    // adição dos itens ao cardapio

    cardapio.addCardapio(parmegiana);
    cardapio.addCardapio(pratoFeito);
    cardapio.addCardapio(omelete);
    cardapio.addCardapio(legumesAssados);
    cardapio.addCardapio(lasanhaBolonhesa);
    cardapio.addCardapio(saladaTomateQueijo);
    cardapio.addCardapio(acaiDaCasa);
    cardapio.addCardapio(galeto);
    cardapio.addCardapio(sopaDePeixe);

    // criando um pedido passando o numero da mesa e adicionando pratos e bebidas a
    // compra

    Pedido p1 = new Pedido(1);
    p1.addPedido(parmegiana, estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p1.addPedido(saladaTomateQueijo, estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p1.addPedido(banco.coca(), estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());

    // p1.getPedido();
    // System.out.println("R$ " + p1.getValorTotal());
    // System.out.println(p1.getTempoTotal() + " minutos");

    Pedido p2 = new Pedido(2);
    p2.addPedido(omelete, estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p2.addPedido(pratoFeito, estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p2.addPedido(banco.pepsi(), estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p2.addPedido(banco.fanta(), estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());

    // p2.getPedido();
    // System.out.println("R$ " + p2.getValorTotal());
    // System.out.println(p2.getTempoTotal() + " minutos");

    Pedido p3 = new Pedido(3);
    p3.addPedido(legumesAssados, estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p3.addPedido(lasanhaBolonhesa, estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p3.addPedido(banco.sucoLaranja(), estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p3.addPedido(banco.sucoLaranja(), estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());
    p3.addPedido(banco.cervejaStella(), estoqueBebidas.getEstoque(), estoqueIngredientes.getEstoqueIngredientes());

    // p3.getPedido();
    System.out.println("R$ " + p3.getValorTotal());
    // System.out.println(p3.getTempoTotal() + " minutos");

    // System.out.println("antes: " +
    // estoqueBebidas.getQuantidadeBebida(guaranaAntarctica));

    // pedido que pede mais guaranas do que o estoque possui

    Pedido p4 = new Pedido(4);
    p4.addPedido(galeto, estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(sopaDePeixe, estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(lasanhaBolonhesa, estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.cervejaStella(), estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.cervejaStella(), estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.aguaMineral(), estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.aguaMineral(), estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.guaranaAntarctica(), esto
                 ---queBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.guaranaAntarctica(), estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());
    p4.addPedido(banco.guaranaAntarctica(), estoqueBebidas.getEstoque(),
        estoqueIngredientes.getEstoqueIngredientes());

     p4.getPedido();
     System.out.println("R$ " + p4.getValorTotal());
     System.out.println(p4.getTempoTotal() + " minutos");

    // ver quantidade todas as bebidas do estoque
    // estoqueBebidas.getQuantidadeBebidaTotal(estoqueBebidas.getEstoque());

    // ver quantidade todas os ingredientes do estoque
    // estoqueIngredientes.getQuantidadeIngredienteTotal(estoqueIngredientes.getEstoqueIngredientes());
  }
}
