package com.ialzoriqi.bias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    ImageView privacy;
    ImageView connectBlutooth;

    WebView mWebView;

    ImageView about ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




        about= (ImageView) findViewById(R.id.about);
        privacy =(ImageView) findViewById(R.id.privacyluk);
        connectBlutooth = (ImageView) findViewById(R.id.connectBlutooth);
    }





    public  void privaceOnclick(View v){


        onPrivacyTap();

        try {

        }
        catch (ActivityNotFoundException anfe) {
            //replace &quot;Unified+Apps&quot; with your developer name
            //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.provicyPolicy))));
        }

    }

    public  void MoreAppOnClick(View v){



        // ShowPopupAds();



      /*  try {
            //replace &quot;Unified+Apps&quot; with your developer name
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.marketAccount))));
        }
        catch (ActivityNotFoundException anfe) {
            //replace &quot;Unified+Apps&quot; with your developer name
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.urlMarkerAccount))));
        }*/

    }

    public  void aboutOneClick(View v){
        //showAds();

        // myAds();
        //  myDialog.dismiss();


        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.about_dialog);
        WebView webView = (WebView) dialog.findViewById(R.id.wv_content);
        this.mWebView = webView;
        webView.loadUrl("file:///android_asset/about.html");
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.btn_cancel);
        dialog.show();
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        /*try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.shareTxt) );
            String sAux = "\n "+  getString(R.string.shareTxt)+ "\n \n";
            sAux = sAux +"http://play.google.com/store/apps/details?id="+getPackageName();
            i.putExtra(Intent.EXTRA_TEXT, sAux);
            startActivity(Intent.createChooser(i, "choose one"));
        } catch(Exception e) {
            //e.toString();
        }*/
    }
    public  void connectBlutoothOnclick(View v){


        // Move to adapter list
        Intent intent = new Intent(getApplicationContext(), SelectDeviceActivity.class);

        startActivity(intent);
    }

    public void   OpenListMusiconClick(View v){


        Intent intent = new Intent(SplashActivity.this,MainActivity.class);



        //intent.addCategory(Intent.CATEGORY_HOME);
       // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


        startActivity(intent);
        //finish();

        // myAds();

    }




    private boolean isNetworkConnected() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onPrivacyTap() {

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


        //TextView textView = (TextView) view2.findViewById(16908299);
        //textView.setTextColor(Color.parseColor("#FFFFFF"));
        //textView.setGravity(17);

    }

    @Override
    public void onBackPressed() {
        final Dialog myDialog= new Dialog(SplashActivity.this) ;
        Button txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.custompopup);
        txtclose =(Button) myDialog.findViewById(R.id.ok);

        btnFollow = (Button) myDialog.findViewById(R.id.no);
        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  myDialog.dismiss();
                finishAffinity();
                finish();
            }
        });

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  myDialog.dismiss();
                myDialog.cancel();
                // onResume();
            }
        });

        myDialog.show();

    }


}