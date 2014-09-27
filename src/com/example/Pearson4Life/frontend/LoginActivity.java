package com.example.Pearson4Life.frontend;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.Pearson4Life.R;

public class LoginActivity extends Activity {
    private boolean _employerMode;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                switch (view.getId()) {
                    case R.id.button_employer:
                        _employerMode = true;
                        break;
                    case R.id.button_user:
                        _employerMode = false;
                        break;
                    case R.id.button_ok:
                        login(((EditText)view).getText().toString(), _employerMode);
                        break;
                }
            }
        };

        findViewById(R.id.button_employer).setOnClickListener(clickListener);
        findViewById(R.id.button_user).setOnClickListener(clickListener);
        findViewById(R.id.button_ok).setOnClickListener(clickListener);
    }

    private void login(final String user, final boolean employerMode) {
        if (employerMode) {

        } else {

        }
    }
}
