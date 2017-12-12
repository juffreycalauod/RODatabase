package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.FixedPreloadSizeProvider;

import java.util.ArrayList;
import java.util.Collections;

import static android.R.attr.fragment;
import static android.view.KeyCharacterMap.load;

/**
 * Created by Mr.Darkycible on 10/2/2017.
 */

public class MapsRecyclerAdapter extends RecyclerView.Adapter<MapsRecyclerAdapter.MapsHolder> {



    Context context;

    ArrayList<DataProvider> arrayList = new ArrayList<>();








    public MapsRecyclerAdapter(ArrayList<DataProvider> arrayList, Context context)


    {

        this.arrayList = arrayList;
        this.context = context;


    }







    @Override
    public MapsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.maps_gallery,parent,false);



        return new MapsHolder(view);
    }

    @Override
    public void onBindViewHolder(final MapsHolder holder, int position) {

       final DataProvider dataProvider = arrayList.get(position);



        holder.textView.setText(dataProvider.getText_res());
        Glide.with(context).load(dataProvider.getImg_res()).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)).into(holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(v.getContext(),Maps_details.class);
                intent.putExtra("NAME",dataProvider.getText_res());
                intent.putExtra("IMG",dataProvider.getImg_res());
                intent.putExtra("POSITION",holder.getAdapterPosition());
                v.getContext().startActivity(intent);



            }
        });







    }








    @Override
    public int getItemCount() {
        return arrayList.size();
    }




    public static class MapsHolder extends RecyclerView.ViewHolder

    {

        ImageView imageView;
        TextView textView;



        public MapsHolder(View view)


        {




            super(view);


            imageView = view.findViewById(R.id.ama_fild01_img);
            textView = view.findViewById(R.id.ama_fild01_txt);





        }







    }



        public void setFilter(ArrayList<DataProvider> searchList )

        {


            arrayList = new ArrayList<>();
            arrayList.addAll(searchList);
            notifyDataSetChanged();




        }




}
