package id.ten.handlingexceptionaop;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ExceptionalService {

    public void throwsIOExceptionCase() throws IOException {
        throw new IOException();
    }

}
