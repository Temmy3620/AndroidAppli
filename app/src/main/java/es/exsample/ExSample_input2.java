package es.exsample;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class ExSample_input2 extends AppCompatActivity {

    public static  int INPUT_UP = 1;
    TextView tv,tv2,tv3,tv4,tv5,total,total2;
    Button bt;
    private int RadioNum,CheckNum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);  //レラティブレイアウトのXMLファイルをアクティビティに設定



        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);//チェックボックス関連付け
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkbox4 = (CheckBox) findViewById(R.id.checkBox4);


        RadioGroup radio1 = (RadioGroup) findViewById(R.id.Radio1);//ラジオグループ関連付け
        RadioGroup radio2 = (RadioGroup) findViewById(R.id.Radio2);

        final SeekBar seekbar = (SeekBar)findViewById(R.id.seekBar1);//SeekBar関連付け

        bt = (Button)findViewById(R.id.button1);//ボタン関連付け

        tv = (TextView) findViewById(R.id.text);//各テキスト関連付け
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        tv4 = (TextView) findViewById(R.id.text4);
        tv5 = (TextView) findViewById(R.id.text5);
        total = (TextView)findViewById(R.id.total1);
        total2 = (TextView)findViewById(R.id.total2);

        bt.setOnClickListener(new BtClickListener());// ボタンリスナー登録






        /*
        ラジオボタンの処理↓
         */
        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {//ラジオグループ１の処理
            @Override
            public void onCheckedChanged(RadioGroup radio1, int check_id) {

                RadioButton radio_button = (RadioButton) findViewById(check_id);

                switch (radio_button.getId()) {

                    case R.id.radioButton1:
                        tv2.setText("ラジオボタン1");
                        RadioNum = 1;
                        break;
                    case R.id.radioButton2:
                        tv2.setText("ラジオボタン２");
                        RadioNum = 2;
                        break;
                    case R.id.radioButton3:
                        tv2.setText("ラジオボタン３");
                        RadioNum = 3;
                        break;
                }
                total.setText("total: " + RadioNum);
            }
        });
        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {//ラジオグループ２の処理
            @Override
            public void onCheckedChanged(RadioGroup radio1, int check_id) {

                RadioButton radio_button = (RadioButton) findViewById(check_id);
                RadioNum --;
                switch (radio_button.getId()) {//＋１しかできないようにする

                    case R.id.radioButton4:
                        RadioNum = 4;
                        break;
                    case R.id.radioButton5:
                        RadioNum = 5;
                        break;
                    case R.id.radioButton6:
                        RadioNum = 6;
                        break;
                }
                total.setText("Radio_total: " + RadioNum);
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


    class BtClickListener implements View.OnClickListener {
        public void onClick(View v){
            Intent it = new Intent(getApplicationContext(), ExSample_output2.class);  //明示的なインテントで起動する他のアクティビティを設定
            it.putExtra("bag", RadioNum);  //インテント先にデータを渡す
            it.putExtra("bag2", CheckNum);
            startActivityForResult(it, INPUT_UP); //インテントの起動
        }
    }


}