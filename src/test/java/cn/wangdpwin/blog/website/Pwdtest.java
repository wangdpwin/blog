package cn.wangdpwin.blog.website;

import cn.wangdpwin.blog.website.modal.Vo.UserVo;
import cn.wangdpwin.blog.website.utils.TaleUtils;
import cn.wangdpwin.blog.website.modal.Vo.UserVo;
import cn.wangdpwin.blog.website.utils.TaleUtils;

/**
 * Created by shuaihan on 2017/4/2.
 */
public class Pwdtest {
    public static void main(String args[]){
        UserVo user = new UserVo();
        user.setUsername("hancongyang");
        user.setPassword("liaihong1314");
        String encodePwd = TaleUtils.MD5encode(user.getUsername() + user.getPassword());
        System.out.println(encodePwd);
    }
}
