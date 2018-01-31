package camp.bso.inf.scorringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersibDetails extends AppCompatActivity {
    Button sumber, maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persib_details);
        sumber = findViewById(R.id.sumber);
        maps = findViewById(R.id.map);


        sumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://en.wikipedia.org/wiki/2018_Persib_Bandung_season"));
                startActivity(browserIntent);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("geo:-6.957404, 107.712051"));
                startActivity(browserIntent);
            }
        });

    }
}
