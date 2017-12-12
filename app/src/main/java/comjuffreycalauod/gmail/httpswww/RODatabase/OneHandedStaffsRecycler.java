package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/19/2017.
 */

public class OneHandedStaffsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener
{



    private  OnehandedStaffsRecyclerAdapter  onehandedStaffsRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.arcwand,R.drawable.crocestaff,R.drawable.deadtreecane,R.drawable.eraser,
            R.drawable.evilbonewand,R.drawable.gentlemansstaff,R.drawable.gloriousarcwand,R.drawable.gloriouscurewand,
            R.drawable.healingstaff,R.drawable.hypnotistsstaff,R.drawable.lacrymastick,R.drawable.llichsbonewand,R.drawable.mightystaff,
            R.drawable.novicerod,R.drawable.piercingstaff,R.drawable.refinedsurvivorsrod,R.drawable.releaseofwish,R.drawable.rod,
            R.drawable.speedyrecoverywand,R.drawable.staff,R.drawable.staffofbordeaux,R.drawable.staffofdarknness,R.drawable.staffofhealing,
            R.drawable.staffofpiercing,R.drawable.staffy,R.drawable.strongrecoverwand,R.drawable.survivorssrod,R.drawable.thornstaffofdarkness,R.drawable.wand,
            R.drawable.wandofoccult,R.drawable.warlocksmagicwand,R.drawable.warlockssbattlewand,R.drawable.wingstaff};


    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onhandedstaffs_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;
        recyclerView =  findViewById(R.id.recyclerwidget_onehandedstaffs);

        text_Res = getResources().getStringArray(R.array.onehandedstaffs_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        onehandedStaffsRecyclerAdapter= new OnehandedStaffsRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(onehandedStaffsRecyclerAdapter);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem = menu.findItem(action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
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

        onehandedStaffsRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }

}
