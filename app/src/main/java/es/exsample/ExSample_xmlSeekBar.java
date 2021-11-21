package es.exsample;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class ExSample_xmlSeekBar extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rlexsample);  //レラティブレイアウトのXMLファイルをアクティビティに設定

        final SeekBar seekbar = (SeekBar)findViewById(R.id.seekBar1);
        final TextView tv3 = (TextView) findViewById(R.id.text3);

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {//ツマミをドラックしたときに呼ばれる
                        tv3.setText("progress:" + seekBar.getProgress());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {//ツマミに触れたときによばれる
                        tv3.setText("progress:" + seekBar.getProgress());

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {//ツマミを離したときに呼ばれる
                        tv3.setText("progress:" + seekBar.getProgress());

                    }
                }
        );
    }
}
