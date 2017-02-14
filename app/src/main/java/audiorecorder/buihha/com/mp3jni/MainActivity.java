package audiorecorder.buihha.com.mp3jni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.buihha.audiorecorder.SimpleLame;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleLame sampleRateInHz = new SimpleLame();
        sampleRateInHz.init(16000, 1, 16000, 96, 8);

    }
}
