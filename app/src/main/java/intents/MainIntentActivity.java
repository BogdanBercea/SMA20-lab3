package intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.lab2_ui.R;

public class MainIntentActivity extends Activity {

    Button button_a;
    Button button_b;
    Button button_c;
    Button button_d;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button_a = (Button) findViewById(R.id.ButtonA);
        button_b = (Button) findViewById(R.id.ButtonB);
        button_c = (Button) findViewById(R.id.ButtonC);
        button_d = (Button) findViewById(R.id.ButtonD);

        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:00401213456");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com");
                Intent intent = new Intent("MSA.LAUNCH", uri);
                startActivity(intent);
            }
        });

        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:00401213456");
                Intent intent = new Intent("MSA.LAUNCH", uri);
                startActivity(intent);
            }
        });
    }
}
