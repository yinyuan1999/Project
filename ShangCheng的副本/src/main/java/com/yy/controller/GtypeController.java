package com.yy.controller;
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.yy.model.Gtype;
import com.yy.service.GtypeService;  
 
@Controller  
@RequestMapping("/gtype")

public class GtypeController {
	@Autowired  
    private GtypeService gtypeService;  
    /**  
     * 获取所有用户列表  
     * @param request  
     * @return  
     */  
    @RequestMapping("/getAllGtype")  
    public String getAllUser(HttpServletRequest request,Model model){  
        List<Gtype> gtype = gtypeService.findAll();  
        model.addAttribute("gtypeList", gtype);  
        request.setAttribute("gtypeList", gtype);  
        return "/allGtype";  
    }  
    /**  
     * 跳转到添加用户界面  
     * @param request  
     * @return  
     */  
    @RequestMapping("/toAddGtype")  
    public String toAddGtype(){  
        return "/addGtype";  
    }  
    /**  
     * 添加用户并重定向  
     * @param Gtype 
     * @param request  
     * @return  
     */  
    @RequestMapping("/addGtype")  
    public String addGtype(Gtype gtype,Model model){  
        gtypeService.save(gtype);  
        return "redirect:/gtype/getAllGtype";  
    }  
    /**  
     *编辑用户  
     * @param Gtype 
     * @param request  
     * @return  
     */  
    @RequestMapping("/updateGtype")  
    public String updateGtype(Gtype gtype,HttpServletRequest request,Model model){  
        if(gtypeService.update(gtype)){  
        	gtype = gtypeService.findByTypeid(gtype.getTypeid());  
            request.setAttribute("gtype", gtype);  
            model.addAttribute("gtype", gtype);  
            return "redirect:/gtype/getAllGtype";  
        }else{  
            return "/error";  
        }  
    }  
    /**  
     * 根据id查询单个用户  
     * @param id
     * @param request  
     * @return  
     */  
    @RequestMapping("/getGtype")  
    public String getGtype(int typeid,HttpServletRequest request,Model model){  
        request.setAttribute("user", gtypeService.findByTypeid(typeid));  
        model.addAttribute("user", gtypeService.findByTypeid(typeid));  
        return "/editGtype";  
    }  
    /**  
     * 删除用户  
     * @param typeid  
     * @param request  
     * @param response  
     */  
    @RequestMapping("/delGtype")  
    public void delGtype(int typeid,HttpServletRequest request,HttpServletResponse response){  
        String result = "{\"result\":\"error\"}";  
        if(gtypeService.delete(typeid)){  
            result = "{\"result\":\"success\"}";  
        }  
        response.setContentType("application/json");  
        try {  
            PrintWriter out = response.getWriter();  
            out.write(result);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }

}
