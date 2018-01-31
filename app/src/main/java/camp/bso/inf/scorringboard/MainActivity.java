package camp.bso.inf.scorringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDetailsPersib;
    Button btnDetailsPersija;
    Button pluspersib, minpersib;
    Button pluspersija, minpersija;
    Button reset, berita;
    TextView skorPersib, skorPersija;
    int skorValuePersib, skorValuePersija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDetailsPersib = findViewById(R.id.btn_details_persib);
        btnDetailsPersija = findViewById(R.id.btn_details_persija);
        pluspersija = findViewById(R.id.btn_tambah_persija);
        minpersija = findViewById(R.id.btn_kurang_persija);
        pluspersib = findViewById(R.id.btn_tambah_persib);
        minpersib = findViewById(R.id.btn_kurang_persib);
        skorPersib = findViewById(R.id.textpersib);
        skorPersija = findViewById(R.id.textpersija);
        reset = findViewById(R.id.reset);
        berita = findViewById(R.id.berita);

        skorValuePersib = 0;
        skorValuePersija = 0;

        //INTENT

        btnDetailsPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PersibDetails.class);
                startActivity(i);
            }
        });


        btnDetailsPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), PersijaDetails.class);
                startActivity(a);
            }
        });

        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://en.wikipedia.org/wiki/2018_Persib_Bandung_season"));
                startActivity(browserIntent);

            }
        });

        //TAMBAH & KURANG SKOR

        pluspersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    skorValuePersib = skorValuePersib + 1;

                skorPersib.setText(String.valueOf(skorValuePersib));

            }
        });
        minpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(skorValuePersib > 0) {
                skorValuePersib = skorValuePersib - 1;
            }
                skorPersib.setText(String.valueOf(skorValuePersib));

            }
        });

        pluspersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValuePersija = skorValuePersija + 1;
                skorPersija.setText(String.valueOf(skorValuePersija));

            }
        });
        minpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (skorValuePersija > 0) {
                    skorValuePersija = skorValuePersija - 1;
                }
                skorPersija.setText(String.valueOf(skorValuePersija));

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValuePersib = 0;
                skorValuePersija = 0;
                skorPersija.setText(String.valueOf(skorValuePersija));
                skorPersib.setText(String.valueOf(skorValuePersib));
            }
        });
    }
}
