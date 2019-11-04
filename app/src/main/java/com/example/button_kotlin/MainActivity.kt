package com.example.button_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val Button=findViewById(R.id.button)as Button

        Button.setOnClickListener {
      // your code to perform when the user clicks on the button
      Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

   }
        /*  val ll_main = findViewById(R.id.constraint) as ConstraintLayout
        // creating the button
        val button_dynamic = Button(this)

       // setting layout_width and layout_height using layout parameters
         button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
         button_dynamic.text = "Dynamic Button"
        // add Button to LinearLayout
         ll_main.addView(button_dynamic)
    }*/

    }


}
