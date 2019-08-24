package eteczl.edu.br.borrachariassustentaveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainLBActivity extends AppCompatActivity  {

    Button localizar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lb);

        localizar = (Button) findViewById(R.id.btnlocalizar);

        localizar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        });

    }
}
