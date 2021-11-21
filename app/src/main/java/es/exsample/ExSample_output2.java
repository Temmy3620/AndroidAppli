//ExSampleSub1.java 2つのアクティビティを明示的なインテントで実現するサンプル
package es.exsample;

import android.app.*;
import android.content.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.text.method.MovementMethod;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class ExSample_output2 extends AppCompatActivity {
    private int RadioNum;
    private  int CheckNum;
    TextView rt,rt2;

    Button bt;
    Intent it;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);

        rt = new TextView(this);
        rt2 = new TextView(this);

        bt = new Button(this);
        bt.setText("back");

        it = getIntent(); //インテントを受け取る

        RadioNum = it.getIntExtra("bag",0);
        CheckNum = it.getIntExtra("bag2",0);

        rt.setText("RadioTotal:" + RadioNum);  //インテント元から受け取ったデータをエディットテキストに設定
        rt2.setText("RadioTotal:" + CheckNum);

        ll.addView(rt);
        ll.addView(rt2);

        ll.addView(bt);

        bt.setOnClickListener(new SampleClickListener());
    }



    class SampleClickListener implements OnClickListener{
        public void onClick(View v){
            finish();  //アクティビティの終了
        }
    }


}