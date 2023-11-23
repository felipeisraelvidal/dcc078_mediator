package mediator;

public class Estabelecimento implements Departamento {
    private static Estabelecimento instancia = new Estabelecimento();

    private Estabelecimento() {}

    public static Estabelecimento getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Estabelecimento vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Estabelecimento agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Estabelecimento vai analisar a sugestão: " + mensagem;
    }
}
