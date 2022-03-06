package com.josue.aboutmeproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_skills.*
import kotlinx.android.synthetic.main.activity_skills.btnAchievement
import kotlinx.android.synthetic.main.activity_skills.btnEducation
import kotlinx.android.synthetic.main.activity_skills.btnHobbies
import kotlinx.android.synthetic.main.activity_skills.exitIcon

class HobbiesActivity: AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        btnHome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnEducation.setOnClickListener{
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnSkill.setOnClickListener{
            val intent = Intent(this, SkillsActivity::class.java)
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