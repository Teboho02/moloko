package com.example.hope;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context con;
    LayoutInflater layoutInflater;
    String[] count;
    String[] question;
    public CustomBaseAdapter() {
    }

    public CustomBaseAdapter(Context context, String[] count, String[] question){
        this.con = context;
        layoutInflater = LayoutInflater.from(context);
        this.count = count;
        this.question = question;


    }


    @Override
    public int getCount() {
        return count.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View x, ViewGroup viewGroup) {
            x = layoutInflater.inflate(R.layout.activity_custom_list_view,null);
            TextView que = x.findViewById(R.id.txtQuestion);
            TextView cou = x.findViewById(R.id.txtCount);
            que.setText(question[position]);
            cou.setText(count[position]);
            Button upvote =x.findViewById(R.id.upvote);
            Button downvote = x.findViewById(R.id.Downvote);

            upvote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int count = Integer.parseInt((String) cou.getText())+ 1;
                    String c = Integer.toString(count);
                    cou.setText(c);
                    upvote.setEnabled(false);
                }
            });

            downvote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int count = Integer.parseInt((String) cou.getText())-1;
                    String c = Integer.toString(count);
                    cou.setText(c);
                    downvote.setEnabled(false);
                }
            });




        return x;
    }
}
