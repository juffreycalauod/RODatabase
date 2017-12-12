package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 9/30/2017.
 */

public class MusicalInstrument_details extends AppCompatActivity {









    TextView musicalinstrumentsName, musicalinstrumentsType, musicalinstrumentsDefense, musicalinstrumentsBuy, musicalinstrumentsSell, musicalinstrumentsWeight, musicalinstrumentsRequiredlvl, musicalinstrumentsApplicablejobs, musicalinstrumentsDescription, musicalinstrumentsDroppedby, musicalinstrumentsBuyableatNpc, musicalinstrumentsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicalinstruments_details);


        musicalinstrumentsName = (TextView) findViewById(R.id.musicalinstrumentsname_txt);
        musicalinstrumentsType = (TextView) findViewById(R.id.musicalinstrumentstype_txt);
        musicalinstrumentsDefense = (TextView) findViewById(R.id.musicalinstrumentsdefense_txt);
        musicalinstrumentsBuy = (TextView) findViewById(R.id.musicalinstrumentsbuy_txt);
        musicalinstrumentsSell = (TextView) findViewById(R.id.musicalinstrumentssell_txt);
        musicalinstrumentsWeight = (TextView) findViewById(R.id.musicalinstrumentsweight_txt);
        musicalinstrumentsRequiredlvl = (TextView) findViewById(R.id.musicalinstrumentsreuiredlvl_txt);
        musicalinstrumentsApplicablejobs = (TextView) findViewById(R.id.musicalinstrumentsApplicableJobs_txt);
        musicalinstrumentsDescription = (TextView) findViewById(R.id.musicalinstrumentsDescription_txt);
        musicalinstrumentsDroppedby = (TextView) findViewById(R.id.musicalinstrumentsDroppedby_txt);
        musicalinstrumentsBuyableatNpc = (TextView) findViewById(R.id.musicalinstrumentsBuyableatNPC_txt);
        musicalinstrumentsObtainablefrom = (TextView) findViewById(R.id.musicalinstrumentsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.musicalinstruments_img);


        type = getResources().getStringArray(R.array.musicalinstrumentstype);
        defense = getResources().getStringArray(R.array.musicalinstrumentsAttack);
        buy = getResources().getStringArray(R.array.musicalinstrumentsBuy);
        sell = getResources().getStringArray(R.array.musicalinstrumentsSELL);
        weight = getResources().getStringArray(R.array.musicalinstrumentsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.musicalinstrumentsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.musicalinstrumentsapplicableJobs);
        description = getResources().getStringArray(R.array.musicalinstrumentsDescription);
        droppedby = getResources().getStringArray(R.array.musicalinstrumentsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.musicalinstrumentsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.musicalinstrumentsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        musicalinstrumentsName.setText(name);
        imageView.setImageResource(img);

        musicalinstrumentsType.setText(type[position]);
        musicalinstrumentsDefense.setText(defense[position]);
        musicalinstrumentsBuy.setText(buy[position]);
        musicalinstrumentsSell.setText(sell[position]);
        musicalinstrumentsWeight.setText(weight[position]);
        musicalinstrumentsRequiredlvl.setText(requiredlvl[position]);
        musicalinstrumentsApplicablejobs.setText(applicablejobs[position]);
        musicalinstrumentsDescription.setText(description[position]);
        musicalinstrumentsDroppedby.setText(droppedby[position]);
        musicalinstrumentsBuyableatNpc.setText(buyabletannpc[position]);
        musicalinstrumentsObtainablefrom.setText(obtainablefrom[position]);


    }
}
