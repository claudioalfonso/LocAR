package com.spectralinsights.locar.plugin.zxing;

import com.google.zxing.Result;

public interface ZXingResultListener {

    public void onZxingDecodeTaskCompleted(Result result);

}
