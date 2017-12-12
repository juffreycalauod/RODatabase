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

public class BooksRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener{




    private BooksRecyclerAdapter booksRecyclerAdapter;




    String [] text_Res;

    int [] img_Res = {R.drawable.ancientmagic,R.drawable.battlefieldtextbook,R.drawable.bible,R.drawable.book,R.drawable.bookofapocalypse,
            R.drawable.bookofbillows,R.drawable.bookofblazingsun,R.drawable.bookofgustwind,R.drawable.bookofmotherearth,R.drawable.bookofprayer,
            R.drawable.bookoftheddead,R.drawable.bravebattlestrategybook,R.drawable.diaryofgreatbasil,R.drawable.diaryofgreatsage,R.drawable.encyclopedia,
            R.drawable.giantencyclopedia,R.drawable.girlsdiary,R.drawable.gloriousapocalypse,R.drawable.glorioustablet,R.drawable.hardcoverbook,
            R.drawable.ledgerofdeath,R.drawable.legacyofdragon,R.drawable.principlesofmagic,R.drawable.refinedhardcoverbook,R.drawable.sagesdiary,R.drawable.tablet,
            R.drawable.valorousbattlestrategybook};

    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_recycler);


        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;




        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_books);

        text_Res = getResources().getStringArray(R.array.books_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        booksRecyclerAdapter= new BooksRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(booksRecyclerAdapter);






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

        booksRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }
}
