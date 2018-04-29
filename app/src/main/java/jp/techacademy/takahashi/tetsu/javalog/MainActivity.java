package jp.techacademy.takahashi.tetsu.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("takahashi", 58, "ゴルフ" );     // 名前をポチ、年齢3歳、趣味ゴルフで、Dogのインスタンスを作る

        human.say();

        human.think();
    }

}
