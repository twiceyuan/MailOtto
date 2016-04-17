package me.drakeet.mailotto.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import me.drakeet.mailotto.Mailbox;
import me.drakeet.mailotto.OnMailReceived;

public class TargetActivity extends AppCompatActivity {

    TextView mTextView;


    public static Intent getIntent(Context context) {
        return new Intent(context, TargetActivity.class);
    }


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        mTextView = (TextView) findViewById(R.id.text);
        Mailbox.getInstance().atHome(this);
    }


    @OnMailReceived public void onPreloadDataReady(AwesomeMail mail) {
        mTextView.setText(String.format("title => %s\ncontent => %s", mail.title, mail.content));
    }


    @Override protected void onDestroy() {
        super.onDestroy();
        Mailbox.getInstance().leave(this);
    }
}
