package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WirteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./ws.txt");
        String line="爱你孤身走，爱你不跪的模样";
        fos.write(line.getBytes(StandardCharsets.UTF_8));

    }


}
