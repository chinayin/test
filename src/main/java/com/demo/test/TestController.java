package com.demo.test;

import com.demo.blog.Blog;
import com.jfinal.core.Controller;

/**
 * IndexController
 */
public class TestController extends Controller {

    public void index() {
        //render("index.html");
        System.out.println("index");
        this.renderText("index");
    }

    public void a() {
        System.out.println("aaa");
        String a[] = new String[]{"1", "2", "3", "4", "5"};
        double b = 3.1415926;
        this.setAttr("a", a).setAttr("b", b);
        this.renderJson();
    }

}
