package jose.com.br.cardapio;

/**
 * Created by Jose Antonio on 21/12/2015.
 */
public class Cardapio {

    private int id;
    private String conteudo;

    public Cardapio(int id, String conteudo) {
        this.id = id;
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
