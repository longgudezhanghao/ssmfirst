package com.dzf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/file")
public class FileController {

    private static String uploadPath = "E:" + File.separator;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile[] multipartFiles, Model model) {

        List<String> filenames = new ArrayList<>();

        if (multipartFiles != null && multipartFiles.length > 0) {

            for (MultipartFile multipartFile : multipartFiles) {
                //传到哪里，传什么，传的细节

//          1.判断
                if (multipartFile != null && !multipartFile.isEmpty()) {
//          2.不空才传，获取原对象的文件名
                    String originFilename = multipartFile.getOriginalFilename();

//          3.先截取原文件的文件前缀，不带后缀
                    String fileNamePrefix = originFilename.substring(0, originFilename.lastIndexOf("."));

//          4.加工处理文件名，源文件名+时间
                    String newFileNamePrefix = fileNamePrefix + new Date().getTime();

//          5.得到新文件名
                    String newFileName = newFileNamePrefix + originFilename.substring(originFilename.lastIndexOf("."));

//          6.构建文件对象
                    File file = new File(uploadPath + newFileName);

                    try {
                        multipartFile.transferTo(file);
                        filenames.add(newFileName);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        model.addAttribute("filenames", filenames);

        return "uploadSuc";
    }

}
