

package es.exsample;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExSample_Search extends AppCompatActivity {

    public static  int SEND_TO = 1;
    Button bt;
    TextView tv;
    private int action1,love1,story1,growth1,fear1,fear2,puzzle1,sport1,action4,
            puzzle4,sport4,growth4,story4,love4,puzzle5,love5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        TabHost th = (TabHost) findViewById(android.R.id.tabhost);  //TabHostオブジェクト取得
        th.setup();  //TabHostのセットアップ

        TabSpec tab1 = th.newTabSpec("tab1");  //tab1のセットアップ
        tab1.setIndicator("Q1～4");  //タブ名の設定
        tab1.setContent(R.id.tab1);   //タブに使うリニアレイアウトの指定
        th.addTab(tab1);  //タブホストにタブを追加

        TabSpec tab2 = th.newTabSpec("tab2");  //tab2のセットアップ
        tab2.setIndicator("Q5～7");
        tab2.setContent(R.id.tab2);
        th.addTab(tab2);


        th.setCurrentTab(0); //最初のタブをtab1に設定

        //これ以降に、各ビューに対する処理を記述する


        tv = (TextView) findViewById(R.id.text1);

        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);//チェックボックス関連付け
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkbox4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox checkbox5 = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox checkbox6 = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox checkbox7 = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox checkbox8 = (CheckBox) findViewById(R.id.checkBox8);
        CheckBox checkbox9 = (CheckBox) findViewById(R.id.checkBox9);
        CheckBox checkbox10 = (CheckBox) findViewById(R.id.checkBox10);
        CheckBox checkbox11 = (CheckBox) findViewById(R.id.checkBox11);
        CheckBox checkbox12 = (CheckBox) findViewById(R.id.checkBox12);
        CheckBox checkbox13 = (CheckBox) findViewById(R.id.checkBox13);
        CheckBox checkbox14 = (CheckBox) findViewById(R.id.checkBox14);
        CheckBox checkbox15 = (CheckBox) findViewById(R.id.checkBox15);
        CheckBox checkbox16 = (CheckBox) findViewById(R.id.checkBox16);
        CheckBox checkbox17 = (CheckBox) findViewById(R.id.checkBox17);
        CheckBox checkbox18 = (CheckBox) findViewById(R.id.checkBox18);
        CheckBox checkbox19 = (CheckBox) findViewById(R.id.checkBox19);
        CheckBox checkbox20 = (CheckBox) findViewById(R.id.checkBox20);
        CheckBox checkbox21 = (CheckBox) findViewById(R.id.checkBox21);

        final SeekBar seekbar = (SeekBar) findViewById(R.id.seekBar);//SeekBar関連付け


        RadioGroup radio1 = (RadioGroup) findViewById(R.id.Radio1);//ラジオグループ関連付け
        RadioGroup radio2 = (RadioGroup) findViewById(R.id.Radio2);

        bt = (Button) findViewById(R.id.button);//ボタン関連付け

        bt.setOnClickListener(new SearchClickListener());// ボタンリスナー登録


        action1 = 0;
        love1 = 0;
        story1 = 0;
        growth1 = 0;
        fear1 = 0;
        fear2 = 0;
        puzzle1 = 0;
        sport1 = 0;
        action4 = 0;
        puzzle4 = 0;
        sport4 = 0;
        growth4 = 0;
        story4 = 0;
        love4 = 0;
        puzzle5 = 0;
        love5 = 0;




        //チェックボックスの処理
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox1処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    growth1 ++;
                    love1 ++;
                    sport1 ++;
                }else{//ボタンが外された
                    growth1 --;
                    love1 --;
                    sport1  --;
                }
            }
        });
        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox2処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    growth1 ++;
                    story1 ++;
                }else{//ボタンが外された
                    growth1 --;
                    story1 --;
                }
            }
        });
        checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox3処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    puzzle1 ++;
                }else{//ボタンが外された
                    puzzle1 --;
                }
            }
        });
        checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox4処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    growth1 = growth1 + 2;
                }else{//ボタンが外された
                    growth1 = growth1 - 2;
                }
            }
        });
        checkbox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox5処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    action1 ++;
                    fear1 ++;
                }else{//ボタンが外された
                    action1 --;
                    fear1 --;
                }
            }
        });
        checkbox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox6処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    love1 ++;
                }else{//ボタンが外された
                    love1 --;
                }
            }
        });
        checkbox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox7処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    action1 ++;
                }else{//ボタンが外された
                    action1 --;
                }
            }
        });
        checkbox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox8処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    puzzle1 ++;
                }else{//ボタンが外された
                    puzzle1 --;
                }
            }
        });
        checkbox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox9処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    story1 ++;
                }else{//ボタンが外された
                    story1 --;
                }
            }
        });
        checkbox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox9処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    fear1 ++;
                }else{//ボタンが外された
                    fear1 --;
                }
            }
        });
        checkbox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox11処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    action1 ++;
                    story1 ++;
                }else{//ボタンが外された
                    action1 --;
                    story1 --;
                }
            }
        });
        checkbox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox12処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    love1 ++;
                }else{//ボタンが外された
                    love1 --;
                }
            }
        });
        checkbox13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox13処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    puzzle1 ++;
                }else{//ボタンが外された
                    puzzle1 --;
                }
            }
        });
        checkbox14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox14処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    puzzle1 ++;
                    growth1 ++;
                    sport1 ++;
                }else{//ボタンが外された
                    puzzle1 --;
                    growth1 --;
                    sport1 --;
                }
            }
        });
        checkbox16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox16処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    story1 ++;
                    growth1 ++;
                }else{//ボタンが外された
                    story1 --;
                    growth1 --;
                }
            }
        });
        checkbox17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox16処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    story1 ++;
                    growth1 ++;
                }else{//ボタンが外された
                    story1 --;
                    growth1 --;
                }
            }
        });
        checkbox18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox18処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    sport1 ++;
                }else{//ボタンが外された
                    sport1 --;
                }
            }
        });
        checkbox19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox19処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    love1 ++;
                }else{//ボタンが外された
                    love1 --;
                }
            }
        });
        checkbox20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox20処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    action1 ++;
                }else{//ボタンが外された
                    action1 --;
                }
            }
        });
        checkbox21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox21処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                if(a){//ボタンが押された
                    action1 ++;
                    love1 ++;
                    story1 ++;
                    growth1 ++;
                    puzzle1 ++;
                    sport1 ++;
                }else{//ボタンが外された
                    action1 --;
                    love1 --;
                    story1 --;
                    growth1 --;
                    puzzle1 --;
                    sport1 --;
                }
            }
        });



        /*
        ラジオボタンの処理↓
         */
        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {//ラジオグループ１の処理
            @Override
            public void onCheckedChanged(RadioGroup radio1, int check_id) {
                RadioButton radio_button = (RadioButton) findViewById(check_id);
                switch (radio_button.getId()) {
                    case R.id.radioButton1:
                        action4 = 2;
                        sport4 = 3;
                        love4 = 3;
                        break;
                    case R.id.radioButton2:
                        growth4 = 3;
                        story4 = 1;
                        break;
                    case R.id.radioButton3:
                        puzzle4 = 4;
                        break;
                }

            }
        });
        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {//ラジオグループ２の処理
            @Override
            public void onCheckedChanged(RadioGroup radio1, int check_id) {
                RadioButton radio_button = (RadioButton) findViewById(check_id);
                switch (radio_button.getId()) {//＋１しかできないようにする
                    case R.id.radioButton4:
                        puzzle5 = 2;
                        break;
                    case R.id.radioButton5:
                        love5 =  4;
                        break;
                }
            }
        });




        //シークバーの処理
        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {//ツマミをドラックしたときに呼ばれる
                        tv.setText("percentage :" + seekBar.getProgress() + " %");
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {//ツマミに触れたときによばれる
                        tv.setText("percentage :" + seekBar.getProgress() + " %");
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {//ツマミを離したときに呼ばれる
                        tv.setText("percentage :" + seekBar.getProgress() + " %");
                        fear2 = seekBar.getProgress()/20;
                    }
                }
        );




    }


    class SearchClickListener implements View.OnClickListener {
        public void onClick(View v){
            Intent it = new Intent(getApplicationContext(), ExSample_data.class);  //明示的なインテントで起動する他のアクティビティを設定
            it.putExtra("BOX", action1);  //インテント先にデータを渡す
            it.putExtra("BOX2", love1);
            it.putExtra("BOX3", story1);
            it.putExtra("BOX4", growth1);
            it.putExtra("BOX5", fear1);
            it.putExtra("BOX6",puzzle1);
            it.putExtra("BOX7", fear2);
            it.putExtra("BOX8", sport1);
            it.putExtra("BOX9", action4);
            it.putExtra("BOX10", puzzle4);
            it.putExtra("BOX11", sport4);
            it.putExtra("BOX12", growth4);
            it.putExtra("BOX13", story4);
            it.putExtra("BOX14", love4);
            it.putExtra("BOX15", puzzle5);
            it.putExtra("BOX16", love5);



            startActivityForResult(it, SEND_TO); //インテントの起動
        }
    }


}