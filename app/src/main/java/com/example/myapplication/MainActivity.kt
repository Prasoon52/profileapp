package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.skillsbutton)
        val buttonExperience = findViewById<Button>(R.id.experience)
        val buttonEducation = findViewById<Button>(R.id.educationbutton)
        val buttonAchievement = findViewById<Button>(R.id.achievementbutton)

        buttonSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonExperience.setOnClickListener {
            val intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }

        buttonEducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        buttonAchievement.setOnClickListener {
            val intent = Intent(this, AchievementActivity::class.java)
            startActivity(intent)
        }
    }
}
