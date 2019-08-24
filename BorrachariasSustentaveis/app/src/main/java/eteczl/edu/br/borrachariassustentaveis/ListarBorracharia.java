package eteczl.edu.br.borrachariassustentaveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListarBorracharia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_borracharia);

        ListView listView = (ListView) findViewById(R.id.lista);

        //final ArrayList<String> borracharia = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, (List<String>) preencherDados());
        listView.setAdapter(arrayAdapter);

    }
            private ArrayList<String> preencherDados() {
                ArrayList<String> dados = new ArrayList<String>();
                dados.add("Borracharia1");
                dados.add("Borracharia2");
                dados.add("Borracharia3");
                dados.add("Borracharia4");
                return dados;
            }
        }


