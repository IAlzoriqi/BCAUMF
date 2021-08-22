package com.ialzoriqi.bias;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {


    EditText editTextAge;
    EditText edtTxtTall;
    EditText edtTxtWhigt;


    TextView txtviewHentInput;
    TextView txtviewBF;
    TextView txtviewBMI;
    TextView txtviewTBW;
    TextView txtviewBCM;
    TextView txtviewTBK;
    TextView txtviewTBKNormal;
    TextView txtviewFFM;
    RadioButton rdoBtnMale;
    RadioButton rdoBtnFMale;
    char gender;

    RadioGroup radioGroup ;

    TextView txtviewBFNormal;
    TextView txtviewBMINormal;
    TextView txtviewTBWNormal;
    TextView txtviewBCMNormal;
    TextView txtviewFFMNormal;

    TextView txtViewSMM;
    TextView txtViewSMMNormal;


    TextView txtViewShowMassege;
     Button btnAdvisor;




















    private String deviceName = null;
    private String deviceAddress;
    public static Handler handler;
    public static BluetoothSocket mmSocket;
    public static ConnectedThread connectedThread;
    public static CreateConnectThread createConnectThread;
    private final static int CONNECTING_STATUS = 1; // used in bluetooth handler to identify message status
    private final static int MESSAGE_READ = 2;

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



ValNasah valNasah;


public String  BfStateResult;
    public String  FFMStateResult;
    public String  BCMStateResult;
    public String  TBWStateResult;
    public String  BMIStateResult;
    public String  TBKStateResult;
    public String  SMMStateResult;

    double wgith=0.0;
    double age=0;
    double tall=0;
     Button buttonConnect;
     Toolbar toolbar;


     String ValueZ;
    String ValueR;
    String ValueXC;

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        toolbar =(Toolbar) findViewById(R.id.toolbar);


        txtViewShowMassege=(TextView)findViewById(R.id.txtViewShowMassege);

        buttonConnect = (Button) findViewById(R.id.buttonConnect);



        txtViewShowMassege.setText("قم بالأتصال بالجهاز ");



        // If a bluetooth device has been selected from SelectDeviceActivity
        deviceName = getIntent().getStringExtra("deviceName");
        if (deviceName != null) {
            // Get the device address to make BT Connection
            deviceAddress = getIntent().getStringExtra("deviceAddress");
            // Show progree and connection status
            toolbar.setSubtitle("يتم الاتصال ب" + deviceName + "...");

            buttonConnect.setEnabled(true);







            BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            createConnectThread = new CreateConnectThread(bluetoothAdapter, deviceAddress);
            createConnectThread.start();
        }



        handler = new Handler(Looper.getMainLooper()) {

            String jdjdjdj = "";
            String charKey;
            String Value = "";
            String[] part;
            String valTrim;

            @Override
            public void handleMessage(Message msg) {

                System.out.println(" Loop ");
                //toolbar.setSubtitle("eeeeeeeeeeeeeee" + msg.obj.toString());
                txtViewShowMassege.setText("قم بالأتصال بالجهاز ");

                switch (msg.what) {
                    case CONNECTING_STATUS:
                        switch (msg.arg1) {
                            case 1:


                                toolbar.setSubtitle("تم الاتصال " + deviceName);
                                txtViewShowMassege.setText("لم يتم استقبال القيم");

                                buttonConnect.setEnabled(true);

                                break;
                            case -1:
                                toolbar.setSubtitle("فشل الاتصال");
                                txtViewShowMassege.setText("قم بالأتصال بالجهاز ");

                                buttonConnect.setEnabled(true);
                                break;


                        }
                        break;


                    case MESSAGE_READ:
                        String arduinoMsg = msg.obj.toString();
                        // Read message from Arduino
                      //  txtViewShowMassege.setText(arduinoMsg);
                        System.out.println("arduinoMsg : "+arduinoMsg);
                        //String massegeValue=arduinoMsg;
                        // toolbar.setSubtitle(arduinoMsg);

                        //  System.out.println("arduinoMsg"+arduinoMsg);
                        //  valTrim=arduinoMsg;
                        // toolbar.setSubtitle("ard "+arduinoMsg);

                        part = arduinoMsg.split("(?<=\\D)(?=\\d)");
                        for (int i = 0; i < arduinoMsg.length(); i++) {
                            char ch = arduinoMsg.charAt(i);
                            // Value = Value +ch;
                            //toolbar.setSubtitle(ch);
                            if (i == 1) {
                                charKey = String.valueOf(ch);
                                System.out.println("charKey" + charKey);
                                //toolbar.setSubtitle(charKey);

                            }

                            //  System.out.println("char at "+i+" index is: "+ch);
                        }


                        //  String va= drawDigitsFromString(arduinoMsg);
                        //  System.out.println("values"+massegeValue);

                        //toolbar.setSubtitle(charKey);
                        System.out.println("charKey" + charKey);


                        jdjdjdj = arduinoMsg;


                        // toolbar.setSubtitle("ard "+jdjdjdj.replaceAll("[^0-9]", ""));
                        //  textViewInfo.setText(jdjdjdj);
                        //  toolbar.setSubtitle( arduinoMsg);

                        switch (charKey.toLowerCase()) {

                            case "z":
                                ValueZ =jdjdjdj.replaceAll("[^0-9]", "");
                                txtViewShowMassege.setText(arduinoMsg);
                                role();
                                break;

                            case "r":
                                ValueR = jdjdjdj.replaceAll("[^0-9]", "");
                                txtViewShowMassege.setText(arduinoMsg);
                                role();
                                break;


                            case "x":
                                ValueXC =jdjdjdj.replaceAll("[^0-9]", "")+ "\n";
                                txtViewShowMassege.setText(arduinoMsg);
                                role();
                                break;

                            case "c":

                                txtViewShowMassege.setText(arduinoMsg);
                                role();

                                break;
                            case "led is turned off":

                                txtViewShowMassege.setText(arduinoMsg);
                                break;
                            case "Frequency:":

                                txtViewShowMassege.setText(arduinoMsg);
                                break;



                        }
                        break;
                }
            }
        };


        // Select Bluetooth Device


        // Button to ON/OFF LED on Arduino Board
       /* buttonToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cmdText = null;


              *//*  switch (btnState) {
                    case "turn on":

                        // Command to turn on LED on Arduino. Must match with the command in Arduino code
                        cmdText = "<turn on>";
                        break;
                    case "turn off":

                        // Command to turn off LED on Arduino. Must match with the command in Arduino code
                        cmdText = "<turn off>";
                        break;
                }*//*
                // Send command to Arduino board
                connectedThread.write(cmdText);
            }
        });*/


        //Code

        edtTxtWhigt = (EditText) findViewById(R.id.edtTxtWhigt);
        valNasah = new ValNasah();
        editTextAge = (EditText) findViewById(R.id.edtTxtAge);
        edtTxtTall = (EditText) findViewById(R.id.edtTxtTall);
        txtviewHentInput = (TextView) findViewById(R.id.txtViewHentInput);
        txtviewBF = (TextView) findViewById(R.id.txtViewBF);
        txtviewTBK = (TextView) findViewById(R.id.txtViewTBK);
        txtviewTBKNormal = (TextView) findViewById(R.id.txtViewTBKNormal);

        txtviewBMI = (TextView) findViewById(R.id.txtViewBMI);
        txtviewTBW = (TextView) findViewById(R.id.txtViewTBW);
        txtViewSMM=(TextView)findViewById(R.id.txtViewSMM);
        txtViewSMMNormal=(TextView)findViewById(R.id.txtViewSMMNormal);

        txtviewBCM = (TextView) findViewById(R.id.txtViewBCM);
        txtviewFFM = (TextView) findViewById(R.id.txtViewFFM);
        radioGroup = (RadioGroup) findViewById(R.id.groupradio);
        rdoBtnFMale = (RadioButton) findViewById(R.id.RdoBtnFmaile);
        rdoBtnMale = (RadioButton) findViewById(R.id.RdoBtnMale);


        txtviewBFNormal = (TextView) findViewById(R.id.txtViewBFNormal);
        txtviewBMINormal = (TextView) findViewById(R.id.txtViewBMINormal);
        txtviewTBWNormal = (TextView) findViewById(R.id.txtViewTBWNormal);
        txtviewBCMNormal = (TextView) findViewById(R.id.txtViewBCMNormal);
        txtviewFFMNormal = (TextView) findViewById(R.id.txtViewFFMNormal);



      /*  edtTxtWhigt.setText("50");
        edtTxtTall.setText("180");
        editTextAge.setText("23");*/



        if (editTextAge.getText().length()
                != 0 && edtTxtTall.getText().length() != 0
                && edtTxtWhigt.getText().length() != 0) {


            wgith = Integer.parseInt(edtTxtWhigt.getText().toString());

            age = Integer.parseInt(editTextAge.getText().toString());
            tall = Integer.parseInt(edtTxtTall.getText().toString());

        }

        btnAdvisor = (Button) findViewById(R.id.btnAdvisor);
        btnAdvisor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), ListNasaih.class);


                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra(TITLE_BF_KEY, "BF "+BfStateResult);
                intent.putExtra(TITLE_BMI_KEY, "BMI "+BMIStateResult);
                intent.putExtra(TITLE_TBW_KEY, "TBW "+TBWStateResult);
                intent.putExtra(TITLE_BCM_KEY, "BCM "+BCMStateResult);
                intent.putExtra(TITLE_FFM_KEY, "FFM "+FFMStateResult);
                intent.putExtra(TITLE_TBK_KEY, "TBK "+TBKStateResult);
                intent.putExtra(TITLE_SMM_KEY, "SMM "+SMMStateResult);
                intent.putExtra(TITLE_SMM_KEY+"Not", "SMM"+SMMStateResult);



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

        txtviewBF.setText("");
        txtviewBCM.setText("");
        txtviewBMI.setText("");
        txtviewFFM.setText("");
        txtviewTBW.setText("");
        txtviewTBK.setText("");
        txtViewSMM.setText("");

        txtviewBFNormal.setText("");
        txtviewBMINormal.setText("");
        txtviewTBWNormal.setText("");
        txtviewBCMNormal.setText("");
        txtviewFFMNormal.setText("");
        txtviewTBKNormal.setText("");
        txtViewSMMNormal.setText("");

        rdoBtnFMale.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                gender = 'F';
                role();
            }
        });

        rdoBtnMale.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                gender = 'M';

                role();
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rdoBtnMale.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        gender = 'M';

                        role();
                    }
                });

                rdoBtnFMale.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        gender = 'F';

                        role();
                    }
                });


            }

        });

        role();

        editTextAge.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(editTextAge.getText().length()>0)
                if(Integer.parseInt(editTextAge.getText().toString())<18||
                        Integer.parseInt(editTextAge.getText().toString())>95){
                    txtviewHentInput.setText("أدخل عمر صحيح");



                    txtviewBF.setText("  " );
                    txtviewBFNormal.setText(" ");
                    txtviewFFM.setText(" " );
                    txtviewFFMNormal.setText("");
                    txtviewBMI.setText("");
                    txtviewBMINormal.setText("");
                    txtviewBCM.setText("");
                    txtviewBCMNormal.setText("");
                    txtviewTBK.setText("");
                    txtviewTBKNormal.setText(" ");
                    txtViewSMM.setText("");
                    // stateSSm   double age,double weight,double Tall,char gender,double R,double Xc
                    txtViewSMMNormal.setText(" ");
                    txtviewTBW.setText("");
                    txtviewTBWNormal.setText(" ");


                }else{
                    txtviewHentInput.setText("");

                    role();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

                if(editTextAge.getText().length()>0)
                    if(Integer.parseInt(editTextAge.getText().toString())<18||
                            Integer.parseInt(editTextAge.getText().toString())>95){
                        txtviewHentInput.setText("أدخل عمر صحيح");



                        txtviewBF.setText("  " );
                        txtviewBFNormal.setText(" ");
                        txtviewFFM.setText(" " );
                        txtviewFFMNormal.setText("");
                        txtviewBMI.setText("");
                        txtviewBMINormal.setText("");
                        txtviewBCM.setText("");
                        txtviewBCMNormal.setText("");
                        txtviewTBK.setText("");
                        txtviewTBKNormal.setText(" ");
                        txtViewSMM.setText("");
                        // stateSSm   double age,double weight,double Tall,char gender,double R,double Xc
                        txtViewSMMNormal.setText(" ");
                        txtviewTBW.setText("");
                        txtviewTBWNormal.setText(" ");


                    }else{
                        txtviewHentInput.setText("");

                        role();
                    }

            }
        });

        edtTxtTall.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(edtTxtTall.getText().length()>0)
                    if(Integer.parseInt(edtTxtTall.getText().toString())<80||
                            Integer.parseInt(edtTxtTall.getText().toString())>200){
                        txtviewHentInput.setText("أدخل طول صحيح");

                        txtviewBF.setText("  " );
                        txtviewBFNormal.setText(" ");
                        txtviewFFM.setText(" " );
                        txtviewFFMNormal.setText("");
                        txtviewBMI.setText("");
                        txtviewBMINormal.setText("");
                        txtviewBCM.setText("");
                        txtviewBCMNormal.setText("");
                        txtviewTBK.setText("");
                        txtviewTBKNormal.setText(" ");
                        txtViewSMM.setText("");
                        // stateSSm   double age,double weight,double Tall,char gender,double R,double Xc
                        txtViewSMMNormal.setText(" ");
                        txtviewTBW.setText("");
                        txtviewTBWNormal.setText(" ");


                    }else{
                        txtviewHentInput.setText("");

                        role();
                    }

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(edtTxtTall.getText().length()>0)
                    if(Integer.parseInt(edtTxtTall.getText().toString())<80||
                            Integer.parseInt(edtTxtTall.getText().toString())>200){
                        txtviewHentInput.setText("أدخل طول صحيح");


                        txtviewBF.setText("  " );
                        txtviewBFNormal.setText(" ");
                        txtviewFFM.setText(" " );
                        txtviewFFMNormal.setText("");
                        txtviewBMI.setText("");
                        txtviewBMINormal.setText("");
                        txtviewBCM.setText("");
                        txtviewBCMNormal.setText("");
                        txtviewTBK.setText("");
                        txtviewTBKNormal.setText(" ");
                        txtViewSMM.setText("");
                        txtViewSMMNormal.setText(" ");
                        txtviewTBW.setText("");
                        txtviewTBWNormal.setText(" ");


                    }else{
                        txtviewHentInput.setText("");

                        role();
                    }

            }
        });

        edtTxtWhigt.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                if(edtTxtWhigt.getText().length()>0)
            if(Integer.parseInt(edtTxtWhigt.getText().toString())<20||
                    Integer.parseInt(edtTxtWhigt.getText().toString())>200){
                txtviewHentInput.setText("أدخل وزن صحيح");


                txtviewBF.setText("  " );
                txtviewBFNormal.setText(" ");
                txtviewFFM.setText(" " );
                txtviewFFMNormal.setText("");
                txtviewBMI.setText("");
                txtviewBMINormal.setText("");
                txtviewBCM.setText("");
                txtviewBCMNormal.setText("");
                txtviewTBK.setText("");
                txtviewTBKNormal.setText(" ");
                txtViewSMM.setText("");
                txtViewSMMNormal.setText(" ");
                txtviewTBW.setText("");
                txtviewTBWNormal.setText(" ");


            }else{
                txtviewHentInput.setText("");


                role();
            }

            }

            @Override
            public void afterTextChanged(Editable s) {



                if(edtTxtWhigt.getText().length()>0)
                    if(Integer.parseInt(edtTxtWhigt.getText().toString())<20||
                            Integer.parseInt(edtTxtWhigt.getText().toString())>200){
                        txtviewHentInput.setText("أدخل وزن صحيح");


                        txtviewBF.setText("  " );
                        txtviewBFNormal.setText(" ");
                        txtviewFFM.setText(" " );
                        txtviewFFMNormal.setText("");
                        txtviewBMI.setText("");
                        txtviewBMINormal.setText("");
                        txtviewBCM.setText("");
                        txtviewBCMNormal.setText("");
                        txtviewTBK.setText("");
                        txtviewTBKNormal.setText(" ");
                        txtViewSMM.setText("");
                        txtViewSMMNormal.setText(" ");
                        txtviewTBW.setText("");
                        txtviewTBWNormal.setText(" ");


                    }else{
                        txtviewHentInput.setText("");


                        role();
                    }

            }


            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

                if (s.length() == 0) {

                } else {

                }
                if (s.length() != 0) {

                    if (Integer.parseInt(s.toString()) > 200 || Integer.parseInt(s.toString()) <= 5) {

                    } else {

                    }
                }


            }

        });


    }



    public  void ConnectOnclick(View v){

        // Move to adapter list
        Intent intent = new Intent(getApplicationContext(), SelectDeviceActivity.class);
        startActivity(intent);

    }


        public static class CreateConnectThread extends Thread {

            @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
            public CreateConnectThread(BluetoothAdapter bluetoothAdapter, String address) {

                BluetoothDevice bluetoothDevice = bluetoothAdapter.getRemoteDevice(address);
                BluetoothSocket tmp = null;
                UUID uuid = bluetoothDevice.getUuids()[0].getUuid();

                try {

                    tmp = bluetoothDevice.createInsecureRfcommSocketToServiceRecord(uuid);

                } catch (IOException e) {
                    Log.e(TAG, "Socket's create() method failed", e);
                }
                mmSocket = tmp;
            }

            public void run() {
                BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                bluetoothAdapter.cancelDiscovery();
                try {

                    mmSocket.connect();
                    Log.e("Status", "Device connected");
                    handler.obtainMessage(CONNECTING_STATUS, 1, -1).sendToTarget();
                } catch (IOException connectException) {
                    // Unable to connect; close the socket and return.
                    try {
                        mmSocket.close();
                        Log.e("Status", "Cannot connect to device");
                        handler.obtainMessage(CONNECTING_STATUS, -1, -1).sendToTarget();
                    } catch (IOException closeException) {
                        Log.e(TAG, "Could not close the client socket", closeException);
                    }
                    return;
                }


                connectedThread = new ConnectedThread(mmSocket);
                connectedThread.run();
            }

            public void cancel() {
                try {
                    mmSocket.close();
                } catch (IOException e) {
                    Log.e(TAG, "Could not close the client socket", e);
                }
            }
        }


        /* =============================== Thread for Data Transfer =========================================== */
        public static class ConnectedThread extends Thread {
            private final BluetoothSocket mmSocket;
            private final InputStream mmInStream;
            private final OutputStream mmOutStream;

            public ConnectedThread(BluetoothSocket socket) {
                mmSocket = socket;
                InputStream tmpIn = null;
                OutputStream tmpOut = null;


                try {
                    tmpIn = socket.getInputStream();
                    tmpOut = socket.getOutputStream();
                } catch (IOException e) { }

                mmInStream = tmpIn;
                mmOutStream = tmpOut;
            }

            public void run() {
                byte[] buffer = new byte[1024];
                int bytes = 0;
                while (true) {
                    try {

                        buffer[bytes] = (byte) mmInStream.read();
                        String readMessage;
                        if (buffer[bytes] == '\n'){
                            readMessage = new String(buffer,0,bytes);
                            Log.e("Arduino Message",readMessage);
                            handler.obtainMessage(MESSAGE_READ,readMessage).sendToTarget();
                            bytes = 0;
                        } else {
                            bytes++;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }

            public void write(String input) {
                byte[] bytes = input.getBytes();
                try {
                    mmOutStream.write(bytes);
                } catch (IOException e) {
                    Log.e("Send Error","Unable to send message",e);
                }
            }



            public void read(String input) {
                byte[] bytes = input.getBytes();
                try {
                    mmInStream.read(bytes);
                } catch (IOException e) {
                    Log.e("Send Error","Unable to send message",e);
                }
            }

            public void cancel() {
                try {
                    mmSocket.close();
                } catch (IOException e) { }
            }
        }





        @Override
        public void onBackPressed() {

            if (createConnectThread != null){
                createConnectThread.cancel();
            }

            Intent intent = new Intent(getApplicationContext(),SplashActivity.class);

          /*  Intent a = new Intent(Intent.ACTION_MAIN);
            a.addCategory(Intent.CATEGORY_HOME);
            a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);*/
            startActivity(intent);
        }





    void role(){



/*
      ValueR="490.0";
        ValueXC="47.0";

        ValueZ="492.0";*/
        if(editTextAge.getText().length()!=0 &&edtTxtTall.getText().length()!=0&& edtTxtWhigt.getText().length()!=0
                && (gender=='M'
                ||gender=='m'||  gender=='F'
                ||gender=='f')
        )
        {





            wgith= Integer.parseInt(edtTxtWhigt.getText().toString());

           age= Integer.parseInt(editTextAge.getText().toString());
            tall=  Integer.parseInt(edtTxtTall.getText().toString());





    if(ValueR!=null  && ValueXC!=null && ValueZ!=null){
        BF_VAl=String.valueOf("%  " +Math.round(valNasah.calcBF(wgith,tall,gender,Double.parseDouble(ValueR)
                ,Double.parseDouble(ValueXC),age,Double.parseDouble(ValueZ))));
            txtviewBF.setText(BF_VAl);
         BfStateResult = valNasah.stateBF(age,wgith,tall,gender,Double.parseDouble(ValueR),Double.parseDouble(ValueXC),Double.parseDouble(ValueZ));

            txtviewBFNormal.setText(BfStateResult);
          Color_BF= getResources().getColor(valNasah.ColorBMIText);
            txtviewBFNormal.setTextColor(Color_BF);
        Color_BF= getResources().getColor(valNasah.ColorBMIText);
            txtviewBF.setTextColor(
                    Color_BF);











                    FFM_VAl=String.valueOf(Math.round(valNasah.calcFFM(
                    age, wgith, tall, gender,
                    Double.parseDouble(ValueR),
                    Double.parseDouble(ValueXC), Double.parseDouble(ValueZ)))) + "  KG";


                txtviewFFM.setText( FFM_VAl);
                 FFMStateResult=valNasah.stateFFM(age, wgith, tall, gender, Double.parseDouble(ValueR), Double.parseDouble(ValueXC),Double.parseDouble(ValueZ));

                txtviewFFMNormal.setText(FFMStateResult);

        Color_FFM= getResources().getColor(valNasah.ColorBMIText);

                txtviewFFMNormal.setTextColor(Color_FFM);
                txtviewFFM.setTextColor(Color_FFM);

                BMI_VAl=String.valueOf(Math.round(valNasah.calcBMI(wgith, tall)))+ "  KG/m^2";

                txtviewBMI.setText( BMI_VAl );
                BMIStateResult=valNasah.stateBMI(wgith, tall);
                txtviewBMINormal.setText(BMIStateResult);
                Color_BMI=getResources().getColor(valNasah.ColorBMIText);
                txtviewBMI.setTextColor(Color_BMI);
                txtviewBMINormal.setTextColor(Color_BMI);


                BCM_VAl=String.valueOf( Math.round(
                        valNasah.calcBCM(wgith, tall, gender, Double.parseDouble(ValueXC), Double.parseDouble(ValueR)))) + "  KG";
                txtviewBCM.setText(
                        BCM_VAl);
                BCMStateResult=valNasah.stateBCM(age, wgith, tall, gender, Double.parseDouble(ValueXC), Double.parseDouble(ValueR));
                txtviewBCMNormal.setText(BCMStateResult);
        Color_BCM=getResources().getColor(valNasah.ColorBMIText);

        txtviewBCM.setTextColor(getResources().getColor(valNasah.ColorBMIText));
                txtviewBCMNormal.setTextColor(getResources().getColor(valNasah.ColorBMIText));


                TBK_VAl=String.valueOf( Math.round(
                        valNasah.calcTBK(
                                wgith, tall, gender, Double.parseDouble(ValueXC
                                ), Double.parseDouble(ValueR)))) + "  MMOL";
                txtviewTBK.setText(
                        TBK_VAl );

                TBKStateResult=valNasah.stateTBK(age, wgith, tall, gender, Double.parseDouble(ValueXC), Double.parseDouble(ValueR));
                txtviewTBKNormal.setText(TBKStateResult);
        Color_TBK=getResources().getColor(valNasah.ColorBMIText);

        txtviewTBKNormal.setTextColor(getResources().getColor(valNasah.ColorBMIText));
                txtviewTBK.setTextColor(getResources().getColor(valNasah.ColorBMIText));


                SMM_VAl=String.valueOf(  Math.round(
                        valNasah.calcSMM(
                                age, tall, gender, Double.parseDouble(ValueR), wgith, Double.parseDouble(ValueXC), Double.parseDouble(ValueZ))));
                txtViewSMM.setText(
                        SMM_VAl + "  %");
                // stateSSm   double age,double weight,double Tall,char gender,double R,double Xc
              SMMStateResult=valNasah.stateSSm(age, wgith, tall, gender, Double.parseDouble(ValueR), Double.parseDouble(ValueXC),Double.parseDouble(ValueZ));
                txtViewSMMNormal.setText(SMMStateResult);
        Color_SMM=getResources().getColor(valNasah.ColorBMIText);

        txtViewSMM.setTextColor(getResources().getColor(valNasah.ColorBMIText));
                txtViewSMMNormal.setTextColor(getResources().getColor(valNasah.ColorBMIText));

        TBW_VAl=String.valueOf(Math.round(valNasah.calcTBW(age, wgith, tall, gender, Double.parseDouble(ValueZ)
        ,Double.parseDouble(ValueR),Double.parseDouble(ValueXC))))+ "  %";
                txtviewTBW.setText(
                        TBW_VAl );
              TBWStateResult=valNasah.stateTBW(age, wgith, tall, gender, Double.parseDouble(ValueZ),Double.parseDouble(ValueR),Double.parseDouble(ValueXC));
                txtviewTBWNormal.setText(TBWStateResult);
        Color_TBW=getResources().getColor(valNasah.ColorBMIText);

        txtviewTBWNormal.setTextColor(getResources().getColor(valNasah.ColorBMIText));
                txtviewTBW.setTextColor(getResources().getColor(valNasah.ColorBMIText));




    }else{
        txtViewShowMassege.setText("لم يتم أستقبال قيم من الجهاز");
    }










                }



        else {


            txtviewBF.setText("  " );
            txtviewBFNormal.setText(" ");
            txtviewFFM.setText(" " );
            txtviewFFMNormal.setText("");
            txtviewBMI.setText("");
            txtviewBMINormal.setText("");
            txtviewBCM.setText("");
            txtviewBCMNormal.setText("");
            txtviewTBK.setText("");
            txtviewTBKNormal.setText(" ");
            txtViewSMM.setText("");
            txtViewSMMNormal.setText(" ");
            txtviewTBW.setText("");
            txtviewTBWNormal.setText(" ");
        }
            }

    }






