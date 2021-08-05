package NetworkProgrammingFundamental.Bai2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
    public static void main(String[] args) throws IOException {


        System.out.println("Server running ...");
        ServerSocket sv =new ServerSocket(5555);
        while (true)
        {

            new Thread(()->{
                Socket sk = null;
                try {
                    sk = sv.accept();
                    System.out.println("Connected!");
                } catch (IOException e) {
                    e.printStackTrace();
                }


            // Tạo input kết nối socket
                BufferedReader inFromClient = null;
                try {
                    inFromClient = new BufferedReader(new InputStreamReader(sk.getInputStream()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // Tạo output kết nối socket
                try {
                    DataOutputStream outToClient =new  DataOutputStream(sk.getOutputStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // đọc chuỗi ký tự được ghi từ Clien
                String sentence_from_client = null;
                try {
                    sentence_from_client = inFromClient.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Gửi chuỗi ký tự đến Client
            String sentence_read_client ="From Client: "+sentence_from_client + '\n';
            System.out.println(String.format(sentence_read_client));

            }).start();

            new Thread(()->{
            //Ghi dữ liệu ra client
                String sentence_from_server;
                Socket sk = null;
                try {
                    sk = sv.accept();
                    System.out.println("Connected!");
                    System.out.println("Input from Server:");
                    BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                    sentence_from_server = inFromUser.readLine();
                    DataOutputStream outToServer =
                            new DataOutputStream(sk.getOutputStream());
                    BufferedReader inFromServer =
                            new BufferedReader(new
                                    InputStreamReader(sk.getInputStream()));
                    outToServer.writeBytes(sentence_from_server + '\n');
                    sentence_from_server = inFromServer.readLine();
                    System.out.println("From Client: " + sentence_from_server);
                } catch (IOException e) {
                    e.printStackTrace();
                }





            }).start();


        }
    }
}
