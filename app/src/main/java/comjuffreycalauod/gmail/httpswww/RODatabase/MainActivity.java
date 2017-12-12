package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.app.ActionBar;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.formats.NativeAd;



import io.fabric.sdk.android.Fabric;

import static android.R.attr.x;


public class MainActivity extends AppCompatActivity {

















    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this,new Crashlytics());



        setContentView(R.layout.main_options);




        Fabric fabric = new Fabric.Builder(this)
                .kits(new Crashlytics())
                .debuggable(true)
                .build();
        Fabric.with(fabric);
        setTitle("RODatabase");

















    }







    public void goToCards (View v)

    {


        Intent intent  = new Intent (MainActivity.this, CardsRecycler.class);
        startActivity(intent);

    }

    public void goToWeapons (View v)

    {

        Intent intent = new Intent (MainActivity.this,WeaponsLayout.class );
        startActivity(intent);


    }


    public void goToArmor (View view)
    {

        Intent intent = new Intent(MainActivity.this,ArmorRecycler.class);
        startActivity(intent);


    }


    public void goToShields (View view)
    {

        Intent intent = new Intent(MainActivity.this,ShieldRecycler.class);
        startActivity(intent);


    }

    public void goToGarments (View view )
    {

        Intent intent = new Intent(MainActivity.this,GarmentRecycler.class);
        startActivity(intent);

    }
    public void goToFootGears (View view ) {



        Intent intent = new Intent(MainActivity.this,FootgearRecycler.class);
        startActivity(intent);


    }

    public void goToAccessories (View view)

    {

        Intent intent =  new Intent(MainActivity.this,AccessoriesRecycler.class);
        startActivity(intent);


    }

    public void goToMonsters (View view)

    {

        Intent intent = new Intent(MainActivity.this, MonstersRecycler.class);
        startActivity(intent);




    }

    public void goTOMaps(View view )


    {


        Intent intent = new Intent(MainActivity.this,Maps_Recycler.class);
        startActivity(intent);


    }











}
