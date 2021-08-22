package com.ialzoriqi.bias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class viewNasiha extends AppCompatActivity {








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

      ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_nasiha);

        Bundle extras = getIntent().getExtras();


        String valID = extras.getString("id");
        String valName= extras.getString("name");
        String ValDesc= extras.getString("Desc");
        String ValImage= extras.getString("Image");
        String Status=extras.getString("Status");
        String Value=extras.getString("Value");

        int Colors=extras.getInt("Colors");

        System.out.println("Value " +Value);

        System.out.println("Colors " +Colors);




        BF_Title= extras.getString(TITLE_BF_KEY);
        BMI_Title= extras.getString(TITLE_BMI_KEY);
        TBW_Title= extras.getString(TITLE_TBW_KEY);
        FFM_Title= extras.getString(TITLE_FFM_KEY);
        BCM_Title= extras.getString(TITLE_BCM_KEY);
        TBK_Title= extras.getString(TITLE_TBK_KEY);
        SMM_Title= extras.getString(TITLE_SMM_KEY);
        SMM_TitleNot=extras.getString(TITLE_SMM_KEY+"Not") ;



        System.out.println("Status " +Status);
        System.out.println("BF_Title " +BF_Title);

        System.out.println("BMI_Title " +BMI_Title);
        System.out.println("TBW_Title " +TBW_Title);
        System.out.println("FFM_Title " +FFM_Title);
        System.out.println("BCM_Title " +BCM_Title);
        System.out.println("TBK_Title " +TBK_Title);
        System.out.println("SMM_Title " +SMM_Title) ;
        System.out.println("SMM_TitleNot " +SMM_TitleNot);


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

        TextView textViewStatus=(TextView) findViewById(R.id.txtViewStatus) ;

        TextView textViewVal=(TextView) findViewById(R.id.txtViewVal) ;



        TextView textViewName=(TextView) findViewById(R.id.txtViewName) ;


        TextView textViewDesc=(TextView) findViewById(R.id.txtViewDesc) ;
        textViewStatus.setText(Status.replace('_',' '));
        textViewVal.setText(Value);

        if(Colors!=0) {
            textViewStatus.setTextColor(Colors);
            textViewVal.setTextColor(Colors);
        }


        System.out.println("BF TITLE = "+BF_Title.replace('_',' ').trim());
        System.out.println("Status = "+Status.replace('_',' ').trim());



        System.out.println("BMI_Title = " +BMI_Title);
        System.out.println("TBW_Title =" +TBW_Title);
        System.out.println("FFM_Title =" +FFM_Title);
        System.out.println("BCM_Title =" +BCM_Title);
        System.out.println("TBK_Title =" +TBK_Title);
        System.out.println("SMM_Title =" +SMM_Title) ;
        System.out.println("SMM_TitleNot =" +SMM_TitleNot);
        System.out.println("Status =" +Status.substring(0,2));

/*

        switch (Status.substring(0,2).trim()){
            case "BM":
                textViewStatus.setText(Status.replace('_',' '));
                textViewVal.setText(BMI_VAl);
                textViewStatus.setTextColor(Color_BMI);
                textViewVal.setTextColor(Color_BMI);
                break;
        }

        switch (Status.substring(0,3).trim())
        {
            case "TBW":
                textViewStatus.setText(TBW_Title.replace('_',' '));
                textViewStatus.setTextColor(Color_TBW);
                textViewVal.setText(TBW_VAl.replace('_',' '));
                textViewVal.setTextColor(Color_TBW);
                break;
        }
        switch (Status.substring(0,2).trim()) {
            case "FF":

                textViewStatus.setText(FFM_Title);
                textViewStatus.setTextColor(Color_FFM);
                textViewVal.setText(FFM_VAl);
                textViewVal.setTextColor(Color_FFM);
                break;
        }
        switch (Status.substring(0,2).trim()){
            case "BC":
                textViewStatus.setText(BCM_Title.replace('_',' '));
                textViewStatus.setTextColor(Color_BCM);
                textViewVal.setText(BCM_VAl.replace('_',' '));
                textViewVal.setTextColor(Color_BCM);
                break;
        }
        switch (Status.substring(0,3).trim()){
            case "TBK":
                textViewStatus.setText(TBK_Title.replace('_',' '));
                textViewStatus.setTextColor(Color_TBK);
                textViewVal.setText(TBK_VAl.replace('_',' '));
                textViewVal.setTextColor(Color_TBK);
                break;
        }


        switch (Status.substring(0,3)) {
            case "BF ":

                textViewStatus.setText(BF_Title.replace('_', ' '));
                textViewVal.setText(BF_VAl.replace('_', ' '));

                textViewStatus.setTextColor(Color_BF);
                textViewVal.setTextColor(Color_BF);


                break;
        }
            switch (Status.substring(0,2))
        {
            case "SM":
                textViewStatus.setText(SMM_Title.replace('_',' '));
                textViewStatus.setTextColor(Color_SMM);
                textViewVal.setText(SMM_VAl.replace('_',' '));
                textViewVal.setTextColor(Color_SMM);
                break;


        }








*/


        imageView=findViewById(R.id.imageView);

        textViewName.setText(valName);
        textViewDesc.setText(ValDesc);
        try
        {
            // get input stream
            InputStream ims = getAssets().open(ValImage);
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView

            imageView.setImageDrawable(d);
            ims .close();
        }
        catch(IOException ex)
        {
            Log.e("TAG", "ERRORS  FOR Image "+ex);

           // imageView.setImageDrawable();
        }




        // DispalyItemsTolist("").get();


    }


    private boolean isNetworkConnected() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    WebView mWebView;

    public void onPrivacyTap() {
        if (isNetworkConnected()) {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.privacy_dialog);
            WebView webView = (WebView) dialog.findViewById(R.id.wv_content);
            this.mWebView = webView;
            webView.loadUrl("file:///android_asset/privacy_policy.html");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCanceledOnTouchOutside(false);
            ImageView imageView = (ImageView) dialog.findViewById(R.id.btn_cancel);
            dialog.show();
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            return;
        }
        Toast makeText = Toast.makeText(getApplicationContext(), "عليك تفعيل خدمة الانترنت للمواصلة", Toast.LENGTH_SHORT);
        View view2 = makeText.getView();
        view2.setBackgroundResource(R.drawable.bg_toast_red);
        //TextView textView = (TextView) view2.findViewById(16908299);
        //textView.setTextColor(Color.parseColor("#FFFFFF"));
        //textView.setGravity(17);
        makeText.show();
    }


    String TitleNasiha;
    String DiscryptionNasiha;
    String ImageNasiha;

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

    public ArrayList<Nasah> DispalyItemsTolist(String Nameitem,String Val){
        ArrayList<Nasah> formList = new ArrayList <Nasah>();

        try {
            JSONObject obj = new JSONObject(readJSONFromAsset());
            JSONArray m_jArry = obj.getJSONArray(Nameitem);
            HashMap<String, String> m_li;

            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                Log.d("Details-->", jo_inside.getString("name"));
                int id=jo_inside.getInt("id");
                TitleNasiha = jo_inside.getString("name");
                DiscryptionNasiha = jo_inside.getString("detils");
                ImageNasiha=jo_inside.getString("Image");



                //Add your values in your `ArrayList` as below:


              //l  formList.add(new Nasah(id, TitleNasiha, DiscryptionNasiha,ImageNasiha,Nameitem,Val));






            }
        } catch (JSONException e) {
            e.printStackTrace();


        }

        return  formList;
    }



}