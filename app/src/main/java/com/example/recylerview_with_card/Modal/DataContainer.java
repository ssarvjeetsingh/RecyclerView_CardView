package com.example.recylerview_with_card.Modal;


import com.example.recylerview_with_card.R;

import java.util.HashMap;

public class DataContainer {

    HashMap<Integer,String> hm=new HashMap<Integer,String>();

    String naturetitle[]={
            "Chrysanth",
            "Desert",
            "Hydrageas",
            "Jelly fish",
            "Koala",
            "LightHouse",
            "Penguins",
            "Tulips"


    };
    String storiestitle[]={
            "Happiness",
            "A Farmer",
            "Monkey King",
            "The Lion",
            "A Story",


    };
    String newstitle[]={
            "Delhi CM",
            "Protest",
            "Politics",


    };
    String religiontitle[]={
            "Equality",
            "One God",


    };


    int stories[]= {
            R.drawable.st1,
            R.drawable.st2,
            R.drawable.st3,
            R.drawable.st4,
            R.drawable.st5};

    int newsAndPolitics[]={
            R.drawable.poli1,
            R.drawable.poli2,
            R.drawable.poli3,

    };
    int religion[]={
            R.drawable.reli1,
            R.drawable.reli2,

    };
    int nature[]={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8
    };


    String title[]={"Nature","NewsandPolitics","Stories","Religion"};



    public int getCount(){

        return  title.length;

    }
    public String gettitle(int index){

        return title[index];
    }


    public int[] getimages(String title){

        if(title.equals("Stories"))
        {
            return stories;
        }
        else if(title.equals("Nature")){
            return nature;
        }
        else if(title.equals("NewsandPolitics")){
          return newsAndPolitics;
        }
        else if(title.equals("Religion")){
          return  religion;
        }

       return null;
    }

    public String[] getNames(String title){
        if(title.equals("Stories"))
        {
            return storiestitle;
        }
        else if(title.equals("Nature")){
            return naturetitle;
        }
        else if(title.equals("NewsandPolitics")){
            return newstitle;
        }
        else if(title.equals("Religion")){
            return  religiontitle;
        }
   return null;
    }

}
