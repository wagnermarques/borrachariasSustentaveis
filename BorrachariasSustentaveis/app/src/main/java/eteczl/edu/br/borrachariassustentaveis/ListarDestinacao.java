package eteczl.edu.br.borrachariassustentaveis;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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
import com.google.firebase.firestore.QueryDocumentSnapshot;
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
    }

    private void getDestinacoes(){
        destinacoes = new ArrayList<String>();
        FirebaseFirestore database = FirebaseFirestore.getInstance();

        database.collection("borracharias")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {

            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task){
                if(task.isSuccessful()){
                    for(QueryDocumentSnapshot document : task.getResult()) {
                        String nome = document.getId();
                        destinacoes.add(nome);
                        Toast.makeText(getApplicationContext(), nome, Toast.LENGTH_LONG).show();
                    }
                    setmListView();
                }
                else {
                    Toast.makeText(getApplicationContext(), "não foi possível requisitar os dados", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }

    public void setmListView(){
        mListView = (ListView) findViewById(R.id.lv_listar_destinacao);

        ArrayAdapter adaptadorDasDestinacoes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, destinacoes);

        mListView.setAdapter(adaptadorDasDestinacoes);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                // inicia a activity responsável por mostrar os dados/campos detalhadamente do item selecionado pelo usuário
            }
        });
    }
}
