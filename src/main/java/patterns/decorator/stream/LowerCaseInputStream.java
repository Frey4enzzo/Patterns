package patterns.decorator.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Декоратор преобразует все символы верхнего регистра
 * во входном потоке к нижнему регистру.
 * Надо всего лишь расширить класс FilterInputStream и
 * переопределить его метод read()
 */
public class LowerCaseInputStream extends FilterInputStream{

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == 1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result  = super.read(b, off, len);
        for (int i = off; i < off+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
