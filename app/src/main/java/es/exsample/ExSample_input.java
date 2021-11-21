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

public class ExSample_input extends AppCompatActivity {

    public static  int GOING_APP = 1;
    TextView tv,tv2,tv3,tv4,tv5,total;
    Button bt;
    private int RadioNum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);  //レラティブレイアウトのXMLファイルをアクティビティに設定

        RadioNum = 0;

        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);//チェックボックス関連付け
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkBox2);

        RadioGroup radio1 = (RadioGroup) findViewById(R.id.Radio1);//ラジオグループ関連付け

        final SeekBar seekbar = (SeekBar)findViewById(R.id.seekBar1);//SeekBar関連付け

        bt = (Button)findViewById(R.id.button1);

        tv = (TextView) findViewById(R.id.text);//各テキスト関連付け
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        tv4 = (TextView) findViewById(R.id.text4);
        tv5 = (TextView) findViewById(R.id.text5);
        total = (TextView)findViewById(R.id.total1);



        bt.setOnClickListener(new BtClickListener());



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
            Intent it = new Intent(getApplicationContext(), ExSample_output.class);  //明示的なインテントで起動する他のアクティビティを設定
            it.putExtra("box1", RadioNum);  //インテント先にデータを渡す

            startActivityForResult(it, GOING_APP); //インテントの起動
        }
    }


}