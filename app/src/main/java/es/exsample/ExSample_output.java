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

public class ExSample_output extends AppCompatActivity {
    private int RadioNum;
    TextView rt;
    Button bt;
    Intent it;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);

        rt = new TextView(this);

        bt = new Button(this);
        bt.setText("back");

        it = getIntent(); //インテントを受け取る

        RadioNum = it.getIntExtra("box1",0);

        rt.setText("total:" + RadioNum);  //インテント元から受け取ったデータをエディットテキストに設定


        ll.addView(rt);

        ll.addView(bt);

        bt.setOnClickListener(new SampleClickListener());
    }



    class SampleClickListener implements OnClickListener{
        public void onClick(View v){
            finish();  //アクティビティの終了
        }
    }


}