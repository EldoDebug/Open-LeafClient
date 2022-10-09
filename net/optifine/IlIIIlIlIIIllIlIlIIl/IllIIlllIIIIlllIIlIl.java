package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.net.*;
import java.util.regex.*;
import java.util.*;
import java.io.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IllIIlllIIIIlllIIlIl
{
    private String llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private Proxy IlIlIIIllIllIIIIIllI;
    private List IllIIlllIIIIlllIIlIl;
    private List llllIIIlIlllIlIIIIIl;
    private Socket lIIIIlIIIIIlllIllIII;
    private InputStream lIIIlllIIIllIIIllIII;
    private OutputStream llIIlIIIlIIIllIlIIIl;
    private lIIIlllIIIllIIIllIII llIllIlIIIIllIlIIllI;
    private llllIIIlIlllIlIIIIIl lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    private long llllIIllllIlIlIIIIll;
    private int IlIllIlIlIIIlIlIlIII;
    private long IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    private static final String IlIlIIIIIIlllIlIllIl = "\n";
    public static final int llllIIIIlIIIlIlllIll = 5000;
    public static final int IlIlIlIlIlllllllllIl = 5000;
    private static final Pattern IIllIIllIIIlIlIIIIlI;
    
    static {
        IIllIIllIIIlIlIIIIlI = Pattern.compile("^[a-zA-Z]+://.*");
    }
    
    public IllIIlllIIIIlllIIlIl(final String s, final int n) {
        this(s, n, Proxy.NO_PROXY);
    }
    
    public IllIIlllIIIIlllIIlIl(final String llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final Proxy ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = Proxy.NO_PROXY;
        this.IllIIlllIIIIlllIIlIl = new LinkedList();
        this.llllIIIlIlllIlIIIIIl = new LinkedList();
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = 0;
        this.IIIIlllIIIIIIlIIIlll = false;
        this.llllIIllllIlIlIIIIll = 5000L;
        this.IlIllIlIlIIIlIlIlIII = 1000;
        this.IIlllIIlIllIllIlIIll = System.currentTimeMillis();
        this.lllIIIIlllllIlIIllIl = false;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        (this.llIllIlIIIIllIlIIllI = new lIIIlllIIIllIIIllIII(this)).start();
        (this.lIlIlIIIllIIllIIIllI = new llllIIIlIlllIlIIIIIl(this)).start();
    }
    
    public synchronized boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.IlIlIIIllIllIIIIIllI()) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl);
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.llllIIIlIlllIlIIIIIl);
        ++this.IlIlIIIllIIllIlllllI;
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final List list) {
        list.add(liiiIlIIIIIlllIllIII);
        this.notifyAll();
    }
    
    public synchronized void llllIIIIlIIIlIlllIll(final Socket liiiIlIIIIIlllIllIII) {
        if (!this.lllIIIIlllllIlIIllIl) {
            if (this.lIIIIlIIIIIlllIllIII != null) {
                throw new IllegalArgumentException("Already connected");
            }
            (this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII).setTcpNoDelay(true);
            this.lIIIlllIIIllIIIllIII = this.lIIIIlIIIIIlllIllIII.getInputStream();
            this.llIIlIIIlIIIllIlIIIl = new BufferedOutputStream(this.lIIIIlIIIIIlllIllIII.getOutputStream());
            this.lIlIlIIIllIIllIIIllI();
            this.notifyAll();
        }
    }
    
    public synchronized OutputStream llllIIIIlIIIlIlllIll() {
        while (this.llIIlIIIlIIIllIlIIIl == null) {
            this.llIllIlIIIIllIlIIllI();
            this.wait(1000L);
        }
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public synchronized InputStream IlIlIlIlIlllllllllIl() {
        while (this.lIIIlllIIIllIIIllIII == null) {
            this.llIllIlIIIIllIlIIllI();
            this.wait(1000L);
        }
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public synchronized lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIlIlllIlIIIIIl.size() <= 0 && this.llIIlIIIlIIIllIlIIIl != null) {
            this.llIIlIIIlIIIllIlIIIl.flush();
        }
        return this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, true);
    }
    
    public synchronized lIIIIlIIIIIlllIllIII IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, false);
    }
    
    private lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final List list, final boolean b) {
        while (list.size() <= 0) {
            this.llIllIlIIIIllIlIIllI();
            this.wait(1000L);
        }
        this.lIlIlIIIllIIllIIIllI();
        if (b) {
            return list.remove(0);
        }
        return list.get(0);
    }
    
    private void llIllIlIIIIllIlIIllI() {
        if (this.lIIIIlIIIIIlllIllIII != null) {
            long llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
            if (this.IllIIlllIIIIlllIIlIl.size() > 0) {
                llllIIllllIlIlIIIIll = 5000L;
            }
            if (System.currentTimeMillis() > this.IIlllIIlIllIllIlIIll + llllIIllllIlIlIIIIll) {
                this.llllIIIIlIIIlIlllIll(new InterruptedException("Timeout " + llllIIllllIlIlIIIIll));
            }
        }
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        this.IIlllIIlIllIllIlIIll = System.currentTimeMillis();
    }
    
    public synchronized void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (!this.lllIIIIlllllIlIIllIl) {
            this.lIlIlIIIllIIllIIIllI();
        }
    }
    
    public synchronized void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        if (!this.lllIIIIlllllIlIIllIl) {
            this.IIIIlllIIIIIIlIIIlll = true;
            this.lIlIlIIIllIIllIIIllI();
            if (this.IllIIlllIIIIlllIIlIl.size() <= 0 || this.IllIIlllIIIIlllIIlIl.get(0) != liiiIlIIIIIlllIllIII) {
                throw new IllegalArgumentException("Response out of order: " + liiiIlIIIIIlllIllIII);
            }
            this.IllIIlllIIIIlllIIlIl.remove(0);
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(true);
            final String llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll("Location");
            if (llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll() / 100 == 3 && llllIIIIlIIIlIlllIll != null && liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII() < 5) {
                try {
                    final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll()), liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII());
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII() + 1);
                    net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl()));
                }
                catch (IOException ex) {
                    liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(), ex);
                }
            }
            else {
                liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(), llIllIlIIIIllIlIIllI);
            }
            this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI);
        }
    }
    
    private String llllIIIIlIIIlIlllIll(final String s, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (net.optifine.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.IIllIIllIIIlIlIIIIlI.matcher(s).matches()) {
            return s;
        }
        if (s.startsWith("//")) {
            return "http:" + s;
        }
        String s2 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
        if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl() != 80) {
            s2 = String.valueOf(s2) + ":" + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
        }
        if (s.startsWith("/")) {
            return "http://" + s2 + s;
        }
        final String ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl();
        final int lastIndex = ilIIIlIlIIIllIlIlIIl.lastIndexOf("/");
        return (lastIndex >= 0) ? ("http://" + s2 + ilIIIlIlIIIllIlIlIIl.substring(0, lastIndex + 1) + s) : ("http://" + s2 + "/" + s);
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final String llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll("Connection");
        if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.toLowerCase().equals("keep-alive")) {
            this.llllIIIIlIIIlIlllIll(new EOFException("Connection not keep-alive"));
        }
        final String llllIIIIlIIIlIlllIll2 = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll("Keep-Alive");
        if (llllIIIIlIIIlIlllIll2 != null) {
            final String[] llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ",;");
            for (int i = 0; i < llllIIIIlIIIlIlllIll3.length; ++i) {
                final String[] llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3[i], '=');
                if (llllIIIIlIIIlIlllIll4.length >= 2) {
                    if (llllIIIIlIIIlIlllIll4[0].equals("timeout")) {
                        final int llllIIIIlIIIlIlllIll5 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4[1], -1);
                        if (llllIIIIlIIIlIlllIll5 > 0) {
                            this.llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll5 * 1000;
                        }
                    }
                    if (llllIIIIlIIIlIlllIll4[0].equals("max")) {
                        final int llllIIIIlIIIlIlllIll6 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4[1], -1);
                        if (llllIIIIlIIIlIlllIll6 > 0) {
                            this.IlIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll6;
                        }
                    }
                }
            }
        }
    }
    
    private String[] llllIIIIlIIIlIlllIll(final String s, final char c) {
        final int index = s.indexOf(c);
        if (index < 0) {
            return new String[] { s };
        }
        return new String[] { s.substring(0, index), s.substring(index + 1) };
    }
    
    public synchronized void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final Exception ex) {
        this.llllIIIIlIIIlIlllIll(ex);
    }
    
    public synchronized void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final Exception ex) {
        this.llllIIIIlIIIlIlllIll(ex);
    }
    
    private synchronized void llllIIIIlIIIlIlllIll(final Exception ex) {
        if (!this.lllIIIIlllllIlIIllIl) {
            this.lllIIIIlllllIlIIllIl = true;
            this.IlIlIlIlIlllllllllIl(ex);
            if (this.llIllIlIIIIllIlIIllI != null) {
                this.llIllIlIIIIllIlIIllI.interrupt();
            }
            if (this.lIlIlIIIllIIllIIIllI != null) {
                this.lIlIlIIIllIIllIIIllI.interrupt();
            }
            try {
                if (this.lIIIIlIIIIIlllIllIII != null) {
                    this.lIIIIlIIIIIlllIllIII.close();
                }
            }
            catch (IOException ex2) {}
            this.lIIIIlIIIIIlllIllIII = null;
            this.lIIIlllIIIllIIIllIII = null;
            this.llIIlIIIlIIIllIlIIIl = null;
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final Exception ex) {
        if (this.IllIIlllIIIIlllIIlIl.size() > 0) {
            if (!this.IIIIlllIIIIIIlIIIlll) {
                final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.remove(0);
                liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(), ex);
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(true);
            }
            while (this.IllIIlllIIIIlllIIlIl.size() > 0) {
                net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.remove(0));
            }
        }
    }
    
    public synchronized boolean IlIlIIIllIllIIIIIllI() {
        return this.lllIIIIlllllIlIIllIl || this.IlIlIIIllIIllIlllllI >= this.IlIllIlIlIIIlIlIlIII;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public synchronized boolean llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl.size() > 0;
    }
    
    public String lIIIIlIIIIIlllIllIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public Proxy llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
