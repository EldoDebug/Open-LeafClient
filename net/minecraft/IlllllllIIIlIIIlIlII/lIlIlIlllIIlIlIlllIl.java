package net.minecraft.IlllllllIIIlIIIlIlII;

import java.net.*;
import org.apache.commons.io.*;
import java.io.*;
import java.util.*;

class lIlIlIlllIIlIlIlllIl implements Runnable
{
    private final /* synthetic */ lllllIIIIIlIlIIIIIIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    private final /* synthetic */ Proxy llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ Map IlIIIlIlIIIllIlIlIIl;
    private final /* synthetic */ File IlIlIIIllIllIIIIIllI;
    private final /* synthetic */ int IllIIlllIIIIlllIIlIl;
    
    lIlIlIlllIIlIlIlllIl(final lllllIIIIIlIlIIIIIIl llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final Proxy llIllIIIIIllIlIIIIlI, final Map ilIIIlIlIIIllIlIlIIl, final File ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Downloading Resource Pack");
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Making Request...");
        }
        try {
            final byte[] array = new byte[4096];
            httpURLConnection = (HttpURLConnection)new URL(this.IlIlIlIlIlllllllllIl).openConnection(this.llIllIIIIIllIlIIIIlI);
            float n = 0.0f;
            final float n2 = (float)this.IlIIIlIlIIIllIlIlIIl.entrySet().size();
            for (final Map.Entry<String, V> entry : this.IlIIIlIlIIIllIlIlIIl.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
                if (this.llllIIIIlIIIlIlllIll != null) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((int)(++n / n2 * 100.0f));
                }
            }
            inputStream = httpURLConnection.getInputStream();
            final float n3 = (float)httpURLConnection.getContentLength();
            final int contentLength = httpURLConnection.getContentLength();
            if (this.llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.format("Downloading file (%.2f MB)...", n3 / 1000.0f / 1000.0f));
            }
            if (this.IlIlIIIllIllIIIIIllI.exists()) {
                final long length = this.IlIlIIIllIllIIIIIllI.length();
                if (length == contentLength) {
                    if (this.llllIIIIlIIIlIlllIll != null) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                    }
                    return;
                }
                IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI.warn("Deleting " + this.IlIlIIIllIllIIIIIllI + " as it does not match what we currently have (" + contentLength + " vs our " + length + ").");
                FileUtils.deleteQuietly(this.IlIlIIIllIllIIIIIllI);
            }
            else if (this.IlIlIIIllIllIIIIIllI.getParentFile() != null) {
                this.IlIlIIIllIllIIIIIllI.getParentFile().mkdirs();
            }
            outputStream = new DataOutputStream(new FileOutputStream(this.IlIlIIIllIllIIIIIllI));
            if (this.IllIIlllIIIIlllIIlIl > 0 && n3 > this.IllIIlllIIIIlllIIlIl) {
                if (this.llllIIIIlIIIlIlllIll != null) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                }
                throw new IOException("Filesize is bigger than maximum allowed (file is " + n + ", limit is " + this.IllIIlllIIIIlllIIlIl + ")");
            }
            int read;
            while ((read = inputStream.read(array)) >= 0) {
                n += read;
                if (this.llllIIIIlIIIlIlllIll != null) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((int)(n / n3 * 100.0f));
                }
                if (this.IllIIlllIIIIlllIIlIl > 0 && n > this.IllIIlllIIIIlllIIlIl) {
                    if (this.llllIIIIlIIIlIlllIll != null) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                    }
                    throw new IOException("Filesize was bigger than maximum allowed (got >= " + n + ", limit was " + this.IllIIlllIIIIlllIIlIl + ")");
                }
                if (Thread.interrupted()) {
                    IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI.error("INTERRUPTED");
                    if (this.llllIIIIlIIIlIlllIll != null) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                    }
                    return;
                }
                outputStream.write(array, 0, read);
            }
            if (this.llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                return;
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
            if (httpURLConnection != null) {
                final InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI.error(IOUtils.toString(errorStream));
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (this.llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                return;
            }
        }
        finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
        }
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(outputStream);
    }
}
