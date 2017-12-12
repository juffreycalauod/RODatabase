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

public class TwoHandedAxes_details extends AppCompatActivity {










    TextView twohandedaxesName, twohandedaxesType, twohandedaxesDefense, twohandedaxesBuy, twohandedaxesSell, twohandedaxesWeight, twohandedaxesRequiredlvl, twohandedaxesApplicablejobs, twohandedaxesDescription, twohandedaxesDroppedby, twohandedaxesBuyableatNpc, twohandedaxesObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twohandedaxes_details);


        twohandedaxesName = (TextView) findViewById(R.id.twohandedaxesname_txt);
        twohandedaxesType = (TextView) findViewById(R.id.twohandedaxestype_txt);
        twohandedaxesDefense = (TextView) findViewById(R.id.twohandedaxesdefense_txt);
        twohandedaxesBuy = (TextView) findViewById(R.id.twohandedaxesbuy_txt);
        twohandedaxesSell = (TextView) findViewById(R.id.twohandedaxessell_txt);
        twohandedaxesWeight = (TextView) findViewById(R.id.twohandedaxesweight_txt);
        twohandedaxesRequiredlvl = (TextView) findViewById(R.id.twohandedaxesreuiredlvl_txt);
        twohandedaxesApplicablejobs = (TextView) findViewById(R.id.twohandedaxesApplicableJobs_txt);
        twohandedaxesDescription = (TextView) findViewById(R.id.twohandedaxesDescription_txt);
        twohandedaxesDroppedby = (TextView) findViewById(R.id.twohandedaxesDroppedby_txt);
        twohandedaxesBuyableatNpc = (TextView) findViewById(R.id.twohandedaxesBuyableatNPC_txt);
        twohandedaxesObtainablefrom = (TextView) findViewById(R.id.twohandedaxesObtainable_txt);
        imageView = (ImageView) findViewById(R.id.twohandedaxes_img);


        type = getResources().getStringArray(R.array.twohandedaxestype);
        defense = getResources().getStringArray(R.array.twohandedaxesAttack);
        buy = getResources().getStringArray(R.array.twohandedaxesBuy);
        sell = getResources().getStringArray(R.array.twohandedaxesSELL);
        weight = getResources().getStringArray(R.array.twohandedaxesWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.twohandedaxesrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.twohandedaxesapplicableJobs);
        description = getResources().getStringArray(R.array.twohandedaxesDescription);
        droppedby = getResources().getStringArray(R.array.twohandedaxesDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.twohandedaxesBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.twohandedaxesObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        twohandedaxesName.setText(name);
        imageView.setImageResource(img);

        twohandedaxesType.setText(type[position]);
        twohandedaxesDefense.setText(defense[position]);
        twohandedaxesBuy.setText(buy[position]);
        twohandedaxesSell.setText(sell[position]);
        twohandedaxesWeight.setText(weight[position]);
        twohandedaxesRequiredlvl.setText(requiredlvl[position]);
        twohandedaxesApplicablejobs.setText(applicablejobs[position]);
        twohandedaxesDescription.setText(description[position]);
        twohandedaxesDroppedby.setText(droppedby[position]);
        twohandedaxesBuyableatNpc.setText(buyabletannpc[position]);
        twohandedaxesObtainablefrom.setText(obtainablefrom[position]);


    }



}
