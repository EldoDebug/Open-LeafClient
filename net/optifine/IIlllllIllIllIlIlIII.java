package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.net.*;
import net.minecraft.client.*;
import java.io.*;

public class IIlllllIllIllIlIlIII extends Thread
{
    public IIlllllIllIllIlIlIII() {
        super("VersionCheck");
    }
    
    @Override
    public void run() {
        try {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Checking for new version");
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("http://optifine.net/version/1.8.9/HD_U.txt").openConnection();
            if (llllIIIIlIIIlIlllIll.c().lllIIIIlllllIlIIllIl) {
                httpURLConnection.setRequestProperty("OF-MC-Version", "1.8.9");
                httpURLConnection.setRequestProperty("OF-MC-Brand", new StringBuilder().append(IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).toString());
                httpURLConnection.setRequestProperty("OF-Edition", "HD_U");
                httpURLConnection.setRequestProperty("OF-Release", "M5");
                httpURLConnection.setRequestProperty("OF-Java-Version", new StringBuilder().append(System.getProperty("java.version")).toString());
                httpURLConnection.setRequestProperty("OF-CpuCount", new StringBuilder().append(llllIIIIlIIIlIlllIll.e()).toString());
                httpURLConnection.setRequestProperty("OF-OpenGL-Version", new StringBuilder().append(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).toString());
                httpURLConnection.setRequestProperty("OF-OpenGL-Vendor", new StringBuilder().append(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).toString());
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            try {
                final InputStream inputStream = httpURLConnection.getInputStream();
                final String ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(inputStream);
                inputStream.close();
                final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "\n\r");
                if (llllIIIIlIIIlIlllIll.length >= 1) {
                    final String trim = llllIIIIlIIIlIlllIll[0].trim();
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Version found: " + trim);
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(trim, "M5") <= 0) {
                        return;
                    }
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(trim);
                    return;
                }
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        catch (Exception ex) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
        }
    }
}
