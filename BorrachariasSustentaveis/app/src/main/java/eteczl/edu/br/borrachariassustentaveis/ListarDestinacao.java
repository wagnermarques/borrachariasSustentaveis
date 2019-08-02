package eteczl.edu.br.borrachariassustentaveis;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListarDestinacao extends AppCompatActivity {
    ArrayList<String> destinacoes;
    ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_listar_destinacao);

        this.getDestinacoes();
        mListView = (ListView) findViewById(R.id.list_view_destinacoes);

        ArrayAdapter adaptadorDasDestinacoes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, destinacoes);

        mListView.setAdapter(adaptadorDasDestinacoes);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                // inicia a activity responsável por mostrar os dados/campos detalhadamente do item selecionado pelo usuário
            }
        });
    }

    private void getDestinacoes(){
        destinacoes = new ArrayList<String>();
        FirebaseFirestore database = FirebaseFirestore.getInstance();

        database.collection("Destinacoes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {

            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task){
                if(task.isSuccessful()){
                    for(DocumentSnapshot document : task.getResult()) {
                        String nome = document.getId();
                        destinacoes.add(nome);
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "não foi possível requisitar os dados", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }
}
