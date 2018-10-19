package m2iformation.fr.toastdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static m2iformation.fr.toastdemo.Tools.affNotif;
import static m2iformation.fr.toastdemo.Tools.affToast;

public class MainActivity extends AppCompatActivity {
    private Button btLancer;
    private TextView tvToast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLancer = findViewById(R.id.button);
        tvToast = findViewById(R.id.tvToast);
    }

    public void lancer(View view) {
        affToast(this, "Ceci est un exemple. Elle est belle la biscotte");
    }

    public void notification(View view) {
        affNotif(this, "Notif : ", "On est bon Gros !");
    }
}
