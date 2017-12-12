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

public class Fuumashuriken_details extends AppCompatActivity {









    TextView fuumashurikenName, fuumashurikenType, fuumashurikenDefense, fuumashurikenBuy, fuumashurikenSell, fuumashurikenWeight, fuumashurikenRequiredlvl, fuumashurikenApplicablejobs, fuumashurikenDescription, fuumashurikenDroppedby, fuumashurikenBuyableatNpc, fuumashurikenObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String[] type, defense, buy, sell, weight, requiredlvl, applicablejobs, description, droppedby, buyabletannpc, obtainablefrom;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuumashuriken_details);


        fuumashurikenName = (TextView) findViewById(R.id.fuumashurikenname_txt);
        fuumashurikenType = (TextView) findViewById(R.id.fuumashurikentype_txt);
        fuumashurikenDefense = (TextView) findViewById(R.id.fuumashurikendefense_txt);
        fuumashurikenBuy = (TextView) findViewById(R.id.fuumashurikenbuy_txt);
        fuumashurikenSell = (TextView) findViewById(R.id.fuumashurikensell_txt);
        fuumashurikenWeight = (TextView) findViewById(R.id.fuumashurikenweight_txt);
        fuumashurikenRequiredlvl = (TextView) findViewById(R.id.fuumashurikenreuiredlvl_txt);
        fuumashurikenApplicablejobs = (TextView) findViewById(R.id.fuumashurikenApplicableJobs_txt);
        fuumashurikenDescription = (TextView) findViewById(R.id.fuumashurikenDescription_txt);
        fuumashurikenDroppedby = (TextView) findViewById(R.id.fuumashurikenDroppedby_txt);
        fuumashurikenBuyableatNpc = (TextView) findViewById(R.id.fuumashurikenBuyableatNPC_txt);
        fuumashurikenObtainablefrom = (TextView) findViewById(R.id.fuumashurikenObtainable_txt);
        imageView = (ImageView) findViewById(R.id.fuumashuriken_img);


        type = getResources().getStringArray(R.array.fuumashurikentype);
        defense = getResources().getStringArray(R.array.fuumashurikenAttack);
        buy = getResources().getStringArray(R.array.fuumashurikenBuy);
        sell = getResources().getStringArray(R.array.fuumashurikenSELL);
        weight = getResources().getStringArray(R.array.fuumashurikenWEIGHT);
        requiredlvl = getResources().getStringArray(R.array.fuumashurikenrequiredLVL);
        applicablejobs = getResources().getStringArray(R.array.fuumashurikenapplicableJobs);
        description = getResources().getStringArray(R.array.fuumashurikenDescription);
        droppedby = getResources().getStringArray(R.array.fuumashurikenDroppedby);
        buyabletannpc = getResources().getStringArray(R.array.fuumashurikenBuyableatNpc);
        obtainablefrom = getResources().getStringArray(R.array.fuumashurikenObtainablefrom);


        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name = intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");


        fuumashurikenName.setText(name);
        imageView.setImageResource(img);

        fuumashurikenType.setText(type[position]);
        fuumashurikenDefense.setText(defense[position]);
        fuumashurikenBuy.setText(buy[position]);
        fuumashurikenSell.setText(sell[position]);
        fuumashurikenWeight.setText(weight[position]);
        fuumashurikenRequiredlvl.setText(requiredlvl[position]);
        fuumashurikenApplicablejobs.setText(applicablejobs[position]);
        fuumashurikenDescription.setText(description[position]);
        fuumashurikenDroppedby.setText(droppedby[position]);
        fuumashurikenBuyableatNpc.setText(buyabletannpc[position]);
        fuumashurikenObtainablefrom.setText(obtainablefrom[position]);


    }
}
