package com.jk.controller.password;

import com.jk.entity.jurisdiction.TUser;
import com.jk.service.jurisdiction.UserService;
import com.jk.util.BaseController;
import com.jk.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 修改密码相关
 */
@Controller
@RequestMapping("/pwd")
public class PwdController extends BaseController {
    @Autowired
    UserService userService;

    /**
     * 进入密码修改页面
     *
     * @param tUser
     * @return
     */
    @RequestMapping(value = "/toPwdUpdatePage")
    public String toPwdUpdatePage(Model model, TUser tUser) {
        model.addAttribute("userName", tUser.getUserName());
        return "html/reception/password/pwdupd";
    }

    /**
     * 修改密码提交
     *
     * @param tUser
     * @return
     */
    @RequestMapping(value = "/pwdUpdSubmit")
    @ResponseBody
    public String pwdUpdSubmit(TUser tUser) {
        // 根据“用户名”查询用户数据
        TUser tUserData = userService.getUserByUserName(tUser);
        // 输入旧密码
        String oldPwd = tUser.getPassword();
        // 查询旧密码
        String password = tUserData.getPassword();

        int i = 0;
        if(Md5Util.md5(oldPwd).equals(password)){
            tUserData.setPassword(tUser.getNewPwd());
            i = userService.updateByPrimaryKeySelective(tUserData);
        }
        return i+"";
    }
}
