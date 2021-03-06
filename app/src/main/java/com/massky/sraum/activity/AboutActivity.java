package com.massky.sraum.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.massky.sraum.R;
import com.massky.sraum.adapter.SystemMessageAdapter;
import com.massky.sraum.base.BaseActivity;
import com.massky.sraum.view.XListView;
import com.yanzhenjie.statusview.StatusUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;

import static com.massky.sraum.Util.DipUtil.dip2px;

/**
 * Created by zhu on 2018/2/12.
 */

public class AboutActivity extends BaseActivity {
    @InjectView(R.id.back)
    ImageView back;



    @Override
    protected int viewId() {
        return R.layout.about_act;
    }

    @Override
    protected void onView() {
        StatusUtils.setFullToStatusBar(this);
    }

    @Override
    protected void onEvent() {
        back.setOnClickListener(this);
    }

    @Override
    protected void onData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                AboutActivity.this.finish();
                break;
        }
    }
}
