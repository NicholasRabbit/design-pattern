package com.pattern.chain.filter;

import com.pattern.chain.controller.LoginController;
import com.pattern.chain.servlet.Request;
import com.pattern.chain.servlet.Response;

import java.util.ArrayList;
import java.util.List;

/*
* 过滤链类，把所有过滤器放在这个类里，按照顺序执行。
* 1，这个FilterChain类也要实现Filter接口，跟CharacterEncodingFilter等一样，
* 只有这样才能和普通的Filter实现类组成一个递归的链条，当Controller处理。
* 2，如果执行到集合内最后一个过滤器则交给Controller执行其处理请求的方法。
* 3，当Controller处理完之后，还会沿着原来的路返回，
* 即 ”用户请求“-->Filter01-->Filter02-->Filter03-->Controller-->Filter03-->Filter02-->Filter01-->"用户请求"
* 这里就体现了这个职责链的精妙之处。
* */
public class FilterChain implements Filter{

    /*
    * 所有过滤器集合。
    * 使用List集合，先放进去的Filter先执行，类似于Tomcat中的web.xml中配置Filter，
    * 实际Tomcat也是读取web.xml里的Filter按书写顺序从上到下放到集合里按顺序执行。
    * */
    private List<Filter> filterList;
    //集合内元素游标
    private int cursor;
    //处理请求的Controller
    LoginController loginController;

    //初始化过滤器集合
    {
        filterList = new ArrayList<>();
    }

    public FilterChain() {
    }

    public FilterChain(LoginController loginController) {
        this.loginController = loginController;
    }

    /*
    * 这个FilterChain也要重写Filter接口的doFilter(..)方法，当跟CharacterEncodingFilter等普通Filter执行
    * 完成后就调用这里的doFilter(..),从而可以从集合中获取下一个Filter再执行它的doFilter(..)方法，由此形成了递归环形链条。
    * */
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //如果游标在集合范围内就执行下一个Filter的方法
        if(cursor < filterList.size()){

            Filter filter = filterList.get(cursor);

            //重点：游标是关键，当一个Filter处理完之后游标要后移，当下一个Filter调用这个的doFilter方法时就会找集合内的下一个元素。
            //注意游标自加1要写在这里不能写在 filter.doFilter(request,response,chain)之后，否则会一直调用第一个Filter的方法造成递归无穷尽。
            cursor ++;
            //执行下一个filter的方法
            filter.doFilter(request,response,chain);
            //cursor ++;  //写在这里错误

        //否则执行Controller的方法来处理请求
        }else{
            loginController.login("tom");
        }

    }

    //添加Filter到集合里
    public void add(Filter filter){
        filterList.add(filter);
    }
}
