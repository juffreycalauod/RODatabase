package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 9/30/2017.
 */

public class Knuckles_details extends AppCompatActivity {
    
    
    








    TextView knucklesName, knucklesType, knucklesDefense, knucklesBuy, knucklesSell, knucklesWeight, knucklesRequiredlvl, knucklesApplicablejobs, knucklesDescription, knucklesDroppedby, knucklesBuyableatNpc, knucklesObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knuckles_details);


        knucklesName = (TextView) findViewById(R.id.knucklesname_txt);
        knucklesType = (TextView) findViewById(R.id.knucklestype_txt);
        knucklesDefense = (TextView) findViewById(R.id.knucklesdefense_txt);
        knucklesBuy = (TextView) findViewById(R.id.knucklesbuy_txt);
        knucklesSell = (TextView) findViewById(R.id.knucklessell_txt);
        knucklesWeight = (TextView) findViewById(R.id.knucklesweight_txt);
        knucklesRequiredlvl = (TextView) findViewById(R.id.knucklesreuiredlvl_txt);
        knucklesApplicablejobs = (TextView) findViewById(R.id.knucklesApplicableJobs_txt);
        knucklesDescription = (TextView) findViewById(R.id.knucklesDescription_txt);
        knucklesDroppedby = (TextView) findViewById(R.id.knucklesDroppedby_txt);
        knucklesBuyableatNpc = (TextView) findViewById(R.id.knucklesBuyableatNPC_txt);
        knucklesObtainablefrom = (TextView) findViewById(R.id.knucklesObtainable_txt);
        imageView = (ImageView) findViewById(R.id.knuckles_img);


        type = getResources().getStringArray(R.array.knucklestype);
        defense = getResources().getStringArray(R.array.knucklesAttack);
        buy = getResources().getStringArray(R.array.knucklesBuy);
        sell = getResources().getStringArray(R.array.knucklesSELL);
        weight = getResources().getStringArray(R.array.knucklesWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.knucklesrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.knucklesapplicableJobs);
        description = getResources().getStringArray(R.array.knucklesDescription);
        droppedby = getResources().getStringArray(R.array.knucklesDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.knucklesBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.knucklesObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        knucklesName.setText(name);
        imageView.setImageResource(img);

        knucklesType.setText(type[position]);
        knucklesDefense.setText(defense[position]);
        knucklesBuy.setText(buy[position]);
        knucklesSell.setText(sell[position]);
        knucklesWeight.setText(weight[position]);
        knucklesRequiredlvl.setText(requiredlvl[position]);
        knucklesApplicablejobs.setText(applicablejobs[position]);
        knucklesDescription.setText(description[position]);
        knucklesDroppedby.setText(droppedby[position]);
        knucklesBuyableatNpc.setText(buyabletannpc[position]);
        knucklesObtainablefrom.setText(obtainablefrom[position]);


    }
            

}
