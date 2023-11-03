import java.util.ArrayList;

public class Sala {
    private final ArrayList<Pessoa> listaDePessoas;

    public Sala() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) throws PessoaInvalidaException {
        if (pessoa.getNome() == null || pessoa.getNome().isEmpty()) {
            throw new PessoaInvalidaException("Nome de pessoa inválido.");
        }
        listaDePessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : listaDePessoas) {
            pessoa.exibirDetalhes();
            System.out.println("---------------------------------------");
        }
    }

    public Cliente buscarClientePorNome(String nome) {
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa instanceof Cliente && pessoa.getNome().equalsIgnoreCase(nome)) {
                return (Cliente) pessoa;
            }
        }
        return null;
    }

    public void excluirPessoa(Pessoa pessoa) {
        listaDePessoas.remove(pessoa);
    }

    public boolean listarClientePorNome(String nome) {
        boolean clienteEncontrado = false;
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa instanceof Cliente && pessoa.getNome().equalsIgnoreCase(nome)) {
                pessoa.exibirDetalhes();
                System.out.println("---------------------------------------");
                clienteEncontrado = true;
            }
        }
        return clienteEncontrado;
    }
}
