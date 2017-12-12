package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.crashlytics.android.Crashlytics;

import java.util.ArrayList;


import io.fabric.sdk.android.Fabric;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/28/2017.
 */

public class AccessoriesRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener{




    private  AccessoriesRecyclerAdapter accessoriesRecyclerAdapter;




    String [] text_Res;

    int [] img_Res = {R.drawable.academyofbadge,R.drawable.accelerator,R.drawable.acolytefigure,R.drawable.acolytemanual,
            R.drawable.adventurerstrustytowel,R.drawable.allinonering,R.drawable.angelicring,R.drawable.archerfigure,R.drawable.archermanual,
            R.drawable.armorcharm,R.drawable.arresthandcuffs,R.drawable.aumdurasbenefit,R.drawable.badgeofordergrace,R.drawable.barrierbuilder,R.drawable.beholderring,
            R.drawable.belcarf,R.drawable.belt,R.drawable.bisonhorn,R.drawable.blackcat,R.drawable.bloodiedshackleball,R.drawable.bloodyironball,
            R.drawable.bloodyring,R.drawable.bowmanscarf,R.drawable.bowthimble,R.drawable.bradiumbrooch,R.drawable.bradiumring,R.drawable.brisingamen,
            R.drawable.brooch,R.drawable.bunchofcarnations,R.drawable.camouflague,R.drawable.celebrantssmitten,R.drawable.celebrationring,
            R.drawable.certificate,R.drawable.chemicalring,R.drawable.chinesehandicraft,R.drawable.christmasmusicbox,R.drawable.clamorousring,
            R.drawable.clip,R.drawable.coldheart,R.drawable.coolingdevice,R.drawable.criticalring,R.drawable.cursedhand,R.drawable.cursedstar,
            R.drawable.darkknightbelt,R.drawable.darkknightglove,R.drawable.deathloop,R.drawable.decussatering,R.drawable.diabolusring,R.drawable.diamondring,
            R.drawable.directive,R.drawable.dragonring,R.drawable.earring,R.drawable.exorcisingring,R.drawable.expertring,R.drawable.eyeofdulllahan,R.drawable.eyestonering,
            R.drawable.fashionhipsack,R.drawable.fifthanniversarycoin,R.drawable.fischerring,R.drawable.flowerring,R.drawable.footring,R.drawable.freshfish,
            R.drawable.gauntleotfhit,R.drawable.gloriousmassproductionring,R.drawable.gloriousring,R.drawable.glove,R.drawable.goddessoffortunescursedbrooch,R.drawable.goldchristmasring,
            R.drawable.goldenaccessories,R.drawable.greenapplering,R.drawable.gusli,R.drawable.hallowring,R.drawable.honorgoldring,R.drawable.huntersearring,
            R.drawable.icaruswings,R.drawable.insctesidering,R.drawable.ironwrist,R.drawable.kafraring,R.drawable.kuirpenring,R.drawable.laboratorypermit,R.drawable.lanternofhope,
            R.drawable.lesserelementalring,R.drawable.librarianglove,R.drawable.llinenglove,R.drawable.lordring,R.drawable.lunaticbrooch,R.drawable.lure,
            R.drawable.magefigure,R.drawable.magemanual,R.drawable.magicstonering,R.drawable.magneticfieldgenerator,R.drawable.marvelouspendant,R.drawable.matyrsleash,
            R.drawable.medalofhonor,R.drawable.megingjard,R.drawable.merchantfigure,R.drawable.merchantmanual,R.drawable.moonlightring,R.drawable.morpheussbracelet,
            R.drawable.morpheussring,R.drawable.morriganesbelt,R.drawable.morriganespendant,R.drawable.navelring,R.drawable.necklace,R.drawable.neoskullring,
            R.drawable.nilerose,R.drawable.novicearmlet,R.drawable.novicefigure,R.drawable.occultinsense,R.drawable.ordinarycoin,R.drawable.orleansgloves,
            R.drawable.pinguiculacorsage,R.drawable.pocketwatch,R.drawable.praccsinos,R.drawable.ragnaroklimitededition,R.drawable.redsilkseal,R.drawable.renownarchersgloves,R.drawable.repairkit,
            R.drawable.republicanniversaryring,R.drawable.ring,R.drawable.ringofearth,R.drawable.ringoffire,R.drawable.ringofflamelord,R.drawable.ringofhonor,
            R.drawable.ringofllonging,R.drawable.ringofresonance,R.drawable.ringoftheancientwiseking,R.drawable.ringofwater,R.drawable.ringofwind,R.drawable.rjcnecklace,
            R.drawable.rocks,R.drawable.roguestreasure,R.drawable.rosary,R.drawable.runespelllstone,R.drawable.rustycoin,R.drawable.sacredincense,R.drawable.sacrificering,R.drawable.safetyring,R.drawable.satanicring,
            R.drawable.sealofcontinentalguard,R.drawable.serinssgoldring,R.drawable.shamanearrings,R.drawable.shamanring,R.drawable.shapeshifter,R.drawable.sheriffbadge,
            R.drawable.shinobisash,R.drawable.shinycoin,R.drawable.silverchristmasring,R.drawable.silverring,R.drawable.skullring,R.drawable.smallfishingrod,R.drawable.spiritualring,R.drawable.sprintring,
            R.drawable.suicidaldevice,R.drawable.swordsmanfigure,R.drawable.swordsmanmanual,R.drawable.theiffigure,R.drawable.thesign,R.drawable.thiefmanual,R.drawable.thirdanniversarycelebrationring,R.drawable.valentinepledge,
            R.drawable.vespercore,R.drawable.warriorsshiningring,R.drawable.waterdropbrooch,R.drawable.weddingring,R.drawable.willofexhaustedangel,R.drawable.womanglory};








    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.accessories_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;




        recyclerView =  findViewById(R.id.recyclerwidget_accessories);

        text_Res = getResources().getStringArray(R.array.accessories_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        accessoriesRecyclerAdapter= new AccessoriesRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(accessoriesRecyclerAdapter);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem= menu.findItem(action_search);

        SearchView searchView = (SearchView) menuitem.getActionView();

        searchView.setOnQueryTextListener(this);






        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        newText = newText.toLowerCase();


        ArrayList<DataProvider> filterArrayList = new ArrayList<>();

        for(DataProvider dataProvider: arrayList)

        {
            String searchText = dataProvider.getText_res().toLowerCase();

            if(searchText.startsWith(newText))

            {

                filterArrayList.add(dataProvider);

            }


        }

        accessoriesRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }

}
