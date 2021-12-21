package th.ac.kku.cis.lab.androidlayoutapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonInfo = findViewById<Button>(R.id.buttonInfo)
        buttonInfo.setOnClickListener { view ->
            Toast.makeText(this, "INFO Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }

        var buttonMail = findViewById<Button>(R.id.buttonEmail)
        buttonMail.setOnClickListener { view ->
            Toast.makeText(this, "Email clieked", Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto: Example@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, "test")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hello World")

            startActivity(intent)
        }
    }
}