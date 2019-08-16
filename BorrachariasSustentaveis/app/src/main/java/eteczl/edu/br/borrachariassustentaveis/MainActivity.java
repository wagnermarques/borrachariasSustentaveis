package eteczl.edu.br.borrachariassustentaveis;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    List<String> opcoes;
    ArrayAdapter<String>adaptador;
    ListView listaOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaOpcoes = (ListView) findViewById(R.id.ListaOpcoes);

        opcoes = new ArrayList<String>();

        opcoes.add("Carlos Eduardo");
        opcoes.add("Fabricio");
        opcoes.add("Maria");
        opcoes.add("Carla");
        opcoes.add("João");
        opcoes.add("Thaian");

        adaptador = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, opcoes);
        listaOpcoes.setAdapter(adaptador);
        listaOpcoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: carlosEduardo();
                        break;
                    case 1: fabricio();
                        break;
                    case 2: maria();
                        break;
                    case 3: carla();
                        break;
                    case 4: Joao();
                        break;
                    case 5: Thaian();
                        break;
                }
            }
        });
    }
    private void carlosEduardo(){
        Intent nome1 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nome1);

        Uri ligarCarlos = Uri.parse("tel: 11 95685-1458");
        Intent navegarCarlos = new Intent(Intent.ACTION_DIAL, ligarCarlos);
        startActivity(navegarCarlos);
    }
    private void fabricio(){
        Intent nome2 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nome2);

        Uri ligarFabricio = Uri.parse("tel: 11 98564-4584");
        Intent navegarFabricio = new Intent(Intent.ACTION_DIAL, ligarFabricio);
        startActivity(navegarFabricio);
    }
    private void maria(){
        Intent nome3 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nome3);

        Uri ligarMaria = Uri.parse("tel: 11 95684-5236");
        Intent navegarMaria = new Intent(Intent.ACTION_DIAL, ligarMaria);
        startActivity(navegarMaria);
    }
    private void carla(){
        Intent nome4 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nome4);

        Uri ligarCarla = Uri.parse("tel: 11 96582-2541");
        Intent navegarCarla = new Intent(Intent.ACTION_DIAL, ligarCarla);
        startActivity(navegarCarla);
    }

    private void Joao(){
        Intent nome5 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nome5);

        Uri ligarJoao = Uri.parse("tel: 11 55685-5214");
        Intent navegarJoao = new Intent(Intent.ACTION_DIAL, ligarJoao);
        startActivity(navegarJoao);
    }

    private void Thaian(){
        Intent nome6 = new Intent(MainActivity.this, MainActivity.class);
        startActivity(nome6);

        Uri ligarThaian = Uri.parse("tel: 11 65892-2541");
        Intent navegarThaian = new Intent(Intent.ACTION_DIAL, ligarThaian);
        startActivity(navegarThaian);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

}