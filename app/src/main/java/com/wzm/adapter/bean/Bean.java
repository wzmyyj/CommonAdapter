package com.wzm.adapter.bean;

/**
 * Created by wzm on 2018/1/18 0018.
 */

public class Bean {
    private String title;
    private String content;
    private int pic;

    public Bean(String title, String content, int pic) {
        this.title = title;
        this.content = content;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
