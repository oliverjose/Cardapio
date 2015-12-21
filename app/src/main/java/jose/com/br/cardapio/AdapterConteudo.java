package jose.com.br.cardapio;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jose Antonio on 21/12/2015.
 */
public class AdapterConteudo extends BaseAdapter {

    private Context ctx;
    private List<Cardapio> listaCardapio;

    public AdapterConteudo(Context ctx, List<Cardapio> listaCardapio) {
        this.ctx = ctx;
        this.listaCardapio = listaCardapio;
    }

    @Override
    public int getCount() {
        return listaCardapio.size();
    }

    @Override
    public Object getItem(int position) {
        return listaCardapio.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaCardapio.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Cardapio cardapio = listaCardapio.get(position);

        View view = LayoutInflater.from(ctx).inflate(R.layout.layout_lista, null);
        TextView texto = (TextView) view.findViewById(R.id.textViewConteudo);
        texto.setText(cardapio.getConteudo());

        return view;
    }
}
