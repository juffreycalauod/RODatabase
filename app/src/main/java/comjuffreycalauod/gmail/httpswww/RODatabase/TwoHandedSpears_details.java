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

public class TwoHandedSpears_details extends AppCompatActivity {







    TextView twohandedspearsName, twohandedspearsType, twohandedspearsDefense, twohandedspearsBuy, twohandedspearsSell, twohandedspearsWeight, twohandedspearsRequiredlvl, twohandedspearsApplicablejobs, twohandedspearsDescription, twohandedspearsDroppedby, twohandedspearsBuyableatNpc, twohandedspearsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twohandedspears_details);


        twohandedspearsName = (TextView) findViewById(R.id.twohandedspearsname_txt);
        twohandedspearsType = (TextView) findViewById(R.id.twohandedspearstype_txt);
        twohandedspearsDefense = (TextView) findViewById(R.id.twohandedspearsdefense_txt);
        twohandedspearsBuy = (TextView) findViewById(R.id.twohandedspearsbuy_txt);
        twohandedspearsSell = (TextView) findViewById(R.id.twohandedspearssell_txt);
        twohandedspearsWeight = (TextView) findViewById(R.id.twohandedspearsweight_txt);
        twohandedspearsRequiredlvl = (TextView) findViewById(R.id.twohandedspearsreuiredlvl_txt);
        twohandedspearsApplicablejobs = (TextView) findViewById(R.id.twohandedspearsApplicableJobs_txt);
        twohandedspearsDescription = (TextView) findViewById(R.id.twohandedspearsDescription_txt);
        twohandedspearsDroppedby = (TextView) findViewById(R.id.twohandedspearsDroppedby_txt);
        twohandedspearsBuyableatNpc = (TextView) findViewById(R.id.twohandedspearsBuyableatNPC_txt);
        twohandedspearsObtainablefrom = (TextView) findViewById(R.id.twohandedspearsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.twohandedspears_img);


        type = getResources().getStringArray(R.array.twohandedspearstype);
        defense = getResources().getStringArray(R.array.twohandedspearsAttack);
        buy = getResources().getStringArray(R.array.twohandedspearsBuy);
        sell = getResources().getStringArray(R.array.twohandedspearsSELL);
        weight = getResources().getStringArray(R.array.twohandedspearsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.twohandedspearsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.twohandedspearsapplicableJobs);
        description = getResources().getStringArray(R.array.twohandedspearsDescription);
        droppedby = getResources().getStringArray(R.array.twohandedspearsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.twohandedspearsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.twohandedspearsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        twohandedspearsName.setText(name);
        imageView.setImageResource(img);

        twohandedspearsType.setText(type[position]);
        twohandedspearsDefense.setText(defense[position]);
        twohandedspearsBuy.setText(buy[position]);
        twohandedspearsSell.setText(sell[position]);
        twohandedspearsWeight.setText(weight[position]);
        twohandedspearsRequiredlvl.setText(requiredlvl[position]);
        twohandedspearsApplicablejobs.setText(applicablejobs[position]);
        twohandedspearsDescription.setText(description[position]);
        twohandedspearsDroppedby.setText(droppedby[position]);
        twohandedspearsBuyableatNpc.setText(buyabletannpc[position]);
        twohandedspearsObtainablefrom.setText(obtainablefrom[position]);


    }
    
    
    
}
