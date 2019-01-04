package com.jk.util;

import com.jk.entity.jurisdiction.TUser;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    public TUser getSession(HttpServletRequest request) {

        TUser user = (TUser) request.getSession().getAttribute("user");
        return user;
    }

    /*public TPersonage getPersonageSession(HttpServletRequest request) {

        TPersonage personage = (TPersonage) request.getSession().getAttribute("personage");
        return personage;
    }*/

}
