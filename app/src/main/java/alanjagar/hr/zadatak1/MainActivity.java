package alanjagar.hr.zadatak1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IView{

    private TextView tvOutput;
    private EditText etInput;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = (TextView) findViewById(R.id.tvOutput);
        etInput = (EditText) findViewById(R.id.etInput);

        presenter = new Presenter(this);
    }

    public void btnAction_click(View view) {
        tvOutput.setText("");
        String strNumber = etInput.getText().toString();
        presenter.checkIfStringNumberIsEven(strNumber);
    }

    @Override
    public void showOutput(String msg) {
        tvOutput.setText(msg);
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
