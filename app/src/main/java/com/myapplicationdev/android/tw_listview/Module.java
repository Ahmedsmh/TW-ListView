package com.myapplicationdev.android.tw_listview;

import android.widget.ImageView;

public class Module {

    private String module;
    private boolean prog;
    public Module(String module, boolean prog){
        this.module = module;
        this.prog = prog;
    }
    public String getModule(){
        return module;
    }
    public boolean isProg(){
        return prog;
    }
}
