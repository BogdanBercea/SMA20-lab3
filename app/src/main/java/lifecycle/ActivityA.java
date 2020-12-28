package lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab2_ui.R;

public class ActivityA extends AppCompatActivity {
    public static final String TAG = "Activity_A";

    Button button_a;
    Button button_b;
    Button button_c;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_layout);
        Log.d(TAG , "On Create");

        button_a = (Button) findViewById(R.id.ActivityA);
        button_b = (Button) findViewById(R.id.ActivityB);
        button_c = (Button) findViewById(R.id.ActivityC);

        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityA.this, ActivityA.class));
            }
        });

        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityA.this, ActivityB.class));
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityA.this, ActivityB.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG , "On Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG , "On On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG , "On Destroy");
    }
}
