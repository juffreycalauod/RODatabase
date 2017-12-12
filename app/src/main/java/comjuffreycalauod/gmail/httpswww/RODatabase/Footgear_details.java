package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 9/27/2017.
 */

public class Footgear_details extends AppCompatActivity {



    TextView footgearName,footgearType,footgearDefense,footgearBuy,footgearSell,footgearWeight,footgearRequiredlvl,footgearApplicablejobs,footgearDescription,footgearDroppedby,footgearBuyableatNpc,footgearObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String [] type ,defense,buy,sell,weight,requiredlvl,applicablejobs,description,droppedby,buyabletannpc,obtainablefrom;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.footgear_details);


        footgearName = (TextView) findViewById(R.id.footgearname_txt);
        footgearType = (TextView) findViewById(R.id.footgeartype_txt);
        footgearDefense = (TextView) findViewById(R.id.footgeardefense_txt);
        footgearBuy = (TextView) findViewById(R.id.footgearbuy_txt);
        footgearSell = (TextView) findViewById(R.id.footgearsell_txt);
        footgearWeight = (TextView) findViewById(R.id.footgearweight_txt);
        footgearRequiredlvl = (TextView) findViewById(R.id.footgearreuiredlvl_txt);
        footgearApplicablejobs = (TextView) findViewById(R.id.footgearApplicableJobs_txt);
        footgearDescription = (TextView) findViewById(R.id.footgearDescription_txt);
        footgearDroppedby = (TextView) findViewById(R.id.footgearDroppedby_txt);
        footgearBuyableatNpc = (TextView) findViewById(R.id.footgearBuyableatNPC_txt);
        footgearObtainablefrom = (TextView) findViewById(R.id.footgearObtainable_txt);
        imageView = (ImageView) findViewById(R.id.footgear_img);


        type = getResources().getStringArray(R.array.footgeartype);
        defense = getResources().getStringArray(R.array.footgearDefense);
        buy = getResources().getStringArray(R.array.footgearBuy);
        sell = getResources().getStringArray(R.array.footgearSELL);
        weight = getResources().getStringArray(R.array.footgearWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.footgearrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.footgearapplicableJobs);
        description = getResources().getStringArray(R.array.footgearDescription);
        droppedby = getResources().getStringArray(R.array.footgearDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.footgearBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.footgearObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        footgearName.setText(name);
        imageView.setImageResource(img);

        footgearType.setText(type[position]);
        footgearDefense.setText(defense[position]);
        footgearBuy.setText(buy[position]);
        footgearSell.setText(sell[position]);
        footgearWeight.setText(weight[position]);
        footgearRequiredlvl.setText(requiredlvl[position]);
        footgearApplicablejobs.setText(applicablejobs[position]);
        footgearDescription.setText(description[position]);
        footgearDroppedby.setText(droppedby[position]);
        footgearBuyableatNpc.setText(buyabletannpc[position]);
        footgearObtainablefrom.setText(obtainablefrom[position]);


    }


    }
