package org.sun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.sun.R;

/**
 * Created with IntelliJ IDEA.
 * User: nimantha
 * Date: 10/7/13
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Second extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout .second);

        TextView tv1=(TextView )findViewById(R.id.textView);
        tv1.setText("Your text is "+this.getIntent().getCharSequenceExtra("text"));

        Button b1=(Button )findViewById(R.id.button1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Second.this, MyActivity.class);
                startActivity(i);
            }
        });

    }
}