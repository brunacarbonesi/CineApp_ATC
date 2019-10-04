package com.bcarbonesi.cineapp_atc.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bcarbonesi.cineapp_atc.R

class SplashActivity : AppCompatActivity() {

    //Tempo de Duração da tela de splash
    private val splashDisplayLength: Long = 3000 //2 segundos

    //Criando o Handler
    private var mDelayHandler: Handler? = null

    private val mRunnable: Runnable = Runnable {
        if(!isFinishing) {
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Inicializando o Handler
        mDelayHandler = Handler()

        //Navegando com atraso
        mDelayHandler!!.postDelayed(mRunnable,splashDisplayLength)

    }

    override fun onDestroy() {

        if (mDelayHandler != null) {

            mDelayHandler!!.removeCallbacks(mRunnable)

        }

        super.onDestroy()


    }
}
