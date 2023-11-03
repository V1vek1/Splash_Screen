package com.helllo.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Yeh code se, App ke upper me jo heading likha aata h n usko hum hide kar sakte, Per mere iss
        //App me Already Heading Hidden hi thi to mujhe ye code likhne ki jarurat nahi h
        supportActionBar?.hide()  //Yeh "Question bar" isiliye lga h kyuki, Yeh btata h ki Kya ActionBar h
                                  //Agar h to Hide kardo or nahi h to kuch maat karo, Basically Yeh Kotlin me
                                   //hota h Java me "Question Mark" nahi lagta h jisse ki Error aate the


        //

        //Yha maine Splash Screen ko open hone me kitna "Time" ka Delay chaiye wo Diya h
        Handler().postDelayed({   //Yha pr maine handler method ko call kiya phri usko "postDelayed" se
                                  //assign kiya phir usme ek "Intent" bnaya

            val intent=  Intent(this, SignUp::class.java)
            startActivity(intent)  //Yha "intent" ko Start kiya
            finish()               //Yha maine "finish" method ko call kiya, taki hum "Second Activity" se back
                                   //aane per phir se "Splash Screen" per na chale jaye, issliliye maine "finish"
                                   //method Call kiya

        },3000)     //Yha maine "Delay Time" diya h ki kitne "millisecond" keliye delay karna h
    }
}

