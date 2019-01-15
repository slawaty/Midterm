package thanakit.ruts.ac.th.midterm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class First extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button btnnext1, btnnext2;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mediaPlayer=MediaPlayer.create(this,R.raw.burbank);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        user = (EditText)findViewById(R.id.edituser);
        pass = (EditText)findViewById(R.id.editpass);



        btnnext1= (Button)findViewById(R.id.btn1);
        btnnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First.this, Welcome_smarthouse.class);
                startActivity(intent);

        btnnext2= (Button) findViewById(R.id.btn2);
        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First.this, Welcome_Tem.class);
                startActivity(intent);
            }
        });

                intent.putExtra("names", user.getText().toString());
                intent.putExtra("passwd", pass.getText().toString());

                startActivity(intent);
            }
        });
    }
}
