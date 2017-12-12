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

public class Garment_details extends AppCompatActivity{





    TextView garmentName,garmentType,garmentDefense,garmentBuy,garmentSell,garmentWeight,garmentRequiredlvl,garmentApplicablejobs,garmentDescription,garmentDroppedby,garmentBuyableatNpc,garmentObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String [] type ,defense,buy,sell,weight,requiredlvl,applicablejobs,description,droppedby,buyabletannpc,obtainablefrom;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.garment_details);


        garmentName = (TextView) findViewById(R.id.garmentname_txt);
        garmentType = (TextView) findViewById(R.id.garmenttype_txt);
        garmentDefense = (TextView) findViewById(R.id.garmentdefense_txt);
        garmentBuy = (TextView) findViewById(R.id.garmentbuy_txt);
        garmentSell = (TextView) findViewById(R.id.garmentsell_txt);
        garmentWeight = (TextView) findViewById(R.id.garmentweight_txt);
        garmentRequiredlvl = (TextView) findViewById(R.id.garmentreuiredlvl_txt);
        garmentApplicablejobs = (TextView) findViewById(R.id.garmentApplicableJobs_txt);
        garmentDescription = (TextView) findViewById(R.id.garmentDescription_txt);
        garmentDroppedby = (TextView) findViewById(R.id.garmentDroppedby_txt);
        garmentBuyableatNpc = (TextView) findViewById(R.id.garmentBuyableatNPC_txt);
        garmentObtainablefrom = (TextView) findViewById(R.id.garmentObtainable_txt);
        imageView = (ImageView) findViewById(R.id.garment_img);


        type = getResources().getStringArray(R.array.garmenttype);
        defense = getResources().getStringArray(R.array.garmentDefense);
        buy = getResources().getStringArray(R.array.garmentBuy);
        sell = getResources().getStringArray(R.array.garmentSELL);
        weight = getResources().getStringArray(R.array.garmentWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.garmentrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.garmentapplicableJobs);
        description = getResources().getStringArray(R.array.garmentDescription);
        droppedby = getResources().getStringArray(R.array.garmentDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.garmentBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.garmentObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        garmentName.setText(name);
        imageView.setImageResource(img);

        garmentType.setText(type[position]);
        garmentDefense.setText(defense[position]);
        garmentBuy.setText(buy[position]);
        garmentSell.setText(sell[position]);
        garmentWeight.setText(weight[position]);
        garmentRequiredlvl.setText(requiredlvl[position]);
        garmentApplicablejobs.setText(applicablejobs[position]);
        garmentDescription.setText(description[position]);
        garmentDroppedby.setText(droppedby[position]);
        garmentBuyableatNpc.setText(buyabletannpc[position]);
        garmentObtainablefrom.setText(obtainablefrom[position]);


    }


}

    
    
    
    









