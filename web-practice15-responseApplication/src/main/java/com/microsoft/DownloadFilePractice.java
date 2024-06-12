package com.microsoft;

import java.io.IOException;
import javax.servlet.ServletOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DownloadFilePractice extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        String realPath = "D:\\desktop\\test.png";
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        response.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode(fileName, "UTF-8"));

        FileInputStream input = new FileInputStream(realPath);
        int length = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream output = response.getOutputStream();
        while ((length = input.read(buffer)) > 0) {
            output.write(buffer, 0, length);
        }

        input.close();
        output.close();

    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) {
        doPost(request, response);
    }

}