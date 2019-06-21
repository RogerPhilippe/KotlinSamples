package br.com.philippesis.kotlinsamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var txtSample: TextView
    private lateinit var btnSample: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComps()
        setupListenerComps()

    }

    private fun initComps() {

        this.txtSample = findViewById(R.id.txtSample)
        this.btnSample = findViewById(R.id.btnSample)

    }

    private fun setupListenerComps() {

        this.btnSample.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        if (v == btnSample) {
            this.txtSample.text = "Roger Philippe. Status: ${UserStatus.ACTIVE}"
            // Or UserStatus.ACTIVE.value to receive int value
        }

    }

}
