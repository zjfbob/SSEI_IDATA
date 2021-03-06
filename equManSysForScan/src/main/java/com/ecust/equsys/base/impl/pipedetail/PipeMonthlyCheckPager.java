package com.ecust.equsys.base.impl.pipedetail;

import android.app.Activity;
import android.view.View;

import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.pipedetail.data.PipeMonthlyCheckData;

public class PipeMonthlyCheckPager extends MenuDetailBasePager{

	public PipeMonthlyCheckPager(Activity activity) {
		super(activity);
	}
	private MenuDetailUI pager;

	@Override
	public View initView() {
		pager = new MenuDetailUI(mActivity);
		return pager.rootView;

	}

	@Override
	public void initData() {
		super.initData();
		pager.mDomain= PipeMonthlyCheckData.getPipeMonthlyCheck();
		pager.initData();

	}
}
