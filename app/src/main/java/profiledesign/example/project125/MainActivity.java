package profiledesign.example.project125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.project125.R;

public class MainActivity extends AppCompatActivity {

    androidx.appcompat.widget.AppCompatButton credly;
    androidx.appcompat.widget.AppCompatButton linkedin;
    androidx.appcompat.widget.AppCompatButton github;
    androidx.appcompat.widget.AppCompatButton kaggle;
    androidx.appcompat.widget.AppCompatButton leetcode;
    androidx.appcompat.widget.AppCompatButton tableau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        credly = findViewById(R.id.credly);
        linkedin = findViewById(R.id.linkedin);
        github = findViewById(R.id.github);
        kaggle = findViewById(R.id.kaggle);
        leetcode = findViewById(R.id.leetcode);
        tableau = findViewById(R.id.tableau);

        credly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.credly.com/users/danziel-cempron/badges");
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/danzielc/");
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Dnzldotexe");
            }
        });

        kaggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.kaggle.com/cemprondanziel");
            }
        });

        leetcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://leetcode.com/dnzldotexe/");
            }
        });

        tableau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://public.tableau.com/app/profile/danziel.cempron");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}