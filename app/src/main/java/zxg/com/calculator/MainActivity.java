package zxg.com.calculator;

import android.view.View.OnClickListener;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    private TextView txt;
    private String opt = "+";
    private double n1 = 0.0, n2 = 0.0;
    private EditText edit;
    private View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn10=(Button) findViewById(R.id.btn10);
        btn11=(Button) findViewById(R.id.btn11);
        btn12=(Button) findViewById(R.id.btn12);
        btn13=(Button) findViewById(R.id.btn13);
        btn14=(Button) findViewById(R.id.btn14);
        btn15=(Button) findViewById(R.id.btn15);
        btn16=(Button) findViewById(R.id.btn16);
        btn17=(Button) findViewById(R.id.btn17);

        txt=(TextView) findViewById(R.id.txt);
        edit=(EditText) findViewById(R.id.edit);

        //设置监听
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Button btn=(Button)view;
        try{
            switch (btn.getId()) {

                //9
                case R.id.btn1:{
                    String str = edit.getText().toString();
                    edit.setText(str + 9);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }
                //8
                case R.id.btn2:{
                    String str = edit.getText().toString();
                    edit.setText(str + 8);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }
                //7
                case R.id.btn3:{
                    String str = edit.getText().toString();
                    edit.setText(str + 7);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }
                //除法
                case R.id.btn4:{
                    String str = edit.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "/";
                    edit.setText("");
                    txt.setText(n1 + opt);
                    break;
                }

                //6
                case R.id.btn5:{
                    String str = edit.getText().toString();
                    edit.setText(str + 6);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }

                //5
                case R.id.btn6:{
                    String str = edit.getText().toString();
                    edit.setText(str + 5);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }

                //4
                case R.id.btn7:{
                    String str = edit.getText().toString();
                    edit.setText(str + 4);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }

                //乘法
                case R.id.btn8:{
                    String str = edit.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "*";
                    edit.setText("");
                    txt.setText(n1 + opt);
                    break;
                }
                //3
                case R.id.btn9:{
                    String str = edit.getText().toString();
                    edit.setText(str + 3);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }

                //2
                case R.id.btn10:{
                    String str = edit.getText().toString();
                    edit.setText(str +2);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }
                //1
                case R.id.btn11:{
                    String str = edit.getText().toString();
                    edit.setText(str +1);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }
                //减法
                case R.id.btn12:{
                    String str = edit.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "-";
                    edit.setText("");
                    txt.setText(n1 + opt);
                    break;
                }

                //0
                case R.id.btn13:{
                    String str = edit.getText().toString();
                    edit.setText(str +0);
                    str = edit.getText().toString();
                    txt.setText(str);break;
                }
                //小数点
                case R.id.btn14://.
                {
                    String str = edit.getText().toString();
                    if(str.indexOf(".") != -1) //判断小数点的位置是否合法
                    {

                    }
                    else //
                    {
                        if(str.equals("0"))//如果前面输入的为零
                            edit.setText(("0" + ".").toString());
                        else if(str.equals(""))//??????????????????????
                        {

                        }
                        else
                            edit.setText(str + ".");
                    }
                    break;
                }
                //+
                case R.id.btn15 :{
                    String str = edit.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "+";
                    txt.setText(n1 + opt);
                    edit.setText(""); break;
                }
                //=

                case R.id.btn16:{
                    if(opt == "+")
                    {
                        String str = edit.getText().toString();
                        n2 = Double.parseDouble(str);
                        txt.setText(n1 + opt + n2 + "=");
                        edit.setText((n1 + n2) + "");
                    }
                    else if(opt == "-")
                    {
                        String str = edit.getText().toString();
                        n2 = Double.parseDouble(str);
                        txt.setText(n1 + opt + n2 + "=");
                        edit.setText((n1 - n2) + "");
                    }
                    else if(opt == "*")
                    {
                        String str = edit.getText().toString();
                        n2 = Double.parseDouble(str);
                        txt.setText(n1 + opt + n2 + "=");
                        edit.setText((n1 * n2) + "");
                    }
                    else if(opt == "/")
                    {
                        String str = edit.getText().toString();
                        n2 = Double.parseDouble(str);
                        if(n2 == 0)
                        {
                            edit.setText("");
                            txt.setText("除数不能未零");
                            break;
                        }
                        else
                        {
                            txt.setText(n1 + opt + n2 + "=");
                            edit.setText((n1 / n2) + "");
                        }
                    }

                    break;
                }
                case R.id.btn17:{
                    txt.setText("");
                    edit.setText("");
                }
            }
        }catch (Exception e) {
            // TODO: handle exception
        }

    }
}
