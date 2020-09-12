package th.ac.su.cp.smartvote3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class windowcheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windowcheck);

        Intent i = getIntent();
        Button button_check = findViewById(R.id.button_check);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textid = findViewById(R.id.text_id);
                String  Etext_id = textid.getText().toString()+"";
                String trueid = "1111111111111";
                String trueid2 = "2222222222222";
                if(Etext_id.length()==13){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(windowcheck.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK",null);
                    if (Etext_id.equals(trueid)||Etext_id.equals(trueid2)){
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    }
                    else{
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    }
                    dialog.show();
                }
                else{
                    Toast toast = Toast.makeText(windowcheck.this,"กรุณากรอกหมายเลขบัตรประชาชน",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}