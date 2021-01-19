package com.tutorials.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tempFragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_tutucu,FragmentBirinci()).commit()

        bottom_nav.setOnNavigationItemSelectedListener { menuItem ->
            if(menuItem.itemId == R.id.action_bir){
                tempFragment = FragmentBirinci()
            }
            if(menuItem.itemId == R.id.action_iki){
                tempFragment = FragmentIkinci()
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_tutucu,tempFragment).commit()

            true
        }
    }
}