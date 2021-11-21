
package es.exsample;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.util.concurrent.Callable;

public class ExSample_file extends AppCompatActivity {

    public static int GO_UP = 1;
    CheckBox checkbox1,checkbox2,checkbox3,checkbox4;
    TextView tv,tv2,tv3,tv4,tv5;
    int Smile,Mind,Load;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_count);  //レラティブレイアウトのXMLファイルをアクティビティに設定


        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);//チェックボックス関連付け
        checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkBox4);

        RadioGroup radio1 = (RadioGroup) findViewById(R.id.Radio1);//ラジオグループ関連付け

        final SeekBar seekbar = (SeekBar)findViewById(R.id.seekBar1);//SeekBar関連付け

        tv = (TextView) findViewById(R.id.text);//各テキスト関連付け
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        tv4 = (TextView) findViewById(R.id.text4);
        tv5 = (TextView) findViewById(R.id.text5);


        checkbox1.setOnCheckedChangeListener(new ExCheckedChangeListener());  //チェックボックス選択時のリスナー登録
        //checkbox2.setOnCheckedChangeListener(new ExCheckedChangeListener());
        //checkbox3.setOnCheckedChangeListener(new ExCheckedChangeListener());
        //checkbox4.setOnCheckedChangeListener(new ExCheckedChangeListener());

        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radio1, int check_id) {

                RadioButton radio_button = (RadioButton) findViewById(check_id);
                switch (radio_button.getId()) {//＋１しかできないようにする

                    case R.id.radioButton1:
                        tv2.setText("ラジオボタン1");

                        break;
                    case R.id.radioButton2:
                        tv2.setText("ラジオボタン２");

                        break;
                    case R.id.radioButton3:
                        tv2.setText("ラジオボタン３");

                        break;
                }
            }
        });


        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {//ツマミをドラックしたときに呼ばれる
                        tv3.setText("progress:" + seekBar.getProgress());
                        tv5.setText("progress:" + seekBar.getProgress()/10);

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {//ツマミに触れたときによばれる
                        tv3.setText("progress:" + seekBar.getProgress());
                        tv5.setText("progress:" + seekBar.getProgress()/10);

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {//ツマミを離したときに呼ばれる
                        tv3.setText("progress:" + seekBar.getProgress());
                        tv5.setText("progress:" + seekBar.getProgress()/10);

                    }
                }
        );

    }
    class ExCheckedChangeListener implements CompoundButton.OnCheckedChangeListener{
        public void onCheckedChanged(CompoundButton cb, boolean isChecked){
            if(cb == checkbox1) {  //チェックボックス選択時
                if (isChecked == true)  //選択が行われたとき
                    tv.setText("スイッチ１ON");

            }
        }
    }

}