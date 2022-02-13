package com.asoodaowar.ezSplashTemp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.asoodaowar.ezSplashTemp.R;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenEightActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenEighteenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenEleventhActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenFifteenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenFifthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenFirstActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenFourteenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenFourthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenNineteenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenNinthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenSecondActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenSeventeenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenSeventhActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenSixteenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenSixthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenTenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenThirdActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenThirteenthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenTwelfthActivity;
import com.asoodaowar.ezSplashTemp.activities.SplashScreenTwentiethActivity;
import com.asoodaowar.ezSplashTemp.models.Title;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.TitleViewHolder> {

    Context context;
    List<Title> titleList;

    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, Title obj, int position);
    }


    public RecyclerViewAdapter(Context context, List<Title> titleList) {
        this.context = context;
        this.titleList = titleList;
    }

    @NonNull
    @Override
    public TitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_main,parent,false);
        return new TitleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleViewHolder holder, final int position) {

        final Title title = titleList.get(position);
        holder.tv_title.setText(title.title);

        /*On Item Click*/
        holder.lyt_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (position == 0){
                   Intent intent = new Intent(context, SplashScreenFirstActivity.class);
                   context.startActivity(intent);
               }
                if (position == 1){
                    Intent intent = new Intent(context, SplashScreenSecondActivity.class);
                    context.startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(context, SplashScreenThirdActivity.class);
                    context.startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(context, SplashScreenFourthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(context, SplashScreenFifthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(context, SplashScreenSixthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(context, SplashScreenSeventhActivity.class);
                    context.startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(context, SplashScreenEightActivity.class);
                    context.startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(context, SplashScreenNinthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(context, SplashScreenTenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 10){
                    Intent intent = new Intent(context, SplashScreenEleventhActivity.class);
                    context.startActivity(intent);
                }
                if (position == 11){
                    Intent intent = new Intent(context, SplashScreenTwelfthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 12){
                    Intent intent = new Intent(context, SplashScreenThirteenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 13){
                    Intent intent = new Intent(context, SplashScreenFourteenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 14){
                    Intent intent = new Intent(context, SplashScreenFifteenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 15){
                    Intent intent = new Intent(context, SplashScreenSixteenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 16){
                    Intent intent = new Intent(context, SplashScreenSeventeenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 17){
                    Intent intent = new Intent(context, SplashScreenEighteenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 18){
                    Intent intent = new Intent(context, SplashScreenNineteenthActivity.class);
                    context.startActivity(intent);
                }
                if (position == 19){
                    Intent intent = new Intent(context, SplashScreenTwentiethActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    class TitleViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_title;
        public View lyt_parent;

        TitleViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.textView_title);
            lyt_parent = itemView.findViewById(R.id.lyt_parent);

        }
    }

}
