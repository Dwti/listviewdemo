package yanxiu.com.yxyl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
    }
    public void ReSetpassword(View view){
        Intent intent=new Intent(this,ResetPasswordActivity.class);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}
