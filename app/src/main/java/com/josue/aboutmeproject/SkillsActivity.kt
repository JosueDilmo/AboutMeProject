package com.josue.aboutmeproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btnAchievement
import kotlinx.android.synthetic.main.activity_main.btnEducation
import kotlinx.android.synthetic.main.activity_main.btnHobbies
import kotlinx.android.synthetic.main.activity_main.exitIcon
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity: AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        btnHome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnEducation.setOnClickListener{
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnHobbies.setOnClickListener{
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

        btnAchievement.setOnClickListener{
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

        exitIcon.setOnClickListener{
            finishAffinity()
        }




    }
}