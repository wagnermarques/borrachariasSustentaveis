package eteczl.edu.br.borrachariassustentaveis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class cadastrar_destinacao extends AppCompatActivity {

    EditText nome;
    EditText descricao;

    EditText cidade;
    EditText uf;
    EditText end;
    EditText bairro;

    Button limpar;
    Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_destinacao);
                limpar = (Button) findViewById(R.id.btnlimpar);
                salvar = (Button) findViewById(R.id.btnsalvar);

                nome = (EditText) findViewById(R.id.txtnome);
        descricao = (EditText) findViewById(R.id.txtdesc);
        cidade = (EditText) findViewById(R.id.txtcidade);
        uf = (EditText) findViewById(R.id.txtuf);
        end = (EditText) findViewById(R.id.txtend);
        bairro = (EditText) findViewById(R.id.txtbairro);


        limpar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nome.setText("");
                descricao.setText("");
                cidade.setText("");
                uf.setText("");
                end.setText("");
                bairro.setText("");

            }
        });

        salvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                HashMap<String, Object> destinacao = new HashMap<>();
                destinacao.put("discriçao", descricao.getText().toString());
                destinacao.put("cidade", cidade.getText().toString());
                destinacao.put("uf", uf.getText().toString());
                destinacao.put("endereço",end.getText().toString());
                destinacao.put("bairro", bairro.getText().toString());



                FirebaseFirestore.getInstance()
                        .collection("borracharias")
                        .document(nome.getText().toString())
                        .set(destinacao)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                // tudo deu certo
                                Toast.makeText(getApplicationContext(), "Dados inseridos com sucesso", Toast.LENGTH_LONG).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure( Exception e) {
                                Toast.makeText(getApplicationContext(), "Alguma coisa deu errado, tente novamente", Toast.LENGTH_LONG).show();
                            }
                        });


            }
        });



    }
}
