package thanakit.ruts.ac.th.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome_smarthouse extends AppCompatActivity {

    TextView username, password;
    Button btnhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_smarthouse);

        btnhome= (Button)findViewById(R.id.btnh);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Welcome_smarthouse.this,First.class);
                startActivity(intent);
            }
        });

        username = (TextView)findViewById(R.id.textuser);
        password = (TextView)findViewById(R.id.textpass);


        username.setText(getIntent().getStringExtra("names"));
        password.setText(getIntent().getStringExtra("passwd"));
    }
}
