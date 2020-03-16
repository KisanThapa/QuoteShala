package com.kisanthapa33.quoteshala

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val tags =
            arrayListOf(
                "#kisan",
                "#thapa",
                "#hello",
                "#HI",
                "#My name is kisan",
                "#hello",
                "#HI",
                "#My name",
                "#is kisan"
            )

        for (text in tags) {
            val chip = Chip(chipGroup.context)

            chip.chipText = text
            chip.isClickable = true
            chip.isCheckable = true
            chipGroup.addView(chip)
        }

        chipGroup.setOnCheckedChangeListener(object : ChipGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: ChipGroup?, p1: Int) {
                Log.i("KKKKK", "Chip data: $p0  id: $p1")
                Log.i("KKKKK", "Chip data: $p0  id: $p1")
            }
        })
    }
}
