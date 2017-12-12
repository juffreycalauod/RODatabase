package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Mr.Darkycible on 9/30/2017.
 */

public class Books_details extends AppCompatActivity {









    TextView booksName, booksType, booksDefense, booksBuy, booksSell, booksWeight, booksRequiredlvl, booksApplicablejobs, booksDescription, booksDroppedby, booksBuyableatNpc, booksObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.books_details);


        booksName = (TextView) findViewById(R.id.booksname_txt);
        booksType = (TextView) findViewById(R.id.bookstype_txt);
        booksDefense = (TextView) findViewById(R.id.booksdefense_txt);
        booksBuy = (TextView) findViewById(R.id.booksbuy_txt);
        booksSell = (TextView) findViewById(R.id.bookssell_txt);
        booksWeight = (TextView) findViewById(R.id.booksweight_txt);
        booksRequiredlvl = (TextView) findViewById(R.id.booksreuiredlvl_txt);
        booksApplicablejobs = (TextView) findViewById(R.id.booksApplicableJobs_txt);
        booksDescription = (TextView) findViewById(R.id.booksDescription_txt);
        booksDroppedby = (TextView) findViewById(R.id.booksDroppedby_txt);
        booksBuyableatNpc = (TextView) findViewById(R.id.booksBuyableatNPC_txt);
        booksObtainablefrom = (TextView) findViewById(R.id.booksObtainable_txt);
        imageView = (ImageView) findViewById(R.id.books_img);


        type = getResources().getStringArray(R.array.bookstype);
        defense = getResources().getStringArray(R.array.booksAttack);
        buy = getResources().getStringArray(R.array.booksBuy);
        sell = getResources().getStringArray(R.array.booksSELL);
        weight = getResources().getStringArray(R.array.booksWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.booksrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.booksapplicableJobs);
        description = getResources().getStringArray(R.array.booksDescription);
        droppedby = getResources().getStringArray(R.array.booksDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.booksBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.booksObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        booksName.setText(name);
        imageView.setImageResource(img);

        booksType.setText(type[position]);
        booksDefense.setText(defense[position]);
        booksBuy.setText(buy[position]);
        booksSell.setText(sell[position]);
        booksWeight.setText(weight[position]);
        booksRequiredlvl.setText(requiredlvl[position]);
        booksApplicablejobs.setText(applicablejobs[position]);
        booksDescription.setText(description[position]);
        booksDroppedby.setText(droppedby[position]);
        booksBuyableatNpc.setText(buyabletannpc[position]);
        booksObtainablefrom.setText(obtainablefrom[position]);


    }



}
