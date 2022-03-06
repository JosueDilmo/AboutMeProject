package com.josue.aboutmeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnEducation.setOnClickListener{
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnSkill.setOnClickListener{
            val intent = Intent(this, SkillsActivity::class.java)
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