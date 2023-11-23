package mediator;

public class Pessoa {
    public String elogiarEstabelecimento(String mensagem) {
        return Site.getInstancia().receberElogioEstabelecimento(mensagem);
    }

    public String reclamarEstabelecimento(String mensagem) {
        return Site.getInstancia().receberReclamacaoEstabelecimento(mensagem);
    }

    public String sugerirEstabelecimento(String mensagem) {
        return Site.getInstancia().receberSugestaoEstabelecimento(mensagem);
    }
}
