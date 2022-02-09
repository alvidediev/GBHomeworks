package GBLVL2.Homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner;



    public static void main(String[] args) {
        new Server();
    }

    Server(){
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
        try(ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("Сервер запущен. Ждем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился.\nЖдем сообщения...");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try{
                    while (true){
                        scanner = new Scanner(System.in);
                        String message = in.readUTF();
                        if("/end".equalsIgnoreCase(message)){
                            closeConnection();
                            break;
                        }
                        System.out.println("Клиент прислал сообщение: " + message);
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
