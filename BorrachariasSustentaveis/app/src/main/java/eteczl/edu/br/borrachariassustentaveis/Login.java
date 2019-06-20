package eteczl.edu.br.borrachariassustentaveis;

import android.widget.EditText;
import android.widget.TextView;

class Login {
    private EditText txtEmail;
    private EditText txtSenha;
    private EditText txtUsuario;
    private EditText txtCEP;
    private EditText txtTel;
    FirebaseAuth auth  = FirebaseAuth.getInstance();

    public void cadastrar(){
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
    }
}
