//ExSampleSub1.java 2つのアクティビティを明示的なインテントで実現するサンプル
package es.exsample;

import android.app.*;
import android.content.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.text.method.MovementMethod;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.Arrays;
import java.util.Collections;

public class ExSample_data extends AppCompatActivity {
    private int action1,love1,story1,growth1,fear1,fear2,puzzle1,sport1,action4,puzzle4,sport4,growth4,story4,love4,puzzle5,love5;
    private  ProgressBar pb1,pb2,pb3,pb4,pb5,pb6,pb7;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    int action,love,story,growth,fear,puzzle,sport;

    Button bt;
    Intent it;
    ListView lv;
    String terms = "time_action";
    String terms2 = "time_love";


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);

        pb1 = (ProgressBar)findViewById(R.id.progressBar1);
        pb2 = (ProgressBar)findViewById(R.id.progressBar2);
        pb3 = (ProgressBar)findViewById(R.id.progressBar3);
        pb4 = (ProgressBar)findViewById(R.id.progressBar4);
        pb5 = (ProgressBar)findViewById(R.id.progressBar5);
        pb6 = (ProgressBar)findViewById(R.id.progressBar6);
        pb7 = (ProgressBar)findViewById(R.id.progressBar7);

        tv1 = (TextView)findViewById(R.id.text1);
        tv2 = (TextView)findViewById(R.id.text2);
        tv3 = (TextView)findViewById(R.id.text3);
        tv4 = (TextView)findViewById(R.id.text4);
        tv5 = (TextView)findViewById(R.id.text5);
        tv6 = (TextView)findViewById(R.id.text6);
        tv7 = (TextView)findViewById(R.id.text7);





        bt = (Button)findViewById(R.id.button);


        it = getIntent(); //インテントを受け取る

        action1 = it.getIntExtra("BOX",0);
        love1 = it.getIntExtra("BOX2",0);
        story1 = it.getIntExtra("BOX3",0);
        growth1 = it.getIntExtra("BOX4",0);
        fear1 = it.getIntExtra("BOX5",0);
        puzzle1 = it.getIntExtra("BOX6",0);
        fear2 = it.getIntExtra("BOX7",0);
        sport1 = it.getIntExtra("BOX8",0);
        action4 = it.getIntExtra("BOX9",0);
        puzzle4 = it.getIntExtra("BOX10",0);
        sport4 = it.getIntExtra("BOX11",0);
        growth4 =  it.getIntExtra("BOX12",0);
        story4 = it.getIntExtra("BOX13",0);
        love4 = it.getIntExtra("BOX14",0);
        puzzle5 = it.getIntExtra("BOX15",0);
        love5 = it.getIntExtra("BOX16",0);

        action = 0;
        love = 0;
        story = 0;
        growth = 0;
        fear = 0;
        puzzle = 0;
        sport = 0;


        action = action1 + action4;
        love = love1 + love4 + love5;
        story = story1 + story4;
        growth = growth1 + growth4;
        fear = fear1 + fear2;
        puzzle = puzzle1 + puzzle4 + puzzle5;
        sport = sport1 + sport4;


        tv1.setText("action :" + action);
        tv2.setText("love :" + love);
        tv3.setText("story :" + story);
        tv4.setText("growth :" + growth);
        tv5.setText("fear :" + fear);
        tv6.setText("puzzle :" + puzzle);
        tv7.setText("sport :" + sport);

        pb1.setProgress(action);
        pb2.setProgress(love);
        pb3.setProgress(story);
        pb4.setProgress(growth);
        pb5.setProgress(fear);
        pb6.setProgress(puzzle);
        pb7.setProgress(sport);




        Integer [] array = {action,love,story,growth,fear,puzzle,sport};

        ListView lv = (ListView)findViewById(R.id.list);
        String str = "data/data/" + getPackageName() + "/Sample.db";  //データベースの保存先の指定
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(str, null);  //データベースオブジェクトの生成

        String qry0 = "DROP TABLE IF EXISTS site"; //テーブルリセットのクエリ
        String qry1 = "CREATE TABLE site" + "(id INTEGER PRIMARY KEY, name STRING, time_action INTEGER,time_love INTEGER,time_story INTEGRE," +
                "time_growth INTEGRE,time_fear INTEGRE,time_puzzle INTEGRE,time_sport INTEGRE)";  //テーブル作成のクエリ
        String[] qry2 ={"INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('世界のアソビ大全51', 0, 0, 0, 0, 0, 7, 0)",  //データ挿入のクエリ
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('あつまれ　どうぶつの森', 0, 0, 4, 8, 0, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('Xenoblade Definitive Edition', 7, 0, 7, 0, 0, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ポケットモンスター　ソード＆シールド', 4, 0, 8, 0, 0, 1, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('聖剣伝説3', 8, 0, 8, 0, 0, 5, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ポケモン不思議のダンジョン　救助隊DX', 4, 0, 8, 6, 0, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ワンピース　海賊無双４', 5, 0, 0, 0, 0, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('バイオショックコレクション', 5, 0, 0, 0, 5, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('NG(エヌジー)', 0, 4, 5, 0, 5, 2, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ジャストダンス', 0, 0, 0, 0, 0, 0, 8)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ブレア・ウィッチ', 4, 4, 3, 0, 5, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ルイージマンション３', 2, 0, 3, 0, 1, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('バイオハザード６', 4, 4, 0, 0, 5, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ドラゴンクエストⅢ　そして伝説へ．．．', 7, 7, 7, 4, 0, 1, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ドラゴンクエストⅪ　過ぎ去りし時を求めて　S', 7, 7, 7, 3, 0, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('テトリス 99', 0, 0, 0, 0, 0, 8, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('ヒューマン　フォール　フラット', 0, 0, 0, 0, 0, 7, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('LIMBO', 0, 3, 6, 0, 2, 7, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('マリオカート８デラックス', 0, 0, 0, 0, 0, 0, 8)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('リングフィット　アドベンチャー', 0, 0, 0, 0, 0, 7, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('大乱闘スマッシュブラザーズ　SPECIAL', 8, 0, 2, 0, 0, 0, 0)",
                "INSERT INTO site(name,time_action,time_love,time_story,time_growth,time_fear,time_puzzle,time_sport) VALUES ('Zombie Army Trilogy', 6, 0, 7, 0, 5, 0, 0)"};

        Arrays.sort(array,Collections.reverseOrder());

        if(array[0] == action){
            terms = "time_action";
        }else if(array[0] == love){
            terms = "time_love";
        }else if(array[0] == story){
            terms = "time_story";
        }else if(array[0] == growth){
            terms = "time_growth";
        }else if(array[0] == puzzle){
            terms = "time_puzzle";
        }else if(array[0] == sport){
            terms = "time_sport";
        }
        if(array[1] == action){
            terms2 = "time_action";
        }else if(array[1] == love){
            terms2 = "time_love";
        }else if(array[1] == story){
            terms2 = "time_story";
        }else if(array[1] == growth){
            terms2 = "time_growth";
        }else if(array[1] == puzzle){
            terms2 = "time_puzzle";
        }else if(array[1] == sport){
            terms2 = "time_sport";
        }

        String qry3 = "SELECT * FROM site " +
                "WHERE (" + terms + " >= " + array[0] + " OR " + terms2 + " >= " + array[1]  + " ) " +
                "AND time_fear <= " + fear; 


        db.execSQL(qry0);  //クエリの実行 2回目以降の実行する際にはコメントアウトする
        db.execSQL(qry1);  //2回目以降の実行する際にはコメントアウトする
        for(int i=0; i<qry2.length; i++)  //2回目以降の実行する際にはコメントアウトする
             db.execSQL(qry2[i]);

        Cursor cr = db.rawQuery(qry3, null);  //クエリ結果をカーソルで受け取り
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);  //結果出力のリスト

        while(cr.moveToNext()){  //カーソルを一つづつ動かしデータを取得
            int i = cr.getColumnIndex("id");  //データをテーブルの要素ごとに取得
            int n = cr.getColumnIndex("name");
            //  int p = cr.getColumnIndex("time");
            int id = cr.getInt(i);
            String name = cr.getString(n);
            //  int action = cr.getInt(p);
            String row = "ゲームソフト　:　" + name ;
            ad.add(row);
        }


        lv.setAdapter(ad);
        db.close();  //データベースのクローズ


        bt.setOnClickListener(new SampleClickListener());

    }

    class SampleClickListener implements OnClickListener{
        public void onClick(View v){

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

            setResult(RESULT_OK, it);  //インテント元にデータを送る




            finish();//アクティビティの終了
        }
    }

}