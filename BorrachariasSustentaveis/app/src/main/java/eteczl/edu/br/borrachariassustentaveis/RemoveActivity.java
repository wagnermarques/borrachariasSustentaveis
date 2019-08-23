package eteczl.edu.br.borrachariassustentaveis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class RemoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        final Button btn = (Button) findViewById(R.id.btnProsseguir);
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
            user.delete()
                    .

            addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete (@NonNull Task < Void > task) {
                    if (task.isSuccessful()) {
                        Log.d(TAG, "User account deleted.");
                    }
                }
            }
        });
    }
}
