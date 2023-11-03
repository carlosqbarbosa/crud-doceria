import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner teclado = new Scanner(System.in);
        Sala novaSala = new Sala();

        do {
            System.out.println("------------------");
            System.out.println("      MENU");
            System.out.println("1-Inserir clientes");
            System.out.println("2-Listar todos os clientes");
            System.out.println("3-Editar cliente");
            System.out.println("4-Excluir cliente");
            System.out.println("5-Listar cliente por nome");
            System.out.println("0-Sair");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1 -> {
                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Endereço: ");
                    String endereco = teclado.nextLine();
                    System.out.println("Pedido: ");
                    String pedido = teclado.nextLine();
                    System.out.println("Descrição do Pedido: ");
                    String descricaoPedido = teclado.nextLine();
                    System.out.println("Forma de pagamento: ");
                    String formadepagamento = teclado.nextLine();
                    System.out.println("Valor: ");
                    String valor = teclado.nextLine();
                    System.out.println("Dia de Entrega: ");
                    String diaEntrega = teclado.nextLine();
                    System.out.println("Entrega ou Retirada: ");
                    String entregaRetirada = teclado.nextLine();

                    Cliente novoCliente = new Cliente(nome, endereco, pedido, descricaoPedido,formadepagamento, valor, diaEntrega, entregaRetirada);

                    try {
                        novaSala.adicionarPessoa(novoCliente);
                        System.out.println("Cliente inserido com sucesso.");
                    } catch (PessoaInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 2 -> novaSala.listarPessoas();
                case 3 -> {
                    System.out.println("Digite o nome do cliente a ser editado: ");
                    String nomeEditar = teclado.nextLine();
                    Cliente clienteParaEditar = novaSala.buscarClientePorNome(nomeEditar);
                    if (clienteParaEditar != null) {
                        System.out.println("Digite o novo endereço: ");
                        String novoEndereco = teclado.nextLine();
                        System.out.println("Digite o novo pedido: ");
                        String novoPedido = teclado.nextLine();
                        System.out.println("Digite a nova descrição do pedido: ");
                        String novaDescricaoPedido = teclado.nextLine();
                        System.out.println("Digite a nova forma de pagamento: ");
                        String formadepagamento = teclado.nextLine(); 
                        System.out.println("Digite o novo valor: ");
                        String novoValor = teclado.nextLine();
                        System.out.println("Digite o novo dia de entrega: ");
                        String novoDiaEntrega = teclado.nextLine();
                        System.out.println("Digite a nova entrega ou retirada: ");
                        String novaEntregaRetirada = teclado.nextLine();

                        clienteParaEditar.setEndereco(novoEndereco);
                        clienteParaEditar.setPedido(novoPedido);
                        clienteParaEditar.setDescricaoPedido(novaDescricaoPedido);
                        clienteParaEditar.setValor(novoValor);
                        clienteParaEditar.setDiaEntrega(novoDiaEntrega);
                        clienteParaEditar.setEntregaRetirada(novaEntregaRetirada);
                        System.out.println("Cliente editado com sucesso.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }
                case 4 -> {
                    System.out.println("Digite o nome do cliente a ser excluído: ");
                    String nomeExcluir = teclado.nextLine();
                    Cliente clienteParaExcluir = novaSala.buscarClientePorNome(nomeExcluir);
                    if (clienteParaExcluir != null) {
                        novaSala.excluirPessoa(clienteParaExcluir);
                        System.out.println("Cliente excluído com sucesso.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }
                case 5 -> {
                    System.out.println("Digite o nome do cliente a ser listado: ");
                    String nomeListar = teclado.nextLine();
                    boolean clienteEncontrado = novaSala.listarClientePorNome(nomeListar);
                    if (!clienteEncontrado) {
                        System.out.println("Cliente não encontrado. Tente novamente com outro nome.");
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opc != 0);
    }
}
