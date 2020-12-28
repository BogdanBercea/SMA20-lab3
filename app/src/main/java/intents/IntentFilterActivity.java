package intents;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.lab2_ui.R;

public class IntentFilterActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter_intent);

        textView = (TextView) findViewById(R.id.filterTextView);
        Uri url = getIntent().getData();

        String text = url.toString();
        textView.setText(text);
    }
}
