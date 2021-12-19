package anjuman.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.minus)
        val reset = findViewById<Button>(R.id.reset)

        var number =0
        var textView = findViewById<TextView>(R.id.tv1)
        add.text = "+"
        sub.text = "-"
        add.setOnClickListener()
        {
            number +=1
            textView.text=number.toString()
        }
        sub.setOnClickListener()
        {
            if (number==0)
            {
                textView.text = "0"
            }
            else
            number -=1
            textView.text=number.toString()
        }
        reset.setOnClickListener()
        {
            if (number==0)
            {
                textView.text = "0"
            }
            else
                number = 0
            textView.text=number.toString()
        }
    }
}