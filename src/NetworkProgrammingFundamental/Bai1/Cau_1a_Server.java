package NetworkProgrammingFundamental.Bai1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
    public static void main(String[] args) throws IOException {
        String sentence_from_client;
        String sentence_to_client;

        System.out.println("Server running ...");
        ServerSocket sv =new ServerSocket(5555);
        while (true)
        {
            Socket sk = sv.accept();
            System.out.println("Connected!");
            Scanner sc =new Scanner(System.in);
            // Tạo input kết nối socket
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            // Tạo output kết nối socket
            DataOutputStream outToClient =new  DataOutputStream(sk.getOutputStream());

            // đọc chuỗi ký tự được ghi từ Clien
            sentence_from_client = inFromClient.readLine();
            //Gửi chuỗi ký tự đến Client
            String sentence_read_client ="From Client: "+sentence_from_client + '\n';
            System.out.println(String.format(sentence_read_client));

            //Ghi dữ liệu ra client
            System.out.println("Input from Server:");
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            sentence_to_client = inFromUser.readLine();
            outToClient.writeBytes(sentence_to_client);

        }
    }
}

