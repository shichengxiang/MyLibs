package com.mylibs.code.mylibs.update;

import android.support.annotation.NonNull;

import java.util.Map;

/**
 * Created by shichengxinag on 2018/2/2.
 */

public class AppManager implements com.mylibs.code.mylibs.update.HttpManager {
    @Override
    public void asyncGet(@NonNull String url, @NonNull Map<String, String> params, @NonNull Callback callBack) {
        //TODO 测试使用
        callBack.onResponse("result");
    }

    @Override
    public void asyncPost(@NonNull String url, @NonNull Map<String, String> params, @NonNull Callback callBack) {

    }

    @Override
    public void download(@NonNull String url, @NonNull String path, @NonNull String fileName, @NonNull FileCallback callback) {

    }
}
