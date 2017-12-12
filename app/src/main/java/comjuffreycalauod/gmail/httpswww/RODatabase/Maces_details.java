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

public class Maces_details extends AppCompatActivity {









        TextView macesName, macesType, macesDefense, macesBuy, macesSell, macesWeight, macesRequiredlvl, macesApplicablejobs, macesDescription, macesDroppedby, macesBuyableatNpc, macesObtainablefrom;

        Intent intent;
        int img;
        ImageView imageView;
        int position;

        String name;

        String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.maces_details);


            macesName = (TextView) findViewById(R.id.macesname_txt);
            macesType = (TextView) findViewById(R.id.macestype_txt);
            macesDefense = (TextView) findViewById(R.id.macesdefense_txt);
            macesBuy = (TextView) findViewById(R.id.macesbuy_txt);
            macesSell = (TextView) findViewById(R.id.macessell_txt);
            macesWeight = (TextView) findViewById(R.id.macesweight_txt);
            macesRequiredlvl = (TextView) findViewById(R.id.macesreuiredlvl_txt);
            macesApplicablejobs = (TextView) findViewById(R.id.macesApplicableJobs_txt);
            macesDescription = (TextView) findViewById(R.id.macesDescription_txt);
            macesDroppedby = (TextView) findViewById(R.id.macesDroppedby_txt);
            macesBuyableatNpc = (TextView) findViewById(R.id.macesBuyableatNPC_txt);
            macesObtainablefrom = (TextView) findViewById(R.id.macesObtainable_txt);
            imageView = (ImageView) findViewById(R.id.maces_img);


            type = getResources().getStringArray(R.array.macestype);
            defense = getResources().getStringArray(R.array.macesAttack);
            buy = getResources().getStringArray(R.array.macesBuy);
            sell = getResources().getStringArray(R.array.macesSELL);
            weight = getResources().getStringArray(R.array.macesWEIGHT);
            requiredlvl = getResources().getStringArray(R.array.macesrequiredLVL);
            applicablejobs = getResources().getStringArray(R.array.macesapplicableJobs);
            description = getResources().getStringArray(R.array.macesDescription);
            droppedby = getResources().getStringArray(R.array.macesDroppedby);
            buyabletannpc = getResources().getStringArray(R.array.macesBuyableatNpc);
            obtainablefrom = getResources().getStringArray(R.array.macesObtainablefrom);


            intent = getIntent();

            img = intent.getExtras().getInt("IMG");
            name = intent.getExtras().getString("NAME");
            position = intent.getExtras().getInt("POSITION");


            macesName.setText(name);
            imageView.setImageResource(img);

            macesType.setText(type[position]);
            macesDefense.setText(defense[position]);
            macesBuy.setText(buy[position]);
            macesSell.setText(sell[position]);
            macesWeight.setText(weight[position]);
            macesRequiredlvl.setText(requiredlvl[position]);
            macesApplicablejobs.setText(applicablejobs[position]);
            macesDescription.setText(description[position]);
            macesDroppedby.setText(droppedby[position]);
            macesBuyableatNpc.setText(buyabletannpc[position]);
            macesObtainablefrom.setText(obtainablefrom[position]);


        }
    }


