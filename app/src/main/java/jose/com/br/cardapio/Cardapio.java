package jose.com.br.cardapio;

import java.io.Serializable;

/**
 * Created by Jose Antonio on 21/12/2015.
 */
public class Cardapio implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String Tipo;

    public Cardapio(int id, String tipo) {
        this.id = id;
        this.Tipo = tipo;
    }

    public Cardapio(String tipo) {
        this.Tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
}
