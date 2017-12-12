package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 9/29/2017.
 */

public class TwoHandSword_details extends AppCompatActivity {




    TextView twohandswordsName, twohandswordsType, twohandswordsDefense, twohandswordsBuy, twohandswordsSell, twohandswordsWeight, twohandswordsRequiredlvl, twohandswordsApplicablejobs, twohandswordsDescription, twohandswordsDroppedby, twohandswordsBuyableatNpc, twohandswordsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twohandswords_details);


        twohandswordsName = (TextView) findViewById(R.id.twohandswordsname_txt);
        twohandswordsType = (TextView) findViewById(R.id.twohandswordstype_txt);
        twohandswordsDefense = (TextView) findViewById(R.id.twohandswordsdefense_txt);
        twohandswordsBuy = (TextView) findViewById(R.id.twohandswordsbuy_txt);
        twohandswordsSell = (TextView) findViewById(R.id.twohandswordssell_txt);
        twohandswordsWeight = (TextView) findViewById(R.id.twohandswordsweight_txt);
        twohandswordsRequiredlvl = (TextView) findViewById(R.id.twohandswordsreuiredlvl_txt);
        twohandswordsApplicablejobs = (TextView) findViewById(R.id.twohandswordsApplicableJobs_txt);
        twohandswordsDescription = (TextView) findViewById(R.id.twohandswordsDescription_txt);
        twohandswordsDroppedby = (TextView) findViewById(R.id.twohandswordsDroppedby_txt);
        twohandswordsBuyableatNpc = (TextView) findViewById(R.id.twohandswordsBuyableatNPC_txt);
        twohandswordsObtainablefrom = (TextView) findViewById(R.id.twohandswordsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.twohandswords_img);


        type = getResources().getStringArray(R.array.twohandswordstype);
        defense = getResources().getStringArray(R.array.twohandswordsAttack);
        buy = getResources().getStringArray(R.array.twohandswordsBuy);
        sell = getResources().getStringArray(R.array.twohandswordsSELL);
        weight = getResources().getStringArray(R.array.twohandswordsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.twohandswordsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.twohandswordsapplicableJobs);
        description = getResources().getStringArray(R.array.twohandswordsDescription);
        droppedby = getResources().getStringArray(R.array.twohandswordsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.twohandswordsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.twohandswordsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        twohandswordsName.setText(name);
        imageView.setImageResource(img);

        twohandswordsType.setText(type[position]);
        twohandswordsDefense.setText(defense[position]);
        twohandswordsBuy.setText(buy[position]);
        twohandswordsSell.setText(sell[position]);
        twohandswordsWeight.setText(weight[position]);
        twohandswordsRequiredlvl.setText(requiredlvl[position]);
        twohandswordsApplicablejobs.setText(applicablejobs[position]);
        twohandswordsDescription.setText(description[position]);
        twohandswordsDroppedby.setText(droppedby[position]);
        twohandswordsBuyableatNpc.setText(buyabletannpc[position]);
        twohandswordsObtainablefrom.setText(obtainablefrom[position]);


    }






}
