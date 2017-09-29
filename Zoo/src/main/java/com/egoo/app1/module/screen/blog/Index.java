package com.egoo.app1.module.screen.blog;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;

import com.alibaba.citrus.turbine.Context;

/**
 * Created by fs_dev on 15-11-26.
 */
public class Index {
    public void execute(Context context,HttpServletRequest request) {
           context.put("name", "fiboliu");
    }
}
