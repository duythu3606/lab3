package NetworkProgrammingFundamental.Bai2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {


        Scanner sc= new Scanner(System.in);

        Socket clientSocket = new Socket("192.168.3.0", 5555);

        System.out.println("Connected!");

            new Thread(()->{
                String sentence_to_server;
                String sentence_from_server;
                while (true) {
                    try {
                    System.out.println("Input from Client: ");
                    BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                    sentence_to_server = inFromUser.readLine();
                    // Tạo output kết nối server
                    DataOutputStream outputToServer = new DataOutputStream(clientSocket.getOutputStream());
                    // Tạo input kết nối Server

                    BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    //Gửi chuỗi ký tự
                    outputToServer.writeBytes(sentence_to_server + '\n');
                    //Đọc chuỗi ký tự từ Server
                    sentence_from_server = inFromServer.readLine();
                    String sentence_read_server = "From Server: " +sentence_from_server +'\n';
                    System.out.println(String.format(sentence_read_server));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
//            //Đọc chuỗi ký tự từ Server
//            sentence_from_server = inFromServer.readLine();
//            String sentence_read_server = "From Server: " +sentence_from_server +'\n';
//            System.out.println(String.format(sentence_read_server));


    }
}
