package GBLVL2.Homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner;

    public static void main(String[] args) {
        new Client();
    }

    Client(){
        start();
        scanner = new Scanner(System.in);
        while (true){
            try {
                out.writeUTF(scanner.nextLine());
                if("/end".equalsIgnoreCase(scanner.nextLine())){
                    closeConnection();
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void start() {
        try {
            socket = new Socket("localhost",8189);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
               try{
                   while (true){
                       String message = in.readUTF();
                       if("/end".equalsIgnoreCase(message)){
                           closeConnection();
                           break;
                       }
                       System.out.println("Сервер прислал сообщение: " + message);
                   }
               }catch (Exception e){
                   e.printStackTrace();
               }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void closeConnection() {
        if(in != null){
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(out != null){
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(scanner != null){
            scanner.close();
        }
    }
}
