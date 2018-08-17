package exercicio_1;

import java.io.FileWriter;

public class Writer extends Thread {
    FileWriter fileWriter;

    public void setFileWriter(FileWriter fileWriter){
        this.fileWriter = fileWriter;
    }

}
