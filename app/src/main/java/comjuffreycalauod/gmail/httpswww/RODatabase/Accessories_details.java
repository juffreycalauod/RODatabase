package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.array.accessoriesBuy;
import static comjuffreycalauod.gmail.httpswww.RODatabase.R.array.accessoriesDefense;

/**
 Accessories
 */

public class Accessories_details extends AppCompatActivity {








    Intent intent;
    int img;
    ImageView imageView;
    int position;



    String name;

    String [] type ,defense,buy,sell,weight,requiredlvl,applicablejobs,description,droppedby,buyabletannpc,obtainablefrom;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.accessories_details);
        TextView accessoriesName,accessoriesType,accessoriesDefense,accessoriesBuy,accessoriesSell,accessoriesWeight,accessoriesRequiredlvl,accessoriesApplicablejobs,accessoriesDescription,accessoriesDroppedby,accessoriesBuyableatNpc,accessoriesObtainablefrom;



        accessoriesName = findViewById(R.id.accessoriesname_txt);
        accessoriesType =  findViewById(R.id.accessoriestype_txt);
        accessoriesDefense =  findViewById(R.id.accessoriesdefense_txt);
        accessoriesBuy =  findViewById(R.id.accessoriesbuy_txt);
        accessoriesSell = findViewById(R.id.accessoriessell_txt);
        accessoriesWeight = findViewById(R.id.accessoriesweight_txt);
        accessoriesRequiredlvl =  findViewById(R.id.accessoriesreuiredlvl_txt);
        accessoriesApplicablejobs =  findViewById(R.id.accessoriesApplicableJobs_txt);
        accessoriesDescription = findViewById(R.id.accessoriesDescription_txt);
        accessoriesDroppedby =  findViewById(R.id.accessoriesDroppedby_txt);
        accessoriesBuyableatNpc =  findViewById(R.id.accessoriesBuyableatNPC_txt);
        accessoriesObtainablefrom =  findViewById(R.id.accessoriesObtainable_txt);
        imageView =  findViewById(R.id.accessories_img);


        type = getResources().getStringArray(R.array.accessoriestype);
        defense = getResources().getStringArray(R.array.accessoriesDefense);
        buy = getResources().getStringArray(R.array.accessoriesBuy);
        sell = getResources().getStringArray(R.array.accessoriesSELL);
        weight = getResources().getStringArray(R.array.accessoriesWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.accessoriesrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.accessoriesapplicableJobs);
        description = getResources().getStringArray(R.array.accessoriesDescription);
        droppedby = getResources().getStringArray(R.array.accessoriesDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.accessoriesBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.accessoriesObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        accessoriesName.setText(name);
        imageView.setImageResource(img);

        accessoriesType.setText(type[position]);
        accessoriesDefense.setText(defense[position]);
        accessoriesBuy.setText(buy[position]);
        accessoriesSell.setText(sell[position]);
        accessoriesWeight.setText(weight[position]);
        accessoriesRequiredlvl.setText(requiredlvl[position]);
        accessoriesApplicablejobs.setText(applicablejobs[position]);
        accessoriesDescription.setText(description[position]);
        accessoriesDroppedby.setText(droppedby[position]);
        accessoriesBuyableatNpc.setText(buyabletannpc[position]);
        accessoriesObtainablefrom.setText(obtainablefrom[position]);


    }

}
