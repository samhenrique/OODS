public class Banco {

  public Banco() {

  }

  Bebida coca = new Bebida("coca-cola", "refrigerante", 7.50, 250, "13/02/2025");
  Bebida pepsi = new Bebida("pepsi", "refrigerante", 6.50, 250, "20/06/2025");
  Bebida fanta = new Bebida("fanta", "refrigerante", 6.50, 250, "05/08/2025");
  Bebida guaranaAntarctica = new Bebida("Guaraná Antarctica", "refrigerante", 7.00, 350, "25/09/2025");
  Bebida sucoLaranja = new Bebida("suco de laranja", "suco natural", 9.00, 300, "15/04/2025");
  Bebida sucoUva = new Bebida("suco de uva", "suco natural", 10.00, 300, "01/05/2025");
  Bebida aguaMineral = new Bebida("água mineral", "água", 3.50, 500, "30/12/2024");
  Bebida vinhoTinto = new Bebida("vinho tinto", "vinho", 35.00, 750, "31/12/2030");
  Bebida cervejaStella = new Bebida("cerveja Stella Artois", "cerveja", 8.50, 355, "15/07/2025");
  Bebida energeticoRedBull = new Bebida("energético Red Bull", "bebida energética", 12.00, 250, "20/08/2025");

  Ingrediente macarrao = new Ingrediente("macarrão", "2 meses");
  Ingrediente carneBovina = new Ingrediente("carne bovina", "5 dias");
  Ingrediente queijo = new Ingrediente("queijo", "12 dias");
  Ingrediente tomate = new Ingrediente("tomate", "1 semana");
  Ingrediente arroz = new Ingrediente("arroz", "1 ano");
  Ingrediente feijao = new Ingrediente("feijão", "6 meses");
  Ingrediente cebola = new Ingrediente("cebola", "1 mês");
  Ingrediente alho = new Ingrediente("alho", "3 meses");
  Ingrediente ovos = new Ingrediente("ovos", "4 semanas");
  Ingrediente pao = new Ingrediente("pão", "3 dias");
  Ingrediente manteiga = new Ingrediente("manteiga", "3 meses");
  Ingrediente cenoura = new Ingrediente("cenoura", "2 semanas");
  Ingrediente batata = new Ingrediente("batata", "2 semanas");
  Ingrediente abobrinha = new Ingrediente("abobrinha", "1 semana");
  Ingrediente couve = new Ingrediente("couve", "1 semana");
  Ingrediente frango = new Ingrediente("frango", "1 mês");
  Ingrediente peixe = new Ingrediente("peixe", "1 mês");
  Ingrediente leiteCondensado = new Ingrediente("leite condensado", "6 mêses");
  Ingrediente acai = new Ingrediente("açai", "6 mêses");
  Ingrediente granola = new Ingrediente("granola", "6 mêses");
  Ingrediente leite = new Ingrediente("leite", "5 dias");

  public void BancoEstoque(EstoqueHashMap estoqueBebidas, EstoqueHashMap estoqueIngredientes) {

    // adicao das bebidas no estoque.
    estoqueBebidas.adicionarBebida(coca(), 1);
    estoqueBebidas.adicionarBebida(pepsi(), 3);
    estoqueBebidas.adicionarBebida(fanta(), 2);
    estoqueBebidas.adicionarBebida(guaranaAntarctica(), 2);
    estoqueBebidas.adicionarBebida(sucoLaranja(), 5);
    estoqueBebidas.adicionarBebida(sucoUva(), 2);
    estoqueBebidas.adicionarBebida(aguaMineral(), 10);
    estoqueBebidas.adicionarBebida(vinhoTinto(), 1);
    estoqueBebidas.adicionarBebida(cervejaStella(), 8);
    estoqueBebidas.adicionarBebida(energeticoRedBull(), 3);

    // adicao dos ingredientes no estoque

    estoqueIngredientes.adicionarIngrediente(macarrao(), 20);
    estoqueIngredientes.adicionarIngrediente(carneBovina(), 10);
    estoqueIngredientes.adicionarIngrediente(queijo(), 15);
    estoqueIngredientes.adicionarIngrediente(tomate(), 76);
    estoqueIngredientes.adicionarIngrediente(arroz(), 30);
    estoqueIngredientes.adicionarIngrediente(feijao(), 25);
    estoqueIngredientes.adicionarIngrediente(cebola(), 50);
    estoqueIngredientes.adicionarIngrediente(alho(), 40);
    estoqueIngredientes.adicionarIngrediente(ovos(), 60);
    estoqueIngredientes.adicionarIngrediente(pao(), 100);
    estoqueIngredientes.adicionarIngrediente(manteiga(), 5);
    estoqueIngredientes.adicionarIngrediente(cenoura(), 30);
    estoqueIngredientes.adicionarIngrediente(batata(), 40);
    estoqueIngredientes.adicionarIngrediente(abobrinha(), 20);
    estoqueIngredientes.adicionarIngrediente(frango(), 15);
    estoqueIngredientes.adicionarIngrediente(peixe(), 15);
    estoqueIngredientes.adicionarIngrediente(leiteCondensado(), 188);
    estoqueIngredientes.adicionarIngrediente(acai(), 145);
    estoqueIngredientes.adicionarIngrediente(granola(), 22);
    estoqueIngredientes.adicionarIngrediente(leite(), 9);
  }

  public void BancoCardapio(Cardapio cardapio) {
    cardapio.addCardapio(coca());
    cardapio.addCardapio(pepsi());
    cardapio.addCardapio(fanta());
    cardapio.addCardapio(guaranaAntarctica());
    cardapio.addCardapio(sucoLaranja());
    cardapio.addCardapio(sucoUva());
    cardapio.addCardapio(aguaMineral());
    cardapio.addCardapio(vinhoTinto());
    cardapio.addCardapio(cervejaStella());
    cardapio.addCardapio(energeticoRedBull());

  }

  // bebidas
  public Bebida coca() {
    return coca;
  }

  public Bebida pepsi() {
    return this.pepsi;
  }

  public Bebida fanta() {
    return this.fanta;
  }

  public Bebida guaranaAntarctica() {
    return this.guaranaAntarctica;
  }

  public Bebida sucoLaranja() {
    return this.sucoLaranja;
  }

  public Bebida sucoUva() {
    return this.sucoUva;
  }

  public Bebida aguaMineral() {
    return this.aguaMineral;
  }

  public Bebida vinhoTinto() {
    return this.vinhoTinto;
  }

  public Bebida cervejaStella() {
    return this.cervejaStella;
  }

  public Bebida energeticoRedBull() {
    return this.energeticoRedBull;
  }

  public Ingrediente macarrao() {
    return this.macarrao;
  }

  public Ingrediente carneBovina() {
    return this.carneBovina;
  }

  public Ingrediente queijo() {
    return this.queijo;
  }

  public Ingrediente tomate() {
    return this.tomate;
  }

  public Ingrediente arroz() {
    return this.arroz;
  }

  public Ingrediente feijao() {
    return this.feijao;
  }

  public Ingrediente cebola() {
    return this.cebola;
  }

  public Ingrediente alho() {
    return this.alho;
  }

  public Ingrediente ovos() {
    return this.ovos;
  }

  public Ingrediente pao() {
    return this.pao;
  }

  public Ingrediente manteiga() {
    return this.manteiga;
  }

  public Ingrediente cenoura() {
    return this.cenoura;
  }

  public Ingrediente batata() {
    return this.batata;
  }

  public Ingrediente abobrinha() {
    return this.abobrinha;
  }

  public Ingrediente couve() {
    return this.couve;
  }

  public Ingrediente frango() {
    return this.frango;
  }

  public Ingrediente peixe() {
    return this.peixe;
  }

  public Ingrediente leiteCondensado() {
    return this.leiteCondensado;
  }

  public Ingrediente acai() {
    return this.acai;
  }

  public Ingrediente granola() {
    return this.granola;
  }

  public Ingrediente leite() {
    return this.leite;
  }

}
