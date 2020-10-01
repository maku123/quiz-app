package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2,btn3,btn4;
    private ImageButton nextBtn,previousBtn;
    private TextView questionView;
    private  int i=0;

    private Question[] questionBank = new Question[]{
           new Question(R.string.question1, R.string.answer1_1, R.string.answer1, R.string.answer1_3, R.string.answer1_4, R.string.answer1),
            new Question(R.string.question2, R.string.answer2_1, R.string.answer2_2, R.string.answer2, R.string.answer2_4, R.string.answer2),
            new Question(R.string.question3, R.string.answer3, R.string.answer3_2, R.string.answer3_3, R.string.answer3_4, R.string.answer3),
            new Question(R.string.question4, R.string.answer4_1, R.string.answer4_2, R.string.answer4, R.string.answer4_4, R.string.answer4),
            new Question(R.string.question5, R.string.answer5_1, R.string.answer5_2, R.string.answer5_3, R.string.answer5, R.string.answer5)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionView=findViewById(R.id.question);
        btn1=findViewById(R.id.option1);
        btn2=findViewById(R.id.option2);
        btn3=findViewById(R.id.option3);
        btn4=findViewById(R.id.option4);
        nextBtn=findViewById(R.id.next_button);
        previousBtn=findViewById(R.id.previous_button);

        nextBtn.setOnClickListener(this);
        previousBtn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.next_button:
                i=(i+1)%questionBank.length;
                questionView.setText(questionBank[i].getQuestionId());
                btn1.setText(questionBank[i].getOpt1Id());
                btn2.setText(questionBank[i].getOpt2Id());
                btn3.setText(questionBank[i].getOpt3Id());
                btn4.setText(questionBank[i].getOpt4Id());
                break;
            case R.id.previous_button:
                if(i!=0){
                    i=(i-1)%questionBank.length;
                    questionView.setText(questionBank[i].getQuestionId());
                    btn1.setText(questionBank[i].getOpt1Id());
                    btn2.setText(questionBank[i].getOpt2Id());
                    btn3.setText(questionBank[i].getOpt3Id());
                    btn4.setText(questionBank[i].getOpt4Id());
                }
                else if(i==0){
                    i=questionBank.length-1;
                    questionView.setText(questionBank[i].getQuestionId());
                    btn1.setText(questionBank[i].getOpt1Id());
                    btn2.setText(questionBank[i].getOpt2Id());
                    btn3.setText(questionBank[i].getOpt3Id());
                    btn4.setText(questionBank[i].getOpt4Id());
                }
                break;
            case R.id.option1:
                if(questionBank[i].getOpt1Id()==questionBank[i].getCorrectAnsId()){
                    Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.option2:
                if(questionBank[i].getOpt2Id()==questionBank[i].getCorrectAnsId()){
                    Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.option3:
                if(questionBank[i].getOpt3Id()==questionBank[i].getCorrectAnsId()){
                    Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.option4:
                if(questionBank[i].getOpt4Id()==questionBank[i].getCorrectAnsId()){
                    Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
