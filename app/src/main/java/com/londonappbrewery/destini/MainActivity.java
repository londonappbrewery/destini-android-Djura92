package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonBottom;
    TextView mTextView;
    Button mButtonTop;
    int index = 0;
    private StoryAnsEnd[] storyBank = {
            new StoryAnsEnd(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryAnsEnd(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryAnsEnd(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryAnsEnd(R.string.T4_End),
            new StoryAnsEnd(R.string.T5_End),
            new StoryAnsEnd(R.string.T6_End)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);
        mTextView = findViewById(R.id.storyTextView);
        mTextView.setText(storyBank[index].getStoryId());
        mButtonTop.setText(storyBank[index].getAnswerTop());
        mButtonBottom.setText(storyBank[index].getAnswerBottom());
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index += 2;
                callUpdateTop();
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index += 1;
                callUpdateBottom();
            }
        });

    }


    public void callUpdateTop() {
        if (index == 2) {
            mTextView.setText(storyBank[index].getStoryId());
            mButtonTop.setText(storyBank[index].getAnswerTop());
            mButtonBottom.setText(storyBank[index].getAnswerBottom());
        } else if (index == 4) {
            mTextView.setText(storyBank[index + 1].getStoryId());
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (index == 3) {
            index = 2;
            callUpdateTop();
        }
    }

    public void callUpdateBottom() {

        if (index == 3) {
            mTextView.setText(storyBank[index + 1].getStoryId());
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (index == 2) {
            mTextView.setText(storyBank[index + 1].getStoryId());
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if (index == 1) {
            mTextView.setText(storyBank[index].getStoryId());
            mButtonTop.setText(storyBank[index].getAnswerTop());
            mButtonBottom.setText(storyBank[index].getAnswerBottom());
        }
    }
}