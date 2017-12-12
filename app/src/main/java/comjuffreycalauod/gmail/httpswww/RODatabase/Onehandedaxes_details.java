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

public class Onehandedaxes_details extends AppCompatActivity {









    TextView onehandedaxesName, onehandedaxesType, onehandedaxesDefense, onehandedaxesBuy, onehandedaxesSell, onehandedaxesWeight, onehandedaxesRequiredlvl, onehandedaxesApplicablejobs, onehandedaxesDescription, onehandedaxesDroppedby, onehandedaxesBuyableatNpc, onehandedaxesObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onehandedaxes_details);


        onehandedaxesName = (TextView) findViewById(R.id.onehandedaxesname_txt);
        onehandedaxesType = (TextView) findViewById(R.id.onehandedaxestype_txt);
        onehandedaxesDefense = (TextView) findViewById(R.id.onehandedaxesdefense_txt);
        onehandedaxesBuy = (TextView) findViewById(R.id.onehandedaxesbuy_txt);
        onehandedaxesSell = (TextView) findViewById(R.id.onehandedaxessell_txt);
        onehandedaxesWeight = (TextView) findViewById(R.id.onehandedaxesweight_txt);
        onehandedaxesRequiredlvl = (TextView) findViewById(R.id.onehandedaxesreuiredlvl_txt);
        onehandedaxesApplicablejobs = (TextView) findViewById(R.id.onehandedaxesApplicableJobs_txt);
        onehandedaxesDescription = (TextView) findViewById(R.id.onehandedaxesDescription_txt);
        onehandedaxesDroppedby = (TextView) findViewById(R.id.onehandedaxesDroppedby_txt);
        onehandedaxesBuyableatNpc = (TextView) findViewById(R.id.onehandedaxesBuyableatNPC_txt);
        onehandedaxesObtainablefrom = (TextView) findViewById(R.id.onehandedaxesObtainable_txt);
        imageView = (ImageView) findViewById(R.id.onehandedaxes_img);


        type = getResources().getStringArray(R.array.onehandedaxestype);
        defense = getResources().getStringArray(R.array.onehandedaxesAttack);
        buy = getResources().getStringArray(R.array.onehandedaxesBuy);
        sell = getResources().getStringArray(R.array.onehandedaxesSELL);
        weight = getResources().getStringArray(R.array.onehandedaxesWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.onehandedaxesrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.onehandedaxesapplicableJobs);
        description = getResources().getStringArray(R.array.onehandedaxesDescription);
        droppedby = getResources().getStringArray(R.array.onehandedaxesDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.onehandedaxesBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.onehandedaxesObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        onehandedaxesName.setText(name);
        imageView.setImageResource(img);

        onehandedaxesType.setText(type[position]);
        onehandedaxesDefense.setText(defense[position]);
        onehandedaxesBuy.setText(buy[position]);
        onehandedaxesSell.setText(sell[position]);
        onehandedaxesWeight.setText(weight[position]);
        onehandedaxesRequiredlvl.setText(requiredlvl[position]);
        onehandedaxesApplicablejobs.setText(applicablejobs[position]);
        onehandedaxesDescription.setText(description[position]);
        onehandedaxesDroppedby.setText(droppedby[position]);
        onehandedaxesBuyableatNpc.setText(buyabletannpc[position]);
        onehandedaxesObtainablefrom.setText(obtainablefrom[position]);


    }
}
