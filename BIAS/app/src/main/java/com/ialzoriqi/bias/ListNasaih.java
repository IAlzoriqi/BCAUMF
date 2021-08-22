package com.ialzoriqi.bias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ImageView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListNasaih extends AppCompatActivity {

    ImageView imageView;

    public ListView list;
    public ArrayList<Nasah> countries = new ArrayList<Nasah>();
    public NadahAdapter adapter;
    public final static String
            TITLE_BF_KEY ="TITLE_BF_KEY";

    public final static String
            TITLE_BMI_KEY ="TITLE_BMI_KEY";

    public final static String
            TITLE_TBW_KEY ="TITLE_TBW_KEY";
    public final static String
            TITLE_BCM_KEY ="TITLE_BCM_KEY";

    public final static String
            TITLE_FFM_KEY ="TITLE_FFM_KEY";

    public final static String
            TITLE_TBK_KEY ="TITLE_TBK_KEY";
    public final static String
            TITLE_SMM_KEY ="TITLE_SMM_KEY";
    public final static String
            IMAGE_SMM_KEY ="IMAGE_SMM_KEY";













    public final static String
            VAL_SMM_KEY ="VAL_SMM_KEY";
    public final static String
            VAL_TBK_KEY ="VAL_TBK_KEY";
    public final static String
            VAL_FFM_KEY ="VAL_FFM_KEY";
    public final static String
            VAL_BCM_KEY ="VAL_BCM_KEY";
    public final static String
            VAL_TBW_KEY ="VAL_TBW_KEY";
    public final static String
            VAL_BMI_KEY ="VAL_BMI_KEY";
    public final static String
            VAL_BF_KEY ="VAL_BF_KEY";


    public  String BF_VAl;
    public  String BMI_VAl;
    public  String TBW_VAl;
    public  String BCM_VAl;
    public  String FFM_VAl;
    public  String TBK_VAl;
    public  String SMM_VAl;

    public int Color_BF;
    public int Color_BMI;
    public int Color_TBW;
    public int Color_BCM;
    public int Color_FFM;
    public int Color_TBK;
    public int Color_SMM;











    public final static String
            COLOR_SMM_KEY ="COLOR_SMM_KEY";
    public final static String
            COLOR_TBK_KEY ="COLOR_TBK_KEY";
    public final static String
            COLOR_FFM_KEY ="COLOR_FFM_KEY";
    public final static String
            COLOR_BCM_KEY ="COLOR_BCM_KEY";
    public final static String
            COLOR_TBW_KEY ="COLOR_TBW_KEY";
    public final static String
            COLOR_BMI_KEY ="COLOR_BMI_KEY";
    public final static String
            COLOR_BF_KEY ="COLOR_BF_KEY";



    String BF_Title;
    String BMI_Title;
    String TBW_Title;
    String FFM_Title;
    String BCM_Title;
    String TBK_Title;
    String SMM_Title;
    String SMM_TitleNot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_nasaih);

        Bundle extras = getIntent().getExtras();


        BF_Title= extras.getString(TITLE_BF_KEY);
         BMI_Title= extras.getString(TITLE_BMI_KEY);
         TBW_Title= extras.getString(TITLE_TBW_KEY);
         FFM_Title= extras.getString(TITLE_FFM_KEY);
         BCM_Title= extras.getString(TITLE_BCM_KEY);
         TBK_Title= extras.getString(TITLE_TBK_KEY);
         SMM_Title= extras.getString(TITLE_SMM_KEY);
         SMM_TitleNot=extras.getString(TITLE_SMM_KEY+"Not") ;

        imageView=findViewById(R.id.imageView);



        TBW_VAl= extras.getString(VAL_TBW_KEY);
        BCM_VAl= extras.getString(VAL_BCM_KEY);
        BMI_VAl= extras.getString(VAL_BMI_KEY);
        FFM_VAl= extras.getString(VAL_FFM_KEY);
        SMM_VAl= extras.getString(VAL_SMM_KEY);
        TBK_VAl= extras.getString(VAL_TBK_KEY);
        BF_VAl= extras.getString(VAL_BF_KEY);





        Color_TBW= extras.getInt(COLOR_TBW_KEY);
        Color_BCM= extras.getInt(COLOR_BCM_KEY);
        Color_BMI= extras.getInt(COLOR_BMI_KEY);
        Color_FFM= extras.getInt(COLOR_FFM_KEY);
        Color_SMM= extras.getInt(COLOR_SMM_KEY);
        Color_TBK= extras.getInt(COLOR_TBK_KEY);
        Color_BF= extras.getInt(COLOR_BF_KEY);




        Log.e("TAG", "BF_Title "+BF_Title);
        Log.e("TAG", "BMI_Title "+BMI_Title);
        Log.e("TAG", "BF_Title "+TBW_Title);
        Log.e("TAG", "BMI_Title "+BCM_Title);
        Log.e("TAG", "FFM_Title "+FFM_Title);
        Log.e("TAG", "SMM_Title "+SMM_Title);
        Log.e("TAG", "SMM_TitleNot "+SMM_TitleNot);
        list = (ListView) findViewById(R.id.list);

        ArrayList<Nasah> arrayListBF= DispalyItemsTolist(BF_Title,BF_VAl,Color_BF);
        ArrayList<Nasah> arrayListBMI=   DispalyItemsTolist(BMI_Title,BMI_VAl,Color_BMI);
        ArrayList<Nasah> arrayListTBW=  DispalyItemsTolist(TBW_Title,TBW_VAl,Color_TBW);
        ArrayList<Nasah> arrayListBCM=   DispalyItemsTolist(BCM_Title,BCM_VAl,Color_BCM);
        ArrayList<Nasah> arrayListFFM=   DispalyItemsTolist(FFM_Title,FFM_VAl,Color_FFM);
        ArrayList<Nasah> arrayListTBK=   DispalyItemsTolist(TBK_Title,TBK_VAl,Color_TBK);
        ArrayList<Nasah> arrayListSMM=   DispalyItemsTolist(SMM_Title,SMM_VAl,Color_SMM);
        ArrayList<Nasah>










                arrayListh=new ArrayList<Nasah>();



       for(int i=0;i<arrayListBF.size();i++)
           arrayListh.add(arrayListBF.get(i));

        for(int i=0;i<arrayListBMI.size();i++)
            arrayListh.add(arrayListBMI.get(i));

        for(int i=0;i<arrayListTBW.size();i++)
            arrayListh.add(arrayListTBW.get(i));

        for(int i=0;i<arrayListSMM.size();i++)
            arrayListh.add(arrayListSMM.get(i));



        for(int i=0;i<arrayListTBK.size();i++)
            arrayListh.add(arrayListTBK.get(i));




        for(int i=0;i<arrayListBCM.size();i++)
            arrayListh.add(arrayListBCM.get(i));


        for(int i=0;i<arrayListFFM.size();i++)
            arrayListh.add(arrayListFFM.get(i));


                adapter = new NadahAdapter(this.getApplicationContext(), arrayListh);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Object listItem = list.getItemAtPosition(position);

                Intent intent = new Intent(getApplicationContext(), viewNasiha.class);




                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//               intent.putExtra("id",countries.get(position).id);
                intent.putExtra("name", arrayListh.get(position).name);
                intent.putExtra("Desc", arrayListh.get(position).detils);
                intent.putExtra("Image", arrayListh.get(position).image);
                intent.putExtra("Status", arrayListh.get(position).Status);


                intent.putExtra("Value", arrayListh.get(position).Value);
                intent.putExtra("Colors", arrayListh.get(position).Colors);








                intent.putExtra(TITLE_BF_KEY, BF_Title);
                intent.putExtra(TITLE_BMI_KEY, BMI_Title);
                intent.putExtra(TITLE_TBW_KEY, TBW_Title);
                intent.putExtra(TITLE_FFM_KEY, FFM_Title);
                intent.putExtra(TITLE_BCM_KEY, BCM_Title);
                intent.putExtra(TITLE_TBK_KEY, TBK_Title);
                intent.putExtra(TITLE_SMM_KEY, SMM_Title);
                intent.putExtra(TITLE_SMM_KEY+"Not", SMM_TitleNot);


                intent.putExtra(VAL_TBW_KEY, TBW_VAl);
                intent.putExtra(VAL_BCM_KEY, BCM_VAl);
                intent.putExtra(VAL_BMI_KEY, BMI_VAl);
                intent.putExtra(VAL_FFM_KEY, FFM_VAl);
                intent.putExtra(VAL_SMM_KEY, SMM_VAl);
                intent.putExtra(VAL_TBK_KEY, TBK_VAl);
                intent.putExtra(VAL_BF_KEY, BF_VAl);



                intent.putExtra(COLOR_TBW_KEY, Color_TBW);
                intent.putExtra(COLOR_BCM_KEY, Color_BCM);
                intent.putExtra(COLOR_BMI_KEY, Color_BMI);
                intent.putExtra(COLOR_FFM_KEY, Color_FFM);
                intent.putExtra(COLOR_SMM_KEY, Color_SMM);
                intent.putExtra(COLOR_TBK_KEY, Color_TBK);
                intent.putExtra(COLOR_BF_KEY, Color_BF);



                startActivity(intent);

            }


        });
      /*  String jsonFileContent = null;
        try {
            jsonFileContent = readFile("nasaih.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = null;
        try {
            jsonArray = new JSONArray(jsonFileContent);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList<Nasah> persons = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObj = null;
            try {
                jsonObj = jsonArray.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Integer id = null;
            try {
                id = jsonObj.getInt("id");
                String name = jsonObj.getString("name");
                String detils = jsonObj.getString("detils");
                persons.add(new Nasah(id, name, detils));
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }*/




    }



    public ArrayList<Nasah> DispalyItemsTolist(String Nameitem,String Val,int Colors){
        ArrayList<Nasah> formList = new ArrayList <Nasah>();

        try {




            JSONObject obj = new JSONObject(readJSONFromAsset());
            JSONArray m_jArry = obj.getJSONArray(Nameitem);
            HashMap<String, String> m_li;

            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                Log.d("Details-->", jo_inside.getString("name"));
                int id = jo_inside.getInt("id");
                String name = jo_inside.getString("name");
                String detils = jo_inside.getString("detils");
                String Image = jo_inside.getString("Image");

                //Add your values in your `ArrayList` as below:


                formList.add(new Nasah(id, name, detils, Image, Nameitem, Val, Colors));


                if(Nameitem=="TBW Under water"||Nameitem=="TBW Normal"||Nameitem== "TBW Over water"||Nameitem=="BMI Over weight"||Nameitem=="BMI Super Obese"||Nameitem=="BMI Obese Clase III"||Nameitem=="BMI Obese Clase II"||Nameitem=="BMI Obese Clase I"||Nameitem=="BMI Overweight"||Nameitem == "BMI Normalweight"||Nameitem == "BMI Underweight"||Nameitem == "BF Over Fat"||Nameitem == "SMM Low"|| Nameitem == "BF Underfat"||Nameitem == "BF Healthy"|| Nameitem == "BF Average Fat"|| Nameitem==" BF Obese"){

                }





            }
        } catch (JSONException e) {
        //    formList.add(new Nasah(0, null, null,null,Nameitem,Val,Colors));


            e.printStackTrace();


        }

        return  formList;
    }


    public String readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(getAssets().open(fileName), "UTF-8"));

        String content = "";
        String line;
        while ((line = reader.readLine()) != null) {
            content = content + line;
        }

        return content;

    }


    public String readJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("nasaih.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


    public String loadJSONFromAsset() {
        String json ;
        try {
            InputStream is = getApplicationContext().getAssets().open("nasaih.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}