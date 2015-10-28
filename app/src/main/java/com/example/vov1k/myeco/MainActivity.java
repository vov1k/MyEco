package com.example.vov1k.myeco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton bCredit;
    private ImageButton bDebet;
    private ImageButton bStatistic;
    private TextView tvDebet;
    private TextView tvKredit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCredit = (ImageButton)findViewById(R.id.ibkredit);
        bDebet = (ImageButton)findViewById(R.id.ibDebet);
        bStatistic = (ImageButton)findViewById(R.id.imageButton);
        tvDebet = (TextView)findViewById(R.id.tvDebet);
        tvKredit = (TextView)findViewById(R.id.tvKredit);

        tvDebet.setText("0");
        tvKredit.setText("0");

        bCredit.setOnClickListener(this);
        bDebet.setOnClickListener(this);
        bStatistic.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Toast ts = new Toast(this);
        switch(v.getId()){
            case R.id.ibDebet:
                ts.makeText(this,"Нажали кномпку дебета", Toast.LENGTH_SHORT);
                break;
            case R.id.ibkredit:
                ts.makeText(this,"Нажали кномпку кредита", Toast.LENGTH_SHORT);
                break;
            case R.id.imageButton:
                ts.makeText(this,"Нажали кномпку аналитики", Toast.LENGTH_SHORT);
                break;
        }
        ts.show();
    }
}
