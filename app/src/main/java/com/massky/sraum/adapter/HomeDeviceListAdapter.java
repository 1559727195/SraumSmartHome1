package com.massky.sraum.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.massky.sraum.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by masskywcy on 2017-05-16.
 */

public class HomeDeviceListAdapter extends BaseAdapter {
    private List<Map> list = new ArrayList<>();
    private HomeDeviceItemClickListener homeDeviceItemClickListener;
    // 用来控制CheckBox的选中状况
    private static HashMap<Integer, Boolean> isSelected = new HashMap<>();

    public HomeDeviceListAdapter(Context context, List<Map> list, HomeDeviceItemClickListener homeDeviceItemClickListener) {
        super(context, list);
        this.list = list;
        this.homeDeviceItemClickListener = homeDeviceItemClickListener;
        initDate();
    }

    // 初始化isSelected的数据
    private void initDate() {
        for (int i = 0; i < list.size(); i++) {
            getIsSelected().put(i, false);
        }
    }

    public static HashMap<Integer, Boolean> getIsSelected() {
        return isSelected;
    }

    public static void setIsSelected(HashMap<Integer, Boolean> isSelected) {
        HomeDeviceListAdapter.isSelected = isSelected;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolderContentType viewHolderContentType = null;
        if (null == convertView) {
            viewHolderContentType = new ViewHolderContentType();
            convertView = LayoutInflater.from(context).inflate(R.layout.home_device_item, null);
            viewHolderContentType.title_home_device = (TextView) convertView.findViewById(R.id.title_home_device);
            viewHolderContentType.image_home_device_item = (ImageView) convertView.findViewById(R.id.image_home_device_item);

            convertView.setTag(viewHolderContentType);
        } else {
            viewHolderContentType = (ViewHolderContentType) convertView.getTag();
        }

//        map1.put("number","3");
//        map1.put("name","儿童房");
//        map1.put("count","23");
        viewHolderContentType.title_home_device.setText((String) list.get(position).get("name") + "(" +
                (String) list.get(position).get("count") + ")");

//        final String is_select = (String) list.get(position).get("is_select");
//        switch (is_select) {
//            case "0":
//                viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.black));
//                viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_changyong);
//                break;
//            case "1":
//                viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.green));
//                viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_changyong_active);
//                break;
//        }
        final String number = (String) list.get(position).get("number");
        switch (number) {
            case "1":
                if (getIsSelected().get(position)) {
//            viewHolderContentType.img_guan_scene.setImageResource(listintwo.get(position));
                    viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_changyong_active);
                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.green));
                } else {
//            viewHolderContentType.img_guan_scene.setImageResource(listint.get(position));
                    viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_changyong);
                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.black));
                }
                break;
            case "2":
                if (getIsSelected().get(position)) {
//            viewHolderContentType.img_guan_scene.setImageResource(listintwo.get(position));
                    viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_woshi_active);
                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.green));
                } else {
//            viewHolderContentType.img_guan_scene.setImageResource(listint.get(position));
                    viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_woshi);
                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.black));
                }
                break;
            case "3":
                if (getIsSelected().get(position)) {
//            viewHolderContentType.img_guan_scene.setImageResource(listintwo.get(position));
                    viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_keting_active);
                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.green));
                } else {
//            viewHolderContentType.img_guan_scene.setImageResource(listint.get(position));
                    viewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_keting);
                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.black));
                }
                break;
        }


//        viewHolderContentType.txt_again_autoscene.setText(list.get(position).get("name").toString());

        final ViewHolderContentType finalViewHolderContentType = viewHolderContentType;


//        for (int i = 0 ; i < list.size(); i++) {
//
//            switch (item_image) {
//                case "1":
//                    switch (type) {//常用
//                        case "0":
//                            finalViewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_changyong);
//
//                            break;
//                        case "1":
//                            finalViewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_changyong_active);
//                            break;
//                    }
//                    break;
//                case "2":
//                    switch (type) {//卧室
//                        case "0":
//                            finalViewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_woshi);
//                            break;
//                        case "1":
//                            finalViewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_woshi_active);
//                            break;
//                    }
//                    break;
//                case "3":
//                    switch (type) {//客厅
//                        case "0":
//                            finalViewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_keting);
//                            break;
//                        case "1":
//                            finalViewHolderContentType.image_home_device_item.setImageResource(R.drawable.icon_l_keting_active);
//                            break;
//                    }
//                    break;
//            }
//
//
//            switch (type) {//
//                case "0":
//                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.black));
//
//                    break;
//                case "1":
//                    viewHolderContentType.title_home_device.setTextColor(context.getResources().getColor(R.color.green));
//                    break;
//            }
//
//            viewHolderContentType.title_home_device.setText((String) list.get(position).get("name"));

//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(context, SettingRoomActivity.class);
//////                intent.putExtra("id", (Serializable) list.get(position).get("id").toString());
////                context.startActivity(intent);
//                for (int i = 0; i < list.size(); i++) {
//                    list.get(i).put("type", "0");
//                    if (i == position) {
//                        list.get(i).put("type", "1");
//                    }
//                }
//                homeDeviceItemClickListener.homedeviceClick((String) list.get(position).get("number"));
//                notifyDataSetChanged();
//            }
//        });
        return convertView;
    }


    public void setList1(List<Map> list1) {
        this.list = list1;
    }

    class ViewHolderContentType {
        ImageView image_home_device_item;
        TextView title_home_device;
    }

    public interface HomeDeviceItemClickListener {
        void homedeviceClick(String number);
    }
}
