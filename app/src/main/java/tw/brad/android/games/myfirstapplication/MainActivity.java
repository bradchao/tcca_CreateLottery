package tw.brad.android.games.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void createLottery(View view){
        doLottery();
    }

    private void doLottery(){
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        TextView textView = (TextView)findViewById(R.id.mesg);
        textView.setText(set.toString());
    }


}
