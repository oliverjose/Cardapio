package jose.com.br.cardapio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TelaListActivity extends AppCompatActivity {

    private ArrayList<Cardapio> listaCardapio;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_list);

        listView = (ListView) findViewById(R.id.listViewCardapio);
        preencherLista();

    }

    private void preencherLista(){

        listaCardapio = new ArrayList<Cardapio>();

        Cardapio cardapio1 = new Cardapio(1,"Comida");
        listaCardapio.add(cardapio1);

        Cardapio cardapio2 = new Cardapio(2,"Bebida");
        listaCardapio.add(cardapio2);

        Cardapio cardapio3 = new Cardapio(3,"Sobremesa");
        listaCardapio.add(cardapio3);

        AdapterConteudo adapterConteudo = new AdapterConteudo(TelaListActivity.this, listaCardapio);
        listView.setAdapter(adapterConteudo);
    }
}
