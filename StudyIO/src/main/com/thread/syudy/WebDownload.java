package com.thread.syudy;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author rong.wang
 * @date 10:11  2019/11/3
 */
public class WebDownload {
    /**
     * 下载工具
     * @param url
     * @param name
     */
    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
