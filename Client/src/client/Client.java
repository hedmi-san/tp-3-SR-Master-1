
package client;
import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws IOException {
        String sentence;
        String ModifirdSentence ;
        BufferedReader inputFromUser = new BufferedReader(new InputStreamReader(System.in));
        sentence = inputFromUser.readLine();
        Socket clientSocket = new Socket("192.168.100.10",6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        DataInputStream inFromServer = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
        outToServer.writeBytes(sentence + '\n');
        ModifirdSentence = inFromServer.readLine();
        System.out.println("From Server :"+ ModifirdSentence );
        clientSocket.close();
    }
    
}
