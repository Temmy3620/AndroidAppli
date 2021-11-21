package es.exsample;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class ExSample_XmlCheckRadioSeek extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activ_checkradioseek);  //レラティブレイアウトのXMLファイルをアクティビティに設定


        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);//チェックボックス関連付け
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkBox2);

        RadioGroup radio1 = (RadioGroup) findViewById(R.id.Radio1);//ラジオグループ関連付け

        final SeekBar seekbar = (SeekBar)findViewById(R.id.seekBar1);//SeekBar関連付け

        final TextView tv = (TextView) findViewById(R.id.text);//各テキスト関連付け
        final TextView tv2 = (TextView) findViewById(R.id.text2);
        final TextView tv3 = (TextView) findViewById(R.id.text3);
        final TextView tv4 = (TextView) findViewById(R.id.text4);
        final TextView tv5 = (TextView) findViewById(R.id.text5);




        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox1処理

            public void onCheckedChanged(CompoundButton buttonView, boolean a) {

                if(a){
                    tv.setText("チェック1ON");
                }else{
                    tv.setText("チェック1OFF");
                }
            }
        });

        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox2処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {

                if(a){
                    tv4.setText("チェック2ON");
                }else{
                    tv4.setText("チェック2OFF");
                }
            }
        });



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
}