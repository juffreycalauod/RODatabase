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

public class Dagger_details extends AppCompatActivity {

    TextView daggersName, daggersType, daggersDefense, daggersBuy, daggersSell, daggersWeight, daggersRequiredlvl, daggersApplicablejobs, daggersDescription, daggersDroppedby, daggersBuyableatNpc, daggersObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagger_details);


        daggersName = (TextView) findViewById(R.id.daggersname_txt);
        daggersType = (TextView) findViewById(R.id.daggerstype_txt);
        daggersDefense = (TextView) findViewById(R.id.daggersdefense_txt);
        daggersBuy = (TextView) findViewById(R.id.daggersbuy_txt);
        daggersSell = (TextView) findViewById(R.id.daggerssell_txt);
        daggersWeight = (TextView) findViewById(R.id.daggersweight_txt);
        daggersRequiredlvl = (TextView) findViewById(R.id.daggersreuiredlvl_txt);
        daggersApplicablejobs = (TextView) findViewById(R.id.daggersApplicableJobs_txt);
        daggersDescription = (TextView) findViewById(R.id.daggersDescription_txt);
        daggersDroppedby = (TextView) findViewById(R.id.daggersDroppedby_txt);
        daggersBuyableatNpc = (TextView) findViewById(R.id.daggersBuyableatNPC_txt);
        daggersObtainablefrom = (TextView) findViewById(R.id.daggersObtainable_txt);
        imageView = (ImageView) findViewById(R.id.daggers_img);


        type = getResources().getStringArray(R.array.daggerstype);
        defense = getResources().getStringArray(R.array.daggersAttack);
        buy = getResources().getStringArray(R.array.daggersBuy);
        sell = getResources().getStringArray(R.array.daggersSELL);
        weight = getResources().getStringArray(R.array.daggersWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.daggersrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.daggersapplicableJobs);
        description = getResources().getStringArray(R.array.daggersDescription);
        droppedby = getResources().getStringArray(R.array.daggersDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.daggersBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.daggersObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        daggersName.setText(name);
        imageView.setImageResource(img);

        daggersType.setText(type[position]);
        daggersDefense.setText(defense[position]);
        daggersBuy.setText(buy[position]);
        daggersSell.setText(sell[position]);
        daggersWeight.setText(weight[position]);
        daggersRequiredlvl.setText(requiredlvl[position]);
        daggersApplicablejobs.setText(applicablejobs[position]);
        daggersDescription.setText(description[position]);
        daggersDroppedby.setText(droppedby[position]);
        daggersBuyableatNpc.setText(buyabletannpc[position]);
        daggersObtainablefrom.setText(obtainablefrom[position]);


    }






}
