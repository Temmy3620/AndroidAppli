package es.exsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;

public class ExSample_xmlCheckRadio extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_llexsample);  //リニアレイアウトのXMLファイルをアクティビティに設定





        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);//チェックボックス関連付け
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkBox2);

        RadioGroup radio1 = (RadioGroup) findViewById(R.id.Radio1);//ラジオグループ関連付け



        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox1処理

            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                TextView tv = (TextView) findViewById(R.id.text);
                if(a){
                    tv.setText("チェック1ON");
                }else{
                    tv.setText("チェック1OFF");
                }
            }
        });

        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//checkbox2処理
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {
                TextView tv = (TextView) findViewById(R.id.text);
                if(a){
                    tv.setText("チェック2ON");
                }else{
                    tv.setText("チェック2OFF");
                }
            }
        });



        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radio1, int check_id) {
                RadioButton check_radio1 = (RadioButton) findViewById(R.id.radioButton1);
                RadioButton check_radio2 = (RadioButton) findViewById(R.id.radioButton2);
                TextView tv2 = (TextView) findViewById(R.id.text2);
                if(check_radio1.isChecked() == true){
                    tv2.setText("ラジオボタン１");
                }else if(check_radio2.isChecked() == true){
                    tv2.setText("ラジオボタン２");
                }else{
                    tv2.setText("ラジオボタン３");
                }
            }
        });






    }
}