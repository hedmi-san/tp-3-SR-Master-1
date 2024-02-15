
package server;
import java.io.*;
import java.net.*;
public class Server {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String clientSentence ;
        String capitalSentence;
        ServerSocket welcomeServer = new ServerSocket(6789);
        while (true) {            
            Socket connectFromClient = welcomeServer.accept();
            DataOutputStream outToClient = new DataOutputStream(connectFromClient.getOutputStream());
            DataInputStream inFromClient = new DataInputStream(new BufferedInputStream(connectFromClient.getInputStream()));
            clientSentence = inFromClient.readLine();
            System.out.println("Recieved : " + clientSentence);
            capitalSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalSentence);
        }
    }
    
}
