package com.example.myfourthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfourthapp.ui.main.MainFragment
import com.example.myfourthapp.ui.main.SubFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.linear_container, MainFragment.newInstance())
                .add(R.id.linear_container, SubFragment.newInstance())
                .commitNow()
        }
    }
}