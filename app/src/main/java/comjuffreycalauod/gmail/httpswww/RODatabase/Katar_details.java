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

public class Katar_details extends AppCompatActivity {








    TextView katarName, katarType, katarDefense, katarBuy, katarSell, katarWeight, katarRequiredlvl, katarApplicablejobs, katarDescription, katarDroppedby, katarBuyableatNpc, katarObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.katar_details);


        katarName = (TextView) findViewById(R.id.katarname_txt);
        katarType = (TextView) findViewById(R.id.katartype_txt);
        katarDefense = (TextView) findViewById(R.id.katardefense_txt);
        katarBuy = (TextView) findViewById(R.id.katarbuy_txt);
        katarSell = (TextView) findViewById(R.id.katarsell_txt);
        katarWeight = (TextView) findViewById(R.id.katarweight_txt);
        katarRequiredlvl = (TextView) findViewById(R.id.katarreuiredlvl_txt);
        katarApplicablejobs = (TextView) findViewById(R.id.katarApplicableJobs_txt);
        katarDescription = (TextView) findViewById(R.id.katarDescription_txt);
        katarDroppedby = (TextView) findViewById(R.id.katarDroppedby_txt);
        katarBuyableatNpc = (TextView) findViewById(R.id.katarBuyableatNPC_txt);
        katarObtainablefrom = (TextView) findViewById(R.id.katarObtainable_txt);
        imageView = (ImageView) findViewById(R.id.katar_img);


        type = getResources().getStringArray(R.array.katartype);
        defense = getResources().getStringArray(R.array.katarAttack);
        buy = getResources().getStringArray(R.array.katarBuy);
        sell = getResources().getStringArray(R.array.katarSELL);
        weight = getResources().getStringArray(R.array.katarWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.katarrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.katarapplicableJobs);
        description = getResources().getStringArray(R.array.katarDescription);
        droppedby = getResources().getStringArray(R.array.katarDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.katarBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.katarObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        katarName.setText(name);
        imageView.setImageResource(img);

        katarType.setText(type[position]);
        katarDefense.setText(defense[position]);
        katarBuy.setText(buy[position]);
        katarSell.setText(sell[position]);
        katarWeight.setText(weight[position]);
        katarRequiredlvl.setText(requiredlvl[position]);
        katarApplicablejobs.setText(applicablejobs[position]);
        katarDescription.setText(description[position]);
        katarDroppedby.setText(droppedby[position]);
        katarBuyableatNpc.setText(buyabletannpc[position]);
        katarObtainablefrom.setText(obtainablefrom[position]);


    }
}
