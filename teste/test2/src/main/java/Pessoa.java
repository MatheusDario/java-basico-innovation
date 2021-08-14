import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    public Pessoa(String nome, int dia, int mes, int ano) { //construtor que recebe as informacoes
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }
    private String nome;
    private LocalDate dataNascimento;

    public String getNome() {return nome;}

   private void setNome(String nome) { //e possivel alterar o nome
        this.nome = nome;
   }

    public LocalDate getDataNascimento() {return dataNascimento;}

    public int calculaIdade() {return Period.between(dataNascimento, LocalDate.now()).getYears();}

    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Matheus", 15,9,1997);
        eu.setNome("Matheus Dario");
        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());
    }
}

