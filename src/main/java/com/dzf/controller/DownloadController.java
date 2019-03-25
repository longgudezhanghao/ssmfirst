package com.dzf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/download")
public class DownloadController {

    //    定义一个文件下载目录
    private static String parentPath = "E:" + File.separator;

    @RequestMapping("down")
    public String down(HttpServletResponse response) {
//        通过输出流写到客户端
//        1.获取文件下载名
        String fileName = "截图.png";

//        2.通过paths工具类获取一个path对象
        Path path = Paths.get(parentPath, fileName);

//        3.判断它是否存在
        if (Files.exists(path)) {
//            存在则下载
//            通过response设定它的响应类型
//            4.获取文件后缀
            String fileSuffix = fileName.substring(fileName.lastIndexOf(".") + 1);

//         5.设置contentType，只有制定它才能去下载
            response.setContentType("application/"+fileSuffix);
//            6.添加头信息
            try {
                response.addHeader("Content-Disposition","attachment;filename="+URLEncoder.encode(fileName, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            try {
                Files.copy(path,response.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "download";

    }

}
