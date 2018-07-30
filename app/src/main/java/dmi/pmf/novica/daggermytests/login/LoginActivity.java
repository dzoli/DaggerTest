package dmi.pmf.novica.daggermytests.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dmi.pmf.novica.daggermytests.R;
import dmi.pmf.novica.daggermytests.detail.DetailActivity;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.btn_detail)
    Button btnDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_detail)
    public void showDetailActivity() {
        startActivity(new Intent(this, DetailActivity.class));
    }
}
