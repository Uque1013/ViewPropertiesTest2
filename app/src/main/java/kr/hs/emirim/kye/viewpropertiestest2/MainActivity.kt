package kr.hs.emirim.kye.viewpropertiestest2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t1 : TextView
        var t2 : TextView
        var t3 : TextView

        t1 = findViewById<TextView>(R.id.text1)
        t2 = findViewById<TextView>(R.id.text2)
        t3 = findViewById<TextView>(R.id.text3)

        t1.setText("안녕 미림티비")
        t1.setTextSize(30.0f)
        t1.setTextColor(Color.MAGENTA)

        t2.setText("성철아 내가 널 정말 많이 애낀다.")
        t2.setTextSize(35.0f)
        t2.setTextColor(Color.CYAN)
        t2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC)

        t3.setText("김성철로말하자면뮤지컬배우로는두말하면잔소리로입이아플정도로유명하고요연기도뒤질라게잘해서그냥천재미친놈이에요")
        t3.setSingleLine()
    }
}