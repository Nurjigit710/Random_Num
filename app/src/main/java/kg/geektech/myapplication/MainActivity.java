package kg.geektech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int minNum = 1, maxNum = 100, numbersEdit;
    private int random = (int) ((Math.random() * (maxNum - minNum)) + minNum);
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        editText = findViewById( R.id.numbers );
    }

    private void toast(String string) {
        Toast.makeText( MainActivity.this, string, Toast.LENGTH_SHORT ).show();
    }

    public void onClickNumbersResult(View view) {
        numbersEdit = Integer.parseInt( editText.getText().toString() );
        if (numbersEdit < random) {
            toast( "Попробуй еще раз о Большом числе" );
        } else if (numbersEdit > random) {
            toast( "Попробуйте еще раз о Меньшем числе" );
        } else {
            toast( "Поздравляю, Вы Угадали число: " + numbersEdit );
        }
    }


}
