package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 9/28/2017.
 */

public class Swords_details extends AppCompatActivity {


    TextView swordsName, swordsType, swordsDefense, swordsBuy, swordsSell, swordsWeight, swordsRequiredlvl, swordsApplicablejobs, swordsDescription, swordsDroppedby, swordsBuyableatNpc, swordsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swords_details);


        swordsName = (TextView) findViewById(R.id.swordsname_txt);
        swordsType = (TextView) findViewById(R.id.swordstype_txt);
        swordsDefense = (TextView) findViewById(R.id.swordsdefense_txt);
        swordsBuy = (TextView) findViewById(R.id.swordsbuy_txt);
        swordsSell = (TextView) findViewById(R.id.swordssell_txt);
        swordsWeight = (TextView) findViewById(R.id.swordsweight_txt);
        swordsRequiredlvl = (TextView) findViewById(R.id.swordsreuiredlvl_txt);
        swordsApplicablejobs = (TextView) findViewById(R.id.swordsApplicableJobs_txt);
        swordsDescription = (TextView) findViewById(R.id.swordsDescription_txt);
        swordsDroppedby = (TextView) findViewById(R.id.swordsDroppedby_txt);
        swordsBuyableatNpc = (TextView) findViewById(R.id.swordsBuyableatNPC_txt);
        swordsObtainablefrom = (TextView) findViewById(R.id.swordsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.swords_img);


        type = getResources().getStringArray(R.array.swordstype);
        defense = getResources().getStringArray(R.array.swordsAttack);
        buy = getResources().getStringArray(R.array.swordsBuy);
        sell = getResources().getStringArray(R.array.swordsSELL);
        weight = getResources().getStringArray(R.array.swordsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.swordsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.swordsapplicableJobs);
        description = getResources().getStringArray(R.array.swordsDescription);
        droppedby = getResources().getStringArray(R.array.swordsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.swordsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.swordsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        swordsName.setText(name);
        imageView.setImageResource(img);

        swordsType.setText(type[position]);
        swordsDefense.setText(defense[position]);
        swordsBuy.setText(buy[position]);
        swordsSell.setText(sell[position]);
        swordsWeight.setText(weight[position]);
        swordsRequiredlvl.setText(requiredlvl[position]);
        swordsApplicablejobs.setText(applicablejobs[position]);
        swordsDescription.setText(description[position]);
        swordsDroppedby.setText(droppedby[position]);
        swordsBuyableatNpc.setText(buyabletannpc[position]);
        swordsObtainablefrom.setText(obtainablefrom[position]);


    }
}