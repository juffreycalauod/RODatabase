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

public class MusicalInstrumentsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {




    private  MusicalInstrumentsRecyclerAdapter  musicalInstrumentsRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.bassguitar,R.drawable.berserkguitar,R.drawable.bravebattlefieldguitar,
            R.drawable.burningpassionguitar,R.drawable.cello,R.drawable.electricguitar,R.drawable.gentlebreezeguitar,
            R.drawable.gloriousguitar,R.drawable.greenacreguitar,R.drawable.guitar,R.drawable.gunmoongom,R.drawable.gunmoongom,
            R.drawable.harp,R.drawable.harpofnephentes,R.drawable.lonersguitar,R.drawable.lute,R.drawable.mandolin,R.drawable.orientallute,
            R.drawable.spiritedguitar,R.drawable.valorousbattlefieldguitar,R.drawable.violin};
    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicalinstruments_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;
        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_musicalinstruments);

        text_Res = getResources().getStringArray(R.array.musicalinstruments_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        musicalInstrumentsRecyclerAdapter= new MusicalInstrumentsRecyclerAdapter(arrayList ,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(musicalInstrumentsRecyclerAdapter);






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

        musicalInstrumentsRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }
}
