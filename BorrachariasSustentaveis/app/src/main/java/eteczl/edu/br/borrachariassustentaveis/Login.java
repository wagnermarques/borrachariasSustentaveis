package eteczl.edu.br.borrachariassustentaveis;

class Login {
    //	Criando e instanciando o objeto da classe FirebaseAuth
    private FirebaseAuth mAuth;
    mAuth = FirebaseAuth.getInstance()

    //	Método de login do usuário
    private void signIn(String email, String senha) {
        //	Antes de autenticar, validar os campos do formulário
        mAuth.signInWithEmailAndPassword(email, senha).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Autenticação bem-sucedida
                    Log.d(TAG, "signInWithEmail:success");
                    FirebaseUser user = mAuth.getCurrentUser();
                } else {
                    // Se a autenticação falhar, mostrar uma mensagem para o usuário.
                    Log.w(TAG, "signInWithEmail:failure", task.getException());
                    Toast.makeText(EmailPasswordActivity.this, "Dados de acesso incorretos.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    //	Método de logout
    private void signOut() {
        mAuth.signOut();
    }
}
