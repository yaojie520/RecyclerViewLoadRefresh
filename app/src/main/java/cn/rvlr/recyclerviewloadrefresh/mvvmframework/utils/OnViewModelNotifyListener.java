package cn.rvlr.recyclerviewloadrefresh.mvvmframework.utils;

import android.os.Bundle;

/**
 * ViewModel 与 Activity 之间通知 监听器
 */
public interface OnViewModelNotifyListener {
    void onViewModelNotify(Bundle bundle , int code);
}
