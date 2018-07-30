package dmi.pmf.novica.daggermytests.detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dmi.pmf.novica.daggermytests.R;
import dmi.pmf.novica.daggermytests.login.LoginActivity;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.btn_login)
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_login)
    public void showLoginActivity(){
        startActivity(new Intent(this, LoginActivity.class));
    }
}
