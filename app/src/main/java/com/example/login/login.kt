import com.example.login.MainActivity
import com.example.login.R



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var login:Button
    lateinit var signUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email=findViewById(R.id.etEmail)
        password=findViewById(R.id.etPass)
        login=findViewById(R.id.btnLogin)
        signUp=findViewById(R.id.btnSignUp)
        login.setOnClickListener {
            if(email.text.isEmpty()){
                email.setError("Fill in all fields")
            }
            if(password.text.isEmpty()){
                password.setError("Fill in all fields")
            }
            }
        signUp.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        }

    }

