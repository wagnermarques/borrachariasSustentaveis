package eteczl.edu.br.borrachariassustentaveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class RemoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        Button btn = (Button)findViewById(R.id.btnProsseguir);
        CheckBox cb = (CheckBox) findViewById(R.id.cbConfirma);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btn.setVisibility(View.VISIBLE);
                }
                else {
                    btn.setVisibility(View.GONE);
                }
            }
        });
    }
}
