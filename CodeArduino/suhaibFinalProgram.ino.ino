#include <Wire.h>
#include "AD5933.h"
#include <SoftwareSerial.h> 
SoftwareSerial MyBlue(5,6);
#define START_FREQ  (10000)
#define FREQ_INCR   (10000)
#define NUM_INCR    (9)
#define REF_RESIST  (1000)
float  TBW ;
float BCM ;
int he=160;
int w=70;
int age=23;
double gain[NUM_INCR + 1];
int phase[NUM_INCR + 1];

void setup(void)
{
  // Begin I2C
  Wire.begin();

  // Begin serial at 9600 baud for output
MyBlue.begin(9600);
  Serial.begin(19200);
  Serial.println("AD5933 Test Started!");

  // Perform initial configuration. Fail if any one of these fail.



  //AD5933::reset();
  
  if (!(AD5933::reset() &&
        AD5933::setInternalClock(true) &&
        AD5933::setStartFrequency(START_FREQ) &&
        AD5933::setIncrementFrequency(FREQ_INCR) &&
        AD5933::setNumberIncrements(NUM_INCR) &&
        AD5933::setPGAGain(PGA_GAIN_X1)))
        {
            Serial.println("FAILED in initialization!");
            while (true) ;
        }
       


         Serial.println("AD5933 Test Started!2");

  // Perform calibration sweep
if (AD5933::calibrate(gain, phase, REF_RESIST, NUM_INCR + 1))
  Serial.println("Calibrated!");
  else
    Serial.println("Calibration failed...");

}


String state;
  double impedance=0;
  double magnitude=0;
void loop(void)
{
  // Easy to use method for frequency sweep
if(MyBlue.available()>0) {
state = MyBlue.readString();
//MyBlue.println("Connect Done");
Serial.println("Connect Done");}

  // Complex but more robust method for frequency sweep
  frequencySweepRaw();

  // Delay
  delay(5000);
  

// Easy way to do a frequency sweep. Does an entire frequency sweep at once and
// stores the data into arrays for processing afterwards. This is easy-to-use,
// but doesn't allow you to process data in real time.


// Removes the frequencySweep abstraction from above. This saves memory and
// allows for data to be processed in real time. However, it's more complex.

}
void frequencySweepRaw() {

   Serial.println("---------------------------ROW------------------------");
    // Create variables to hold the impedance data and track frequency
    int real, imag, i = 0, cfreq = START_FREQ/1000;

    // Initialize the frequency sweep
    if (!(AD5933::setPowerMode(POWER_STANDBY) &&          // place in standby
          AD5933::setControlMode(CTRL_INIT_START_FREQ) && // init start freq
          AD5933::setControlMode(CTRL_START_FREQ_SWEEP))) // begin frequency sweep
         {
             Serial.println("Could not initialize frequency sweep...");
         }

    // Perform the actual sweep
    while ((AD5933::readStatusRegister() & STATUS_SWEEP_DONE) != STATUS_SWEEP_DONE) {
        // Get the frequency data for this frequency point
        if (!AD5933::getComplexData(&real, &imag)) {
            Serial.println("Could not get raw frequency data...");
   
        }
                                    //   delay(2000);

        Serial.print("F= ");
        Serial.print(cfreq);
        Serial.print(": R=");
        Serial.print(real);
        Serial.print("/I=");
        Serial.print(imag);

        // Compute impedance
         magnitude = sqrt(pow(real, 2) + pow(imag, 2));
        Serial.print("  |MM|=");
        Serial.print(magnitude);
       impedance = 1/(magnitude*gain[i]);
        Serial.print("  |Z|=");
        Serial.print(impedance);
        Serial.println("");
         
             
        // Increment the frequency
   if(cfreq==50){
                    Serial.println(" Check Condetion ");
                    //MyBlue.println("phase:\n");
                    //MyBlue.println(phase);
                    
                    //MyBlue.println("F");
                    
                    //MyBlue.println(freq/1000);
                    //MyBlue.println(",kHz;");
                    //Serial.println.println(" Magnitude: ");
                    //Serial.println(mag);
                     Serial.println(" Z"+String( magnitude,0));

                     if(magnitude>=20 || magnitude<=-20){

                    MyBlue.println(" Z"+String( magnitude,0));
                    Serial.println(" Z"+String( magnitude,0));
                     delay(500);

                    }
                                    


                                      double rr=real;

                   
              TBW =(6.53+(0.36740*pow(he,2)/magnitude)+(0.17065*w)+(-0.11*age)+2.66)*100/w ;
         
                           Serial.println("TBW:");
                                           Serial.println(TBW);
                                            //elay(2000);
                   
                   
                   
                   
                   
                       

                          double   ffm1=(TBW/0.732)*w/100;
                           Serial.print("ffm1:");
                         Serial.println(ffm1);
                            //elay(2000);

                       double FM =(w-ffm1);  
                     double Bf1 =(FM /w)*100;  
                    Serial.println("Body fat1:");
                          Serial.println(Bf1);
                                        
                    MyBlue.println(" R"+String(rr,0));

                                             
                    if(rr>=20 || rr<=-20){
                      
                    MyBlue.println(" R"+String(rr,0));
                    Serial.println(" R"+String(rr,0));
                                      delay(500);                    
                    }


                                                
                                                     double     ii=imag;
                                                                                        
                                                            
                                                            double   ECW =abs(-5.22+(0.2*pow(he ,2)/rr)+(0.005/ii)+(0.08*w )+1.9+1.86*0) ;
                                                           // double   ECW =(0.0119*pow(he ,2)/ii)+(0.005/ii) +(0.08*w)+1.9 ;
                                                             Serial.println("ECW:"); 
                                                             Serial.println(ECW); 

                                               

                                             
                                                      double   FFM2=abs(-4.104+(0.518*pow(he,2)/rr)+(0.231*w )+(4.229)+(0.130*ii));

                                                                 Serial.println("FFM2:");  
                                                                 Serial.println(FFM2);
                                                                 // delay(2000);
                                                                 double FM2 =(w-FFM2);  
                     double Bf2 =FM2*100/w;  
                    Serial.println("Body fat2:");
                           Serial.println(Bf2);
                                         //    delay(2000);


                                                                                       

                          double   BD=1.100696-(0.107903*w*rr/pow(he,2))+(0.00017*ii);
                           double  PBF=(4.57/BD-4.142)*100;
                                                     Serial.println("PBF:");
                                                     Serial.println(PBF);
                                                                                                                                         


}
                     if(cfreq==30){
                    //MyBlue.println("gain:\n");
                    //MyBlue.println(gain);
                          double ii=imag;
                          double rr=real;
                     Serial.println(" X"+String(ii,0));

                      if(ii>=20 || ii<=-20){
                    MyBlue.println(" X"+String(ii,0));
                    
                    Serial.println(" X"+String(ii,0));
                    delay(500); 
                        }                          

                   
                           }
                  delay(5000);                    
                                      
                                                 
 
 
                     i++;
        cfreq += FREQ_INCR/1000;
        AD5933::setControlMode(CTRL_INCREMENT_FREQ);
    
    }

    Serial.println("Frequency sweep complete!");

    // Set AD5933 power mode to standby when finished
    if (!AD5933::setPowerMode(POWER_STANDBY))
        Serial.println("Could not set to standby...");
Serial.println("cfreq=/");
Serial.println(cfreq);

}
