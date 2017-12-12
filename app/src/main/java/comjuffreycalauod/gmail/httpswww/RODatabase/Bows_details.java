package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Mr.Darkycible on 9/28/2017.
 */

public class Bows_details extends AppCompatActivity {


    TextView bowsName, bowsType, bowsDefense, bowsBuy, bowsSell, bowsWeight, bowsRequiredlvl, bowsApplicablejobs, bowsDescription, bowsDroppedby, bowsBuyableatNpc, bowsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.bows_details);


        bowsName = (TextView) findViewById(R.id.bowsname_txt);
        bowsType = (TextView) findViewById(R.id.bowstype_txt);
        bowsDefense = (TextView) findViewById(R.id.bowsdefense_txt);
        bowsBuy = (TextView) findViewById(R.id.bowsbuy_txt);
        bowsSell = (TextView) findViewById(R.id.bowssell_txt);
        bowsWeight = (TextView) findViewById(R.id.bowsweight_txt);
        bowsRequiredlvl = (TextView) findViewById(R.id.bowsreuiredlvl_txt);
        bowsApplicablejobs = (TextView) findViewById(R.id.bowsApplicableJobs_txt);
        bowsDescription = (TextView) findViewById(R.id.bowsDescription_txt);
        bowsDroppedby = (TextView) findViewById(R.id.bowsDroppedby_txt);
        bowsBuyableatNpc = (TextView) findViewById(R.id.bowsBuyableatNPC_txt);
        bowsObtainablefrom = (TextView) findViewById(R.id.bowsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.bows_img);


        type = getResources().getStringArray(R.array.bowstype);
        defense = getResources().getStringArray(R.array.bowsAttack);
        buy = getResources().getStringArray(R.array.bowsBuy);
        sell = getResources().getStringArray(R.array.bowsSELL);
        weight = getResources().getStringArray(R.array.bowsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.bowsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.bowsapplicableJobs);
        description = getResources().getStringArray(R.array.bowsDescription);
        droppedby = getResources().getStringArray(R.array.bowsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.bowsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.bowsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        bowsName.setText(name);
        imageView.setImageResource(img);

        bowsType.setText(type[position]);
        bowsDefense.setText(defense[position]);
        bowsBuy.setText(buy[position]);
        bowsSell.setText(sell[position]);
        bowsWeight.setText(weight[position]);
        bowsRequiredlvl.setText(requiredlvl[position]);
        bowsApplicablejobs.setText(applicablejobs[position]);
        bowsDescription.setText(description[position]);
        bowsDroppedby.setText(droppedby[position]);
        bowsBuyableatNpc.setText(buyabletannpc[position]);
        bowsObtainablefrom.setText(obtainablefrom[position]);


    }









}
