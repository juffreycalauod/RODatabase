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

public class OneHandSpear_details extends AppCompatActivity {





    TextView onehandspearsName, onehandspearsType, onehandspearsDefense, onehandspearsBuy, onehandspearsSell, onehandspearsWeight, onehandspearsRequiredlvl, onehandspearsApplicablejobs, onehandspearsDescription, onehandspearsDroppedby, onehandspearsBuyableatNpc, onehandspearsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onehandspears_details);


        onehandspearsName = (TextView) findViewById(R.id.onehandspearsname_txt);
        onehandspearsType = (TextView) findViewById(R.id.onehandspearstype_txt);
        onehandspearsDefense = (TextView) findViewById(R.id.onehandspearsdefense_txt);
        onehandspearsBuy = (TextView) findViewById(R.id.onehandspearsbuy_txt);
        onehandspearsSell = (TextView) findViewById(R.id.onehandspearssell_txt);
        onehandspearsWeight = (TextView) findViewById(R.id.onehandspearsweight_txt);
        onehandspearsRequiredlvl = (TextView) findViewById(R.id.onehandspearsreuiredlvl_txt);
        onehandspearsApplicablejobs = (TextView) findViewById(R.id.onehandspearsApplicableJobs_txt);
        onehandspearsDescription = (TextView) findViewById(R.id.onehandspearsDescription_txt);
        onehandspearsDroppedby = (TextView) findViewById(R.id.onehandspearsDroppedby_txt);
        onehandspearsBuyableatNpc = (TextView) findViewById(R.id.onehandspearsBuyableatNPC_txt);
        onehandspearsObtainablefrom = (TextView) findViewById(R.id.onehandspearsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.onehandspears_img);


        type = getResources().getStringArray(R.array.onehandspearstype);
        defense = getResources().getStringArray(R.array.onehandspearsAttack);
        buy = getResources().getStringArray(R.array.onehandspearsBuy);
        sell = getResources().getStringArray(R.array.onehandspearsSELL);
        weight = getResources().getStringArray(R.array.onehandspearsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.onehandspearsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.onehandspearsapplicableJobs);
        description = getResources().getStringArray(R.array.onehandspearsDescription);
        droppedby = getResources().getStringArray(R.array.onehandspearsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.onehandspearsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.onehandspearsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        onehandspearsName.setText(name);
        imageView.setImageResource(img);

        onehandspearsType.setText(type[position]);
        onehandspearsDefense.setText(defense[position]);
        onehandspearsBuy.setText(buy[position]);
        onehandspearsSell.setText(sell[position]);
        onehandspearsWeight.setText(weight[position]);
        onehandspearsRequiredlvl.setText(requiredlvl[position]);
        onehandspearsApplicablejobs.setText(applicablejobs[position]);
        onehandspearsDescription.setText(description[position]);
        onehandspearsDroppedby.setText(droppedby[position]);
        onehandspearsBuyableatNpc.setText(buyabletannpc[position]);
        onehandspearsObtainablefrom.setText(obtainablefrom[position]);


    }




}
