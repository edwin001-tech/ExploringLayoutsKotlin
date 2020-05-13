package com.example.exploringlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

    }

    fun loadConstraintLayout(view: View) {
        setContentView(R.layout.activity_main)
    }

    fun loadTableLayout(view: View) {
        //  setContentView(R.layout.my_table_layout)
    }
}
