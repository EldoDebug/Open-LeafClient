package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.net.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import java.io.*;

public class lIlIlIIIllIIllIIIllI
{
    private static String llIllIIIIIllIlIIIIlI;
    public static final String llllIIIIlIIIlIlllIll = "http://s.optifine.net";
    public static final String IlIlIlIlIlllllllllIl = "http://optifine.net";
    
    static {
        lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = null;
    }
    
    public static byte[] llllIIIIlIIIlIlllIll(final String s) {
        HttpURLConnection httpURLConnection = null;
        byte[] array2;
        try {
            httpURLConnection = (HttpURLConnection)new URL(s).openConnection(Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                if (httpURLConnection.getErrorStream() != null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(httpURLConnection.getErrorStream());
                }
                throw new IOException("HTTP response: " + httpURLConnection.getResponseCode());
            }
            final InputStream inputStream = httpURLConnection.getInputStream();
            final byte[] array = new byte[httpURLConnection.getContentLength()];
            int i = 0;
            do {
                final int read = inputStream.read(array, i, array.length - i);
                if (read < 0) {
                    throw new IOException("Input stream closed: " + s);
                }
                i += read;
            } while (i < array.length);
            array2 = array;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return array2;
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s, final Map map, final byte[] array) {
        HttpURLConnection httpURLConnection = null;
        String string;
        try {
            httpURLConnection = (HttpURLConnection)new URL(s).openConnection(Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl());
            httpURLConnection.setRequestMethod("POST");
            if (map != null) {
                for (final String next : map.keySet()) {
                    httpURLConnection.setRequestProperty(next, new StringBuilder().append(map.get(next)).toString());
                }
            }
            httpURLConnection.setRequestProperty("Content-Type", "text/plain");
            httpURLConnection.setRequestProperty("Content-Length", new StringBuilder().append(array.length).toString());
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            final OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(array);
            outputStream.flush();
            outputStream.close();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "ASCII"));
            final StringBuffer sb = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append('\r');
            }
            bufferedReader.close();
            string = sb.toString();
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return string;
    }
    
    public static synchronized String llllIIIIlIIIlIlllIll() {
        if (lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI == null) {
            try {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(System.getProperty("player.models.local"), false)) {
                    lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = new File(Minecraft.getMinecraft().mcDataDir, "playermodels").toURI().toURL().toExternalForm();
                }
            }
            catch (Exception ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ex.getClass().getName() + ": " + ex.getMessage());
            }
            if (lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI == null) {
                lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = "http://s.optifine.net";
            }
        }
        return lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
    }
}
