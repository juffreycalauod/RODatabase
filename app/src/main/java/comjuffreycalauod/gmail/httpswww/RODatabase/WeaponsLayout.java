package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Mr.Darkycible on 8/14/2017.
 */

public class WeaponsLayout extends AppCompatActivity {





Button buttonSwords,buttonBows;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_options);


        buttonSwords =  findViewById(R.id.oneHandedSwords);
        buttonBows =  findViewById(R.id.Bows);



    }


    public void goToBows (View view) {


        Intent intent = new Intent(WeaponsLayout.this,BowsRecycler.class);
        startActivity(intent);


    }

    public void goToSwords (View view)

    {

        Intent intent = new Intent (WeaponsLayout.this,SwordsRecycler.class);
        startActivity(intent);


    }


    public void goToTwoHandSwords (View view)


    {

        Intent intent = new Intent(WeaponsLayout.this,TwoHandSwordsRecycler.class);
        startActivity(intent);



    }

    public void goToDaggers (View view)

    {


            Intent intent = new Intent(WeaponsLayout.this,DaggerRecycler.class);
            startActivity(intent);

    }

    public void goToOneHandedSpears (View view )

    {

        Intent intent = new Intent (WeaponsLayout.this, OneHandSpearRecycler.class);
        startActivity(intent);



    }


    public void goToTwoHandedSpears(View view)

    {

        Intent intent = new Intent(WeaponsLayout.this,TwoHandedSpearsRecycler.class);
        startActivity(intent);

    }

    public void goToOneHandedAxes (View view )

    {

        Intent intent = new Intent (WeaponsLayout.this,OneHandedAxesRecycler.class );
        startActivity(intent);

    }


    public void goToTwoHandedAxes (View view)

    {

        Intent intent = new Intent (WeaponsLayout.this,TwoHandedAxesRecycler.class );
        startActivity(intent);

    }

    public void goToMaces (View view)

    {


        Intent intent = new Intent (WeaponsLayout.this, MacesRecycler.class);
        startActivity(intent);

    }

    public void goToOneHandedStaffs(View view)

    {

        Intent intent = new Intent(WeaponsLayout.this,OneHandedStaffsRecycler.class);
        startActivity(intent);


    }

    public void goToKnuckles ( View view )

    {


        Intent intent = new Intent(WeaponsLayout.this,KnucklesRecycler.class);
        startActivity(intent);
    }


    public void goTOMusicalInstruments (View view)

    {

        Intent intent = new Intent(WeaponsLayout.this,MusicalInstrumentsRecycler.class);
        startActivity(intent);


    }

    public void goToWhips ( View view)

    {



        Intent intent = new Intent(WeaponsLayout.this,WhipsRecycler.class);
        startActivity(intent);
    }

    public void goToBooks (View view)

    {

        Intent intent = new Intent(WeaponsLayout.this,BooksRecycler.class);
        startActivity(intent);


    }

    public void goToKatar (View view)

    {


        Intent intent = new Intent(WeaponsLayout.this,KatarRecycler.class);
        startActivity(intent);


    }
    public void goToFuumaShuriken (View view)

    {
        Intent intent = new Intent (WeaponsLayout.this,FuumaShurikenRecycler.class);
        startActivity(intent);

    }
    public void goToGuns(View view)

    {

        Intent intent = new Intent(WeaponsLayout.this,GunsReycler.class);
        startActivity(intent);


    }







}
