package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.net.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.io.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private static Map llIIlIIIlIIIllIlIIIl;
    public static final String llllIIIIlIIIlIlllIll = "User-Agent";
    public static final String IlIlIlIlIlllllllllIl = "Host";
    public static final String llIllIIIIIllIlIIIIlI = "Accept";
    public static final String IlIIIlIlIIIllIlIlIIl = "Location";
    public static final String IlIlIIIllIllIIIIIllI = "Keep-Alive";
    public static final String IllIIlllIIIIlllIIlIl = "Connection";
    public static final String llllIIIlIlllIlIIIIIl = "keep-alive";
    public static final String lIIIIlIIIIIlllIllIII = "Transfer-Encoding";
    public static final String lIIIlllIIIllIIIllIII = "chunked";
    
    static {
        net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = new HashMap();
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        llllIIIIlIIIlIlllIll(s, llIllIIIIIllIlIIIIlI, Proxy.NO_PROXY);
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final Proxy proxy) {
        llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll(s, proxy), llIllIIIIIllIlIIIIlI));
    }
    
    public static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final String s, final Proxy proxy) {
        final URL url = new URL(s);
        if (!url.getProtocol().equals("http")) {
            throw new IOException("Only protocol http is supported: " + url);
        }
        final String file = url.getFile();
        final String host = url.getHost();
        int port = url.getPort();
        if (port <= 0) {
            port = 80;
        }
        final String s2 = "GET";
        final String s3 = "HTTP/1.1";
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("User-Agent", "Java/" + System.getProperty("java.version"));
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Accept", "text/html, image/gif, image/png");
        linkedHashMap.put("Connection", "keep-alive");
        return new llIIlIIIlIIIllIlIIIl(host, port, proxy, s2, file, s3, linkedHashMap, new byte[0]);
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        for (IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()); !illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII); illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII())) {
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), illIIlllIIIIlllIIlIl);
        }
    }
    
    private static synchronized IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final String s, final int n, final Proxy proxy) {
        final String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(s, n, proxy);
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.get(ilIlIlIlIlllllllllIl);
        if (illIIlllIIIIlllIIlIl == null) {
            illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(s, n, proxy);
            net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.put(ilIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl);
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    private static synchronized void llllIIIIlIIIlIlllIll(final String s, final int n, final Proxy proxy, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(s, n, proxy);
        if (net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.get(ilIlIlIlIlllllllllIl) == illIIlllIIIIlllIIlIl) {
            net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.remove(ilIlIlIlIlllllllllIl);
        }
    }
    
    private static String IlIlIlIlIlllllllllIl(final String s, final int n, final Proxy proxy) {
        return String.valueOf(s) + ":" + n + "-" + proxy;
    }
    
    public static byte[] llllIIIIlIIIlIlllIll(final String s) {
        return IlIlIlIlIlllllllllIl(s, Proxy.NO_PROXY);
    }
    
    public static byte[] IlIlIlIlIlllllllllIl(final String s, final Proxy proxy) {
        if (s.startsWith("file:")) {
            return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(new URL(s).openStream());
        }
        final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(s, proxy));
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() / 100 != 2) {
            throw new IOException("HTTP response: " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        }
        return llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    public static llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final HashMap<Object, llIllIlIIIIllIlIIllI> hashMap = new HashMap<Object, llIllIlIIIIllIlIIllI>();
        final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new IlIlIIIllIllIIIIIllI(hashMap);
        synchronized (hashMap) {
            llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII(llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI));
            try {
                hashMap.wait();
            }
            catch (InterruptedException ex2) {
                throw new InterruptedIOException("Interrupted");
            }
            final Exception ex = hashMap.get("Exception");
            if (ex != null) {
                if (ex instanceof IOException) {
                    throw (IOException)ex;
                }
                if (ex instanceof RuntimeException) {
                    throw (RuntimeException)ex;
                }
                throw new RuntimeException(ex.getMessage(), ex);
            }
            else {
                final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = hashMap.get("Response");
                if (llIllIlIIIIllIlIIllI == null) {
                    throw new IOException("Response is null");
                }
                // monitorexit(hashMap)
                return llIllIlIIIIllIlIIllI;
            }
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll() {
        final Iterator<IllIIlllIIIIlllIIlIl> iterator = net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().llllIIIlIlllIlIIIIIl()) {
                return true;
            }
        }
        return false;
    }
}
