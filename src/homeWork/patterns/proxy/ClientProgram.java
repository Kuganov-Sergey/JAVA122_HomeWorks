package homeWork.patterns.proxy;

import homeWork.patterns.proxy.proxyComponents.ProxyClass;
import homeWork.patterns.proxy.proxyComponents.WriterToFiles;

import java.io.File;

public class ClientProgram {
    public static void main(String[] args) {
        WriterToFiles writerToFiles = new ProxyClass();
        for (int i = 0; i < 10; i++) {
            writerToFiles.write();
        }
    }
}
