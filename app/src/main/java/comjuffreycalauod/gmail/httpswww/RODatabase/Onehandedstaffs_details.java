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

public class Onehandedstaffs_details extends AppCompatActivity {










    TextView onehandedstaffsName, onehandedstaffsType, onehandedstaffsDefense, onehandedstaffsBuy, onehandedstaffsSell, onehandedstaffsWeight, onehandedstaffsRequiredlvl, onehandedstaffsApplicablejobs, onehandedstaffsDescription, onehandedstaffsDroppedby, onehandedstaffsBuyableatNpc, onehandedstaffsObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onehandedstaffs_details);


        onehandedstaffsName = (TextView) findViewById(R.id.onehandedstaffsname_txt);
        onehandedstaffsType = (TextView) findViewById(R.id.onehandedstaffstype_txt);
        onehandedstaffsDefense = (TextView) findViewById(R.id.onehandedstaffsdefense_txt);
        onehandedstaffsBuy = (TextView) findViewById(R.id.onehandedstaffsbuy_txt);
        onehandedstaffsSell = (TextView) findViewById(R.id.onehandedstaffssell_txt);
        onehandedstaffsWeight = (TextView) findViewById(R.id.onehandedstaffsweight_txt);
        onehandedstaffsRequiredlvl = (TextView) findViewById(R.id.onehandedstaffsreuiredlvl_txt);
        onehandedstaffsApplicablejobs = (TextView) findViewById(R.id.onehandedstaffsApplicableJobs_txt);
        onehandedstaffsDescription = (TextView) findViewById(R.id.onehandedstaffsDescription_txt);
        onehandedstaffsDroppedby = (TextView) findViewById(R.id.onehandedstaffsDroppedby_txt);
        onehandedstaffsBuyableatNpc = (TextView) findViewById(R.id.onehandedstaffsBuyableatNPC_txt);
        onehandedstaffsObtainablefrom = (TextView) findViewById(R.id.onehandedstaffsObtainable_txt);
        imageView = (ImageView) findViewById(R.id.onehandedstaffs_img);


        type = getResources().getStringArray(R.array.onehandedstaffstype);
        defense = getResources().getStringArray(R.array.onehandedstaffsAttack);
        buy = getResources().getStringArray(R.array.onehandedstaffsBuy);
        sell = getResources().getStringArray(R.array.onehandedstaffsSELL);
        weight = getResources().getStringArray(R.array.onehandedstaffsWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.onehandedstaffsrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.onehandedstaffsapplicableJobs);
        description = getResources().getStringArray(R.array.onehandedstaffsDescription);
        droppedby = getResources().getStringArray(R.array.onehandedstaffsDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.onehandedstaffsBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.onehandedstaffsObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        onehandedstaffsName.setText(name);
        imageView.setImageResource(img);

        onehandedstaffsType.setText(type[position]);
        onehandedstaffsDefense.setText(defense[position]);
        onehandedstaffsBuy.setText(buy[position]);
        onehandedstaffsSell.setText(sell[position]);
        onehandedstaffsWeight.setText(weight[position]);
        onehandedstaffsRequiredlvl.setText(requiredlvl[position]);
        onehandedstaffsApplicablejobs.setText(applicablejobs[position]);
        onehandedstaffsDescription.setText(description[position]);
        onehandedstaffsDroppedby.setText(droppedby[position]);
        onehandedstaffsBuyableatNpc.setText(buyabletannpc[position]);
        onehandedstaffsObtainablefrom.setText(obtainablefrom[position]);


    }
}
