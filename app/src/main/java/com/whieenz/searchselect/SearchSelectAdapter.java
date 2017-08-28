package com.whieenz.searchselect;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;





public class SearchSelectAdapter extends BaseAdapter {
	private List<Enity> Datas;
	private Context context;
	private LayoutInflater inflater;

	public SearchSelectAdapter(Context ctx, List<Enity> datas) {
		this.context = ctx;
		this.Datas = datas;
		this.inflater = LayoutInflater.from(ctx);
	}
	@Override
	public int getCount() {
		return Datas.size();
	}

	@Override
	public String getItem(int i) {
		return Datas.get(i).getCity();
	}

	@Override
	public long getItemId(int i) {
		return i;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null ) {
            view = inflater.inflate(R.layout.list_cell_select_single, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

		if (Datas.get(i).isSelCity()) {
			//设置为红色
			holder.info.setTextColor(Color.RED);
		} else
			holder.info.setTextColor(Color.GREEN);

		holder.info.setText(Datas.get(i).getCity());
		return view;
	}


	static class ViewHolder {
		TextView info;
		public ViewHolder(View view) {
			info = view.findViewById(R.id.tv_select_info);
		}
	}

}
