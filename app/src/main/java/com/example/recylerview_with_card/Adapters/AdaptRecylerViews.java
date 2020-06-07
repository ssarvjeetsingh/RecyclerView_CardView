package com.example.recylerview_with_card.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recylerview_with_card.Modal.DataContainer;
import com.example.recylerview_with_card.R;


public class AdaptRecylerViews extends RecyclerView.Adapter<AdaptRecylerViews.AdaptViewHolder> {

    DataContainer dataContainer=new DataContainer();


    int[] images;
    String[] names;

    public AdaptRecylerViews(String title) {

        for(int i=0;i<dataContainer.getCount();i++)
        {

                images=dataContainer.getimages(title);
                names=dataContainer.getNames(title);

        }


    }

    @NonNull
    @Override
    public AdaptViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemcontentadapter,parent,false);
        return  new AdaptViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptViewHolder holder, int position) {
      holder.textView.setText(names[position]);
        holder.imageView.setImageResource(images[position]);
        holder.imageView2.setImageResource(R.drawable.but1);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class AdaptViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView,imageView2;

        public AdaptViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.text1);
            imageView=itemView.findViewById(R.id.img);
            imageView2=itemView.findViewById(R.id.img2);
        }
    }
}
