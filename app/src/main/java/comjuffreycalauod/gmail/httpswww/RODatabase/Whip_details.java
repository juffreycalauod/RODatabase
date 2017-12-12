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

public class Whip_details extends AppCompatActivity {









    TextView whipName, whipType, whipDefense, whipBuy, whipSell, whipWeight, whipRequiredlvl, whipApplicablejobs, whipDescription, whipDroppedby, whipBuyableatNpc, whipObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whip_details);


        whipName = (TextView) findViewById(R.id.whipname_txt);
        whipType = (TextView) findViewById(R.id.whiptype_txt);
        whipDefense = (TextView) findViewById(R.id.whipdefense_txt);
        whipBuy = (TextView) findViewById(R.id.whipbuy_txt);
        whipSell = (TextView) findViewById(R.id.whipsell_txt);
        whipWeight = (TextView) findViewById(R.id.whipweight_txt);
        whipRequiredlvl = (TextView) findViewById(R.id.whipreuiredlvl_txt);
        whipApplicablejobs = (TextView) findViewById(R.id.whipApplicableJobs_txt);
        whipDescription = (TextView) findViewById(R.id.whipDescription_txt);
        whipDroppedby = (TextView) findViewById(R.id.whipDroppedby_txt);
        whipBuyableatNpc = (TextView) findViewById(R.id.whipBuyableatNPC_txt);
        whipObtainablefrom = (TextView) findViewById(R.id.whipObtainable_txt);
        imageView = (ImageView) findViewById(R.id.whip_img);


        type = getResources().getStringArray(R.array.whiptype);
        defense = getResources().getStringArray(R.array.whipAttack);
        buy = getResources().getStringArray(R.array.whipBuy);
        sell = getResources().getStringArray(R.array.whipSELL);
        weight = getResources().getStringArray(R.array.whipWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.whiprequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.whipapplicableJobs);
        description = getResources().getStringArray(R.array.whipDescription);
        droppedby = getResources().getStringArray(R.array.whipDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.whipBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.whipObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        whipName.setText(name);
        imageView.setImageResource(img);

        whipType.setText(type[position]);
        whipDefense.setText(defense[position]);
        whipBuy.setText(buy[position]);
        whipSell.setText(sell[position]);
        whipWeight.setText(weight[position]);
        whipRequiredlvl.setText(requiredlvl[position]);
        whipApplicablejobs.setText(applicablejobs[position]);
        whipDescription.setText(description[position]);
        whipDroppedby.setText(droppedby[position]);
        whipBuyableatNpc.setText(buyabletannpc[position]);
        whipObtainablefrom.setText(obtainablefrom[position]);


    }






}
