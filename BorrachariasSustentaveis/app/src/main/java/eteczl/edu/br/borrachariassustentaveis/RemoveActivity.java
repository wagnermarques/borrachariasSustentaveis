package eteczl.edu.br.borrachariassustentaveis;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class RemoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        Button btn = (Button) findViewById(R.id.btnProsseguir);
        CheckBox cb = (CheckBox) findViewById(R.id.cbConfirma);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btn.setVisibility(View.VISIBLE);
                } else {
                    btn.setVisibility(View.GONE);
                }
            }
        });
        btn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                if(user == null) {
                    Toast.makeText(getApplicationContext(), "Usuário não autenticado", Toast.LENGTH_LONG).show();
                    return;
                }

                user.delete()
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                String TAG = "";
                                if (task.isSuccessful()) {
                                    Log.d(TAG, "Conta de usuário deletada");
                                    Toast.makeText(getApplicationContext(), "Usuário deletado", Toast.LENGTH_LONG).show();
                                }

                            }
                        });
            }
        });
    }
}
