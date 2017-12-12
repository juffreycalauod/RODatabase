package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Card_details extends AppCompatActivity {




    TextView textview,textview01;
    Intent intent;
    String cardnames;
    String [] cardinfo;
    ImageView imageView;
    int img = 0;
    int  position;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_info);

        textview = (TextView) findViewById(R.id.cardtext_name);
        textview01 = (TextView) findViewById(R.id.cardtext_info);
        imageView = (ImageView) findViewById(R.id.cardimg_info);

        intent =getIntent();


        cardnames = intent.getExtras().getString("CARDNAME");
        img = intent.getExtras().getInt("CARDIMAGE");
        cardinfo = getResources().getStringArray(R.array.CARDS);
        position = intent.getExtras().getInt("POSITION");

        imageView.setImageResource(img);
        textview.setText(cardnames);
        textview01.setText(cardinfo[position]);






















    }
}
