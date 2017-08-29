package com.whieenz.searchselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Enity> mDatas;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_result);
        initData();
    }

    public void doSelect(View view){
        final SerachSelectDialog.Builder alert = new SerachSelectDialog.Builder(this);
        alert.setListData(mDatas);
        alert.setTitle("请选择城市");
        alert.setSelectedListiner(new SerachSelectDialog.Builder.OnSelectedListiner() {
            @Override
            public void onSelected(String info) {
                //通过position判断
//                textView.setText(mDatas.get(position).toString());


            }

            @Override
            public void onSaved(List<Enity> list) {

                for (int i = 0; i < list.size(); i++) {
                    Log.d("vivi", "onSelected: " + list.get(i).toString());

                }


            }
        });
        SerachSelectDialog mDialog = alert.show();
        //设置Dialog 尺寸
        mDialog.setDialogWindowAttr(0.9,0.9,this);
    }
    /**
     * 初始化数据
     */
    private void initData(){
        mDatas = new ArrayList<>();
        String [] citys = {"武汉","北京","上海","深圳","兰州","成都","天津"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < citys.length; j++) {
                Enity enity = new Enity();
                enity.setCity(citys[j] + i);
                mDatas.add(enity);
            }
        }
    }
}
