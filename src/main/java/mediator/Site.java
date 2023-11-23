package mediator;

public class Site {
    private static Site instancia = new Site();

    private Site() {}

    public static Site getInstancia() {
        return instancia;
    }

    public String receberElogioEstabelecimento(String mensagem) {
        return "O Site agradece seu contato.\n"+
                "O Estabelecimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Estabelecimento.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoEstabelecimento(String mensagem) {
        return "O Site agradece seu contato.\n"+
                "O Estabelecimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Estabelecimento.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoEstabelecimento(String mensagem) {
        return "O Site agradece seu contato.\n"+
                "O Estabelecimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Estabelecimento.getInstancia().receberSugestao(mensagem);
    }
}
