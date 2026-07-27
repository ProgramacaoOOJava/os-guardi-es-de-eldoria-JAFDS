public class Personagem{
    // atributos = variaveis
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase){
        // contrutor 
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public void exibirInformacoes(){
        // informacoes que apareceram no metodo exibirInformacoes no main
        System.out.println(
        "nome: " + nome + "\n" +
        " classe: " + classe + "\n" +
        " nivel: " + nivel + "\n" +
        " pontos de vida: " + pontosDeVida + "\n" +
        " pode base " + poderBase);
    }
}
