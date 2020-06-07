package com.example.recylerview_with_card.Adapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recylerview_with_card.Modal.DataContainer;
import com.example.recylerview_with_card.R;


public class MainAdapter extends  RecyclerView.Adapter<MainAdapter.MainViewHolder>  {
    DataContainer dataContainer;



    public Context context;




    public MainAdapter(Context context){
        this.context = context;
        dataContainer=new DataContainer();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.itemmainadapter,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(dataContainer.gettitle(position));
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setAdapter(new AdaptRecylerViews(dataContainer.gettitle(position)));
    }

    @Override
    public int getItemCount() {
        return dataContainer.getCount();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        RecyclerView recyclerView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.textview);
            recyclerView = itemView.findViewById(R.id.recycleView1);

        }
    }
}