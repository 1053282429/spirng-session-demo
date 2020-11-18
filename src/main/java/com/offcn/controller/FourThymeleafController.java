package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class FourThymeleafController {
    @GetMapping("/four")
    public String four(Model model){
        model.addAttribute("msg1","username");
        model.addAttribute("msg2","password");
        model.addAttribute("size","30");
        return "index3";
    }
    @GetMapping("/five")
    public String five(Model model){
        return "index5";
    }
    @GetMapping("/six")
    public String six(Model model){
        Date date = new Date();
        model.addAttribute("date",date);
        double price = 1.99999;
        model.addAttribute("price",price);
        String str = "有基本的 crud 操作功能，分页用的是 MyBatis 的一个插件 PageHelper，批量删除，修改，\n" +
                "添加，在添加和修改这块有个图片上传，分布式开发么，我们用的是 FastDFS 服务器做的。\n" +
                "还有就是，商品添加的时候，我们是先把商品信息添加到 spu 表中，然后根据商品类别\n" +
                "来找到对应的模板，接着我们将商品品牌，分类，规格，规格项设计成 json 格式，直接存\n" +
                "储在 sku 表中，举个简单的例子手机对应的模板有外观，外观下的分类有颜色，尺寸，提交\n" +
                "的时候都是以 json 的形式存储的，我们用这样的方式来解决一对多关系关联的，查询的时\n" +
                "候更加方便，也方便了前后台数据的的传输，因为我们在表现层用的是@RestController 进行\n" +
                "json 数据的传输，前台用 AngularJs 发送 Ajax 请求进行数据传输。\n" +
                "我们在添加商品介绍这块还做了一个功能点就是用到了富文本编辑器 KindEditor，做这\n" +
                "个的时候我们是在页面中添加富文本编辑器的 JS 代码，这个主要是在前台进行操作的，参\n" +
                "考 Api 相当简单。\n" +
                "FastDFS 服务器搭建比较复杂，是搭建在 linux 系统上的，这个是我配合我们组长参考文\n" +
                "档搭建的，当时用了差不多两个多小时吧。\n" +
                "FastDFS 服务器也属于一个中间件，我们是结合 Nginx 实现负载均衡的，里面配置了\n" +
                "TrackerServer 服务";
        model.addAttribute("strText",str);
        String str2 = "JAVA-OO1";
        model.addAttribute("str2",str2);
        return "index5";
    }
}
