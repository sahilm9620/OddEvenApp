package sahil.mulla.oddevenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myedit = findViewById<EditText>(R.id.editTextTextPersonName)
        val mytv = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val num: Int = myedit.text.toString().toInt()
            if (num % 2 == 0) {
                mytv.text = ("$num is even")
            } else {
                mytv.text = ("$num is odd")
            }
        })
    }
}