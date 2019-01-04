package in.std.codedadu.buttoncounterinter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Default Weered 3 atau lain set manual
    private int pushcounter = 3;
    private Button pindah;
    private Button push;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("First Activity");

        push = (Button)findViewById(R.id.btnPushCounter);
        pindah = (Button)findViewById(R.id.btnActionIntent);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(pindah);
            }
        });
    }

    public void pushCounter(View view) {
        pushcounter--;
        push.setText(pushcounter+"X");
        if (pushcounter == 0) {
            push.setText("SELANJUTNYA");
            pindah.setVisibility(View.VISIBLE);
            push.setVisibility(View.GONE);
        }
    }
}
