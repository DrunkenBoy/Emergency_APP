package studienarbeit.beta02_notfallapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;


public class Einstellungen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einstellungen);
    }
    public void safenumber(View view) {
        Intent intent = new Intent(this, Anruf.class);
        EditText editText = (EditText) findViewById(R.id.EditText);
    }


}
