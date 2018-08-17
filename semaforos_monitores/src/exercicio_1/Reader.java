package exercicio_1;

import java.io.FileReader;

public class Reader extends Thread {
    FileReader fileReader;

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }
}
