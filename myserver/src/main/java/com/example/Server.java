package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        MainRollPagerBean mrpb=new MainRollPagerBean(
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_01.png",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_02.png",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_03.png",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_04.png"
        );
        SuperManBean smb = new SuperManBean("https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/gou.jpg",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/touxiang.png",
                "狗狗","https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/icon_master_focused_selected.png",
                "汪汪汪汪汪");
        HotCoupBean hcb=new HotCoupBean(
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_page_one.jpg",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_page_two.jpg",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_page_three.jpg",
                "https://raw.githubusercontent.com/sys1211/YueSongBaby/master/app/src/main/res/drawable-xhdpi/welcome_page_four.jpg"
        );

        MainPageData mpd=new MainPageData(
                mrpb,smb,hcb
        );
        MD5Bean md5data=new MD5Bean();
        String str1 = gson.toJson(mpd);
        String md5pnce=md5data.encryption(str1);
        DataBean db=new DataBean(mpd,md5pnce);
        String str=gson.toJson(db);
        System.out.print(str);
        try {

            ServerSocket server = new ServerSocket(8989);//定义客户端的端口号
            Socket client = server.accept();//定义一个Socket对象

            InputStream is = client.getInputStream();//服务器接受信息输入流，也就是接受从服务器段发送过来的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));//用bufferedreader包装下输入流

            OutputStream os = client.getOutputStream();//这是用来给服务器发送消息的输出流


            boolean flag = true;//定义一个死循环，让服务器不停的接受从客户端发送来的字符串




            while (flag) {

                String s = br.readLine();//s是从客户端接受到得字符串
                if (s==null)
                    break;
                System.out.println(s);
                if(s.equals("GET /SuperManBean HTTP/1.1")){
                    String strResponse = "HTTP/1.1 200 OK\nContent-Length: " + str.getBytes().length + "\n\n" + str;

                    os.write(strResponse.getBytes(),
                            0,
                            strResponse.getBytes().length);

                    os.flush();
                }


            }

            client.close();
        }
        catch (IOException e) {//try 跟catch你不用管，这是用来处理异常的，就是固定格式
            e.printStackTrace();
        }
    }
}

