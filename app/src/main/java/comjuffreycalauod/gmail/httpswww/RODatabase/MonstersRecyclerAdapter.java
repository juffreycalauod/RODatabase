package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



import java.util.ArrayList;

/**
 * Created by Mr.Darkycible on 9/3/2017.
 */

public class MonstersRecyclerAdapter extends RecyclerView.Adapter<MonstersRecyclerAdapter.MonstersHolder>  {

Context context;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    public MonstersRecyclerAdapter(ArrayList<DataProvider> arrayList,Context context)

    {

        this.arrayList = arrayList;
        this.context = context;



    }








    @Override
    public MonstersHolder onCreateViewHolder (ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.monsters_layout,parent,false);

        MonstersHolder monstersHolder = new MonstersHolder(view);





        return monstersHolder;
    }



    @Override
    public void onBindViewHolder(final MonstersHolder holder, final int position) {






        final DataProvider dataProvider = arrayList.get(position);



        Glide.with(context).asGif().load(dataProvider.getImg_res()).into(holder.imageView);

      //  setFadeAnimation(holder.itemView);


        holder.textview.setText(dataProvider.getText_res());


        holder.textview.setOnClickListener(new View.OnClickListener() {






            @Override
            public void onClick(View v) {






                Intent intent = new Intent(v.getContext(),Monster_details.class);



                intent.putExtra("GIF",dataProvider.getImg_res());
                intent.putExtra("NAME",dataProvider.getText_res());
                intent.putExtra("POSITION",holder.getAdapterPosition());

                v.getContext().startActivity(intent);






            }
        });












    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class MonstersHolder extends RecyclerView.ViewHolder

    {

        ImageView imageView;
        TextView textview;



        public MonstersHolder(View view)


        {

            super(view);

           imageView  = (ImageView) view.findViewById(R.id.abysmal_img);



            textview = (TextView) view.findViewById(R.id.abysmal_txt);





        }


    }










    public void setFilter (ArrayList<DataProvider> searchList)


    {
        arrayList = new ArrayList<>();
        arrayList.addAll(searchList);

        notifyDataSetChanged();



    }

   // private void setFadeAnimation(View view) {
     //   AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
     //   anim.setDuration(FADE_DURATION);
     //   view.startAnimation(anim);
  //  }




}
