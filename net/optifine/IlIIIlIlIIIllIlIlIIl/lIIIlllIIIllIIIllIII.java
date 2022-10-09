package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.nio.charset.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII extends Thread
{
    private IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private static final String IlIlIlIlIlllllllllIl = "\r\n";
    private static Charset llIllIIIIIllIlIIIIlI;
    
    static {
        lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = Charset.forName("ASCII");
    }
    
    public lIIIlllIIIllIIIllIII(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll) {
        super("HttpPipelineSender");
        this.llllIIIIlIIIlIlllIll = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI = null;
        try {
            this.llllIIIIlIIIlIlllIll();
            while (!Thread.interrupted()) {
                llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
            }
        }
        catch (InterruptedException ex2) {}
        catch (Exception ex) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ex);
        }
    }
    
    private void llllIIIIlIIIlIlllIll() {
        final String liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
        final Socket socket = new Socket(this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
        socket.connect(new InetSocketAddress(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII), 5000);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(socket);
    }
    
    private void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final OutputStream outputStream) {
        this.llllIIIIlIIIlIlllIll(outputStream, String.valueOf(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI()) + " " + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() + " " + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI() + "\r\n");
        for (final String s : llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl().keySet()) {
            this.llllIIIIlIIIlIlllIll(outputStream, String.valueOf(s) + ": " + (String)llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl().get(s) + "\r\n");
        }
        this.llllIIIIlIIIlIlllIll(outputStream, "\r\n");
    }
    
    private void llllIIIIlIIIlIlllIll(final OutputStream outputStream, final String s) {
        outputStream.write(s.getBytes(lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI));
    }
}
