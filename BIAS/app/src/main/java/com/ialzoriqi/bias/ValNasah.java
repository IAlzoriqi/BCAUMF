package com.ialzoriqi.bias;

import android.app.Application;
import android.content.Context;


class ValNasah   {

    Context context;
    public  int ColorBMIText=R.color.normal ;
    ValNasah(){
//        mContext =  getApplicationContext();
    }

    public   void setColor(int i){
        if(i==0)
            this.ColorBMIText=R.color.normal;
        if(i==1)
            this.ColorBMIText=R.color.nearHazrd;
        if(i==2)
            this.ColorBMIText=R.color.hazrd;

    }

    public static final String BFUnderfat_key="Underfat";
    public static final double[][]BF_age={

            {18,40},
            {41,60},
            {61,100},
          /*  {18,20},
            {21,25},
            {26,30},
            {31,35},
            {36,40},
            {41,45},
            {46,50},
            {51,55},
            {55,100},*/
    };



    public static final double[][]BFUnderfat_Man_val={


            {0,7},
            {0,11},
            {0,13},


         /*   {2,4},
            {3,5},
            {3,8},
            {4,9},
            {7,11},
            {7,14},
            {8,15},
            {9,16},
            {10,17},*/
    };
    public static final double[][]BFUnderfat_Woman_val={
            {0,21},
            {0,23},
            {0,24},
           /* {11,16},
            {12,18},
            {13,19},
            {13,20},
            {14,22},
            {14,23},
            {15,23},
            {16,24},
            {16,25},*/
    };


    public static final String   BF_Healthy="Healthy";


    public static final double[][] BF_Healthy_man_val={
           /* {6,13},
            {7,14},
            {11,16},
            {12,18},
            {13,19},
            {16,21},
            {17,22},
            {18,23},
            {19,25},*/




            {8,19},
            {12,22},
            {14,25},


    };

    public static final double[][] BF_Healthy_wman_val={
           /* {18,22},
            {20,24},
            {21,25},
            {22,25},
            {24,27},
            {25,28},
            {25,29},
            {26,29},
            {27,30},*/



            {21,33},
            {23,35},
            {24,36},



    };


    public static final String  BF_Averagefat="Average Fat";



    public static final double[][]BF_Average_man_val={
        /*    {14,19},
            {25,21},
            {18,22},
            {19,23},
            {20,24},
            {23,26},
            {24,28},
            {25,29},
            {26,31},*/



            {20,25},
            {23,27},
            {26,30},

    };


    public static final double[][]BF_Average_wman_val={
          /*  {23,29},
            {26,30},
            {26,32},
            {27,32},
            {28,33},
            {29,34},
            {30,35},
            {31,36},
            {31,37},*/


            {34,39},
            {35,40},
            {36,42},
    };

    public static final String   BF_oferFat="Over Fat";


    public static final double[][] BF_oferFat_man_val={
        /*    {22,25},
            {22,26},
            {23,27},
            {25,28},
            {26,29},
            {28,30},
            {29,31},
            {30,32},
            {31,33},*/


            {26,100},
            {28,100},
            {31,100},

    };

    public static final double[][] BF_oferFat_wman_val={
           /* {30,35},
            {30,35},
            {32,36},
            {33,37},
            {33,38},
            {35,37},
            {36,38},
            {36,38},
            {38,40},*/


            {40,100},
            {41,100},
            {43,100},


    };


    public static final String   BMIUnderweight="Underweight";


    public static final double[] BMIUnderweight_val={
            0.0,18.5


    };


    public static final String   BMINormalweight="Normalweight";


    public static final double[]BMINormalweight_val={
            18.6,24.9


    };



    public static final String   BMIOverweight="Overweight";


    public static final double[] BMIOverweight_val={
            25,29.9


    };


    public static final String   BMIObeseClaseI="Obese Clase I";


    public static final double[] BMIObeseClaseI_val={
            30,34.9


    };

    public static final String   BMIObeseClaseII="Obese Clase II";


    public static final double[] BMIObeseClaseII_val={
            35,39.9


    };

    public static final String   BMIObeseClaseIII="Obese Clase III";


    public static final double[] BMIObeseClaseIII_val={
            40,49.9


    };

    public static final String   BMISuperObese="Super Obese";


    public static final double[] BMISuperObese_val={
            50.0,156


    };


    public static final String   BCMNormal="Normal";


    public static final double[] BCMNormal_val={
            18.8,32.8


    };



    public static final String   SMMNormal="Normal";

    public static final double[][]SMM_age={
           /* {18,40},
            {41,60},
            {61,80},*/

            {18,29},
            {30,39},
            {40,49},
            {50,59},
            {60,69},
            {70,79},
            {80,98},
            /* {18,40},
             {41,60},
             {61,80},*/

    };




    public static final String   SSMVeryhigh_key="High";

    public static final int[][]SSMVeryHigh_woman_val={
             /* {75,100},
              {73,100},
              {72,100},*/
            {69,100},
            {70,100},
            {69,100},
            {67,100},
            {61,100},
            {54,100},
            {50,100},
          /**{36,100},
            {36,100},
            {35,100},**/


    };
    public static final int[][]SSMVeryHigh_man_val={
            /* {88,100},
              {85,100},
              {83,100},*/
            {74,100},
            {73,100},
            {70,100},
            {64,100},
            {56,100},
            {46,100},
            {39,100},

            /*{45,100},
            {45,100},
            {44,100},*/


    };

    public static final String   SSMhigh_key="High";

    public static final int[][]SSMHigh_woman_val={
           /* {75,100},
            {73,100},
            {72,100},*/

            {69,100},
            {70,100},
            {69,100},
            {67,100},
            {61,100},
            {54,100},
            {50,100},
          /*  {31,35},
            {31,35},
            {30,34},*/


    };
    public static final int[][]SSMHigh_man_val={
          /*  {88,100},
            {85,100},
            {83,100},*/

            {74,100},
            {73,100},
            {70,100},
            {64,100},
            {56,100},
            {46,100},
            {39,100},
          /*  {40,44},
            {40,44},
            {39,43},*/


    };



    public static final String   SSMLow_key="Low";

    public static final int[][]SSMLow_man_val= {
           /* {0, 69},
            {0, 55},
            {0, 60},*/


            {10,48},
            {10,46},
            {10,43},
            {10,38},
            {10,32},
            {10,24},
            {10,20},

    };


    public static final int[][]SSMLow_woman_val= {
           /* {0, 56},
            {0, 55},
            {0, 54},*/



            {10,47},
            {10,47},
            {10,44},
            {10,40},
            {10,33},
            {10,25},
            {10,21},

    };

    public static final String   SSMAvrage_key="avrage";


    public static final int[][]SSMAvrage_woman_val={
          /*  {63,75},
            {62,73},
            {60,72},*/



            {48,67},
            {48,69},
            {45,68},
            {41,66},
            {34,60},
            {26,53},
            {22,49},
           /* {0,24},
            {0,24},
            {0,24},
*/

    };





    public static final int[][]SSMNormal_woman_val={
           /* {56,61},
            {56,62},
            {54,60},*/
            {48,67},
            {48,69},
            {45,68},
            {41,66},
            {34,60},
            {26,53},
            {22,49},

            /*{25,30},
            {25,30},
            {25,29},*/


    };





    public static final int[][]SSMAvrage_man_val={
           /* {76,88},
            {74,85},
            {71,83},*/


            {49,73},
            {47,72},
            {44,69},
            {39,63},
            {33,55},
            {25,45},
            {21,38},

            /*{0,33},
            {0,33},
            {2,33},*/



    };
    public static final int[][]SSMNormal_man_val={
           /* {71,76},
            {68,74},
            {66,71},*/

            {49,73},
            {47,72},
            {44,69},
            {39,63},
            {33,55},
            {25,45},
            {21,38},


            /*{33,39},
            {33,39},
            {33,38},*/


    };

    public static final String TBKNormal_Kay="Normal";

    public static final int[]TBKNormal_Male_val={
        //    3972,3577,
            1672,4365


    };



    public static final int[]TBKNormal_Famle_val={
           // 2526,2277,
            1672,4365


    };





    public static final String TBWNormal_Kay="Normal";
    public static final int[] TBWNormalMan_val={
            49,65


    };

    public static final String TBWOver_Kay="Over water";
    public static final int[] TBWOverMan_val={
            66,100


    };


    public static final String TBWUnderNormal_Kay="Under water";
    public static final int[] TBWUnderNormalMan_val={
            40,48


    };


    public static final int[] TBWNormalFemale_val={
            46,60


    };




    public static final int[] TBWOverFemale_val={
            61,100


    };


    public static final int[] TBWUnderNormalFemale_val={
            40,45


    };










    public static final String   FFMNormal="Normal";


    public static final double[] FFMNormal_val={
           //39.5,50
            32,64

    };












/*    public static String StatusBMI(double BMI){
        if(BMI>=BMIDingerNigative_main && BMI<=BMIDingerNigative_max){
            return  BMIDingerNigative_Kay;

        }
        else if(BMI>=BMIDingerPositive_main && BMI<=BMIDingerPositive_max){
            return  TBWDingerPositive_Kay;
        }

        else if(BMI>=BMINearDingerPositive_main && BMI<=BMINearDingerPositive_Max){
            return  TBWNearDingerPositive_Kay;
        }


        else if(BMI>=BMINearDingerNigative_main && BMI<=BMINearDingerNigative_max){
            return  BMINearDingerNigative_Kay;

        }

        else if(BMI>=BMINormal_main && BMI<=BMINormal_max){
            return  "Normal";

        }
        else {
            return "Value Null";
        }
    }*/



 /*   public static String StatusTBW(double TBW){
        if(TBW>=TBWDingerNigative_mian && TBW<=TBWDingerNigative_max){
            return  TBWDingerNigative_Kay;

        }
        else if(TBW>=TBWDingerPositive_mian && TBW<=TBWDingerPositive_max){
            return  TBWDingerPositive_Kay;
        }

        else if(TBW>=BMINearDingerPositive_main && TBW<=BMINearDingerPositive_Max){
            return  TBWNearDingerPositive_Kay;
        }


        else if(TBW>=BMINearDingerNigative_main && TBW<=BMINearDingerNigative_max){
            return  BMINearDingerNigative_Kay;

        }

        else if(TBW>=TBWNormal_main && TBW<=TBWNormal_max){
            return  "Normal";

        }
        else {
            return "Value Null";
        }
    }*/


    public  String stateTBW(double age,double weight,double Tall,char gender,double Z,double R,double Xc){

        double TBW=calcTBW(age,weight,Tall,gender,Z,R,Xc) ;
        if(gender=='M') {


            if (TBW >= TBWNormalMan_val[0] && TBW <= TBWNormalMan_val[1]) {

                setColor(0);
                return TBWNormal_Kay;

            }

            else   if (TBW >= TBWOverMan_val[0] && TBW <= TBWOverMan_val[1]) {

                setColor(2);
                return TBWOver_Kay;

            }


            else   if (TBW >= TBWUnderNormalMan_val[0] && TBW <= TBWUnderNormalMan_val[1]) {

                setColor(2);
                return TBWUnderNormal_Kay;

            }
        }


        else if(gender=='m') {

            if (TBW >= TBWNormalMan_val[0] && TBW <= TBWNormalMan_val[1]) {

                setColor(0);
                return TBWNormal_Kay;

            }

            else if (TBW >= TBWOverMan_val[0] && TBW <= TBWOverMan_val[1]) {

                setColor(2);
                return TBWOver_Kay;

            }


            else if (TBW >= TBWUnderNormalMan_val[0] && TBW <= TBWUnderNormalMan_val[1]) {

                setColor(2);
                return TBWUnderNormal_Kay;

            }
        }

        else if(gender=='F') {

            if (TBW >= TBWNormalFemale_val[0] && TBW <= TBWNormalFemale_val[1]) {

                setColor(0);
                return TBWNormal_Kay;

            }

            else if (TBW >= TBWOverFemale_val[0] && TBW <= TBWOverFemale_val[1]) {

                setColor(2);
                return TBWOver_Kay;

            }


            else  if (TBW >= TBWUnderNormalFemale_val[0] && TBW <= TBWUnderNormalFemale_val[1]) {

                setColor(2);
                return TBWUnderNormal_Kay;

            }
        }


        else if(gender=='f') {

            if (TBW >= TBWNormalFemale_val[0] && TBW <= TBWNormalFemale_val[1]) {

                setColor(0);
                return TBWNormal_Kay;

            }

            else if (TBW >= TBWOverFemale_val[0] && TBW <= TBWOverFemale_val[1]) {

                setColor(2);
                return TBWOver_Kay;

            }


            else if (TBW >= TBWUnderNormalFemale_val[0] && TBW <= TBWUnderNormalFemale_val[1]) {

                setColor(2);
                return TBWUnderNormal_Kay;

            }
        }

        else {
            setColor(2);
            return "Err";
        }
        setColor(2);
        return "Err";

    }






    public static long calcSMM(double age,double Tall,char gender,double R,double weight,double XC,double Z){
        double SMM=0.0;
        //z== impedince



        if(gender=='M'||gender=='m') {
            // SSm=(Tall/100)/R*0.401+1*3.825-age*0.071+5.102;
            SMM=((-4.211+((0.267*Math.pow(Tall/100,2))/R)+0.095*weight+1.909*1-0.012*age+0.058*XC)/weight)*100;
            // SMM=((-4.211+((0.267*Math.pow(Tall,2)/10000)/R)+0.095*weight+1.909*1-0.012*age+0.058*XC)/weight)*100;
            // SMM  =((((Tall)/R *0.401) + (1* -3.825) + (age* 0.071) +5.102)/weight)*100 ;
           // SMM = ((5.102 +( 0.401 * (Math.pow(Tall, 2)) / R )+ (3.825 * 1 )+(- 0.71 * age)) );
        }



        if(gender=='F'|| gender=='f') {
            //SMM=((-4.211+((0.267*Math.pow(Tall/100,2))/R)+0.095*weight-0.012*age+0.058*XC)/weight)*100;

            SMM=((-4.211+((0.267*Math.pow(Tall/100,2))/R)+0.095*weight-0.012*age+0.058*XC)/weight)*100;
            //SMM = ((((Tall) / R * 0.401) + (0 * -3.825) + (age * 0.071) + 5.102) / weight) * 100;
            //SMM = ((5.102 +( 0.401 * (Math.pow(Tall, 2))  / R )+ (3.825 * 0 )+(- 0.71 * age)) / weight) * 100;

        }

        return Math.abs(Math.round(SMM));
    }

    public static long calcTBK(double whigh,double Tall,char gender,double Xc,double R){
        double TBK=calcBCM(whigh,Tall,gender,Xc,R)/0.00833;
        //z== impedince







        return  Math.round(Math.abs(TBK));
    }

    public static long calcBCM(double whigh,double Tall,char gender,double Xc,double R){
        double BCM=0.0;
        //z== impedince
        if(gender=='M'|| gender=='m'){
            // BCM=1.898*(Math.pow(Tall,2)/10000) /Xc-0.051*whigh+4.180*1+15.496;

            BCM=((1.898*(Math.pow(Tall,2)))/(Xc+(Math.pow(R,2)/Xc))+0.051*whigh+4.180*1+15.496)*whigh/100;
            //BCM=0.822*((Math.pow(Tall,2)) /R)+4.180*1+14.096;



        }



        if(gender=='F' || gender=='f'){
            //BCM=1.898*(Math.pow(Tall,2)/10000) /Xc-0.051*whigh+15.496;

             BCM=((1.898*(Math.pow(Tall,2)) )/(Xc+(Math.pow(R,2)/Xc))+0.051*whigh+15.496)*whigh/100;
            //BCM=0.822*((Math.pow(Tall,2)) /R)+4.180*0+14.096;


        }



        return  Math.round(Math.abs(BCM));
    }


    //-------------------------------------------------
    public static double calcTBW(double age,double whigh,double Tall,char gender,double Z,double R,double Xc){
        double TBW=0.0;
        //z== impedince
        if(gender=='M'|| gender=='m'){
             TBW=(6.3+0.367*(Math.pow(Tall,2)) /Z+0.17065*whigh-0.11*age+2.66*1)*100/whigh;
            //TBW=((6.69+0.346*(Math.pow((Tall/100),2)) /Z+0.17531*whigh-0.11*age+2.86*1)/whigh)*100;
         //  TBW = (( 0.372 * (Math.pow(Tall/100,2)/10000) / Z  + 0.142 * whigh - 0.069 * age + 3.05 * 1)/whigh)*100;
           // TBW=calcFFM( age, whigh, Tall, gender, R, Xc,Z)*0.732;
         //    TBW=(( 0.377 * (Math.pow(Tall,2)) / Z  + 0.14 * whigh - 0.08 * age + 2.9 * 1+4.65)/whigh)*
           // TBW=



        }



      else   if(gender=='F'||gender=='f'){
            TBW=(6.3+0.367*(Math.pow(Tall,2)) /Z+0.17065*whigh-0.11*age)*100/whigh;

            //  TBW=(6.69+0.346*(Math.pow(Tall,2)/10000) /Z+0.17065*whigh-0.11*age)*100/whigh;
         //  TBW=((6.69+0.346*(Math.pow((Tall/100),2)) /Z+0.17531*whigh-0.11*age)/whigh)*100;
         // TBW = (( 0.372 * (Math.pow((Tall),2)/10000) / Z  + 0.142 * whigh - 0.069 * age )/whigh)*100;

       //     TBW=(( 0.377 * (Math.pow(Tall,2)) / Z  + 0.14 * whigh - 0.08 * age + 2.9 * 0+4.65)/whigh)*100;;


        }



        return  Math.round(Math.abs(TBW));
    }


    public  String stateTBK(double age,double weight,double Tall,char gender,double Xc,double R){
        double FFM=calcTBK(weight, Tall, gender, R, Xc) ;

        if(gender=='m' || gender=='M'){
            if (FFM>=TBKNormal_Male_val[0]&&FFM<=TBKNormal_Male_val[1]) {
                setColor(0);

                return TBKNormal_Kay;
            }
            else if(FFM>TBKNormal_Male_val[1]){
                setColor(1);

                return "High TBK";
            }else if(FFM<TBKNormal_Male_val[0]){
                setColor(1);

                return "LOW TBK";
            }else {
                setColor(2);
                return "ERR";
            }
        }

        else if(gender=='f' || gender=='F'){
            if (FFM>=TBKNormal_Famle_val[0]&&FFM<=TBKNormal_Famle_val[1]) {
                setColor(0);

                return TBKNormal_Kay;
            }
            else if(FFM>TBKNormal_Famle_val[1]){
                setColor(1);

                return "High TBK";
            }else if(FFM<TBKNormal_Famle_val[0]){
                setColor(1);

                return "LOW TBK";
            }else {
                setColor(2);
                return "ERR";
            }
        }
        setColor(2);
        return "ERR";
    }


    public  String stateBCM(double age,double weight,double Tall,char gender,double R,double Xc){
        double FFM=calcBCM(  weight, Tall, gender, R, Xc) ;

        if (FFM>=BCMNormal_val[0]&&FFM<=BCMNormal_val[1]) {
            setColor(0);

            return BCMNormal;
        }
        else if(FFM>BCMNormal_val[1]){
            setColor(1);

            return "High BCM";
        }else if(FFM<BCMNormal_val[0]){
            setColor(1);

            return "LOW BCM";
        }else{
            setColor(2);
            return "ERR";

        }

    }

    public  String stateFFM(double age,double weight,double Tall,char gender,double R,double Xc,double Z){
        double FFM=calcFFM( age, weight, Tall, gender, R, Xc,Z) ;

        if (FFM>=FFMNormal_val[0]&&FFM<=FFMNormal_val[1]) {
            setColor(0);

            return FFMNormal;
        }
        else if(FFM>FFMNormal_val[1]){
            setColor(1);

            return "High FFM";
        }else if(FFM<FFMNormal_val[0]){
            setColor(1);

            return "LOW FFM";
        }else{
            setColor(2);
            return "ERR";

        }

    }














    public  String stateSSm(double age,double weight,double Tall,char gender,double R,double Xc,double Z){
        double SMM=calcSMM( age, Tall, gender, R, weight , Xc,Z) ;
    if(gender=='M'|| gender=='m'){
        if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMNormal_man_val[0][0] && SMM <= SSMNormal_man_val[0][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMNormal_man_val[1][0] && SMM <= SSMNormal_man_val[1][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMNormal_man_val[2][0] && SMM <= SSMNormal_man_val[2][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMNormal_man_val[3][0] && SMM <= SSMNormal_man_val[3][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMNormal_man_val[4][0] && SMM <= SSMNormal_man_val[4][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMNormal_man_val[5][0] && SMM <= SSMNormal_man_val[5][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMNormal_man_val[6][0] && SMM <= SSMNormal_man_val[6][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMVeryHigh_man_val[0][0] && SMM <= SSMVeryHigh_man_val[0][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMVeryHigh_man_val[1][0] && SMM <= SSMVeryHigh_man_val[1][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMVeryHigh_man_val[2][0] && SMM <= SSMVeryHigh_man_val[2][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }

        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMVeryHigh_man_val[3][0] && SMM <= SSMVeryHigh_man_val[3][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMVeryHigh_man_val[4][0] && SMM <= SSMVeryHigh_man_val[4][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMVeryHigh_man_val[5][0] && SMM <= SSMVeryHigh_man_val[5][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMVeryHigh_man_val[6][0] && SMM <= SSMVeryHigh_man_val[6][1]) {
            setColor(2);

            return SSMVeryhigh_key;
        }





        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMHigh_man_val[0][0] && SMM <= SSMHigh_man_val[0][1]) {
            setColor(1);

            return SSMhigh_key;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMHigh_man_val[1][0] && SMM <= SSMHigh_man_val[1][1]) {
            setColor(1);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMHigh_man_val[2][0] && SMM <= SSMHigh_man_val[2][1]) {
            setColor(1);

            return SSMhigh_key;
        }

        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMHigh_man_val[3][0] && SMM <= SSMHigh_man_val[3][1]) {
            setColor(1);

            return SSMhigh_key;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMHigh_man_val[4][0] && SMM <= SSMHigh_man_val[4][1]) {
            setColor(1);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMHigh_man_val[5][0] && SMM <= SSMHigh_man_val[5][1]) {
            setColor(1);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMHigh_man_val[6][0] && SMM <= SSMHigh_man_val[6][1]) {
            setColor(1);

            return SSMhigh_key;
        }





        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMAvrage_man_val[0][0] && SMM <= SSMAvrage_man_val[0][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMAvrage_man_val[1][0] && SMM <= SSMAvrage_man_val[1][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMAvrage_man_val[2][0] && SMM <= SSMAvrage_man_val[2][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMAvrage_man_val[3][0] && SMM <= SSMAvrage_man_val[3][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMAvrage_man_val[4][0] && SMM <= SSMAvrage_man_val[4][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMAvrage_man_val[5][0] && SMM <= SSMAvrage_man_val[5][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMHigh_man_val[6][0] && SMM <= SSMHigh_man_val[6][1]) {
            setColor(0);

            return SMMNormal;
        }



        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMLow_man_val[0][0] && SMM <= SSMLow_man_val[0][1]) {
            setColor(2);

            return SSMLow_key;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMLow_man_val[1][0] && SMM <= SSMLow_man_val[1][1]) {
            setColor(2);

            return SSMLow_key;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMLow_man_val[2][0] && SMM <= SSMLow_man_val[2][1]) {
            setColor(2);

            return SSMLow_key;
        }




        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMLow_man_val[3][0] && SMM <= SSMLow_man_val[3][1]) {
            setColor(2);

            return SSMLow_key;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMLow_man_val[4][0] && SMM <= SSMLow_man_val[4][1]) {
            setColor(2);

            return SSMLow_key;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMLow_man_val[5][0] && SMM <= SSMLow_man_val[5][1]) {
            setColor(2);

            return SSMLow_key;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMLow_man_val[6][0] && SMM <= SSMLow_man_val[6][1]) {
            setColor(2);

            return SSMLow_key;
        }
      else{
            setColor(2);
            return "ERR";

        }
    }else if(gender=='F'||gender=='f'){




        if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMNormal_woman_val[0][0] && SMM <= SSMNormal_woman_val[0][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMNormal_woman_val[1][0] && SMM <= SSMNormal_woman_val[1][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMNormal_woman_val[2][0] && SMM <= SSMNormal_woman_val[2][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMNormal_woman_val[3][0] && SMM <= SSMNormal_woman_val[3][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMNormal_woman_val[4][0] && SMM <= SSMNormal_woman_val[4][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMNormal_woman_val[5][0] && SMM <= SSMNormal_woman_val[5][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMNormal_woman_val[6][0] && SMM <= SSMNormal_woman_val[6][1]) {
            setColor(0);

            return SMMNormal;
        }




        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMAvrage_woman_val[0][0] && SMM <= SSMAvrage_woman_val[0][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMAvrage_woman_val[1][0] && SMM <= SSMAvrage_woman_val[1][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMAvrage_woman_val[2][0] && SMM <= SSMAvrage_woman_val[2][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMAvrage_woman_val[3][0] && SMM <= SSMAvrage_woman_val[3][1]) {
            setColor(0);

            return SMMNormal;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMAvrage_woman_val[4][0] && SMM <= SSMAvrage_woman_val[4][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMAvrage_woman_val[5][0] && SMM <= SSMAvrage_woman_val[5][1]) {
            setColor(0);

            return SMMNormal;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMAvrage_woman_val[6][0] && SMM <= SSMAvrage_woman_val[6][1]) {
            setColor(0);

            return SMMNormal;
        }











        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMVeryHigh_woman_val[0][0] && SMM <= SSMVeryHigh_woman_val[0][1]) {
            setColor(2);

            return SSMhigh_key;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMVeryHigh_woman_val[1][0] && SMM <= SSMVeryHigh_woman_val[1][1]) {
            setColor(2);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMVeryHigh_woman_val[2][0] && SMM <= SSMVeryHigh_woman_val[2][1]) {
            setColor(2);

            return SSMhigh_key;
        }
        else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMVeryHigh_woman_val[3][0] && SMM <= SSMVeryHigh_woman_val[3][1]) {
            setColor(2);

            return SSMhigh_key;
        }

        else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMVeryHigh_woman_val[4][0] && SMM <= SSMVeryHigh_woman_val[4][1]) {
            setColor(2);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMVeryHigh_woman_val[5][0] && SMM <= SSMVeryHigh_woman_val[5][1]) {
            setColor(2);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMVeryHigh_woman_val[6][0] && SMM <= SSMVeryHigh_woman_val[6][1]) {
            setColor(2);

            return SSMhigh_key;
        }







        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMHigh_woman_val[0][0] && SMM <= SSMHigh_woman_val[0][1]) {
            setColor(2);

            return SSMhigh_key;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMHigh_woman_val[1][0] && SMM <= SSMHigh_woman_val[1][1]) {
            setColor(2);

            return SSMhigh_key;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMHigh_woman_val[2][0] && SMM <= SSMHigh_woman_val[2][1]) {
            setColor(2);

            return SSMhigh_key;
        }



    else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMHigh_woman_val[3][0] && SMM <= SSMHigh_woman_val[3][1]) {
        setColor(2);

        return SSMhigh_key;
    }

    else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMHigh_woman_val[4][0] && SMM <= SSMHigh_woman_val[4][1]) {
        setColor(2);

        return SSMhigh_key;
    }


    else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMHigh_woman_val[5][0] && SMM <= SSMHigh_woman_val[5][1]) {
        setColor(2);

        return SSMhigh_key;
    }


    else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMHigh_woman_val[6][0] && SMM <= SSMHigh_woman_val[6][1]) {
        setColor(2);

        return SSMhigh_key;
    }



        else if (age >= SMM_age[0][0] && age <= SMM_age[0][1] && SMM >= SSMLow_woman_val[0][0] && SMM <= SSMLow_woman_val[0][1]) {
        setColor(2);

        return SSMLow_key;
        }

        else if (age >= SMM_age[1][0] && age <= SMM_age[1][1] && SMM >= SSMLow_woman_val[1][0] && SMM <= SSMLow_woman_val[1][1]) {
            setColor(2);

            return SSMLow_key;
        }


        else if (age >= SMM_age[2][0] && age <= SMM_age[2][1] && SMM >= SSMLow_woman_val[2][0] && SMM <= SSMLow_woman_val[2][1]) {
        setColor(2);

        return SSMLow_key;
        }

    else if (age >= SMM_age[3][0] && age <= SMM_age[3][1] && SMM >= SSMLow_woman_val[3][0] && SMM <= SSMLow_woman_val[3][1]) {
        setColor(2);

        return SSMLow_key;
    }

    else if (age >= SMM_age[4][0] && age <= SMM_age[4][1] && SMM >= SSMLow_woman_val[4][0] && SMM <= SSMLow_woman_val[4][1]) {
        setColor(2);

        return SSMLow_key;
    }


    else if (age >= SMM_age[5][0] && age <= SMM_age[5][1] && SMM >= SSMLow_woman_val[5][0] && SMM <= SSMLow_woman_val[5][1]) {
        setColor(2);

        return SSMLow_key;
    }


    else if (age >= SMM_age[6][0] && age <= SMM_age[6][1] && SMM >= SSMLow_woman_val[6][0] && SMM <= SSMLow_woman_val[6][1]) {
        setColor(2);

        return SSMLow_key;
    }

        else{
            setColor(2);
            return "ERR";

        }
    }
        else{
        setColor(2);
        return "ERR";

    }





    }

    public  double calcBF(double weight,double Tall,char gender,double R,double Xc,double age,double Z){
       // double BF=((calcFM(weight,Tall,gender,R,Xc,age,Z))/weight)*100;

        double BF=((14.94-0.079*Math.pow(Tall/100,2)/R+0.818*weight-0.231*Tall-0.064*1*weight-0.077*age));

        return  BF;
    }
    public  String stateBF(double age,double weight,double Tall,char gender,double R,double Xc,double Z){

        double BF=calcBF(weight,Tall,gender,R ,Xc,age,Z) ;
        if(gender=='M'||gender=='M') {
            if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BFUnderfat_Man_val[0][0] && BF <= BFUnderfat_Man_val[0][1]) {

                setColor(2);
                return BFUnderfat_key;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BFUnderfat_Man_val[1][0] && BF <= BFUnderfat_Man_val[1][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BFUnderfat_Man_val[2][0] && BF <= BFUnderfat_Man_val[2][1]) {
                setColor(2);
                return BFUnderfat_key;
           /* } else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BFUnderfat_Man_val[3][0] && BF <= BFUnderfat_Man_val[3][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BFUnderfat_Man_val[4][0] && BF <= BFUnderfat_Man_val[4][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BFUnderfat_Man_val[5][0] && BF <= BFUnderfat_Man_val[5][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BFUnderfat_Man_val[6][0] && BF <= BFUnderfat_Man_val[6][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BFUnderfat_Man_val[7][0] && BF <= BFUnderfat_Man_val[7][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BFUnderfat_Man_val[8][0] && BF <= BFUnderfat_Man_val[8][1]) {
                setColor(2);
                return BFUnderfat_key;*/
            } else if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BF_Average_man_val[0][0] && BF <= BF_Average_man_val[0][1]) {

                setColor(0);
                return BF_Healthy;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BF_Average_man_val[1][0] && BF <= BF_Average_man_val[1][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BF_Average_man_val[2][0] && BF <= BF_Average_man_val[2][1]) {
                setColor(0);
                return BF_Healthy;
            } /*else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BF_Average_man_val[3][0] && BF <= BF_Average_man_val[3][1]) {
                setColor(1);
                return BF_Averagefat;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BF_Average_man_val[4][0] && BF <= BF_Average_man_val[4][1]) {
                setColor(1);
                return BF_Averagefat;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BF_Average_man_val[5][0] && BF <= BF_Average_man_val[5][1]) {
                setColor(1);

                return BF_Averagefat;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BF_Average_man_val[6][0] && BF <= BF_Average_man_val[6][1]) {
                setColor(1);

                return BF_Averagefat;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BF_Average_man_val[7][0] && BF <= BF_Average_man_val[7][1]) {
                setColor(1);

                return BF_Averagefat;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BF_Average_man_val[8][0] && BF <= BF_Average_man_val[8][1]) {
                setColor(1);

                return BF_Averagefat;
            }*/ else if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BF_Healthy_man_val[0][0] && BF <= BF_Healthy_man_val[0][1]) {

                setColor(0);
                return BF_Healthy;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BF_Healthy_man_val[1][0] && BF <= BF_Healthy_man_val[1][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BF_Healthy_man_val[2][0] && BF <= BF_Healthy_man_val[2][1]) {
                setColor(0);
                return BF_Healthy;
            }/* else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BF_Healthy_man_val[3][0] && BF <= BF_Healthy_man_val[3][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BF_Healthy_man_val[4][0] && BF <= BF_Healthy_man_val[4][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BF_Healthy_man_val[5][0] && BF <= BF_Healthy_man_val[5][1]) {
                setColor(0);

                return BF_Healthy;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BF_Healthy_man_val[6][0] && BF <= BF_Healthy_man_val[6][1]) {
                setColor(0);

                return BF_Healthy;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BF_Healthy_man_val[7][0] && BF <= BF_Healthy_man_val[7][1]) {
                setColor(0);

                return BF_Healthy;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BF_Healthy_man_val[8][0] && BF <= BF_Average_man_val[8][1]) {
                setColor(0);

                return BF_Healthy;
            }*/ else if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BF_oferFat_man_val[0][0] && BF <= BF_oferFat_man_val[0][1]) {

                setColor(2);
                return BF_oferFat;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BF_oferFat_man_val[1][0] && BF <= BF_oferFat_man_val[1][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BF_oferFat_man_val[2][0] && BF <= BF_oferFat_man_val[2][1]) {
                setColor(2);
                return BF_oferFat;
            } /*else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BF_oferFat_man_val[3][0] && BF <= BF_oferFat_man_val[3][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BF_oferFat_man_val[4][0] && BF <= BF_oferFat_man_val[4][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BF_oferFat_man_val[5][0] && BF <= BF_oferFat_man_val[5][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BF_oferFat_man_val[6][0] && BF <= BF_oferFat_man_val[6][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BF_oferFat_man_val[7][0] && BF <= BF_oferFat_man_val[7][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BF_oferFat_man_val[8][0] && BF <= BF_oferFat_man_val[8][1]) {
                setColor(2);
                return BF_oferFat;
            }*/
            else {
                setColor(2);
                return "Err";
            }



        }if(gender=='F'||gender=='f'){




            if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BFUnderfat_Woman_val[0][0] && BF <= BFUnderfat_Woman_val[0][1]) {

                setColor(2);
                return BFUnderfat_key;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BFUnderfat_Woman_val[1][0] && BF <= BFUnderfat_Woman_val[1][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BFUnderfat_Woman_val[2][0] && BF <= BFUnderfat_Woman_val[2][1]) {
                setColor(2);
                return BFUnderfat_key;
            }/* else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BFUnderfat_Woman_val[3][0] && BF <= BFUnderfat_Woman_val[3][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BFUnderfat_Woman_val[4][0] && BF <= BFUnderfat_Woman_val[4][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BFUnderfat_Woman_val[5][0] && BF <= BFUnderfat_Woman_val[5][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BFUnderfat_Woman_val[6][0] && BF <= BFUnderfat_Woman_val[6][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BFUnderfat_Woman_val[7][0] && BF <= BFUnderfat_Woman_val[7][1]) {
                setColor(2);
                return BFUnderfat_key;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BFUnderfat_Woman_val[8][0] && BF <= BFUnderfat_Woman_val[8][1]) {
                setColor(2);
                return BFUnderfat_key;
            }*/ else if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BF_Average_wman_val[0][0] && BF <= BF_Average_wman_val[0][1]) {

                setColor(1);
                return BF_Averagefat;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BF_Average_wman_val[1][0] && BF <= BF_Average_wman_val[1][1]) {
                setColor(1);
                return BF_Averagefat;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BF_Average_wman_val[2][0] && BF <= BF_Average_wman_val[2][1]) {
                setColor(1);
                return BF_Averagefat;
            }/* else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BF_Average_wman_val[3][0] && BF <= BF_Average_wman_val[3][1]) {
                setColor(1);
                return BF_Averagefat;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BF_Average_wman_val[4][0] && BF <= BF_Average_wman_val[4][1]) {
                setColor(1);
                return BF_Averagefat;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BF_Average_wman_val[5][0] && BF <= BF_Average_wman_val[5][1]) {
                setColor(1);

                return BF_Averagefat;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BF_Average_wman_val[6][0] && BF <= BF_Average_wman_val[6][1]) {
                setColor(1);

                return BF_Averagefat;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BF_Average_wman_val[7][0] && BF <= BF_Average_wman_val[7][1]) {
                setColor(1);

                return BF_Averagefat;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BF_Average_wman_val[8][0] && BF <= BF_Average_wman_val[8][1]) {
                setColor(1);

                return BF_Averagefat;
            }*/ else if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BF_Healthy_wman_val[0][0] && BF <= BF_Healthy_wman_val[0][1]) {

                setColor(0);
                return BF_Healthy;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BF_Healthy_wman_val[1][0] && BF <= BF_Healthy_wman_val[1][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BF_Healthy_wman_val[2][0] && BF <= BF_Healthy_wman_val[2][1]) {
                setColor(0);
                return BF_Healthy;
            } /*else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BF_Healthy_wman_val[3][0] && BF <= BF_Healthy_wman_val[3][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BF_Healthy_wman_val[4][0] && BF <= BF_Healthy_wman_val[4][1]) {
                setColor(0);
                return BF_Healthy;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BF_Healthy_wman_val[5][0] && BF <= BF_Healthy_wman_val[5][1]) {
                setColor(0);

                return BF_Healthy;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BF_Healthy_wman_val[6][0] && BF <= BF_Healthy_wman_val[6][1]) {
                setColor(0);

                return BF_Healthy;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BF_Healthy_wman_val[7][0] && BF <= BF_Healthy_wman_val[7][1]) {
                setColor(0);

                return BF_Healthy;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BF_Healthy_wman_val[8][0] && BF <= BF_Healthy_wman_val[8][1]) {
                setColor(0);

                return BF_oferFat;
            }*/ else if (age >= BF_age[0][0] && age <= BF_age[0][1] && BF >= BF_oferFat_wman_val[0][0] && BF <= BF_oferFat_wman_val[0][1]) {

                setColor(2);
                return BF_oferFat;

            } else if (age >= BF_age[1][0] && age <= BF_age[1][1] && BF >= BF_oferFat_wman_val[1][0] && BF <= BF_oferFat_wman_val[1][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[2][0] && age <= BF_age[2][1] && BF >= BF_oferFat_wman_val[2][0] && BF <= BF_oferFat_wman_val[2][1]) {
                setColor(2);
                return BF_oferFat;
            }/* else if (age >= BF_age[3][0] && age <= BF_age[3][1] && BF >= BF_oferFat_wman_val[3][0] && BF <= BF_oferFat_wman_val[3][1]) {
                setColor(2);
                return BF_oferFat;
            }*/ /*else if (age >= BF_age[4][0] && age <= BF_age[4][1] && BF >= BF_oferFat_wman_val[4][0] && BF <= BF_oferFat_wman_val[4][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[5][0] && age <= BF_age[5][1] && BF >= BF_oferFat_wman_val[5][0] && BF <= BF_oferFat_wman_val[5][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[6][0] && age <= BF_age[6][1] && BF >= BF_oferFat_wman_val[6][0] && BF <= BF_oferFat_wman_val[6][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[7][0] && age <= BF_age[7][1] && BF >= BF_oferFat_wman_val[7][0] && BF <= BF_oferFat_wman_val[7][1]) {
                setColor(2);
                return BF_oferFat;
            } else if (age >= BF_age[8][0] && age <= BF_age[8][1] && BF >= BF_oferFat_wman_val[8][0] && BF <= BF_oferFat_wman_val[8][1]) {
                setColor(2);
                return BF_oferFat;
            }*/



            else {
                setColor(2);
                return "Err";
            }





        }



     else {
            setColor(2);
            return "Err";
        }


    }



    private  static double calcFM(double weight,double Tall,char gender,double R,double Xc,double age,double Z){
        double FM= weight- calcFFM(age,weight,Tall,gender,R,Xc,Z) ;
        return FM;
    }


    public static   double calcFFM(double age,double weight,double Tall,char gender,double R,double Xc,double Z){
        double FFM= 0;








        if(gender=='M' || gender=='m'){

            //FFM = 0.36 * ((Math.pow(Tall,2)/10000) / R) + 0.162 * Tall + 0.289 * weight - 0.134 * age + 4.83 * 1;

            // FFM = -4.104 +0.518 * (Math.pow(Tall,2)/10000) / R +0.231 * weight + 0.130* Xc+ 4.229;
            //FFM=-4.104+(0.518/R)*(Math.pow(Tall,2)/Math.pow(10,4))+0.231*weight+0.130*Xc+4.229;




             //FFM=-4.104+(0.518*((Math.pow(Tall,2))/Math.pow(10,4))/R)+0.231*weight+0.130*Xc+4.229*1;

          //  FFM = 0.36 * (Math.pow(Tall,2)/10000) /Z + 0.162 * Tall + 0.289 * weight - 0.134 * age + 4.83 * 1;
            FFM = (calcTBW(age,weight,Tall,gender,Z,R,Xc)/0.732)*weight/100;

        }





        else if(gender=='F' || gender=='f'){

            // FFM = 0.36 * ((Math.pow(Tall,2)/10000)/ R) + 0.162 * Tall + 0.289 * weight - 0.134 * age + 4.83 * 0;

          //  FFM = -4.104 +0.518 * (Math.pow(Tall,2)/10000) / R +0.231 * weight + 0.130* Xc+ 4.229 * 0;
            //FFM=-4.104+(0.518*((Math.pow(Tall,2))/Math.pow(10,4))/R)+0.231*weight+0.130*Xc;
           // FFM = 0.36 * (Math.pow(Tall,2)/10000) /Z + 0.162 * Tall + 0.289 * weight - 0.134 * age;

            FFM = (calcTBW(age,weight,Tall,gender,Z,R,Xc)/0.732)*weight/100;

        }


        return FFM;
    }

    public  long calcBMI(double whigh,double Tall){
        double BMI=Math.pow(100,2)*whigh/Math.pow(Tall,2);
        return Math.round(Math.abs(BMI));
    }

    public  String stateBMI(double whigh,double Tall){
        double BMI=calcBMI(whigh,Tall);
        if(BMI>=BMIUnderweight_val[0] && BMI<=BMIUnderweight_val[1]){
            setColor(2);
            return BMIUnderweight;
        }

        else if(BMI>=BMINormalweight_val[0] &&  BMI<=BMINormalweight_val[1]){
            setColor(0);
            return BMINormalweight;
        }

        else if(BMI>=BMIOverweight_val[0] &&  BMI<=BMIOverweight_val[1]){
            setColor(1);

            return BMIOverweight;
        }

        else if(BMI>=BMIObeseClaseI_val[0] &&  BMI<=BMIObeseClaseI_val[1]){
            setColor(1);

            return BMIObeseClaseI;
        }

        else if(BMI>=BMIObeseClaseII_val[0] &&  BMI<=BMIObeseClaseII_val[1]){
            setColor(2);

            return BMIObeseClaseII;
        }


        else if(BMI>=BMIObeseClaseIII_val[0] &&  BMI<=BMIObeseClaseIII_val[1]){
            setColor(2);

            return BMIObeseClaseIII;
        }
        else if(BMI>=BMISuperObese_val[0] &&  BMI<=BMISuperObese_val[1]){
            setColor(2);

            return BMISuperObese;
        }else {
            setColor(2);
            return "Err";
        }



    }


}
