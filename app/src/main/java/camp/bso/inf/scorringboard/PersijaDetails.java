package camp.bso.inf.scorringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersijaDetails extends AppCompatActivity {
    Button sumber, maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persija_details);
        sumber = findViewById(R.id.sumber);
        maps = findViewById(R.id.map);
        sumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://id.wikipedia.org/wiki/Persija_Jakarta_musim_2018"));
                startActivity(browserIntent);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("geo:-6.238035, 106.992022"));
                startActivity(browserIntent);
            }
        });
    }
}
