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
  
import com.yy.model.Ginfo;  
import com.yy.service.GinfoService;  
 
@Controller  
@RequestMapping("/ginfo") 

public class GinfoController {
	@Autowired  
    private GinfoService GinfoService;  
    /**  
     * 获取所有用户列表  
     * @param request  
     * @return  
     */  
    @RequestMapping("/getAllGinfo")  
    public String getAllGinfo(HttpServletRequest request,Model model){  
        List<Ginfo> ginfo = GinfoService.findAll();  
        model.addAttribute("ginfoList", ginfo);  
        request.setAttribute("ginfoList", ginfo);  
        return "/allGinfo";  
    }  
    /**  
     * 跳转到添加用户界面  
     * @param request  
     * @return  
     */  
    @RequestMapping("/toAddGinfo")  
    public String toAddGinfo(){  
        return "/addGinfo";  
    }  
    /**  
     * 添加用户并重定向  
     * @param user  
     * @param request  
     * @return  
     */  
    @RequestMapping("/addGinfo")  
    public String addGinfo(Ginfo ginfo,Model model){  
        GinfoService.save(ginfo);  
        return "redirect:/ginfo/getAllGinfo";  
    }  
    /**  
     *编辑用户  
     * @param user  
     * @param request  
     * @return  
     */  
    @RequestMapping("/updateUser")  
    public String updateGinfo(Ginfo ginfo,HttpServletRequest request,Model model){  
        if(GinfoService.update(ginfo)){  
            ginfo = GinfoService.findById(ginfo.getId());  
            request.setAttribute("ginfo", ginfo);  
            model.addAttribute("ginfo", ginfo);  
            return "redirect:/ginfo/getAllGinfo";  
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
    @RequestMapping("/getGinfo")  
    public String getGinfo(int id,HttpServletRequest request,Model model){  
        request.setAttribute("ginfo", GinfoService.findById(id));  
        model.addAttribute("ginfo", GinfoService.findById(id));  
        return "/editGinfo";  
    }  
    /**  
     * 删除用户  
     * @param id  
     * @param request  
     * @param response  
     */  
    @RequestMapping("/delGinfo")  
    public void delGinfo(int id,HttpServletRequest request,HttpServletResponse response){  
        String result = "{\"result\":\"error\"}";  
        if(GinfoService.delete(id)){  
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
