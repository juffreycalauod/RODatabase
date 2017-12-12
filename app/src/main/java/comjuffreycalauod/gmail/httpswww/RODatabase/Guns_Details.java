package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 10/1/2017.
 */

public class Guns_Details extends AppCompatActivity {








    TextView gunsName, gunsType, gunsDefense, gunsBuy, gunsSell, gunsWeight, gunsRequiredlvl, gunsApplicablejobs, gunsDescription, gunsDroppedby, gunsBuyableatNpc, gunsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guns_details);


        gunsName = (TextView) findViewById(R.id.gunsname_txt);
        gunsType = (TextView) findViewById(R.id.gunstype_txt);
        gunsDefense = (TextView) findViewById(R.id.gunsdefense_txt);
        gunsBuy = (TextView) findViewById(R.id.gunsbuy_txt);
        gunsSell = (TextView) findViewById(R.id.gunssell_txt);
        gunsWeight = (TextView) findViewById(R.id.gunsweight_txt);
        gunsRequiredlvl = (TextView) findViewById(R.id.gunsreuiredlvl_txt);
        gunsApplicablejobs = (TextView) findViewById(R.id.gunsApplicableJobs_txt);
        gunsDescription = (TextView) findViewById(R.id.gunsDescription_txt);
        gunsDroppedby = (TextView) findViewById(R.id.gunsDroppedby_txt);
        gunsBuyableatNpc = (TextView) findViewById(R.id.gunsBuyableatNPC_txt);
        gunsObtainablefrom = (TextView) findViewById(R.id.gunsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.guns_img);


        type = getResources().getStringArray(R.array.gunstype);
        defense = getResources().getStringArray(R.array.gunsAttack);
        buy = getResources().getStringArray(R.array.gunsBuy);
        sell = getResources().getStringArray(R.array.gunsSELL);
        weight = getResources().getStringArray(R.array.gunsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.gunsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.gunsapplicableJobs);
        description = getResources().getStringArray(R.array.gunsDescription);
        droppedby = getResources().getStringArray(R.array.gunsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.gunsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.gunsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        gunsName.setText(name);
        imageView.setImageResource(img);

        gunsType.setText(type[position]);
        gunsDefense.setText(defense[position]);
        gunsBuy.setText(buy[position]);
        gunsSell.setText(sell[position]);
        gunsWeight.setText(weight[position]);
        gunsRequiredlvl.setText(requiredlvl[position]);
        gunsApplicablejobs.setText(applicablejobs[position]);
        gunsDescription.setText(description[position]);
        gunsDroppedby.setText(droppedby[position]);
        gunsBuyableatNpc.setText(buyabletannpc[position]);
        gunsObtainablefrom.setText(obtainablefrom[position]);


    }
}
