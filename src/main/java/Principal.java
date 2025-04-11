import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        // Usando a classe mutável "Cidade"
        Cidade cidade = new Cidade();
        cidade.setNome("Paulínia");

        System.out.println("\nExecutando a classe mutável 'Cidade' \nNome: " + cidade.getNome() +"\n");

        // Usando a classe superficialmente mutável "PessoaRecordShallow"
        PessoaRecordShallow pessoaRecordShallow = new PessoaRecordShallow("Francismaria", cidade);

        // Mudando o nome do objeto cidade
        cidade.setNome("Ribeirão Preto");

        System.out.println("Executando a classe superficialmente mutável 'PessoaRecordShallow' \nNome: " + pessoaRecordShallow.nome() + "\nCidade: " + pessoaRecordShallow.cidade().getNome() + "\n");

        // Usando a classe imutável "CidadeRecord"
        CidadeRecord cidadeRecord = new CidadeRecord("Palmas");

        System.out.println("Executando a classe imutável 'CidadeRecord' \nNome: " + cidadeRecord.nome() + "\n");

        // Usando a classe totalmente imutável "PessoaRecord"
        PessoaRecord pessoaRecord = new PessoaRecord("Alexandra", cidadeRecord);

        System.out.println("Executando a classe  totalmente imutável 'PessoaRecord' \nNome: " + pessoaRecord.nome() + "\nCidade: " + cidadeRecord.nome());



    }
}
