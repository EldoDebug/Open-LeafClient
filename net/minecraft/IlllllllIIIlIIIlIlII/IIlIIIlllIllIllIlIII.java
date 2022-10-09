package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.concurrent.atomic.*;
import java.util.concurrent.*;
import org.apache.logging.log4j.*;
import java.util.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import com.google.common.util.concurrent.*;
import java.net.*;
import java.io.*;

public class IIlIIIlllIllIllIlIII
{
    public static final ListeningExecutorService llllIIIIlIIIlIlllIll;
    private static final AtomicInteger IlIlIlIlIlllllllllIl;
    private static final Logger llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Downloader %d").build()));
        IlIlIlIlIlllllllllIl = new AtomicInteger(0);
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
    }
    
    public static String llllIIIIlIIIlIlllIll(final Map map) {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            try {
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            if (entry.getValue() != null) {
                sb.append('=');
                try {
                    sb.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                }
                catch (UnsupportedEncodingException ex2) {
                    ex2.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final URL url, final Map map, final boolean b) {
        return llllIIIIlIIIlIlllIll(url, llllIIIIlIIIlIlllIll(map), b);
    }
    
    private static String llllIIIIlIIIlIlllIll(final URL url, final String s, final boolean b) {
        try {
            Proxy no_PROXY = (net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() == null) ? null : net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIIlllllllllllll();
            if (no_PROXY == null) {
                no_PROXY = Proxy.NO_PROXY;
            }
            final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection(no_PROXY);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", new StringBuilder().append(s.getBytes().length).toString());
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            final DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(s);
            dataOutputStream.flush();
            dataOutputStream.close();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            final StringBuffer sb = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append('\r');
            }
            bufferedReader.close();
            return sb.toString();
        }
        catch (Exception ex) {
            if (!b) {
                IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI.error("Could not post to " + url, (Throwable)ex);
            }
            return "";
        }
    }
    
    public static ListenableFuture llllIIIIlIIIlIlllIll(final File file, final String s, final Map map, final int n, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl, final Proxy proxy) {
        return IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll.submit((Runnable)new lIlIlIlllIIlIlIlllIl(lllllIIIIIlIlIIIIIIl, s, proxy, map, file, n));
    }
    
    public static int llllIIIIlIIIlIlllIll() {
        ServerSocket serverSocket = null;
        int localPort = -1;
        try {
            serverSocket = new ServerSocket(0);
            localPort = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException ex) {}
        }
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
        catch (IOException ex2) {}
        return localPort;
    }
    
    public static String llllIIIIlIIIlIlllIll(final URL url) {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        final StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append('\r');
        }
        bufferedReader.close();
        return sb.toString();
    }
}
