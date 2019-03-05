package com.jk.controller.obtainWxPhone;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.security.spec.AlgorithmParameterSpec;

@Controller
@RequestMapping("/WxPhone")
public class ObtainWxPhone {
    /**
     * 解密并且获取用户手机号码
     *
     * @param encrypdata
     * @param ivdata
     * @param sessionkey
     * @param request
     * @return
     */
    @RequestMapping(value = "deciphering", method = RequestMethod.GET)
    @ResponseBody
    public String deciphering(String encrypdata, String ivdata, String sessionkey, HttpServletRequest request) {
        byte[] encrypData = Base64.decode(encrypdata);
        byte[] ivData = Base64.decode(ivdata);
        byte[] sessionKey = Base64.decode(sessionkey);
        String str = "";
        try {
            str = decrypt(sessionKey, ivData, encrypData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;

    }

    public static String decrypt(byte[] key, byte[] iv, byte[] encData) throws Exception {
        AlgorithmParameterSpec ivSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
         //解析解密后的字符串  
        return new String(cipher.doFinal(encData), "UTF-8");
    }
}
