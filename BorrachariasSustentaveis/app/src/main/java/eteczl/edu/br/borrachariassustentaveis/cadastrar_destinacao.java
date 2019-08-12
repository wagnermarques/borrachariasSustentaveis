package eteczl.edu.br.borrachariassustentaveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

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





    }
}
